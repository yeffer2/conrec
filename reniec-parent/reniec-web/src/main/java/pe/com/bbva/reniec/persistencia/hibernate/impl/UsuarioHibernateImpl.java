package pe.com.bbva.reniec.persistencia.hibernate.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.com.bbva.reniec.dominio.Usuario;
import pe.com.bbva.reniec.persistencia.hibernate.UsuarioHibernate;


@Repository
@SuppressWarnings("serial")
public class UsuarioHibernateImpl extends BaseHibernateImpl<Usuario, Long>
		implements UsuarioHibernate {

	@Autowired
	public UsuarioHibernateImpl(SessionFactory sessionFactory) {
		setSessionFactory(sessionFactory);
	}
}
