package pe.com.bbva.reniec.persistencia;

import pe.com.bbva.reniec.dominio.Usuario;

public interface LDAP2DAO {

	void autenticacionLDAP(String loginUsuario, String password);
	Usuario login(String loginUsuario);
	
}
