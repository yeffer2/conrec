package pe.com.bbva.reniec.persistencia.hibernate;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.com.bbva.reniec.dominio.Parametro;
import pe.com.bbva.reniec.persistencia.ParametroDAO;

/***
 * Clase Hibernate de la tabla Carga.
 * 
 * @author CDA Informática
 * @since 11/10/2013
 *
 */
@Repository
@SuppressWarnings("serial")
public class ParametroHibernate extends BaseHibernate<Parametro, String> implements
		ParametroDAO {
	
	@Autowired
	public ParametroHibernate(SessionFactory sessionFactory){
		setSessionFactory(sessionFactory);
	}
}
