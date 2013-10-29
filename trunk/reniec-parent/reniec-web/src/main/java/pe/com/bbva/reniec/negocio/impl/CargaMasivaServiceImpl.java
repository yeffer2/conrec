package pe.com.bbva.reniec.negocio.impl;

import java.util.List;

import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.bbva.reniec.dominio.Carga;
import pe.com.bbva.reniec.negocio.CargaMasivaService;
import pe.com.bbva.reniec.persistencia.CargaDAO;
import pe.com.bbva.reniec.utileria.Busqueda;
import pe.com.bbva.reniec.utileria.Utilidades;

/***
 * Servicio para las Consultas de la carga masiva.
 * @author CDA Informática
 * @since 11/10/2013
 *
 */
@Service
public class CargaMasivaServiceImpl extends ConfiguracionServiceImpl implements
		CargaMasivaService {

	private static final long serialVersionUID = 1L;
	
	@Autowired
	CargaDAO cargaDao;

	@Override
	public List<Carga> obtenerCargasDesc() {		
		return cargaDao.buscarHql("select c from Carga c order by c.id desc");
	}
	
	@Override
	public List<Carga> obtenerCargasDescByCriteria(Carga carga) {	
		Busqueda filtro = Busqueda.forClass(Carga.class);
		if (carga != null)
		{			
			if (carga.getId() != null)
				filtro.add(Restrictions.eq("id", carga.getId()));			
			if(carga.getMensaje() != null)
				filtro.add(Restrictions.ilike("mensaje", carga.getMensaje(), MatchMode.ANYWHERE));
			if(carga.getInicio() != null)
				filtro.add(Restrictions.ge("inicio", Utilidades.fechaInicial(carga.getInicio())));
			if(carga.getFin()!= null)
				filtro.add(Restrictions.le("fin", Utilidades.fechaFinal(carga.getFin())));
			if(carga.getEstado() != null){
				filtro.createAlias("estado", "e");
				filtro.add(Restrictions.eq("e.codigo", carga.getEstado().getCodigo()));
			}
			if(carga.getTipo() != null){
				filtro.createAlias("tipo", "t");
				filtro.add(Restrictions.eq("t.codigo", carga.getTipo().getCodigo()));
			}
			if(carga.getOrigen() != null){
				filtro.createAlias("origen", "o");
				filtro.add(Restrictions.eq("o.codigo", carga.getOrigen().getCodigo()));
			}
		}
System.out.println(cargaDao.buscar(filtro).size());
		filtro.addOrder(Order.desc("id"));
		return cargaDao.buscar(filtro);
	}

	@Override
	public Long obtenerUltimoId() {
		Carga cargaIdMax = cargaDao.obtenerHql("select c from Carga c where c.id = (select max(cc.id) from Carga cc)");		
		return (cargaIdMax != null) ? cargaIdMax.getId() : 0L;
	}
	
	@Override
	public void guardarCarga(Carga carga) {
		if(carga.getId() == null)
			cargaDao.crear(carga);
		else
			cargaDao.actualizar(carga);
	}
	

}
