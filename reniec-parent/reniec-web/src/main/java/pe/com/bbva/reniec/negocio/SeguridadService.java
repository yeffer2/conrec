package pe.com.bbva.reniec.negocio;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import pe.com.bbva.reniec.dominio.Membresia;
import pe.com.bbva.reniec.dominio.Opcion;
import pe.com.bbva.reniec.dominio.Permiso;
import pe.com.bbva.reniec.dominio.Rol;
import pe.com.bbva.reniec.dominio.Usuario;

public interface SeguridadService extends ConfiguracionService,Serializable{

	Usuario login(String loginUsuario, String password);
	Usuario login(String loginUsuario);
	Map<String, List<Opcion>> obtenerOpciones();
	List<Rol> buscarRoles(Rol rol);
	Rol obtenerRolxId(Long id);
	void guardarRol(Rol rol);
	void eliminarRol(Long id);
	List<Rol> obtenerRolesHijo(Rol rol);
	List<Permiso> obtenerPermisosXRol(Long idRol, boolean estadoActivo);
	List<Membresia> buscarMembresias(Membresia membresia);
	void guardarMembresia(Membresia membresia);
	void eliminarMembresia(Long id);
	void guardarPermisos(Long idRol, List<Long> idsOpciones);
	Map<String, List<Opcion>> listarOpciones();	
	
}
