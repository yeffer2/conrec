package pe.com.bbva.reniec.negocio;

import java.io.Serializable;
import java.util.List;

import com.pe.bbva.reniec.ws.UsuarioResponse;

import pe.com.bbva.reniec.dominio.Consultante;
import pe.com.bbva.reniec.dominio.Valor;

public interface ConsultantesService extends ConfiguracionService,Serializable{

	List<Consultante> obtenerConsultante(Consultante consultante);	
	String guardarConsultante(Consultante consultante);
	String guardarConsultanteUI(Consultante consultante);
	Consultante obtenerConsultantePorIdentificador(String identificador);
	Valor obtenerEstadoReniec(Consultante consultante);
	UsuarioResponse guardarConsultanteWS(Consultante consultante, String proceso);
	Consultante obtenerConsultanteLDAP(String registro, Valor origen);
}
