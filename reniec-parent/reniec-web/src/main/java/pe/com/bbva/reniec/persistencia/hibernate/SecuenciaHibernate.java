package pe.com.bbva.reniec.persistencia.hibernate;

import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.com.bbva.reniec.dominio.Secuencia;
import pe.com.bbva.reniec.persistencia.SecuenciaDAO;

@Repository
@SuppressWarnings("serial")
public class SecuenciaHibernate extends BaseHibernate<Secuencia, Long>
		implements SecuenciaDAO {

	@Autowired
	public SecuenciaHibernate(SessionFactory sessionFactory) {
		setSessionFactory(sessionFactory);
	}
	
}
