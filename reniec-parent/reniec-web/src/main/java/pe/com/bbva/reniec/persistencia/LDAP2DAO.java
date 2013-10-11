package pe.com.bbva.reniec.persistencia;

import java.io.Serializable;

import pe.com.bbva.reniec.dominio.Usuario;

public interface LDAP2DAO extends Serializable{

	void autenticacionLDAP(String loginUsuario, String password);
	Usuario login(String loginUsuario);
	
}
