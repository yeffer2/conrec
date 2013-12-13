package pe.com.bbva.procesarUsuarioRENIEC;

import java.rmi.RemoteException;

import com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequest;
import com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequestDocument;
import com.pe.bbva.reniec.ws.RefRequestHeader;
import com.pe.bbva.reniec.ws.UsuarioResponse;
import com.pe.bbva.reniec.ws.UsuarioWSBBVAResponseDocument;
import com.pe.bbva.reniec.ws.UsuarioWSBBVAServiceStub;

public class ProcesarUsuarioRENIEC 
{
	
	private String url="";
	private Long timeOut=null;
	
    public void setUrl(String url) {
		this.url = url;
	}
    
	public void setTimeOut(Long timeOut) {
		this.timeOut = timeOut;
	}

	public UsuarioResponse respuestaTransaccion(RefRequestHeader refRequestHeader, 
			ProcesarUsuarioRENIECRequest refprocesarUsuarioRENIECRequest) throws RemoteException{
    	
		UsuarioWSBBVAServiceStub usuarioWSBBVA=null;
    	
		usuarioWSBBVA=new UsuarioWSBBVAServiceStub(url);
    	
		if(timeOut!=null){
			usuarioWSBBVA._getServiceClient().getOptions().setTimeOutInMilliSeconds(timeOut);
		}
		
    	if(usuarioWSBBVA!=null){
    		
    		com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequestDocument.ProcesarUsuarioRENIECRequest procesarUsuarioRENIECRequest=
    				com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequestDocument.ProcesarUsuarioRENIECRequest.Factory.newInstance();
    		
    		//RefRequestHeader
    		procesarUsuarioRENIECRequest.setRefRequestHeader(RefRequestHeader.Factory.newInstance());
    		procesarUsuarioRENIECRequest.getRefRequestHeader().setCanal(refRequestHeader.getCanal());
    		procesarUsuarioRENIECRequest.getRefRequestHeader().setCodigoAplicacion(refRequestHeader.getCodigoAplicacion());
    		procesarUsuarioRENIECRequest.getRefRequestHeader().setIdEmpresa(refRequestHeader.getIdEmpresa());
    		procesarUsuarioRENIECRequest.getRefRequestHeader().setUsuario(refRequestHeader.getUsuario());
    		procesarUsuarioRENIECRequest.getRefRequestHeader().setFechaHoraEnvio(refRequestHeader.getFechaHoraEnvio());
    		procesarUsuarioRENIECRequest.getRefRequestHeader().setIdTransaccion(refRequestHeader.getIdTransaccion());
    		procesarUsuarioRENIECRequest.getRefRequestHeader().setCodigoInterfaz(refRequestHeader.getCodigoInterfaz());
    		
    		//ProcesarUsuarioRENIECRequest
    		procesarUsuarioRENIECRequest.setRefprocesarUsuarioRENIECRequest(ProcesarUsuarioRENIECRequest.Factory.newInstance());
    		procesarUsuarioRENIECRequest.getRefprocesarUsuarioRENIECRequest().setEmpresa(refprocesarUsuarioRENIECRequest.getEmpresa());
    		procesarUsuarioRENIECRequest.getRefprocesarUsuarioRENIECRequest().setCodigo(refprocesarUsuarioRENIECRequest.getCodigo());
    		procesarUsuarioRENIECRequest.getRefprocesarUsuarioRENIECRequest().setNombres(refprocesarUsuarioRENIECRequest.getNombres());
    		procesarUsuarioRENIECRequest.getRefprocesarUsuarioRENIECRequest().setApellidoPaterno(refprocesarUsuarioRENIECRequest.getApellidoPaterno());
    		procesarUsuarioRENIECRequest.getRefprocesarUsuarioRENIECRequest().setApellidoMaterno(refprocesarUsuarioRENIECRequest.getApellidoMaterno());
    		procesarUsuarioRENIECRequest.getRefprocesarUsuarioRENIECRequest().setFechaNacimiento(refprocesarUsuarioRENIECRequest.getFechaNacimiento());
    		procesarUsuarioRENIECRequest.getRefprocesarUsuarioRENIECRequest().setTipo(refprocesarUsuarioRENIECRequest.getTipo());
    		procesarUsuarioRENIECRequest.getRefprocesarUsuarioRENIECRequest().setProceso(refprocesarUsuarioRENIECRequest.getProceso());
    		
    		ProcesarUsuarioRENIECRequestDocument procesarUsuarioRENIECRequestDocument=
    				ProcesarUsuarioRENIECRequestDocument.Factory.newInstance();
    		
    		procesarUsuarioRENIECRequestDocument.setProcesarUsuarioRENIECRequest(procesarUsuarioRENIECRequest);
    		
    		UsuarioWSBBVAResponseDocument usuarioWSBBVAResponseDocument=null;
    		
    		usuarioWSBBVAResponseDocument=usuarioWSBBVA.procesarUsuarioRENIECRequest(procesarUsuarioRENIECRequestDocument);
    		    					
			if(usuarioWSBBVAResponseDocument!=null){
				return usuarioWSBBVAResponseDocument.getUsuarioWSBBVAResponse().getUsuarioWSBBVAReturn();
			}
			
    	}
		return null;
    }
}
