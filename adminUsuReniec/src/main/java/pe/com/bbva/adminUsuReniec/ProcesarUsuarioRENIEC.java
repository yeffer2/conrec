package pe.com.bbva.adminUsuReniec;

import java.rmi.RemoteException;

import com.grupobbva.pe.simr.ents.header.RequestHeader;
import com.grupobbva.pe.simr.ents.body.mantenimientousuario.UsuarioRequest;
import com.grupobbva.pe.simr.service.message.UsuarioRequestDocument;
import com.grupobbva.pe.simr.service.message.UsuarioResponse;
import com.grupobbva.pe.simr.service.message.UsuarioResponseDocument;
import com.grupobbva.pe.simr.service.message.WS_AdminUsuReniec;
import com.grupobbva.pe.simr.service.message.WS_AdminUsuReniecStub;


public class ProcesarUsuarioRENIEC 
{
	
	String url="";
	
    public void setUrl(String url) {
		this.url = url;
	}

	public UsuarioResponse respuestaTransaccion(RequestHeader refRequestHeader, UsuarioRequest refUsuarioRequest) throws RemoteException{
    	
		WS_AdminUsuReniec adminUsuReniec=null;
    	
		adminUsuReniec=new WS_AdminUsuReniecStub(url);
    	
    	if(adminUsuReniec!=null){
    		com.grupobbva.pe.simr.service.message.UsuarioRequest usuarioRequest=
    				com.grupobbva.pe.simr.service.message.UsuarioRequest.Factory.newInstance();
    		
    		//RequestHeader
    		usuarioRequest.setRefRequestHeader(RequestHeader.Factory.newInstance());
    		usuarioRequest.getRefRequestHeader().setCanal(refRequestHeader.getCanal());
    		usuarioRequest.getRefRequestHeader().setCodigoAplicacion(refRequestHeader.getCodigoAplicacion());
    		usuarioRequest.getRefRequestHeader().setIdEmpresa(refRequestHeader.getIdEmpresa());
    		usuarioRequest.getRefRequestHeader().setUsuario(refRequestHeader.getUsuario());
    		usuarioRequest.getRefRequestHeader().setFechaHoraEnvio(refRequestHeader.getFechaHoraEnvio());
    		usuarioRequest.getRefRequestHeader().setIdTransaccion(refRequestHeader.getIdTransaccion());
    		usuarioRequest.getRefRequestHeader().setCodigoInterfaz(refRequestHeader.getCodigoInterfaz());
    		//UsuarioRequest
    		usuarioRequest.setRefUsuarioRequest(UsuarioRequest.Factory.newInstance());
    		usuarioRequest.getRefUsuarioRequest().setEmpresa(refUsuarioRequest.getEmpresa());
    		usuarioRequest.getRefUsuarioRequest().setCodigo(refUsuarioRequest.getCodigo());
    		usuarioRequest.getRefUsuarioRequest().setNombres(refUsuarioRequest.getNombres());
    		usuarioRequest.getRefUsuarioRequest().setApellidoPaterno(refUsuarioRequest.getApellidoPaterno());
    		usuarioRequest.getRefUsuarioRequest().setApellidoMaterno(refUsuarioRequest.getApellidoMaterno());
    		usuarioRequest.getRefUsuarioRequest().setFechaNacimiento(refUsuarioRequest.getFechaNacimiento());
    		usuarioRequest.getRefUsuarioRequest().setTipo(refUsuarioRequest.getTipo());
    		usuarioRequest.getRefUsuarioRequest().setProceso(refUsuarioRequest.getProceso());
    		    		
    		UsuarioRequestDocument usuarioRequestDocument=UsuarioRequestDocument.Factory.newInstance();
			usuarioRequestDocument.setUsuarioRequest(usuarioRequest);
			
			UsuarioResponseDocument usuarioResponseDocument=null;
    		
			usuarioResponseDocument=adminUsuReniec.procesarUsuarioRENIEC(usuarioRequestDocument);
			
			if(usuarioResponseDocument!=null){
				return usuarioResponseDocument.getUsuarioResponse();
			}
			
    	}
		return null;
    }
}
