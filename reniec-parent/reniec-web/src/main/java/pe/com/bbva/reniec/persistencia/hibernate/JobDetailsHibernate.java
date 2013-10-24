package pe.com.bbva.reniec.persistencia.hibernate;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.com.bbva.reniec.dominio.quartz.QrtzJobDetails;
import pe.com.bbva.reniec.persistencia.JobDetailsDAO;

/***
 * Clase Hibernate de la tabla Carga.
 * 
 * @author CDA Informática
 * @since 11/10/2013
 *
 */
@Repository
public class JobDetailsHibernate extends BaseHibernate<QrtzJobDetails, Long> implements
		JobDetailsDAO {

	private static final long serialVersionUID = 1L;
	
	@Autowired
	public JobDetailsHibernate(SessionFactory sessionFactory){
		setSessionFactory(sessionFactory);
	}
}
