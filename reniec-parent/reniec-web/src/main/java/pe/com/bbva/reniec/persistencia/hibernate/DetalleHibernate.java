package pe.com.bbva.reniec.persistencia.hibernate;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.com.bbva.reniec.dominio.Detalle;
import pe.com.bbva.reniec.persistencia.DetalleDAO;

/***
 * Clase Hibernate de la tabla Detalle.
 * 
 * @author CDA Informática
 * @since 16/10/2013
 *
 */
@Repository
public class DetalleHibernate extends BaseHibernate<Detalle, Long> implements
		DetalleDAO {
	
	private static final long serialVersionUID = 1L;
	
	@Autowired
	public DetalleHibernate(SessionFactory sessionFactory){
		setSessionFactory(sessionFactory);
	}

}
