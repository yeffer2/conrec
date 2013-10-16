package pe.com.bbva.reniec.negocio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.bbva.reniec.dominio.Carga;
import pe.com.bbva.reniec.negocio.CargaMasivaService;
import pe.com.bbva.reniec.persistencia.CargaDAO;

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
		return cargaDao.buscarHql("select c from Carga c order by c.fecha desc");
	}

}
