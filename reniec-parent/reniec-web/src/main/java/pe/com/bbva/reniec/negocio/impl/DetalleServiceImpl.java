package pe.com.bbva.reniec.negocio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.bbva.reniec.dominio.Detalle;
import pe.com.bbva.reniec.negocio.DetalleService;
import pe.com.bbva.reniec.persistencia.DetalleDAO;

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

}
