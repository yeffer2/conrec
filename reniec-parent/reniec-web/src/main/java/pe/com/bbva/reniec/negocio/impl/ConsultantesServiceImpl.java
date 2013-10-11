package pe.com.bbva.reniec.negocio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.bbva.reniec.dominio.Consultante;
import pe.com.bbva.reniec.negocio.ConsultantesService;
import pe.com.bbva.reniec.persistencia.ConsultanteDAO;

@Service
@SuppressWarnings("serial")
public class ConsultantesServiceImpl extends ConfiguracionServiceImpl 
		implements ConsultantesService{

	@Autowired
	ConsultanteDAO consultanteDAO;
	
	@Override
	public List<Consultante> obtenerConsultante() {
		return consultanteDAO.buscarHql("select c from Consultante c");
	}

	@Override
	public void crearConsultante(Consultante consultante) {
		consultanteDAO.crear(consultante);
	}

}
