package pe.com.bbva.reniec.utileria;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import pe.com.bbva.reniec.dominio.Carga;
import pe.com.bbva.reniec.dominio.Consultante;
import pe.com.bbva.reniec.dominio.Detalle;
import pe.com.bbva.reniec.dominioLDAP.Ldapperu2;
import pe.com.bbva.reniec.dominio.Valor;
import pe.com.bbva.reniec.negocio.CargaMasivaService;
import pe.com.bbva.reniec.negocio.ConfiguracionService;
import pe.com.bbva.reniec.negocio.ConsultantesService;
import pe.com.bbva.reniec.negocio.DetalleService;
import pe.com.bbva.reniec.negocio.LDAPService;

public class ProcesarCargaLDAP {

	@Autowired
	LDAPService ldapService;
	@Autowired
	ConsultantesService consultantesService;

	@Autowired
	ConfiguracionService configuracionService;

	@Autowired
	CargaMasivaService cargaMasivaService;
	
	@Autowired
	DetalleService detalleService;
	
	List<Consultante> consultantesLDAP = new ArrayList<Consultante>();
	List<Consultante> consultantesReniec = new ArrayList<Consultante>();

	private Carga carga;
	private String formatoFecha = "dd-MM-yyyy";
	private String codPaisPeru = "0504";

	public ProcesarCargaLDAP() {
		Inject.inject(this);
	}
	public ProcesarCargaLDAP(ApplicationContext schedulerContext) {
		Inject.injectScheduler(this, schedulerContext);
	}

	public void procesarCarga(Date fecha, String mensaje) {
		carga = new Carga();
		Long nroFilaInterno = 2L;
		Valor origen = configuracionService.obtenerValorxCodigo(
				Constante.LISTA.CODIGO.ORIGEN,
				Constante.VALOR.ORIGEN.CODIGO.LDAP);
		Valor estado = configuracionService.obtenerValorxCodigo(
				Constante.LISTA.CODIGO.REGISTRO_ESTADO,
				Constante.VALOR.REGISTRO_ESTADO.CODIGO.ACTIVO);
		Valor tipoDoi = configuracionService.obtenerValorxCodigo(
				Constante.LISTA.CODIGO.DOI_TIPO,
				Constante.VALOR.DOI_TIPO.CODIGO.DNI);
		Valor tipoCarga = configuracionService.obtenerValorxCodigo(
				Constante.LISTA.CODIGO.CARGA_TIPO,
				Constante.VALOR.CARGA_TIPO.CODIGO.AUTOMATICA);
		carga.setTipo(tipoCarga);
		carga.setOrigen(origen);
		carga.setFecha(fecha);
		carga.setEstado(estado);
		carga.setMensaje(mensaje);
		carga.setInicio(new Date());
		cargaMasivaService.guardarCarga(carga);
		Consultante consultante = new Consultante();

		List<Ldapperu2> usuariosLdap = ldapService.obtenerUsuariosLDAP();
		loopConsultante: for (Ldapperu2 usuario : usuariosLdap) {
			try {
				Detalle detalle = new Detalle();
				detalle.setCarga(carga);
				detalle.setNroFila(nroFilaInterno++);
				consultante = consultantesService.obtenerConsultantePorIdentificador(usuario.getCodusu());
				consultante = consultante==null ? new Consultante() : consultante;
				consultante.setIdentificador(usuario.getCodusu());
				detalle.setIdentificador(usuario.getCodusu());
				consultante.setCodigoReniec(usuario.getNumdoc());
				detalle.setCodigoReniec(usuario.getNumdoc());
				consultante.setTipoDOI(tipoDoi);
				detalle.setTipoDoi(tipoDoi.getCodigo());
				consultante.setDoi(usuario.getNumdoc());
				detalle.setNumeroDoi(usuario.getNumdoc());
				consultante.setNombres(usuario.getNombre());
				detalle.setNombres(usuario.getNombre());
				consultante.setPaterno(usuario.getApepat());
				detalle.setPaterno(usuario.getApepat());
				consultante.setMaterno(usuario.getApemat());
				detalle.setMaterno(usuario.getApemat());

				String nacimiento = usuario.getFecnac();
				if (nacimiento == null)
					continue loopConsultante;
				SimpleDateFormat formatoDelTexto = new SimpleDateFormat(
						formatoFecha);
				consultante.setNacimiento(formatoDelTexto.parse(nacimiento));

				detalle.setNacimiento(nacimiento);

				Valor nacionalidad;
				if (usuario.getCodpais().equals(codPaisPeru)) {
					nacionalidad = configuracionService.obtenerValorxCodigo(
							Constante.LISTA.CODIGO.NACIONALIDAD_TIPO,
							Constante.VALOR.NACIONALIDAD_TIPO.CODIGO.PERUANA);
				} else {
					nacionalidad = configuracionService
							.obtenerValorxCodigo(
									Constante.LISTA.CODIGO.NACIONALIDAD_TIPO,
									Constante.VALOR.NACIONALIDAD_TIPO.CODIGO.EXTRANJERO);
				}
				Valor estadoUsuario = configuracionService.obtenerValorxCodigo(
						Constante.LISTA.CODIGO.USUARIO_ESTADO,
						Constante.VALOR.USUARIO_ESTADO.CODIGO.ACTIVO);

				consultante.setNacionalidad(nacionalidad);
				detalle.setNacionalidad(nacionalidad.getCodigo());
				if (usuario.getCodofi() == null)
					continue loopConsultante;
				consultante.setCentro(usuario.getCodofi());
				detalle.setCentro(usuario.getCodofi());
				consultante.setOrigen(origen);
				detalle.setOrigen(origen.getCodigo());
				if (consultante.getEstado() == null)
					consultante.setEstado(estadoUsuario);
				else {
					if (consultante
							.getEstado()
							.getCodigo()
							.equals(Constante.VALOR.USUARIO_ESTADO.CODIGO.ACTIVO)
							|| consultante
									.getEstado()
									.getCodigo()
									.equals(Constante.VALOR.USUARIO_ESTADO.CODIGO.BAJA_TEMPORAL)
									|| consultante
									.getEstado()
									.getCodigo()
									.equals(Constante.VALOR.USUARIO_ESTADO.CODIGO.ERROR_RENIEC)) {
						consultante.setEstado(estadoUsuario);
					} else {
						continue loopConsultante;
					}
				}
				detalle.setAccion(Constante.VALOR.ACCION.CODIGO.ACTIVACION);
				
				consultantesLDAP.add(consultante);
				String resultado=consultantesService.guardarConsultante(consultante);
				detalle.setMensaje(resultado);
				detalle.setConsultante(consultante);
				
				detalleService.guardaDetalle(detalle);
				
			} catch (ParseException e) {
				e.printStackTrace();
			}
			
			
		}
		bajaTemporalConsultantes(origen);
		carga.setFin(new Date());
		cargaMasivaService.guardarCarga(carga);
		

	}

	private void bajaTemporalConsultantes(Valor origen) {
		Consultante consultanteReniec = new Consultante();
		consultanteReniec.setOrigen(origen);
		consultantesReniec = consultantesService.obtenerConsultante(consultanteReniec);
		List<Consultante> consultanteBajaTemporal = new  ArrayList<Consultante>();		
		
		iteradorLdap: for(Consultante consultanteReniecLocal: consultantesReniec){			
			for(Consultante consultanteLdap : consultantesLDAP){
				if(consultanteReniecLocal.getId().equals(consultanteLdap.getId()))
					continue iteradorLdap;
			}
			consultanteBajaTemporal.add(consultanteReniecLocal);	
		}

		Valor estadoBT = configuracionService.obtenerValorxCodigo(
				Constante.LISTA.CODIGO.USUARIO_ESTADO,
				Constante.VALOR.USUARIO_ESTADO.CODIGO.BAJA_TEMPORAL);
		for(Consultante consultanteBT : consultanteBajaTemporal){
			if(!consultanteBT.getEstado().getCodigo().equals(Constante.VALOR.USUARIO_ESTADO.CODIGO.BAJA_DEFINITIVA)){
				consultanteBT.setEstado(estadoBT);
				consultantesService.guardarConsultante(consultanteBT);
			}
			
			
		}
		
				
		
	}


}
