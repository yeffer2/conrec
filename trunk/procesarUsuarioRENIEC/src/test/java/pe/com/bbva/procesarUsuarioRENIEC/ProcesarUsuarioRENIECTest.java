package pe.com.bbva.procesarUsuarioRENIEC;

import static org.junit.Assert.*;

import java.rmi.RemoteException;

import org.junit.Test;

import pe.gob.reniec.www.ProcesoType;
import pe.gob.reniec.www.TipoType;

import com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequest;
import com.pe.bbva.reniec.ws.RefRequestHeader;
import com.pe.bbva.reniec.ws.UsuarioResponse;

public class ProcesarUsuarioRENIECTest{

	@Test
	public void pruebaRespuesta() {
		ProcesarUsuarioRENIEC procesarUsuarioRENIEC=new ProcesarUsuarioRENIEC();
		
		RefRequestHeader refRequestHeader=RefRequestHeader.Factory.newInstance();
		refRequestHeader.setCanal("S_C_");
		refRequestHeader.setCodigoAplicacion("SCIReniec");
		refRequestHeader.setIdEmpresa("RENI");
		refRequestHeader.setUsuario("P017433");
		refRequestHeader.setFechaHoraEnvio("2013-11-22-19.51.01.123456");
		refRequestHeader.setIdTransaccion("20131122195101123456");
		refRequestHeader.setCodigoInterfaz("PUSRREN");
		
		ProcesarUsuarioRENIECRequest refprocesarUsuarioRENIECRequest=ProcesarUsuarioRENIECRequest.Factory.newInstance();
		refprocesarUsuarioRENIECRequest.setEmpresa("DE2019");
		refprocesarUsuarioRENIECRequest.setCodigo("41880218");
		refprocesarUsuarioRENIECRequest.setNombres("JOSE ANTONIO");
		refprocesarUsuarioRENIECRequest.setApellidoPaterno("RAMIREZ");
		refprocesarUsuarioRENIECRequest.setApellidoMaterno("GUERRERO");
		refprocesarUsuarioRENIECRequest.setFechaNacimiento("19830108");
		refprocesarUsuarioRENIECRequest.setTipo(TipoType.DNI);
		refprocesarUsuarioRENIECRequest.setProceso(ProcesoType.CO);
		
		procesarUsuarioRENIEC.setUrl("http://172.31.9.41:9080/WSMantenimientoRENIEC/services/WS_UsuarioRENIEC");
		
		UsuarioResponse usuarioResponse=null;
		try {
			usuarioResponse=procesarUsuarioRENIEC.respuestaTransaccion(refRequestHeader, refprocesarUsuarioRENIECRequest);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		assertNotNull(usuarioResponse);
    }

}
