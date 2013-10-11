package pe.com.bbva.reniec.negocio;

import java.io.Serializable;
import java.util.List;

import pe.com.bbva.reniec.dominio.Usuario;

public interface UsuarioService extends Serializable{
	
	public List<Usuario> obtenerTodos();
	
	public List<Usuario> buscar();
	
}
