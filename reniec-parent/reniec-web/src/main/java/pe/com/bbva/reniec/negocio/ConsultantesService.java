package pe.com.bbva.reniec.negocio;

import java.io.Serializable;
import java.util.List;

import pe.com.bbva.reniec.dominio.Consultante;
import pe.com.bbva.reniec.dominio.Valor;

public interface ConsultantesService extends ConfiguracionService,Serializable{

	List<Consultante> obtenerConsultante(Consultante consultante);	
	void guardarConsultante(Consultante consultante);
	Valor obtenerEstadoReniec(Consultante consultante);
	
}
