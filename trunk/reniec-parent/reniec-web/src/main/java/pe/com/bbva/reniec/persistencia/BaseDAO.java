package pe.com.bbva.reniec.persistencia;

import java.io.Serializable;
import java.util.List;

import pe.com.bbva.reniec.utileria.Busqueda;

public interface BaseDAO<Entidad, TipoLlave> extends Serializable {

	Entidad obtener(TipoLlave id);
	
	Entidad obtener(final Busqueda filtro);
	
	Entidad obtenerHql(String sql, Object... object);

	void actualizar(Entidad object);

	void crear(Entidad object);
	
	void grabarTodos(List<Entidad> list);

	void eliminar(Entidad object);

	void eliminarXId(TipoLlave id);
	
	void eliminarTodos(List<Entidad> list);

	List<Entidad> obtenerTodos();

	int contar();
	
	List<Entidad> buscar(final Busqueda filtro);
	
	List<Entidad> buscarHql(String sql, Object... object);
	
	List<Entidad> buscarHql(String sql, int limite, Object... object);
	
	boolean contiene(TipoLlave tipoLlave);

}
