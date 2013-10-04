package pe.com.bbva.reniec.ws;

import pe.com.bbva.reniec.ws.dominio.ConsultanteWS;
import pe.com.bbva.reniec.ws.dominio.RespuestaAutorizacion;

/**
 * Clase base del WSDL 
 * 
 * @author CDA Informática
 * @since 03/10/2013
 *
 */

public interface AutorizacionesWS {
	
	ConsultanteWS consultarAutorizacion(String identificador);
	
	RespuestaAutorizacion registrarAutorizacion(ConsultanteWS consultante);

}
