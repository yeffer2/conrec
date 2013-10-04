package pe.com.bbva.reniec.ws.impl;

import pe.com.bbva.reniec.ws.AutorizacionesWS;
import pe.com.bbva.reniec.ws.dominio.ConsultanteWS;
import pe.com.bbva.reniec.ws.dominio.RespuestaAutorizacion;

public class AutorizacionesWSImpl implements AutorizacionesWS {

	public ConsultanteWS consultarAutorizacion(String identificador) {
		ConsultanteWS  consultante = new ConsultanteWS();
		return consultante;
	}

	public RespuestaAutorizacion registrarAutorizacion(ConsultanteWS consultante) {
		RespuestaAutorizacion respuesta = new RespuestaAutorizacion();
		return respuesta;
	}	
}
