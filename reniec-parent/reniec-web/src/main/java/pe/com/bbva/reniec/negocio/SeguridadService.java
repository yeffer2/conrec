package pe.com.bbva.reniec.negocio;

import java.util.List;
import java.util.Map;

import pe.com.bbva.reniec.dominio.Opcion;
import pe.com.bbva.reniec.dominio.Usuario;

public interface SeguridadService {

	Usuario login(String loginUsuario, String password);
	Map<String, List<Opcion>> obtenerOpciones();
	
}
