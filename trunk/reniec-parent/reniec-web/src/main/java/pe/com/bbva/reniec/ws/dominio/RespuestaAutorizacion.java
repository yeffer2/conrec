package pe.com.bbva.reniec.ws.dominio;

import java.io.Serializable;

/**
 * Clase serializable de respuesta para el WS de autorizaciones.
 * 
 * @author CDA Informática.
 * @since 04/10/2013
 *
 */
public class RespuestaAutorizacion implements Serializable {	
	
	
	private static final long serialVersionUID = 1L;
	
	String error;
	String mensaje;
	
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	

}
