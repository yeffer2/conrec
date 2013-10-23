package pe.com.bbva.reniec.negocio;

import java.io.Serializable;
import java.util.List;

import pe.com.bbva.reniec.dominio.Detalle;

public interface DetalleService extends ConfiguracionService, Serializable  {
	
	List<Detalle> cargaDetallesPorCarga(Long idCarga);
	
	List<Detalle> cargaDetallesPorDetalle(Detalle detalle);

}
