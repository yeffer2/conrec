package pe.com.bbva.reniec.negocio;

import java.io.Serializable;
import java.util.List;

import pe.com.bbva.reniec.dominioLDAP.Ldapperu2;

public interface LDAPService extends ConfiguracionService, Serializable {
	
	List<Ldapperu2> obtenerUsuariosLDAP();
	Ldapperu2 obtenerUsuarioLDAP(String registro);

}
