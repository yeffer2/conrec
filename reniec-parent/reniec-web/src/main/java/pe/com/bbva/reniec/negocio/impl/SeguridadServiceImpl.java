package pe.com.bbva.reniec.negocio.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.bbva.reniec.dominio.Membresia;
import pe.com.bbva.reniec.dominio.Opcion;
import pe.com.bbva.reniec.dominio.Usuario;
import pe.com.bbva.reniec.negocio.SeguridadService;
import pe.com.bbva.reniec.persistencia.LDAP2DAO;
import pe.com.bbva.reniec.persistencia.MembresiaDAO;
import pe.com.bbva.reniec.persistencia.OpcionDAO;
import pe.com.bbva.reniec.persistencia.UsuarioDAO;
import pe.com.bbva.reniec.utileria.ReniecUtil;

@Service
@SuppressWarnings("serial")
public class SeguridadServiceImpl implements SeguridadService{

	@Autowired
	private UsuarioDAO usuarioDAO;
	@Autowired
	private LDAP2DAO ldap2DAO;
	@Autowired
	private MembresiaDAO membresiaDAO;
	@Autowired
	private OpcionDAO opcionDAO;
	
	@Override
	public Usuario login(String loginUsuario, String password) {
		ldap2DAO.autenticacionLDAP(loginUsuario, password);
		Usuario usuarioLDAP=ldap2DAO.login(loginUsuario);
		if(usuarioLDAP!=null){
			Usuario usuario=
					usuarioDAO.obtenerHql("select u from Usuario u where u.registro=?", usuarioLDAP.getRegistro());
			if(usuario==null){
				usuarioDAO.crear(usuarioLDAP);
				return usuarioLDAP;
			}else{
				usuario.setNombres(usuarioLDAP.getNombres());
				usuario.setPaterno(usuarioLDAP.getPaterno());
				usuario.setMaterno(usuarioLDAP.getMaterno());
				usuario.setRegistro(loginUsuario);
				usuario.setCargo(usuarioLDAP.getCargo());
				usuario.setCargoNombre(usuarioLDAP.getCargoNombre());
				usuario.setCorreo(usuarioLDAP.getCorreo());
				usuario.setCentro(usuarioLDAP.getCentro());
				usuario.setCentroNombre(usuarioLDAP.getCentroNombre());
				usuarioDAO.actualizar(usuario);
				return usuario;
			}
		}
		return null;
	}

	@Override
	public Map<String, List<Opcion>> obtenerOpciones() {
		Usuario usuario=ReniecUtil.obtenerUsuarioSesion();
		Map<String, List<Opcion>> map=new HashMap<String, List<Opcion>>();
		if(usuario!=null){
			Membresia membresia=membresiaDAO.obtenerHql("select m from Membresia m where m.valor=?", usuario.getRegistro());
			if(membresia!=null){
				List<Opcion> opciones=opcionDAO.buscarHql("select p.opcion from Permiso p where p.rol.id=? order by p.opcion.padre desc, p.opcion.orden", membresia.getRol().getId());
				map=ReniecUtil.ordenarOpciones(opciones);
			}
		}
		return map;
	}

}
