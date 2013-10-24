package pe.com.bbva.reniec.persistencia.hibernate;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.com.bbva.reniec.dominio.quartz.QrtzTriggers;
import pe.com.bbva.reniec.persistencia.TriggersDAO;

/***
 * Clase Hibernate de la tabla Carga.
 * 
 * @author CDA Informática
 * @since 11/10/2013
 *
 */
@Repository
@SuppressWarnings("serial")
public class TriggersHibernate extends BaseHibernate<QrtzTriggers, Long> implements
		TriggersDAO {
	
	@Autowired
	public TriggersHibernate(SessionFactory sessionFactory){
		setSessionFactory(sessionFactory);
	}
}
