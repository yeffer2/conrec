package pe.com.bbva.reniec.negocio;

import java.io.Serializable;
import java.util.List;

import com.pe.bbva.reniec.ws.UsuarioResponse;

import pe.com.bbva.reniec.dominio.Consultante;
import pe.com.bbva.reniec.dominio.Valor;

public interface ConsultantesService extends ConfiguracionService,Serializable{

	List<Consultante> obtenerConsultante(Consultante consultante);	
	void guardarConsultante(Consultante consultante);
	void guardarConsultanteUI(Consultante consultante);
	Consultante obtenerConsultantePorIdentificador(String identificador);
	Valor obtenerEstadoReniec(Consultante consultante);
	UsuarioResponse guardarConsultanteWS(Consultante consultante, String proceso);
}
