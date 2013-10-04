package pe.com.bbva.reniec.persistencia.hibernate;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.com.bbva.reniec.dominio.Membresia;
import pe.com.bbva.reniec.persistencia.MembresiaDAO;

@Repository
@SuppressWarnings("serial")
public class MembresiaHibernate extends BaseHibernate<Membresia, Long>
		implements MembresiaDAO {

	@Autowired
	public MembresiaHibernate(SessionFactory sessionFactory) {
		setSessionFactory(sessionFactory);
	}
	
}
