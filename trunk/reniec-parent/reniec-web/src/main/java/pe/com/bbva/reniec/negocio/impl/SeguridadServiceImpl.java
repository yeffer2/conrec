package pe.com.bbva.reniec.negocio.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.ListUtils;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.bbva.reniec.dominio.Membresia;
import pe.com.bbva.reniec.dominio.Opcion;
import pe.com.bbva.reniec.dominio.Permiso;
import pe.com.bbva.reniec.dominio.Rol;
import pe.com.bbva.reniec.dominio.Usuario;
import pe.com.bbva.reniec.dominio.Valor;
import pe.com.bbva.reniec.exception.ValidacionException;
import pe.com.bbva.reniec.negocio.SeguridadService;
import pe.com.bbva.reniec.persistencia.LDAP2DAO;
import pe.com.bbva.reniec.persistencia.MembresiaDAO;
import pe.com.bbva.reniec.persistencia.OpcionDAO;
import pe.com.bbva.reniec.persistencia.PermisoDAO;
import pe.com.bbva.reniec.persistencia.RolDAO;
import pe.com.bbva.reniec.persistencia.UsuarioDAO;
import pe.com.bbva.reniec.utileria.Busqueda;
import pe.com.bbva.reniec.utileria.Constante;
import pe.com.bbva.reniec.utileria.ReniecUtil;

@Service
@SuppressWarnings("serial")
public class SeguridadServiceImpl extends ConfiguracionServiceImpl implements SeguridadService{

	@Autowired
	private UsuarioDAO usuarioDAO;
	@Autowired
	private LDAP2DAO ldap2DAO;
	@Autowired
	private MembresiaDAO membresiaDAO;
	@Autowired
	private OpcionDAO opcionDAO;
	@Autowired
	private RolDAO rolDAO;
	@Autowired
	private PermisoDAO permisoDAO;
	
	@Override
	public Usuario login(String loginUsuario, String password) {
		ldap2DAO.autenticacionLDAP(loginUsuario, password);
		Usuario usuarioLDAP=ldap2DAO.login(loginUsuario);
		if(usuarioLDAP!=null){
			Usuario usuario=
					usuarioDAO.obtenerHql("select u from Usuario u where u.registro=?", usuarioLDAP.getRegistro());
			if(usuario==null){
				usuarioDAO.crear(usuarioLDAP);
				usuario=usuarioLDAP;
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
			}
			usuario.setRol(rolDAO.obtenerHql("select m.rol from Membresia m where m.valor=?", usuario.getRegistro()));
			return usuario;
		}
		return null;
	}

	@Override
	public Usuario login(String loginUsuario) {
		Usuario usuarioLDAP=ldap2DAO.login(loginUsuario);
		if(usuarioLDAP!=null){
			Usuario usuario=
					usuarioDAO.obtenerHql("select u from Usuario u where u.registro=?", usuarioLDAP.getRegistro());
			if(usuario==null){
				usuarioDAO.crear(usuarioLDAP);
				usuario=usuarioLDAP;
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
			}
			usuario.setRol(rolDAO.obtenerHql("select m.rol from Membresia m where m.valor=?", usuario.getRegistro()));
			return usuario;
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
				List<Opcion> opciones=opcionDAO.buscarHql("select p.opcion from Permiso p where p.rol.id=? and p.estado.codigo=? order by p.opcion.padre desc, p.opcion.orden", 
						membresia.getRol().getId(), Constante.VALOR.REGISTRO_ESTADO.CODIGO.ACTIVO);
				map=ReniecUtil.ordenarOpciones(opciones);
			}
		}
		return map;
	}

	@Override
	public List<Rol> buscarRoles(Rol rol) {
		Busqueda filtro = Busqueda.forClass(Rol.class);
		if (rol != null) {
			if (rol.getId() != null) {
				filtro.add(Restrictions.eq("id", rol.getId()));
			}
			if (rol.getCodigo() != null) {
				filtro.add(Restrictions.ilike("codigo", "%" + rol.getCodigo() + "%"));
			}
			if (rol.getNombre() != null) {
				filtro.add(Restrictions.ilike("nombre", "%" + rol.getNombre() + "%"));
			}
			if (rol.getPadre() != null && rol.getPadre().getNombre() != null) {
				filtro.createAlias("padre", "p");
				filtro.add(Restrictions.ilike("p.nombre", "%" + rol.getPadre().getNombre() + "%"));
			}
			if (rol.getEstado() != null && rol.getEstado().getNombre() != null) {
				filtro.createAlias("estado", "est");
				filtro.add(Restrictions.ilike("est.nombre", "%" + rol.getEstado().getNombre() + "%"));
			}

		}
		filtro.addOrder(Order.asc("id"));
		return rolDAO.buscar(filtro);
	}

	@Override
	public Rol obtenerRolxId(Long id) {
		return rolDAO.obtener(id);
	}

	@Override
	public void guardarRol(Rol rol) {
		if(rol.getId()==null){
			rolDAO.crear(rol);
		}else{
			rolDAO.actualizar(rol);
		}
	}

	@Override
	public void eliminarRol(Long id) {
		rolDAO.eliminarXId(id);
	}

	@Override
	public List<Rol> obtenerRolesHijo(Rol rol) {
		Busqueda filtro = Busqueda.forClass(Rol.class);
		if (rol != null) {
			if (rol.getId() != null) {
				filtro.add(Restrictions.ne("id", rol.getId()));
				filtro.createAlias("padre", "p");
				filtro.add(Restrictions.eq("p.id", rol.getId()));
			}
		}
		filtro.addOrder(Order.asc("id"));
		return rolDAO.buscar(filtro);
	}

	@Override
	public List<Permiso> obtenerPermisosXRol(Long idRol, boolean estadoActivo) {
		Busqueda filtro = Busqueda.forClass(Permiso.class);
		filtro.createAlias("rol", "r");
		filtro.createAlias("opcion", "o");
		filtro.createAlias("o.estado", "oe");		
		filtro.add(Restrictions.eq("oe.codigo", Constante.VALOR.REGISTRO_ESTADO.CODIGO.ACTIVO));
		filtro.add(Restrictions.eq("r.id", idRol));
		if(estadoActivo)
		{
			filtro.createAlias("estado", "e");
			filtro.add(Restrictions.eq("e.codigo", Constante.VALOR.REGISTRO_ESTADO.CODIGO.ACTIVO));
			
		}
		filtro.addOrder(Order.asc("o.padre"));
		filtro.addOrder(Order.asc("o.tipo"));
		filtro.addOrder(Order.asc("o.orden"));
		return permisoDAO.buscar(filtro);
	}

	@Override
	public List<Membresia> buscarMembresias(Membresia membresia) {
		Busqueda filtro = Busqueda.forClass(Membresia.class);
		if (membresia != null) {
			if (membresia.getId() != null) {
				filtro.add(Restrictions.eq("id",membresia.getId()));
			}
			if (membresia.getTipo() != null
					&& membresia.getTipo().getNombre() != null) {
				filtro.createAlias("tipo", "t");
				filtro.createAlias("t.lista", "lt");
				filtro.add(Restrictions.eq("lt.codigo",
						Constante.LISTA.CODIGO.MEMBRESIA_TIPO));
				filtro.add(Restrictions.ilike("t.nombre", membresia.getTipo().getNombre(), MatchMode.ANYWHERE));
			}
			if (membresia.getValor() != null) {
				filtro.add(Restrictions.ilike("valor", membresia.getValor(), MatchMode.ANYWHERE));
			}
			if (membresia.getEstado() != null
					&& membresia.getEstado().getNombre() != null) {
				filtro.createAlias("estado", "e");
				filtro.createAlias("e.lista", "le");
				filtro.add(Restrictions.eq("le.codigo",
						Constante.LISTA.CODIGO.REGISTRO_ESTADO));
				filtro.add(Restrictions.ilike("e.nombre",membresia.getEstado().getNombre(), MatchMode.ANYWHERE));
			}
			if (membresia.getRol() != null
					&& membresia.getRol().getId() != null) {
				filtro.createAlias("rol", "r");
				filtro.add(Restrictions.eq("r.id",
						membresia.getRol().getId()));
			}

		}
		filtro.addOrder(Order.asc("id"));
		return membresiaDAO.buscar(filtro);
	}

	@Override
	public void guardarMembresia(Membresia membresia) {
		Membresia membresiaBusqueda=membresiaDAO.obtenerHql("select m from Membresia m where valor=?", membresia.getValor());
		if(membresiaBusqueda!=null){
			throw new ValidacionException(Constante.CODIGO_MENSAJE.VALIDAR_EXISTE_VALOR,new Object[] {membresia.getValor()});
		}
		if(membresia.getId()==null){
			membresiaDAO.crear(membresia);
		}else{
			membresiaDAO.actualizar(membresia);
		}
	}

	@Override
	public void eliminarMembresia(Long id) {
		membresiaDAO.eliminarXId(id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void guardarPermisos(Long idRol, List<Long> idsOpciones) {
		List<Permiso> permisosALL = obtenerPermisosXRol(idRol, false);
		List<Permiso> permisosA = obtenerPermisosXRol(idRol, true);
		List<Permiso> permisosSel = new ArrayList<Permiso>();
		for (Long idOpcion : idsOpciones) {
			Permiso permiso = new Permiso();
			permiso.setRol(new Rol());
			permiso.getRol().setId(idRol);
			permiso.setOpcion(new Opcion());
			permiso.getOpcion().setId(idOpcion);
			permisosSel.add(permiso);
		}
		List<Permiso> permisosD = ListUtils.subtract(permisosALL, permisosA);
		
		List<Permiso> updPermisosD = ListUtils.subtract(permisosA, permisosSel);
		List<Permiso> updPermisosA = ListUtils.intersection(permisosSel, permisosD);
		List<Permiso> insPermisosA = ListUtils.subtract(permisosSel, permisosALL);
		
		Valor estadoInactivo = obtenerValorxCodigo(Constante.LISTA.CODIGO.REGISTRO_ESTADO, Constante.VALOR.REGISTRO_ESTADO.CODIGO.INACTIVO);
		Valor estadoActivo = obtenerValorxCodigo(Constante.LISTA.CODIGO.REGISTRO_ESTADO, Constante.VALOR.REGISTRO_ESTADO.CODIGO.ACTIVO);
		
		prepararLista(updPermisosD, estadoInactivo);
		prepararLista(updPermisosA, estadoActivo);
		prepararLista(insPermisosA, estadoActivo);
		
		List<Permiso> permisosU = ListUtils.union(updPermisosD, updPermisosA);
		List<Permiso> permisos = ListUtils.union(permisosU, insPermisosA);
		
		permisoDAO.grabarTodos(permisos);		
	}

	private void prepararLista(List<Permiso> lista, Valor estado)
	{
		for (Permiso permiso : lista) {
			permiso.setEstado(estado);
		}
	}

	@Override
	public Map<String, List<Opcion>> listarOpciones() {
		Busqueda filtro = Busqueda.forClass(Opcion.class);
		filtro.addOrder(Order.asc("id"));
		filtro.addOrder(Order.asc("padre"));
		filtro.addOrder(Order.asc("orden"));
		
		List<Opcion> opciones = opcionDAO.buscar(filtro);
		
		return ReniecUtil.ordenarOpciones(opciones);
	}

	@Override
	public List<Opcion> buscarOpciones(Opcion opcion) {
		Busqueda filtro = Busqueda.forClass(Opcion.class);
		if (opcion != null) {
			if (opcion.getId() != null) {
				filtro.add(Restrictions.ilike("id", opcion.getId().toString(), MatchMode.ANYWHERE));
			}
		}
		filtro.addOrder(Order.asc("codigo"));
		return opcionDAO.buscar(filtro);
	}

	@Override
	public void guardarOpcion(Opcion opcion) {
		if(opcion.getId()==null){
			opcionDAO.crear(opcion);
		}else{
			opcionDAO.actualizar(opcion);
		}
	}

	@Override
	public void eliminarOpcion(Long id) {
		List<Opcion> opciones=opcionDAO.buscarHql("select o from Opcion o where padre.id=?", id);
		if(!opciones.isEmpty()){
			throw new ValidacionException(Constante.CODIGO_MENSAJE.VALIDAR_DEPENDENCIA_OPCION,new Object[] {opciones.get(0).getPadre().getCodigo()});
		}
		List<Permiso> permisos=permisoDAO.buscarHql("select p from Permiso p where opcion.id=?", id);
		permisoDAO.eliminarTodos(permisos);
		opcionDAO.eliminarXId(id);
	}
	
}
