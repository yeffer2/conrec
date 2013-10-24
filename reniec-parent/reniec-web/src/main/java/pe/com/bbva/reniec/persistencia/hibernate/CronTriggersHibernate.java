package pe.com.bbva.reniec.persistencia.hibernate;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.com.bbva.reniec.dominio.quartz.QrtzCronTriggers;
import pe.com.bbva.reniec.persistencia.CronTriggersDAO;

/***
 * Clase Hibernate de la tabla Carga.
 * 
 * @author CDA Informática
 * @since 11/10/2013
 *
 */
@Repository
@SuppressWarnings("serial")
public class CronTriggersHibernate extends BaseHibernate<QrtzCronTriggers, Long> implements
		CronTriggersDAO {
	
	@Autowired
	public CronTriggersHibernate(SessionFactory sessionFactory){
		setSessionFactory(sessionFactory);
	}
}
