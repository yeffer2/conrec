package pe.com.bbva.reniec.negocio;

import java.io.Serializable;
import java.util.List;

import pe.com.bbva.reniec.dominio.Valor;

public interface ConfiguracionService extends Serializable{

	List<Valor> obtenerValoresxLista(String codigo);
	
}
