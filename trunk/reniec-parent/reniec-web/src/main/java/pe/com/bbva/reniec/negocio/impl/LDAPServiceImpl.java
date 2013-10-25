package pe.com.bbva.reniec.negocio.impl;

import java.util.List;

import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import pe.com.bbva.reniec.dominio.Ldapperu2;

import pe.com.bbva.reniec.negocio.LDAPService;
import pe.com.bbva.reniec.persistencia.LDAP2DAO;
import pe.com.bbva.reniec.utileria.Busqueda;
import pe.com.bbva.reniec.utileria.Constante;

@Service
public class LDAPServiceImpl extends ConfiguracionServiceImpl implements LDAPService{

	private static final long serialVersionUID = 1L;
	
	@Autowired
	LDAP2DAO ldapdao;

	@Override
	public List<Ldapperu2> obtenerUsuariosLDAP() {
		Busqueda filtro = Busqueda.forClass(Ldapperu2.class);
		filtro.add(Restrictions.eq("tipdoc", Constante.VALOR.DOI_TIPO.CODIGO.DNI));
		filtro.add(Restrictions.isNotNull("numdoc"));
		filtro.add(Restrictions.ne("numdoc", "0"));
		return ldapdao.buscar(filtro);
	}

}
