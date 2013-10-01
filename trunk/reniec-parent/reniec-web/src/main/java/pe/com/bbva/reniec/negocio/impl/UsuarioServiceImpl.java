package pe.com.bbva.reniec.negocio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.bbva.reniec.dominio.Usuario;
import pe.com.bbva.reniec.negocio.UsuarioService;
import pe.com.bbva.reniec.persistencia.hibernate.UsuarioHibernate;

@Service
public class UsuarioServiceImpl	implements UsuarioService {
	
	@Autowired
	private UsuarioHibernate usuarioHibernate;
	
	public List<Usuario> obtenerTodos() {
		return usuarioHibernate.obtenerTodos();
	}

}
