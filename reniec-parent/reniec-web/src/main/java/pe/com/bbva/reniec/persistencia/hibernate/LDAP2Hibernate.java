package pe.com.bbva.reniec.persistencia.hibernate;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.grupobbva.bc.per.tele.ldap.comunes.IILDPeExcepcion;
import com.grupobbva.bc.per.tele.ldap.directorio.IILDPeUsuario;

import pe.com.bbva.reniec.dominio.Ldapperu2;
import pe.com.bbva.reniec.dominio.Usuario;
import pe.com.bbva.reniec.persistencia.LDAP2DAO;
import pe.com.bbva.reniec.utileria.Busqueda;

@Repository
@SuppressWarnings("serial")
public class LDAP2Hibernate extends HibernateDaoSupport implements LDAP2DAO{
	
	@Autowired
	public LDAP2Hibernate(SessionFactory sessionFactory){
		setSessionFactory(sessionFactory);
	}

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

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<Ldapperu2> buscar(final Busqueda filtro) {
		return (List<Ldapperu2>)this.getHibernateTemplate().execute(new HibernateCallback() {
	        public Object doInHibernate(Session session) throws HibernateException, SQLException {
	            Criteria busqueda = filtro.getExecutableCriteria(session);
	            busqueda.setFirstResult(((Busqueda)filtro).getFirstResult());
	            if (filtro.getMaxResults() > 0)
	            {
	                busqueda.setMaxResults(((Busqueda)filtro).getMaxResults());
	            }
	            return (List<Ldapperu2>)busqueda.list(); 
	        }
	    });
	}


	

}
