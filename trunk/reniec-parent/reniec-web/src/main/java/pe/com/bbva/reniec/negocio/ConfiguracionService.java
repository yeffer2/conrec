package pe.com.bbva.reniec.negocio;

import java.io.Serializable;
import java.util.List;

import pe.com.bbva.reniec.dominio.Lista;
import pe.com.bbva.reniec.dominio.Parametro;
import pe.com.bbva.reniec.dominio.Valor;
import pe.com.bbva.reniec.dominio.quartz.QrtzCronTriggers;
import pe.com.bbva.reniec.dominio.quartz.QrtzJobDetails;
import pe.com.bbva.reniec.dominio.quartz.QrtzTriggers;

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
	List<Parametro> buscarParametros(Parametro parametro);
	void guardarParametro(Parametro parametro);
	void eliminarParametro(String codigo);
	
	//Quartz
	List<QrtzCronTriggers> buscarCronTriggers(QrtzCronTriggers qrtzCronTriggers);
	
	List<QrtzJobDetails> buscarJobDetails(QrtzJobDetails qrtzJobDetails);
	
	List<QrtzTriggers> buscarTriggers(QrtzTriggers qrtzTriggers);
	
}
