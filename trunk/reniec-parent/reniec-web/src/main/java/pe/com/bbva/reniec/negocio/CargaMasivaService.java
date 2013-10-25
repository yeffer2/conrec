package pe.com.bbva.reniec.negocio;

import java.io.Serializable;
import java.util.List;

import pe.com.bbva.reniec.dominio.Carga;

public interface CargaMasivaService  extends ConfiguracionService, Serializable {

	List<Carga> obtenerCargasDesc();

	List<Carga> obtenerCargasDescByCriteria(Carga carga);
	
	Long obtenerUltimoId();

	void guardarCarga(Carga carga);

}
