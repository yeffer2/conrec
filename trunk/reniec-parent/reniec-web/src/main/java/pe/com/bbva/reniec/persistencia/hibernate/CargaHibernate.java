package pe.com.bbva.reniec.persistencia.hibernate;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.com.bbva.reniec.dominio.Carga;
import pe.com.bbva.reniec.persistencia.CargaDAO;

/***
 * Clase Hibernate de la tabla Carga.
 * 
 * @author CDA Informática
 * @since 11/10/2013
 *
 */
@Repository
public class CargaHibernate extends BaseHibernate<Carga, Long> implements
		CargaDAO {

	private static final long serialVersionUID = 1L;
	
	@Autowired
	public CargaHibernate(SessionFactory sessionFactory){
		setSessionFactory(sessionFactory);
	}
}
