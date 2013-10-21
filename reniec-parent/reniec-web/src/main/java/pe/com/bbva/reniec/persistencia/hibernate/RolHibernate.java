package pe.com.bbva.reniec.persistencia.hibernate;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.com.bbva.reniec.dominio.Rol;
import pe.com.bbva.reniec.persistencia.RolDAO;

@Repository
@SuppressWarnings("serial")
public class RolHibernate extends BaseHibernate<Rol, Long> implements
		RolDAO {
	
	@Autowired
	public RolHibernate(SessionFactory sessionFactory){
		setSessionFactory(sessionFactory);
	}
}
