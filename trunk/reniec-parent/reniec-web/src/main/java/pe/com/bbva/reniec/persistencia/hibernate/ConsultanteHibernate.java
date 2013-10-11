package pe.com.bbva.reniec.persistencia.hibernate;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.com.bbva.reniec.dominio.Consultante;
import pe.com.bbva.reniec.persistencia.ConsultanteDAO;

@Repository
@SuppressWarnings("serial")
public class ConsultanteHibernate extends BaseHibernate<Consultante, Long>
		implements ConsultanteDAO {

	@Autowired
	public ConsultanteHibernate(SessionFactory sessionFactory) {
		setSessionFactory(sessionFactory);
	}
	
}
