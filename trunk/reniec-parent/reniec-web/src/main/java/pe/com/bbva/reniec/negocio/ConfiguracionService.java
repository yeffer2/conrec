package pe.com.bbva.reniec.negocio;

import java.io.Serializable;
import java.util.List;

import pe.com.bbva.reniec.dominio.Lista;
import pe.com.bbva.reniec.dominio.Parametro;
import pe.com.bbva.reniec.dominio.Valor;

public interface ConfiguracionService extends Serializable{

	List<Valor> obtenerValoresxLista(String codigo);
	Valor obtenerValorxCodigo(String codigo, String codigoValor);
	List<Lista> buscarListas(Lista lista);
	void guardarLista(Lista lista);
	void eliminarLista(Long id);
	List<Valor> buscarValores(Valor valor);
	void guardarValor(Valor valor);
	void eliminarValor(Long id);
	Parametro obtenerParametroxCodigo(String codigo);
	
}
