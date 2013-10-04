package pe.com.bbva.reniec.ws.impl;

import javax.jws.WebService;

import pe.com.bbva.reniec.ws.AutorizacionesWS;

@WebService(
        portName = "AutorizacionesWSPort",
        serviceName = "AutorizacionesWSService",
        targetNamespace = "http://pe.com.bbva.reniec.ws/wsdl",
        endpointInterface = "AutorizacionesWS")
public class AutorizacionesWSImpl implements AutorizacionesWS {

	public String ConsultarAutorizacion(String identificador){
		return identificador;
	}
	
}
