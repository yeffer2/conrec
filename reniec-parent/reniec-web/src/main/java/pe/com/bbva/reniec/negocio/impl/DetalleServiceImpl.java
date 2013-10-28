package pe.com.bbva.reniec.negocio.impl;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.bbva.reniec.dominio.Carga;
import pe.com.bbva.reniec.dominio.Detalle;
import pe.com.bbva.reniec.negocio.DetalleService;
import pe.com.bbva.reniec.persistencia.DetalleDAO;
import pe.com.bbva.reniec.utileria.Busqueda;
import pe.com.bbva.reniec.utileria.Constante;

/***
 * Servicio para el detalle de las cargas masivas.
 * 
 * @author CDA Informática
 * @since 16/10/2013
 * 
 */
@Service
public class DetalleServiceImpl extends ConfiguracionServiceImpl implements
		DetalleService {

	@Autowired
	DetalleDAO detalleDAO;
	
	@Override
	public List<Detalle> cargaDetallesPorCarga(Long idCarga) {		
		return detalleDAO.buscarHql("select d from Detalle where d.carga = ?", idCarga);
	}

	@Override
	public List<Detalle> cargaDetallesCriteria(Detalle detalle) {		
		Busqueda filtro = Busqueda.forClass(Detalle.class);
		if (detalle != null){
			if(detalle.getCarga().getId() != null){
				filtro.createAlias("carga", "c");
				filtro.add(Restrictions.eq("c.id", detalle.getCarga().getId()));
			}
			if(detalle.getId() != null)
				filtro.add(Restrictions.eq("id", detalle.getId()));		
			
			if(detalle.getNroFila() != null)
				filtro.add(Restrictions.eq("nroFila", detalle.getNroFila()));
			
			if(detalle.getCodigoReniec() != null)
				filtro.add(Restrictions.ilike("codigoReniec", detalle.getCodigoReniec(), MatchMode.ANYWHERE));	
			
			if(detalle.getNumeroDoi() != null)
				filtro.add(Restrictions.ilike("numeroDoi", detalle.getNumeroDoi(), MatchMode.ANYWHERE));
			
			if(detalle.getNombreCompleto() != null)
				filtro.add(Restrictions.sqlRestriction("paterno || ' ' || materno || ' ' || nombres like ?", "%" + detalle.getNombreCompleto() + "%", Hibernate.STRING));
			
			if(detalle.getConsultante() != null){				
				if (detalle.getConsultante().getEstado() != null){
					filtro.createAlias("consultante", "con");
					filtro.createAlias("con.estado", "cone");
					filtro.createAlias("cone.lista", "cel");
					filtro.add(Restrictions.eq("cel.codigo", Constante.LISTA.CODIGO.USUARIO_ESTADO));
					filtro.add(Restrictions.ilike("cone.nombre", detalle.getConsultante().getEstado().getNombre(), MatchMode.ANYWHERE));
			
				}
			}
		
		}
		return detalleDAO.buscar(filtro);
	}
	
	@Override
	public void guardaDetalle(Detalle detalle) {		
		if (detalle.getId() == null)
			detalleDAO.crear(detalle);
		else
			detalleDAO.actualizar(detalle);
	}

}
