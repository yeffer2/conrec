package pe.com.bbva.reniec.persistencia.hibernate.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import pe.com.bbva.reniec.exception.ValidacionException;
import pe.com.bbva.reniec.persistencia.hibernate.BaseHibernate;
import pe.com.bbva.reniec.utileria.Busqueda;
import pe.com.bbva.reniec.utileria.Constante;

@SuppressWarnings("serial")
public abstract class BaseHibernateImpl
				<Entidad extends Serializable, TipoLlave extends Serializable>
		extends HibernateDaoSupport implements BaseHibernate<Entidad, TipoLlave> {
			
	protected final static Log logger = LogFactory.getLog(BaseHibernateImpl.class);
	
	protected Class<Entidad> domainClass;// = getDomainClass();		
	
	@SuppressWarnings("unchecked")
	public BaseHibernateImpl() {
		super();
		this.domainClass = (Class<Entidad>) ((ParameterizedType) getClass()
				.getGenericSuperclass()).getActualTypeArguments()[0];
	}
	
	public Entidad obtener(TipoLlave id) {		
		return (Entidad) getHibernateTemplate().get(domainClass, id);
	}

	public void actualizar(Entidad t) {
		getHibernateTemplate().update(t);
		getHibernateTemplate().flush();
	}

	public void crear(Entidad t) {
		getHibernateTemplate().persist(t);
	}
	
	public void grabarTodos(List<Entidad> list)
	{
		getHibernateTemplate().saveOrUpdateAll(list);  
	}

	public void eliminar(Entidad t) {
		try{
			getHibernateTemplate().delete(t);
			getHibernateTemplate().flush();
		}catch (DataIntegrityViolationException e) {
//			System.out.println("MostSpecificCause : "+e.getMostSpecificCause().fillInStackTrace().getMessage());
//			System.out.println("MostSpecificCause : "+e.getMostSpecificCause().getMessage());
			throw new ValidacionException(Constante.CODIGO_MENSAJE.VALIDAR_ELIMINAR_GENERICO,null,e);
		}
	}

	@SuppressWarnings("unchecked")
	public List<Entidad> obtenerTodos() {
		return (getHibernateTemplate().find("from " + domainClass.getName()
				+ " x"));
	}

	public void eliminarXId(TipoLlave id) {
		try{
			Object obj = obtener(id);
			getHibernateTemplate().delete(obj);
			getHibernateTemplate().flush();
		}catch (DataIntegrityViolationException e) {
			throw new ValidacionException(Constante.CODIGO_MENSAJE.VALIDAR_ELIMINAR_GENERICO,null,e);
		}
	}
	
	/*public void deleteAll() {
        getHibernateTemplate().execute(new HibernateCallback() {
            public Object doInHibernate(Session session) throws HibernateException {
                String hqlDelete = "delete " + domainClass.getName();
                int deletedEntities = session.createQuery(hqlDelete).executeUpdate();
                return null;
            }

        });
    }*/
	
	public void eliminarTodos(List<Entidad> list) {
		getHibernateTemplate().deleteAll(list);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<Entidad> buscar(final Busqueda filtro) {
		return (List<Entidad>)this.getHibernateTemplate().execute(new HibernateCallback() {
	        public Object doInHibernate(Session session) throws HibernateException, SQLException {
	            Criteria busqueda = filtro.getExecutableCriteria(session);
	            busqueda.setFirstResult(((Busqueda)filtro).getFirstResult());
	            if (filtro.getMaxResults() > 0)
	            {
	                busqueda.setMaxResults(((Busqueda)filtro).getMaxResults());
	            }
	            return (List<Entidad>)busqueda.list(); 
	        }
	    });
	}

	public int contar() {
		@SuppressWarnings("rawtypes")
		List list = getHibernateTemplate().find(
				"select count(*) from " + domainClass.getName() + " x");
		Integer count = (Integer) list.get(0);
		return count.intValue();
	}
	
	public boolean contiene(TipoLlave tipoLlave) {
		Entidad object = obtener(tipoLlave);
		return object != null;
	};

}
