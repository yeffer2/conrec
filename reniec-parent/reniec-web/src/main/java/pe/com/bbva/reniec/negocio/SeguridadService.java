package pe.com.bbva.reniec.negocio;

import pe.com.bbva.reniec.dominio.Usuario;

public interface SeguridadService {

	Usuario login(String loginUsuario, String password);
	void obtenerOpciones();
	
}
