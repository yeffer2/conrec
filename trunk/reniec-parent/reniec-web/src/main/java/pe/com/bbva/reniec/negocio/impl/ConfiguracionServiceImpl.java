package pe.com.bbva.reniec.negocio.impl;

import java.util.List;

import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.bbva.reniec.dominio.Lista;
import pe.com.bbva.reniec.dominio.Parametro;
import pe.com.bbva.reniec.dominio.Valor;
import pe.com.bbva.reniec.negocio.ConfiguracionService;
import pe.com.bbva.reniec.persistencia.ListaDAO;
import pe.com.bbva.reniec.persistencia.ParametroDAO;
import pe.com.bbva.reniec.persistencia.ValorDAO;
import pe.com.bbva.reniec.utileria.Busqueda;

@Service
@SuppressWarnings("serial")
public class ConfiguracionServiceImpl implements ConfiguracionService{

	@Autowired
	ValorDAO valorDAO;
	@Autowired
	ListaDAO listaDAO;
	@Autowired
	ParametroDAO parametroDAO;
	
	@Override
	public List<Valor> obtenerValoresxLista(String codigo) {
		return valorDAO.buscarHql("select v from Valor v where v.lista.codigo=?", codigo);
	}

	@Override
	public Valor obtenerValorxCodigo(String codigoLista, String codigoValor) {
		return valorDAO.obtenerHql("select v from Valor v where v.lista.codigo=? and codigo=?", codigoLista, codigoValor);
	}

	@Override
	public List<Lista> buscarListas(Lista lista) {
		Busqueda filtro = Busqueda.forClass(Lista.class);
		if (lista != null) {
			if (lista.getId() != null) {
				filtro.add(Restrictions.eq("id",
						lista.getId()));
			}
			if (lista.getCodigo() != null) {
				filtro.add(Restrictions.ilike("codigo",
						lista.getCodigo(), MatchMode.ANYWHERE));
			}
			if (lista.getNombre() != null) {
				filtro.add(Restrictions.ilike("nombre",
						lista.getNombre(), MatchMode.ANYWHERE));
			}
			if (lista.getEstado() != null) {
				filtro.add(Restrictions.ilike("estado",
						lista.getEstado(), MatchMode.ANYWHERE));
			}
		}
		filtro.addOrder(Order.asc("id"));
		return listaDAO.buscar(filtro);
	}

	@Override
	public void guardarLista(Lista lista) {
		if(lista.getId()==null){
			listaDAO.crear(lista);
		}else{
			listaDAO.actualizar(lista);
		}
	}

	@Override
	public void eliminarLista(Long id) {
		listaDAO.eliminarXId(id);
	}
	
	@Override
	public List<Valor> buscarValores(Valor valor) {
		Busqueda filtro = Busqueda.forClass(Valor.class);
		if (valor != null) {
			if (valor.getId() != null) {
				filtro.add(Restrictions.eq("id",	valor.getId()));
			}
			if (valor.getCodigo() != null) {
				filtro.add(Restrictions.ilike("codigo", valor.getCodigo(), MatchMode.ANYWHERE));
			}
			if (valor.getNombre() != null) {
				filtro.add(Restrictions.ilike("nombre",
						valor.getNombre(), MatchMode.ANYWHERE));
			}
			if (valor.getOrden() != null) {
				filtro.add(Restrictions.eq("orden",valor.getOrden()));
			}
			if (valor.getEstado() != null) {
				filtro.add(Restrictions.ilike("estado",
						valor.getEstado(), MatchMode.ANYWHERE));
			}
			if (valor.getLista() != null) {
				filtro.createAlias("lista", "l");
				filtro.add(Restrictions.eq("l.id",
						valor.getLista().getId()));
			}
		}
		filtro.addOrder(Order.asc("id"));
		return valorDAO.buscar(filtro);
	}

	@Override
	public void guardarValor(Valor valor) {
		if(valor.getId()==null){
			valorDAO.crear(valor);
		}else{
			valorDAO.actualizar(valor);
		}
	}

	@Override
	public void eliminarValor(Long id) {
		valorDAO.eliminarXId(id);		
	}
	
	@Override
	public Parametro obtenerParametroxCodigo(String codigo) {
		return parametroDAO.obtenerHql("select p from Parametro p where p.codigo=?", codigo);
	}

}
