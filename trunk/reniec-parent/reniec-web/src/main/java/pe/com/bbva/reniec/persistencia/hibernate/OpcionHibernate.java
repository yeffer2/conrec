package pe.com.bbva.reniec.persistencia.hibernate;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.com.bbva.reniec.dominio.Opcion;
import pe.com.bbva.reniec.persistencia.OpcionDAO;

@Repository
@SuppressWarnings("serial")
public class OpcionHibernate extends BaseHibernate<Opcion, Long>
		implements OpcionDAO {

	@Autowired
	public OpcionHibernate(SessionFactory sessionFactory) {
		setSessionFactory(sessionFactory);
	}
	
}
