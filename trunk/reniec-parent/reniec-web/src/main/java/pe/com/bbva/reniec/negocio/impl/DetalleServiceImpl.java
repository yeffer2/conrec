package pe.com.bbva.reniec.negocio.impl;

import java.util.List;

import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.bbva.reniec.dominio.Carga;
import pe.com.bbva.reniec.dominio.Detalle;
import pe.com.bbva.reniec.negocio.DetalleService;
import pe.com.bbva.reniec.persistencia.DetalleDAO;
import pe.com.bbva.reniec.utileria.Busqueda;

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
	public List<Detalle> cargaDetallesPorDetalle(Detalle detalle) {		
		Busqueda filtro = Busqueda.forClass(Carga.class);
		if (detalle != null){
			if(detalle.getCarga().getId() != null){
				filtro.createAlias("carga", "c");
				filtro.add(Restrictions.eq("c.id", detalle.getCarga().getId()));	
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
