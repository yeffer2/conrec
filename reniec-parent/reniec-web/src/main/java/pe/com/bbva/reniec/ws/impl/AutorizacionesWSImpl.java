package pe.com.bbva.reniec.ws.impl;

import org.springframework.beans.factory.annotation.Autowired;

import pe.com.bbva.reniec.dominio.Consultante;
import pe.com.bbva.reniec.negocio.ConsultantesService;
import pe.com.bbva.reniec.utileria.Inject;
import pe.com.bbva.reniec.ws.AutorizacionesWS;
import pe.com.bbva.reniec.ws.dominio.ConsultanteWS;
import pe.com.bbva.reniec.ws.dominio.RespuestaAutorizacion;

public class AutorizacionesWSImpl implements AutorizacionesWS {

	@Autowired
	ConsultantesService consultantesService;
	
	public ConsultanteWS consultarAutorizacion(String identificador) {
		Consultante consultanteLocal = getConsultantesService().obtenerConsultantePorIdentificador(identificador);
		ConsultanteWS  consultante = new ConsultanteWS();
		if (consultanteLocal != null){
			consultante.setIdentificador(consultanteLocal.getIdentificador());
			consultante.setCodigo(consultanteLocal.getCodigoReniec());
			consultante.setDOI(consultanteLocal.getDoi());
			consultante.setNombres(consultanteLocal.getNombres());
			consultante.setPaterno(consultanteLocal.getPaterno());
			consultante.setMaterno(consultanteLocal.getMaterno());
			consultante.setNacimiento(consultanteLocal.getNacimiento());
			if (consultanteLocal.getTipoDOI() != null)
				consultante.setTipoDOI(consultanteLocal.getTipoDOI().getCodigo());
			if (consultanteLocal.getNacionalidad() != null)
				consultante.setNacionalidad(consultanteLocal.getNacionalidad().getCodigo());
			consultante.setCentro(consultanteLocal.getCentro());
			if(consultanteLocal.getOrigen() != null)
				consultante.setOrigen(consultanteLocal.getOrigen().getCodigo());
			if(consultanteLocal.getEstado() != null)
				consultante.setEstado(consultanteLocal.getEstado().getCodigo());			
		}
		
		return consultante;
	}

	public RespuestaAutorizacion registrarAutorizacion(ConsultanteWS consultante) {
		RespuestaAutorizacion respuesta = new RespuestaAutorizacion();
		return respuesta;
	}

	private ConsultantesService getConsultantesService() {
		if (consultantesService == null)
			Inject.inject(this);
		return consultantesService;
	}	
	
	
}
