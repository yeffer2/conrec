package pe.com.bbva.reniec.ws.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.pe.bbva.reniec.ws.UsuarioResponse;

import pe.com.bbva.reniec.dominio.Consultante;
import pe.com.bbva.reniec.dominio.Valor;
import pe.com.bbva.reniec.negocio.ConfiguracionService;
import pe.com.bbva.reniec.negocio.ConsultantesService;
import pe.com.bbva.reniec.utileria.Constante;
import pe.com.bbva.reniec.utileria.Inject;
import pe.com.bbva.reniec.ws.AutorizacionesWS;
import pe.com.bbva.reniec.ws.dominio.ConsultanteWS;
import pe.com.bbva.reniec.ws.dominio.RespuestaAutorizacion;

public class AutorizacionesWSImpl implements AutorizacionesWS {
	
	protected final static Log logger = LogFactory.getLog(AutorizacionesWSImpl.class);

	@Autowired
	ConsultantesService consultantesService;

	@Autowired
	ConfiguracionService configuracionService;

	public ConsultanteWS consultarAutorizacion(String identificador) {
		Consultante consultanteLocal = getConsultantesService()
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
		Valor tipoDoi = getConfiguracionService().obtenerValorxCodigo(
				Constante.LISTA.CODIGO.DOI_TIPO, consultanteLocal.getTipoDOI());
		Valor nacionalidad = getConfiguracionService().obtenerValorxCodigo(
				Constante.LISTA.CODIGO.NACIONALIDAD_TIPO,
				consultanteLocal.getNacionalidad());
		Valor origen = getConfiguracionService().obtenerValorxCodigo(
				Constante.LISTA.CODIGO.ORIGEN, consultanteLocal.getOrigen());
		consultante.setTipoDOI(tipoDoi);
		consultante.setNacionalidad(nacionalidad);
		consultante.setOrigen(origen);

		Consultante consultanteConId = getConsultantesService()
				.obtenerConsultantePorIdentificador(
						consultanteLocal.getIdentificador());
		if (consultanteConId != null)
			consultante.setId(consultanteConId.getId());

		UsuarioResponse usuarioModificado = getConsultantesService()
				.guardarConsultanteWS(consultante, consultanteLocal.getAccion());

		
		respuesta.setError(usuarioModificado.getRefResponseHeader()
				.getCodigoRespuesta());
		respuesta.setMensaje(usuarioModificado.getRefResponseHeader()
				.getMensajeRespuesta());
		}
		catch (Exception e){
			logger.error(e.getStackTrace());
			respuesta.setError("Error");
			respuesta.setMensaje(e.getStackTrace().toString());			
		}
		return respuesta;
	}

	private ConsultantesService getConsultantesService() {
		if (consultantesService == null)
			Inject.inject(this);
		return consultantesService;
	}

	private ConfiguracionService getConfiguracionService() {
		if (configuracionService == null)
			Inject.inject(this);
		return configuracionService;
	}

}
