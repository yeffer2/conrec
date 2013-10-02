package pe.com.bbva.reniec.persistencia.hibernate;

import java.io.Serializable;
import java.util.List;

import pe.com.bbva.reniec.utileria.Busqueda;

public interface BaseHibernate<Entidad, TipoLlave> extends Serializable {

	Entidad obtener(TipoLlave id);

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
	
	boolean contiene(TipoLlave tipoLlave);

}
