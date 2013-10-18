package pe.com.bbva.reniec.utileria;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.Transient;

import pe.com.bbva.reniec.utileria.annotations.DefinicionVista;

import com.vaadin.data.Container;
import com.vaadin.data.Item;
import com.vaadin.data.Property.ConversionException;
import com.vaadin.data.Property.ReadOnlyException;
import com.vaadin.data.util.IndexedContainer;
import com.vaadin.ui.Table;

/**
 * Clase generic para generar tablas básicas.
 * 
 * @author CDA Informática
 * @since 15/04/2013
 * 
 */
public class TableConstructor {

	/**
	 * Constante de prefijo de métodos.
	 */
	private final static String GETPREFIX = "get";
	private final static String ORIGENPREFIX = "objBaseT";

	/***
	 * * Método que construye dinamicamente las tablas de vaadin en base a un
	 * modelo y a una lista de valores del propio modelo.
	 * 
	 * @param <E>
	 * 
	 * @param tblContenido
	 *            Tabla a construir
	 * @param modelo
	 *            Modelo en que se basa la construcción de las columnas.
	 * @param valores
	 *            Valores a agregar
	 * @param ordenCampos
	 *            Opcionalmente se puede enviar una ArrayList con los nombres de
	 *            las columnas ordenadas, deben ser los nombres de las
	 *            propiedades del modelo.
	 * 
	 * @see cda.analytics.com.utils.annotations.DefinicionVista
	 */
	@SuppressWarnings("all")
	public static <T, E> void construirTablaSimple(E tblContenido,
			Class<T> modelo, List<T> valores, ArrayList<Object> ordenCampos) {
		IndexedContainer container = new IndexedContainer();

		try {
			tblContenido
					.getClass()
					.getDeclaredMethod("setContainerDataSource",
							new Class[] { Container.class })
					.invoke(tblContenido, container);

			ArrayList<Object> visibleColumns = new ArrayList<Object>();

			List<Field> campos = new ArrayList<Field>();
			campos = (new TableConstructor()).getAllElements(campos, modelo,
					Field.class);
			for (Field campo : campos) {
				DefinicionVista anotacionLocal = campo
						.getAnnotation(DefinicionVista.class);
				if (anotacionLocal != null) {
					if (!anotacionLocal.nombreVista().equals("")) {
						if (!anotacionLocal.tipoFinal().equals("")) {
							container.addContainerProperty(
									ORIGENPREFIX + campo.getName(),
									campo.getType(), null);
							container.addContainerProperty(campo.getName(),
									Class.forName(anotacionLocal.tipoFinal()),
									null);
						} else {
							container.addContainerProperty(campo.getName(),
									campo.getType(), null);
						}
						tblContenido
								.getClass()
								.getDeclaredMethod("setColumnWidth",
										new Class[] { Object.class, int.class })
								.invoke(tblContenido, campo.getName(), -1);
						tblContenido
								.getClass()
								.getDeclaredMethod(
										"setColumnHeader",
										new Class[] { Object.class,
												String.class })
								.invoke(tblContenido, campo.getName(),
										anotacionLocal.nombreVista());
						visibleColumns.add(campo.getName());

					}
				}
			}

			visibleColumns = (ordenCampos != null) ? ordenCampos
					: visibleColumns;

			System.out.println((new Object[] { new Object() }).getClass());
			tblContenido
					.getClass()
					.getDeclaredMethod("setVisibleColumns",
							new Class[] { (new Object[] {}).getClass() })
					.invoke(tblContenido,
							new Object[] { visibleColumns.toArray() });
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		int con = 1;
		for (T valor : valores) {
			Item item = container.addItem(con++);
			List<Method> metodos = new ArrayList<Method>();
			metodos = (new TableConstructor()).getAllElements(metodos, modelo,
					Method.class);
			for (Method metodo : metodos) {
				if (metodo.getName().startsWith(GETPREFIX)) {
					if (!metodo.isAnnotationPresent(Transient.class)) {
						propiedadesObjetoRecursivas(item, metodo, valor, null);
					}
				}
			}

		}

	}

	/***
	 * Método que genera una búsqueda de propiedades cuando la relación es con
	 * objetos y no con valores.
	 * 
	 * @param item
	 *            Item del container a agregarse
	 * @param metodo
	 *            Método para obtener el valor
	 * @param valor
	 *            Objeto de donde se obtendrá el valor
	 * @param nombreColumna
	 *            Nombre de la columna donde se insertará
	 */
	@SuppressWarnings("all")
	private static <T> void propiedadesObjetoRecursivas(Item item,
			Method metodo, T valor, String nombreColumna) {

		if (nombreColumna == null)
			nombreColumna = metodo.getName().substring(3).toLowerCase();

		boolean seguir = false;
		for (Object objeto : item.getItemPropertyIds()) {
			if (nombreColumna.trim().equals(objeto.toString().trim()))
				seguir = true;
		}
		if (!seguir)
			return;

		try {
			DefinicionVista anotacionLocal = metodo
					.getAnnotation(DefinicionVista.class);
			if (anotacionLocal == null) {

				item.getItemProperty(nombreColumna).setValue(
						metodo.invoke(valor, null));
			} else {
				if (anotacionLocal.nombrePropiedadRelacion().equals("")) {

					if (anotacionLocal.convertToStringWithFormat().equals("")) {
						item.getItemProperty(nombreColumna).setValue(
								metodo.invoke(valor, null));
					} else {
						item.getItemProperty(nombreColumna).setValue(
								formatterToString(metodo.invoke(valor, null),
										anotacionLocal
												.convertToStringWithFormat()));
					}

				} else {
					String nombrePropiedadRelacion = anotacionLocal
							.nombrePropiedadRelacion().substring(0, 1)
							.toUpperCase()
							+ anotacionLocal.nombrePropiedadRelacion()
									.substring(1);
					T valorInterno = (T) metodo.invoke(valor, null);
					Method metodoInterno = valorInterno.getClass()
							.getDeclaredMethod(
									GETPREFIX + nombrePropiedadRelacion);
					item.getItemProperty(ORIGENPREFIX + nombreColumna)
							.setValue(metodo.invoke(valor, null));
					propiedadesObjetoRecursivas(item, metodoInterno,
							valorInterno, nombreColumna);

				}
			}
		} catch (ReadOnlyException e) {
			e.printStackTrace();
		} catch (ConversionException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}

	}

	/***
	 * Obtiene la lista de todos los elementos del tipo T declarados de una
	 * clase y sus clases superiores
	 * 
	 * @param elementos
	 *            Lista de elementos
	 * @param tipo
	 *            Clase Tipo
	 * @return Devuelve todos los elementos.
	 */
	@SuppressWarnings({ "unchecked" })
	private <T> List<T> getAllElements(List<T> elementos, Class<?> tipo,
			Class<T> tipoInicial) {
		List<T> listaObjetos = new ArrayList<T>();
		if (tipoInicial == Method.class)
			listaObjetos = (List<T>) Arrays.asList(tipo.getDeclaredMethods());
		else
			listaObjetos = (List<T>) Arrays.asList(tipo.getDeclaredFields());

		for (T objeto : listaObjetos)
			elementos.add(objeto);
		if (tipo.getSuperclass() != null)
			elementos = getAllElements(elementos, tipo.getSuperclass(),
					tipoInicial);
		return elementos;
	}

	/***
	 * Convierte un tipo de datos a string con un formato en especifico.
	 * 
	 * @param value
	 *            Origen
	 * @param format
	 *            Formato
	 * @return Se devuelve un objeto con la cadena formateada.
	 */
	private static <T> Object formatterToString(T value, String format) {
		String cadenaFormateada = "";
		if (value.getClass().equals(Timestamp.class)) {
			cadenaFormateada = (new SimpleDateFormat(format)).format(value);
		}
		return cadenaFormateada;

	}
}
