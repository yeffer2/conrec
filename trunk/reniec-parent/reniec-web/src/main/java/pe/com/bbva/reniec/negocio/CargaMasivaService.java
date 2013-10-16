package pe.com.bbva.reniec.negocio;

import java.io.Serializable;
import java.util.List;



import pe.com.bbva.reniec.dominio.Carga;
import pe.com.bbva.reniec.dominio.Valor;

public interface CargaMasivaService  extends ConfiguracionService, Serializable {

	List<Carga> obtenerCargasDesc();

}
