package pe.com.bbva.reniec.persistencia;


import java.io.Serializable;
import java.util.List;

import pe.com.bbva.reniec.dominio.Ldapperu2;
import pe.com.bbva.reniec.dominio.Usuario;
import pe.com.bbva.reniec.utileria.Busqueda;

public interface LDAP2DAO extends Serializable {

	void autenticacionLDAP(String loginUsuario, String password);
	Usuario login(String loginUsuario);
	List<Ldapperu2> buscar(Busqueda filtro);
	
}
