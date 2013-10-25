package pe.com.bbva.reniec.utileria;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import pe.com.bbva.reniec.dominio.Carga;
import pe.com.bbva.reniec.dominio.Consultante;
import pe.com.bbva.reniec.dominio.Detalle;
import pe.com.bbva.reniec.dominio.Valor;
import pe.com.bbva.reniec.negocio.CargaMasivaService;
import pe.com.bbva.reniec.negocio.ConfiguracionService;
import pe.com.bbva.reniec.negocio.ConsultantesService;
import pe.com.bbva.reniec.negocio.DetalleService;

public class ProcesarArchivo {

	protected ByteArrayOutputStream outputStream;
	protected String formatoFecha = "yyyy-MM-dd";
	protected InputStream inputStream;

	@Autowired
	ConsultantesService consultantesService;

	@Autowired
	ConfiguracionService configuracionService;
	
	@Autowired
	CargaMasivaService cargaMasivaService;
	
	@Autowired
	DetalleService detalleService;

	private Carga carga;
	private Long nroFilaInterno;

	public ProcesarArchivo(ByteArrayOutputStream outputStream) {
		this.outputStream = outputStream;
		this.inputStream = null;
		Inject.inject(this);
		nroFilaInterno = 2L;
	}
	
	public ProcesarArchivo(InputStream inputStream) {
		this.inputStream = inputStream;
		this.outputStream = null;
		Inject.inject(this);
		nroFilaInterno = 2L;
	}

	public void cargarArchivo(Valor tipoCarga, Valor origen, Date fecha, String fichero, Valor estado, String mensaje) {
		carga = new Carga();
		carga.setTipo(tipoCarga);
		carga.setOrigen(origen);
		carga.setFecha(fecha);
		carga.setFichero(fichero);
		carga.setEstado(estado);
		carga.setMensaje(mensaje);
		carga.setInicio(new Date());
		cargaMasivaService.guardarCarga(carga);
		

		inputStream = (outputStream != null)?new ByteArrayInputStream(
				outputStream.toByteArray()) : inputStream;
		InputStreamReader readerInput = new InputStreamReader(inputStream);
		BufferedReader bufReaderFile = new BufferedReader(readerInput);
		try {
			String lineaHeader = bufReaderFile.readLine();
			String lineaDatos;
			while ((lineaDatos = bufReaderFile.readLine()) != null) {				
				procesaLinea(lineaDatos);

			}
			readerInput.close();
			cargaMasivaService.guardarCarga(carga);

			
		} catch (IOException e) {
			e.printStackTrace();
			cargaMasivaService.guardarCarga(carga);

		}
		carga.setFin(new Date());
		cargaMasivaService.guardarCarga(carga);
		

	}

	private void procesaLinea(String lineaDatos) {
		Consultante consultante;
		Detalle detalle = new Detalle();
		detalle.setCarga(carga);
		detalle.setNroFila(nroFilaInterno++);
		try {
			/*
			 * FIXME La definición marca un espacio para el numero de linea,
			 * pero no viene en el archivo de ejemplo.
			 */

			// String numeroFila = lineaDatos.substring(0,10).trim();
			// lineaDatos = lineaDatos.substring(10);

			String identificador = lineaDatos.substring(0, 20).trim();
			lineaDatos = lineaDatos.substring(20);

			consultante = (consultantesService
					.obtenerConsultantePorIdentificador(identificador) != null) ? consultantesService
					.obtenerConsultantePorIdentificador(identificador)
					: new Consultante();
			consultante.setIdentificador(identificador);
			detalle.setIdentificador(identificador);
		
			String nacionalidad = lineaDatos.substring(0, 1).trim();
			lineaDatos = lineaDatos.substring(1);
			Valor nacionValor = configuracionService.obtenerValorxCodigo(
					Constante.LISTA.CODIGO.NACIONALIDAD_TIPO, nacionalidad);
			if (nacionValor == null)
				return;
			consultante.setNacionalidad(nacionValor);
			detalle.setNacionalidad(nacionalidad);

			String nombres = lineaDatos.substring(0, 60).trim();
			lineaDatos = lineaDatos.substring(60);
			consultante.setNombres(nombres);
			detalle.setNombres(nombres);

			String paterno = lineaDatos.substring(0, 40).trim();
			lineaDatos = lineaDatos.substring(40);
			consultante.setPaterno(paterno);
			detalle.setPaterno(paterno);

			String materno = lineaDatos.substring(0, 40).trim();
			lineaDatos = lineaDatos.substring(40);
			consultante.setMaterno(materno);
			detalle.setMaterno(materno);

			String origen = lineaDatos.substring(0, 15).trim();
			lineaDatos = lineaDatos.substring(15);
			Valor origenValor = configuracionService.obtenerValorxCodigo(
					Constante.LISTA.CODIGO.ORIGEN, origen);
			if (origenValor == null)
				return;
			consultante.setOrigen(origenValor);
			detalle.setOrigen(origen);

			String codigo = lineaDatos.substring(0, 20).trim();
			lineaDatos = lineaDatos.substring(20);
			consultante.setCodigoReniec(codigo);
			detalle.setCodigoReniec(codigo);

			String nacimiento = lineaDatos.substring(0, 10).trim();
			lineaDatos = lineaDatos.substring(10);
			SimpleDateFormat formatoDelTexto = new SimpleDateFormat(
					formatoFecha);
			consultante.setNacimiento(formatoDelTexto.parse(nacimiento));
			detalle.setNacimiento(nacimiento);

			String tipoDoi = lineaDatos.substring(0, 2).trim();
			lineaDatos = lineaDatos.substring(2);
			Valor tipoDoiValor = configuracionService.obtenerValorxCodigo(
					Constante.LISTA.CODIGO.DOI_TIPO, tipoDoi);
			if (tipoDoiValor == null)
				return;
			consultante.setTipoDOI(tipoDoiValor);
			detalle.setTipoDoi(tipoDoi);

			String numeroDoi = lineaDatos.substring(0, 20).trim();
			lineaDatos = lineaDatos.substring(20);
			consultante.setDoi(numeroDoi);
			detalle.setNumeroDoi(numeroDoi);
			
			String accion = lineaDatos.substring(0, 2).trim();
			lineaDatos = lineaDatos.substring(2);
			Valor accionValor = configuracionService.obtenerValorxCodigo(
					Constante.LISTA.CODIGO.ACCION, accion);
			
			if (accionValor == null)
				return;
			Valor estado;
			if (accionValor.getCodigo().equals(
					Constante.VALOR.ACCION.CODIGO.ACTIVACION)) {
				estado = configuracionService.obtenerValorxCodigo(
						Constante.LISTA.CODIGO.USUARIO_ESTADO,
						Constante.VALOR.USUARIO_ESTADO.CODIGO.ACTIVO);
				if (consultante.getEstado() == null)
					consultante.setEstado(estado);
				else if (consultante.getEstado().equals(
						Constante.VALOR.USUARIO_ESTADO.CODIGO.BAJA_TEMPORAL))
					consultante.setEstado(estado);
			} else if (accionValor.getCodigo().equals(
					Constante.VALOR.ACCION.CODIGO.BAJA_TEMPORAL)) {
				estado = configuracionService.obtenerValorxCodigo(
						Constante.LISTA.CODIGO.USUARIO_ESTADO,
						Constante.VALOR.USUARIO_ESTADO.CODIGO.BAJA_TEMPORAL);
				if (consultante.getEstado() != null) {
					if (consultante.getEstado().equals(
							Constante.VALOR.USUARIO_ESTADO.CODIGO.ACTIVO))
						consultante.setEstado(estado);
				}
			} else if (accionValor.getCodigo().equals(
					Constante.VALOR.ACCION.CODIGO.BAJA_DEFINITIVA)) {
				estado = configuracionService.obtenerValorxCodigo(
						Constante.LISTA.CODIGO.USUARIO_ESTADO,
						Constante.VALOR.USUARIO_ESTADO.CODIGO.BAJA_DEFINITIVA);
				if (consultante.getEstado() != null) {
					if (consultante.getEstado().equals(
							Constante.VALOR.USUARIO_ESTADO.CODIGO.ACTIVO)
							|| consultante
									.getEstado()
									.equals(Constante.VALOR.USUARIO_ESTADO.CODIGO.BAJA_TEMPORAL))
						consultante.setEstado(estado);
				}
			} else if (accionValor.getCodigo().equals(
					Constante.VALOR.ACCION.CODIGO.REACTIVACION)) {
				estado = configuracionService.obtenerValorxCodigo(
						Constante.LISTA.CODIGO.USUARIO_ESTADO,
						Constante.VALOR.USUARIO_ESTADO.CODIGO.ACTIVO);
				if (consultante.getEstado() != null) {
					if (consultante
							.getEstado()
							.equals(Constante.VALOR.USUARIO_ESTADO.CODIGO.BAJA_TEMPORAL))
						consultante.setEstado(estado);
				}
			}
			if (consultante.getEstado() == null)
				return;
			detalle.setAccion(accion);

			String centro = lineaDatos.substring(0, 4).trim();
			lineaDatos = lineaDatos.substring(4);
			consultante.setCentro(centro);
			detalle.setCentro(centro);
			
			consultantesService.guardarConsultante(consultante);
			detalle.setConsultante(consultante);
			
			detalleService.guardaDetalle(detalle);
			

		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
