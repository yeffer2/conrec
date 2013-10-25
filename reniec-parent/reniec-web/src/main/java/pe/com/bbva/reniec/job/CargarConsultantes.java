package pe.com.bbva.reniec.job;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;

import pe.com.bbva.reniec.dominio.Valor;
import pe.com.bbva.reniec.exception.ValidacionException;
import pe.com.bbva.reniec.negocio.ConfiguracionService;
import pe.com.bbva.reniec.utileria.Constante;
import pe.com.bbva.reniec.utileria.Inject;
import pe.com.bbva.reniec.utileria.ProcesarArchivo;
import pe.com.bbva.reniec.utileria.ProcesarCargaLDAP;


/**
 * Clase Job que ejecuta el proceso de carga de Consultantes desde ldap y archivos externos-
 * 
 * @author CDA Informática
 * @since 02/10/2013
 */
public class CargarConsultantes implements Job {
	
	Logger log = Logger.getLogger("cargarConsultantes");

	@Autowired
	ConfiguracionService configuracionService;
	
	protected String formatoDateArchivo = "yyyyMMdd";
	
	/**
	 * Ejecute del job.
	 */
	public void execute(JobExecutionContext context) throws JobExecutionException  {
		Timestamp tstInicio = new Timestamp(new java.util.Date().getTime());
		log.info("+++ INICIA CARGA DE CONSULTANTES A LAS " + tstInicio);
		cargaAutomaticaLDAP();
		cargaAutomaticaArchivos();
		
	
		Timestamp tstFin = new Timestamp(new java.util.Date().getTime());
		log.info("+++ TERMINA CARGA DE CONSULTANTES A LAS " + tstFin);
	}


	private void cargaAutomaticaArchivos() {
		List<Valor> obtenerOrigenes = getConfiguracionService().obtenerValoresxLista(Constante.LISTA.CODIGO.ORIGEN);
		origenes: for(Valor origen : obtenerOrigenes ){
			Date fechaProceso = new Date();
			SimpleDateFormat formatoDate = new SimpleDateFormat(
					formatoDateArchivo);
			String nombreArchivo = origen.getCodigo()
					+ "."
					+ formatoDate.format(fechaProceso)
					+ ".txt";
			Valor rutaArchivo = configuracionService
					.obtenerValorxCodigo(
							Constante.LISTA.CODIGO.RUTAS_ARCHIVOS,
							origen.getCodigo());

			String nombreRuta = rutaArchivo.getDescripcion()
					+ nombreArchivo;

			File archivo = new File(nombreRuta);
			if (!archivo.exists()) {
				log.error("+++ No existe el archivo " + nombreArchivo);
				continue origenes;
			}

			try {
				InputStream inputStream = new FileInputStream(
						nombreRuta);

				Valor estado = configuracionService
						.obtenerValorxCodigo(
								Constante.LISTA.CODIGO.REGISTRO_ESTADO,
								Constante.VALOR.REGISTRO_ESTADO.CODIGO.ACTIVO);
				ProcesarArchivo procesarArchivo = new ProcesarArchivo(
						inputStream);
				
				Valor tipoCarga = configuracionService.obtenerValorxCodigo(Constante.LISTA.CODIGO.CARGA_TIPO, Constante.VALOR.CARGA_TIPO.CODIGO.AUTOMATICA); 

				procesarArchivo.cargarArchivo(
						tipoCarga,
						origen,
						fechaProceso, nombreArchivo,
						estado, "");
				archivo.delete();
			} catch (FileNotFoundException e) {
				log.error("+++ Error en el archivo " + nombreArchivo);
			}
		}
		
	}


	private void cargaAutomaticaLDAP() {
		ProcesarCargaLDAP procesoLDAP = new ProcesarCargaLDAP();
		procesoLDAP.procesarCarga(new Date(), "");		
	}


	public ConfiguracionService getConfiguracionService() {
		if(configuracionService == null)
			Inject.inject(this);
		return configuracionService;
	}
	




}
