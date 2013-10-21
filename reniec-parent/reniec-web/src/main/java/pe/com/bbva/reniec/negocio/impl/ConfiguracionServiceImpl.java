package pe.com.bbva.reniec.negocio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.bbva.reniec.dominio.Valor;
import pe.com.bbva.reniec.negocio.ConfiguracionService;
import pe.com.bbva.reniec.persistencia.ValorDAO;

@Service
@SuppressWarnings("serial")
public class ConfiguracionServiceImpl implements ConfiguracionService{

	@Autowired
	ValorDAO valorDAO;
	
	@Override
	public List<Valor> obtenerValoresxLista(String codigo) {
		return valorDAO.buscarHql("select v from Valor v where v.lista.codigo=?", codigo);
	}

	@Override
	public Valor obtenerValorxCodigo(String codigoLista, String codigoValor) {
		// TODO Auto-generated method stub
		return valorDAO.obtenerHql("select v from Valor v where v.lista.codigo=? and codigo=?", codigoLista, codigoValor);
	}


}
