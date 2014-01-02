package pe.com.bbva.reniec.persistencia.hibernate;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import pe.com.bbva.reniec.dominio.Secuencia;
import pe.com.bbva.reniec.dominio.Usuario;
import pe.com.bbva.reniec.dominio.util.AuditoriaBean;
import pe.com.bbva.reniec.dominio.util.IdBean;
import pe.com.bbva.reniec.persistencia.BaseDAO;
import pe.com.bbva.reniec.utileria.Busqueda;
import pe.com.bbva.reniec.utileria.ReniecUtil;

@SuppressWarnings("serial")
public abstract class BaseHibernate
				<Entidad extends Serializable, TipoLlave extends Serializable>
		extends HibernateDaoSupport implements BaseDAO<Entidad, TipoLlave> {
	
	protected Class<Entidad> domainClass;
	
	@SuppressWarnings("unchecked")
	public BaseHibernate() {
		super();
		this.domainClass = (Class<Entidad>) ((ParameterizedType) getClass()
				.getGenericSuperclass()).getActualTypeArguments()[0];
	}
	
	public Entidad obtener(TipoLlave id) {		
		return (Entidad) getHibernateTemplate().get(domainClass, id);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Entidad obtener(final Busqueda filtro) {
		List<Entidad> list= (List<Entidad>)this.getHibernateTemplate().execute(new HibernateCallback() {
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
		if(list!=null && !list.isEmpty()){
			return list.get(0);
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public Entidad obtenerHql(String sql, Object... object) {
		getHibernateTemplate().setMaxResults(1);
		List<Entidad> list=getHibernateTemplate().find(sql,object);
		if(list!=null && !list.isEmpty()){
			return list.get(0);
		}
		return null;
	}

	@Transactional
	public void actualizar(Entidad t) {
		validarAuditoria(t);
		getHibernateTemplate().update(t);
	}

	@Transactional
	public void crear(Entidad t) {
		validarId(t);
		validarAuditoria(t);
		getHibernateTemplate().persist(t);
	}
	
	@Transactional
	public void grabarTodos(List<Entidad> list)
	{
		for (Entidad entidad : list) {
			validarId(entidad);
			validarAuditoria(entidad);
		}
		getHibernateTemplate().saveOrUpdateAll(list);  
	}

	@Transactional
	public void eliminar(Entidad t) {
		getHibernateTemplate().delete(t);
	}
	
	@Transactional
	public void eliminarXId(TipoLlave id) {
		Object obj = obtener(id);
		getHibernateTemplate().delete(obj);
	}
	
	@Transactional
	public void eliminarTodos(List<Entidad> list) {
		getHibernateTemplate().deleteAll(list);
	}

	public List<Entidad> obtenerTodos() {
		return getHibernateTemplate().loadAll(domainClass);
	}
	
	@SuppressWarnings("rawtypes")
	public int contar() {
		List list = getHibernateTemplate().find(
				"select count(*) from " + domainClass.getName() + " x");
		Integer count = (Integer) list.get(0);
		return count.intValue();
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
	
	@SuppressWarnings("unchecked")
	public List<Entidad> buscarHql(String sql, Object... object){
		getHibernateTemplate().setMaxResults(0);
		List<Entidad> list=getHibernateTemplate().find(sql,object);
		return list;
	}
	
	@SuppressWarnings("unchecked")
	public List<Entidad> buscarHql(String sql, int limite, Object... object) {
		getHibernateTemplate().setMaxResults(limite);
		List<Entidad> list=getHibernateTemplate().find(sql,object);
		return list;
	}

	public boolean contiene(TipoLlave tipoLlave) {
		Entidad object = obtener(tipoLlave);
		return object != null;
	};
	
	@SuppressWarnings("unchecked")
	private void validarId(Entidad t){
		if(t instanceof IdBean){
			IdBean idBean=(IdBean)t;
			if(idBean.getId()==null){
				Secuencia secuencia=null;
				getHibernateTemplate().setMaxResults(1);
				List<Secuencia> list=getHibernateTemplate().find("select s from Secuencia s where s.entidad=?",t.getClass().getName());
				if(list==null || list.isEmpty()){
					secuencia=new Secuencia();
					secuencia.setEntidad(t.getClass().getName());
					secuencia.setUltimoId(1L);
					getHibernateTemplate().persist(secuencia);
				}else{
					secuencia=list.get(0);
					secuencia.setUltimoId(secuencia.getUltimoId()+1L);
					getHibernateTemplate().update(secuencia);
				}
				idBean.setId(secuencia.getUltimoId());
			}
		}
	}
	
	private void validarAuditoria(Entidad t){
		if(t instanceof AuditoriaBean){
			AuditoriaBean auditoriaBean=(AuditoriaBean)t;
			Usuario usuario=ReniecUtil.obtenerUsuarioSesion();
			if(usuario==null){
				usuario=new Usuario();
				usuario.setId(1L);
			}
			if(auditoriaBean.getCreador()==null || auditoriaBean.getCreacion()==null){
				auditoriaBean.setCreador(usuario);
				auditoriaBean.setCreacion(new Date());
			}else{
				auditoriaBean.setEditor(usuario);
				auditoriaBean.setEdicion(new Date());
			}
		}
	}
	
}
