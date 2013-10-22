package pe.com.bbva.reniec.persistencia.hibernate;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.com.bbva.reniec.dominio.Lista;
import pe.com.bbva.reniec.persistencia.ListaDAO;

/***
 * Clase Hibernate de la tabla Carga.
 * 
 * @author CDA Informática
 * @since 11/10/2013
 *
 */
@Repository
public class ListaHibernate extends BaseHibernate<Lista, Long> implements
		ListaDAO {

	private static final long serialVersionUID = 1L;
	
	@Autowired
	public ListaHibernate(SessionFactory sessionFactory){
		setSessionFactory(sessionFactory);
	}
}
