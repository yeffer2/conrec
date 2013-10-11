package pe.com.bbva.reniec.negocio;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import pe.com.bbva.reniec.dominio.Opcion;
import pe.com.bbva.reniec.dominio.Usuario;

public interface SeguridadService extends Serializable{

	Usuario login(String loginUsuario, String password);
	Map<String, List<Opcion>> obtenerOpciones();
	
}
