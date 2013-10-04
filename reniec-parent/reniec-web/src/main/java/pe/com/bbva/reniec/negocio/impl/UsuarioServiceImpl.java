package pe.com.bbva.reniec.negocio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.bbva.reniec.dominio.Usuario;
import pe.com.bbva.reniec.negocio.UsuarioService;
import pe.com.bbva.reniec.persistencia.UsuarioDAO;

@Service
public class UsuarioServiceImpl	implements UsuarioService {
	
	@Autowired
	private UsuarioDAO usuarioHibernate;
	
	@Override
	public List<Usuario> obtenerTodos() {
		return usuarioHibernate.obtenerTodos();
	}

	@Override
	public List<Usuario> buscar() {
		// TODO Auto-generated method stub
		return usuarioHibernate.buscarHql("Select u from Usuario u where u.nombres=?","ADMIN");
	}

}
