package pe.com.bbva.reniec.persistencia.hibernate;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.com.bbva.reniec.dominio.Permiso;
import pe.com.bbva.reniec.persistencia.PermisoDAO;

@Repository
@SuppressWarnings("serial")
public class PermisoHibernate extends BaseHibernate<Permiso, Long> implements
		PermisoDAO {
	
	@Autowired
	public PermisoHibernate(SessionFactory sessionFactory){
		setSessionFactory(sessionFactory);
	}
}
