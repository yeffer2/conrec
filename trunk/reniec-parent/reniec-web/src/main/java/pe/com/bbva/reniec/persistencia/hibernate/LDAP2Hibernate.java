package pe.com.bbva.reniec.persistencia.hibernate;

import org.springframework.stereotype.Repository;

import com.grupobbva.bc.per.tele.ldap.comunes.IILDPeExcepcion;
import com.grupobbva.bc.per.tele.ldap.directorio.IILDPeUsuario;

import pe.com.bbva.reniec.dominio.Usuario;
import pe.com.bbva.reniec.persistencia.LDAP2DAO;

@Repository
@SuppressWarnings("serial")
public class LDAP2Hibernate implements LDAP2DAO{

	@Override
	public void autenticacionLDAP(String loginUsuario, String password) {
		/*StringBuilder mensaje = new StringBuilder();		
		mensaje.append("Parametros de Conexión LDAP: \n");
		mensaje.append(KEY_VALIDATOR).append("=").append(validator).append("\n");
		mensaje.append(KEY_URL).append("=").append(url).append("\n");
		mensaje.append(KEY_EMPLEADOS).append("=").append(empleados).append("\n");
		
		if (Constante.DESARROLLO.MODO.equalsIgnoreCase(validator))
		{
			mensaje.append("Ambiente de Desarrollo\n");
			logger.debug(mensaje.toString());
			return;
		}
		
		InitialDirContext ctx = null;
		Properties env = System.getProperties();
		Properties envLDAP = (Properties) env.clone();
		envLDAP.put(Context.INITIAL_CONTEXT_FACTORY,
				"com.sun.jndi.ldap.LdapCtxFactory");
		envLDAP.put(Context.PROVIDER_URL, url);
		envLDAP.put(Context.SECURITY_PRINCIPAL, "cn=" + usuario + ","
				+ empleados);
		envLDAP.put(Context.SECURITY_CREDENTIALS, password);
		try {
			ctx = new InitialDirContext(envLDAP);			
		} catch (AuthenticationException e) {
			mensaje.append("Error de autenticación: \n");
			logger.info(mensaje.toString(), e);
			throw new ValidacionException("login.ldap.validacion", null);
		} catch (NamingException e) {
			mensaje.append("Error de conexión LDAP: \n");
			logger.info(mensaje.toString(), e);
			throw new BBVAServiceExcepcion("login.ldap.error", null, e);
		}
		finally
		{
			try {
				if(ctx!=null)
				{
					ctx.close();
				}
			} catch (NamingException e) {
				mensaje.append("Error al cerrar la conexión LDAP: \n");
				logger.info(mensaje.toString(), e);
				throw new BBVAServiceExcepcion("login.ldap.error", null, e);
			}
		}*/
	}
	
	@Override
	public Usuario login(String loginUsuario) {
		IILDPeUsuario usuarioLDAP = null;
		
		try {
			usuarioLDAP = IILDPeUsuario.recuperarUsuario(loginUsuario);
		} catch (IILDPeExcepcion e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Usuario usuario = null;
		if(usuarioLDAP != null)
		{
			usuario = new Usuario();
			usuario.setNombres(usuarioLDAP.getNombre());
			usuario.setPaterno(usuarioLDAP.getApellido1());
			usuario.setMaterno(usuarioLDAP.getApellido2());
			usuario.setRegistro(loginUsuario);
			if(usuarioLDAP.getCargo()!=null){
				usuario.setCargo(usuarioLDAP.getCargo().getCodigo());
				usuario.setCargoNombre(usuarioLDAP.getCargo().getDescripcion());
			}
			usuario.setCorreo(usuarioLDAP.getEmail());
			if(usuarioLDAP.getBancoOficina()!=null){
				usuario.setCentro(usuarioLDAP.getBancoOficina().getCodigo());
				usuario.setCentroNombre(usuarioLDAP.getBancoOficina().getDescripcion());
			}
		}
		
		return usuario;
	}

}
