package pe.com.bbva.reniec.ws.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;

import com.pe.bbva.reniec.ws.UsuarioResponse;

import pe.com.bbva.reniec.dominio.Consultante;
import pe.com.bbva.reniec.dominio.Valor;
import pe.com.bbva.reniec.negocio.ConsultantesService;
import pe.com.bbva.reniec.utileria.Constante;
import pe.com.bbva.reniec.utileria.MyContext;
import pe.com.bbva.reniec.ws.AutorizacionesWS;
import pe.com.bbva.reniec.ws.dominio.ConsultanteWS;
import pe.com.bbva.reniec.ws.dominio.RespuestaAutorizacion;

public class AutorizacionesWSImpl implements AutorizacionesWS {
	
	Logger logger = LogManager.getLogger(AutorizacionesWS.class.getName());

	public ConsultanteWS consultarAutorizacion(String identificador) {
		ApplicationContext context = MyContext.getApplicationContext();
		ConsultantesService consultantesService=context.getBean(ConsultantesService.class);
		Consultante consultanteLocal = consultantesService
				.obtenerConsultantePorIdentificador(identificador);
		ConsultanteWS consultante = new ConsultanteWS();
		if (consultanteLocal != null) {
			consultante.setIdentificador(consultanteLocal.getIdentificador());
			consultante.setCodigo(consultanteLocal.getCodigoReniec());
			consultante.setDOI(consultanteLocal.getDoi());
			consultante.setNombres(consultanteLocal.getNombres());
			consultante.setPaterno(consultanteLocal.getPaterno());
			consultante.setMaterno(consultanteLocal.getMaterno());
			consultante.setNacimiento(consultanteLocal.getNacimiento());
			if (consultanteLocal.getTipoDOI() != null)
				consultante.setTipoDOI(consultanteLocal.getTipoDOI()
						.getCodigo());
			if (consultanteLocal.getNacionalidad() != null)
				consultante.setNacionalidad(consultanteLocal.getNacionalidad()
						.getCodigo());
			consultante.setCentro(consultanteLocal.getCentro());
			if (consultanteLocal.getOrigen() != null)
				consultante.setOrigen(consultanteLocal.getOrigen().getCodigo());
			if (consultanteLocal.getEstado() != null)
				consultante.setEstado(consultanteLocal.getEstado().getCodigo());
		}

		return consultante;
	}

	public RespuestaAutorizacion registrarAutorizacion(
			ConsultanteWS consultanteLocal) {
		ApplicationContext context = MyContext.getApplicationContext();
		ConsultantesService consultantesService=context.getBean(ConsultantesService.class);
		RespuestaAutorizacion respuesta = new RespuestaAutorizacion();
		try{
		Consultante consultante = new Consultante();
		consultante.setIdentificador(consultanteLocal.getIdentificador());
		consultante.setCodigoReniec(consultanteLocal.getCodigo());
		consultante.setDoi(consultanteLocal.getDOI());
		consultante.setNombres(consultanteLocal.getNombres());
		consultante.setPaterno(consultanteLocal.getPaterno());
		consultante.setMaterno(consultanteLocal.getMaterno());
		consultante.setNacimiento(consultanteLocal.getNacimiento());
		consultante.setCentro(consultanteLocal.getCentro());
		Valor tipoDoi = consultantesService.obtenerValorxCodigo(
				Constante.LISTA.CODIGO.DOI_TIPO, consultanteLocal.getTipoDOI());
		Valor nacionalidad = consultantesService.obtenerValorxCodigo(
				Constante.LISTA.CODIGO.NACIONALIDAD_TIPO,
				consultanteLocal.getNacionalidad());
		Valor origen = consultantesService.obtenerValorxCodigo(
				Constante.LISTA.CODIGO.ORIGEN, consultanteLocal.getOrigen());
		consultante.setTipoDOI(tipoDoi);
		consultante.setNacionalidad(nacionalidad);
		consultante.setOrigen(origen);

		Consultante consultanteConId = consultantesService
				.obtenerConsultantePorIdentificador(
						consultanteLocal.getIdentificador());
		if (consultanteConId != null)
			consultante.setId(consultanteConId.getId());

		UsuarioResponse usuarioModificado = consultantesService
				.guardarConsultanteWS(consultante, consultanteLocal.getAccion());

		
		respuesta.setError(usuarioModificado.getRefResponseHeader()
				.getCodigoRespuesta());
		respuesta.setMensaje(usuarioModificado.getRefResponseHeader()
				.getMensajeRespuesta());
		}
		catch (Exception e){
			logger.error(e.toString());
			respuesta.setError("Error");
			respuesta.setMensaje(e.toString());			
		}
		return respuesta;
	}
	
}
