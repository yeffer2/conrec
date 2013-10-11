package pe.com.bbva.reniec.persistencia.hibernate;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.com.bbva.reniec.dominio.Valor;
import pe.com.bbva.reniec.persistencia.ValorDAO;

@Repository
@SuppressWarnings("serial")
public class ValorHibernate extends BaseHibernate<Valor, Long>
		implements ValorDAO {

	@Autowired
	public ValorHibernate(SessionFactory sessionFactory) {
		setSessionFactory(sessionFactory);
	}
	
}
