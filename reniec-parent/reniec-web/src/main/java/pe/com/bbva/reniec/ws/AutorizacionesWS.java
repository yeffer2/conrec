package pe.com.bbva.reniec.ws;
import javax.jws.WebService;

/**
 * Clase base del WSDL 
 * 
 * @author CDA Informática
 * @since 03/10/2013
 *
 */
@WebService(targetNamespace = "http://pe.com.bbva.reniec.ws/wsdl")
public interface AutorizacionesWS {
	
	 String ConsultarAutorizacion(String identificador);
	

}
