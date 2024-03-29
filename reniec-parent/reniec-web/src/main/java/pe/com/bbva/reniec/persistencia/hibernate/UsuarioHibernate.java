package pe.com.bbva.reniec.persistencia.hibernate;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.com.bbva.reniec.dominio.Usuario;
import pe.com.bbva.reniec.persistencia.UsuarioDAO;

@Repository
@SuppressWarnings("serial")
public class UsuarioHibernate extends BaseHibernate<Usuario, Long>
		implements UsuarioDAO {

	@Autowired
	public UsuarioHibernate(SessionFactory sessionFactory) {
		setSessionFactory(sessionFactory);
	}
	
}
