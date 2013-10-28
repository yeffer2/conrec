package pe.com.bbva.reniec.utileria;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.persistence.Transient;

import org.apache.commons.lang.StringUtils;

import pe.com.bbva.reniec.dominio.Valor;
import pe.com.bbva.reniec.utileria.annotations.DefinicionVista;

import com.vaadin.data.Container;
import com.vaadin.data.Item;
import com.vaadin.data.Property.ConversionException;
import com.vaadin.data.Property.ReadOnlyException;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.data.util.IndexedContainer;
import com.vaadin.event.FieldEvents.TextChangeEvent;
import com.vaadin.event.FieldEvents.TextChangeListener;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.data.Property.ValueChangeListener;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.PopupDateField;
import com.vaadin.ui.Table;
import com.vaadin.ui.Table.ColumnReorderEvent;
import com.vaadin.ui.Table.ColumnResizeListener;
import com.vaadin.ui.TextField;
import com.vaadin.ui.Table.ColumnResizeEvent;
import com.vaadin.ui.Table.ColumnReorderListener;

/**
 * Clase generic para generar tablas básicas.
 * 
 * @author CDA Informática
 * @param <F>
 * @param <M>
 * @param <SC>
 * @param <E>
 * @param <D>
 * @since 15/04/2013
 * 
 */
public class TableConstructor<F, M, SC> {

	/**
	 * Arreglo de objetos de la forma:
	 */
	public final static short NOMBRE_COLUMNA = 0;
	public final static short ANCHO_COLUMNA = 1;
	public final static short TIPO_COLUMNA = 2;
	public final static short VALOR_BEANCONTAINER = 3;

	/***
	 * Inyección del servicio origen.
	 */
	public F servicioOrigenListaObjetos;
	public String nombreMetodoOrigenDatos;

	/**
	 * Constantes de prefijo de métodos.
	 */
	private final String GETPREFIX = "get";
	private final String SETPREFIX = "set";

	/***
	 * Instancia del modelo para el filtrado;
	 */
	M nuevaInstancia;

	/**
	 * Constante de prefijo para las columnas de tipo distinto
	 */
	private final String ORIGENPREFIX = "objBaseT";

	/**
	 * Container de la construcción
	 */
	private IndexedContainer container = new IndexedContainer();

	/**
	 * Container de la construcción
	 */
	private Class<M> modelo;

	/**
	 * Tabla formateada
	 */
	private Table tblTablaLocal;

	ArrayList<Object[]> definicionCampos;
	HorizontalLayout panelFiltro;

	List<Object> componentesFiltro = new ArrayList<Object>();

	/**
	 * Lista que relaciona las columnas y sus tipos.
	 */
	private List<DefinicionesLocales> definicionesLocales = new ArrayList<DefinicionesLocales>();

	/***
	 * * Método que construye dinamicamente las tablas de vaadin en base a un
	 * modelo y a una lista de valores del propio modelo.
	 * 
	 * 
	 * @param tblContenido
	 *            Tabla a construir
	 * @param modelo
	 *            Modelo en que se basa la construcción de las columnas.
	 * @param valores
	 *            Valores a agregar
	 * @param definicionCampos
	 *            Opcionalmente se puede enviar una ArrayList con una colección
	 *            de objetos opcionales de la forma [nombreColumna,
	 *            anchoColumna]
	 * 
	 * @see cda.analytics.com.utils.annotations.DefinicionVista
	 */
	@SuppressWarnings("all")
	public void construirTablaSimple(Table tblContenido, Class<M> modelo,
			List<M> valores, ArrayList<Object[]> definicionCampos) {
		this.modelo = modelo;

		try {
			tblContenido.setContainerDataSource(container);

			ArrayList<Object> visibleColumns = new ArrayList<Object>();

			List<Field> campos = new ArrayList<Field>();

			Integer anchoTotal = 0;
			campos = (new TableConstructor()).getAllElements(campos, modelo,
					Field.class);

			for (Field campo : campos) {
				DefinicionVista anotacionLocal = campo
						.getAnnotation(DefinicionVista.class);
				if (anotacionLocal != null) {
					if (!anotacionLocal.nombreVista().equals("")) {
						DefinicionesLocales tipoColumna;
						if (!anotacionLocal.tipoFinal().equals("")) {
							container.addContainerProperty(
									ORIGENPREFIX + campo.getName(),
									campo.getType(), null);
							container.addContainerProperty(campo.getName(),
									Class.forName(anotacionLocal.tipoFinal()),
									null);
							tipoColumna = (new TableConstructor()).new DefinicionesLocales(
									campo.getName(),
									Class.forName(anotacionLocal.tipoFinal()));
						} else {
							container.addContainerProperty(campo.getName(),
									campo.getType(), null);
							tipoColumna = (new TableConstructor()).new DefinicionesLocales(
									campo.getName(), campo.getType());
						}

						Integer ancho = obtenValorDesdeArregloDeObjetos(
								Integer.class,
								recorreListaDeObjetosByValue(definicionCampos,
										campo.getName()), ANCHO_COLUMNA);

						anchoTotal += (ancho != null) ? ancho + 13 : 0;
						tblContenido.setColumnWidth(campo.getName(),
								((ancho == null) ? -1 : ancho));

						tblContenido.setColumnHeader(campo.getName(),
								anotacionLocal.nombreVista());
						visibleColumns.add(campo.getName());
						tipoColumna.setNombreVisibleColumna(anotacionLocal
								.nombreVista());
						definicionesLocales.add(tipoColumna);

					}
				}
			}

			tblContenido.setWidth(Integer.toString(anchoTotal + 20));
			visibleColumns = (definicionCampos != null) ? createVisibleColumns(definicionCampos)
					: visibleColumns;

			tblContenido.setVisibleColumns(visibleColumns.toArray());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		int con = 1;
		for (M valor : valores) {
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
	 * 
	 * Constructor Alternativo para CrearFiltros. construye dinamicamente las
	 * tablas de vaadin en base a un modelo y a una lista de valores del propio
	 * modelo. Agrega un panel de filtros.
	 * 
	 * @param <F>
	 * 
	 * @param tblContenido
	 *            Tabla a construir
	 * @param modelo
	 *            Modelo en que se basa la construcción de las columnas.
	 * @param valores
	 *            Valores a agregar
	 * @param definicionCampos
	 *            Opcionalmente se puede enviar una ArrayList con una colección
	 *            de objetos opcionales de la forma [nombreColumna,
	 *            anchoColumna]
	 * @param panelFiltro
	 *            Panel donde se colocan los filtros. Vuelve obligatorio el
	 *            campo de anchoColumna en el arreglo definicionCampos
	 * @param servicioOrigen
	 *            Instancia del servicio donde se obtendrían los datos después
	 *            del filtrado.
	 * @param nombreMetodo
	 *            Nombre del método para obtener los datos del filtrado.
	 * 
	 * @see cda.analytics.com.utils.annotations.DefinicionVista
	 */
	public void construirTablaSimple(Table tblContenido, Class<M> modelo,
			List<M> valores, ArrayList<Object[]> definicionCampos,
			HorizontalLayout panelFiltro, F servicioOrigen, String nombreMetodo) {
		this.definicionCampos = definicionCampos;
		this.panelFiltro = panelFiltro;
		tblTablaLocal = tblContenido;
		servicioOrigenListaObjetos = servicioOrigen;
		nombreMetodoOrigenDatos = nombreMetodo;
		construirTablaSimple(tblContenido, modelo, valores, definicionCampos);
		construirFiltros(tblContenido, panelFiltro, definicionCampos);
	}

	public void limpiarFiltros(HorizontalLayout panelFiltro) {
		for (int i = 0; i < panelFiltro.getComponentCount(); i++) {
			Object objComponente = panelFiltro.getComponent(i);
			try {
				Object nullOrBlack = null;

				if (objComponente.getClass().equals(TextField.class))
					nullOrBlack = "";
				objComponente
						.getClass()
						.getSuperclass()
						.getSuperclass()
						.getDeclaredMethod("setValue",
								new Class<?>[] { Object.class })
						.invoke(objComponente, new Object[] { nullOrBlack });

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private void construirFiltros(final Table table,
			HorizontalLayout panelFiltros,
			final ArrayList<Object[]> definicionCampos) {

		panelFiltros.removeAllComponents();
		Object[] visibleColumns = table.getVisibleColumns();

		for (Object columna : visibleColumns) {
			for (DefinicionesLocales tipoColumna : definicionesLocales) {
				if (tipoColumna.getNombreColumna().equals(columna)) {
					Component comp = getComponente(tipoColumna,
							definicionCampos);
					if (comp != null)
						panelFiltros.addComponent(comp);
				}
			}

		}

		table.addListener(new ColumnResizeListener() {
			private static final long serialVersionUID = 1L;

			@Override
			public void columnResize(ColumnResizeEvent event) {
				resizeTabla();

			}
		});

	}

	protected void reorderTable() {
		List<Object> nuevoOrden = new ArrayList<Object>();

		for (String nuevoOrdenColumnas : tblTablaLocal.getColumnHeaders()) {
			for (Object propiedad : tblTablaLocal.getContainerPropertyIds()) {
				if (nuevoOrdenColumnas.equals(tblTablaLocal
						.getColumnHeader(propiedad))) {
					nuevoOrden.add(propiedad);
				}
			}

		}
		ArrayList<Object[]> nuevaDefinicion = new ArrayList<Object[]>();
		List<Integer> nuevoOrdenIndices = new ArrayList<Integer>();
		for (Object objOrdenado : nuevoOrden) {
			for (Object[] prop : definicionCampos) {
				if (obtenValorDesdeArregloDeObjetos(String.class, prop,
						NOMBRE_COLUMNA).equals(objOrdenado)) {
					nuevaDefinicion.add(prop);
					nuevoOrdenIndices.add(definicionCampos.indexOf(prop));
				}
			}
		}
		definicionCampos = nuevaDefinicion;
		HorizontalLayout nuevaOrdenFiltros = new HorizontalLayout();

		Iterator<Component> i = panelFiltro.getComponentIterator();
		List<Component> componentes = new ArrayList<Component>();
		while (i.hasNext()) {
			Component c = (Component) i.next();
			componentes.add(c);
		}
		System.out.println(componentesFiltro.size());
		for (Object comp : componentesFiltro) {
			TextField text = (TextField) comp;
			System.out.println(text.getValue());
			panelFiltro.addComponent(text, 0);
		}

		// System.out.println(componentes.size());
		// for(Component compoloc : componentes){
		// System.out.println(compoloc);
		// panelFiltro.addComponent(compoloc, 0);
		// }
		//
		// for(Integer indexFiltroNuevoOrden : nuevoOrdenIndices){
		// System.out.println((Component)
		// componentes.get(indexFiltroNuevoOrden));
		//
		// }
		// panelFiltro = nuevaOrdenFiltros;
		// construirFiltros(tblTablaLocal, panelFiltro, nuevaDefinicion);

	}

	private void resizeTabla() {
		int totalTamanho = 0;
		for (int index = 0; index < definicionCampos.size(); index++) {

			int tamanho = tblTablaLocal
					.getColumnWidth(obtenValorDesdeArregloDeObjetos(
							String.class, definicionCampos.get(index),
							NOMBRE_COLUMNA));
			tamanho += 13;
			panelFiltro.getComponent(index).setWidth(Integer.toString(tamanho));
			totalTamanho += tamanho;

		}
		tblTablaLocal.setWidth(Integer.toString(totalTamanho + 20));

	}

	@SuppressWarnings("unchecked")
	private Component getComponente(
			final DefinicionesLocales definicionesLocales,
			ArrayList<Object[]> definicionCampos) {
		Integer ancho = obtenValorDesdeArregloDeObjetos(
				Integer.class,
				recorreListaDeObjetosByValue(definicionCampos,
						definicionesLocales.getNombreColumna()), ANCHO_COLUMNA);
		final Class<?> tipoColumna = obtenValorDesdeArregloDeObjetos(
				Class.class,
				recorreListaDeObjetosByValue(definicionCampos,
						definicionesLocales.getNombreColumna()), TIPO_COLUMNA);
		if (tipoColumna.equals(String.class) || tipoColumna.equals(Long.class)
				|| tipoColumna.equals(Integer.class)) {
			ancho += 13;
			TextField textField = new TextField();
			textField.setInputPrompt(definicionesLocales
					.getNombreVisibleColumna());
			textField.setWidth(ancho.toString());
			textField.addListener(new TextChangeListener() {
				private static final long serialVersionUID = 1L;

				@Override
				public void textChange(TextChangeEvent event) {
					asignaValoresDeBusqueda(
							definicionesLocales.getNombreColumna(),
							tipoColumna, event.getText());
				}

			});
			componentesFiltro.add(textField);
			return textField;
		}
		if (tipoColumna.equals(Date.class)) {
			ancho += 13;
			PopupDateField ppdFecha = new PopupDateField();
			ppdFecha.setInputPrompt(definicionesLocales
					.getNombreVisibleColumna());
			ppdFecha.setWidth(ancho.toString());
			ppdFecha.setImmediate(true);
			ppdFecha.addListener(new ValueChangeListener() {
				private static final long serialVersionUID = 1L;

				@Override
				public void valueChange(ValueChangeEvent event) {
					asignaValoresDeBusqueda(
							definicionesLocales.getNombreColumna(),
							tipoColumna, event.getProperty().getValue());

				}

			});
			ppdFecha.setDateFormat("dd/MM/yyyy");
			return ppdFecha;
		}
		if (tipoColumna.equals(Valor.class)) {
			BeanItemContainer<Valor> containerCombo = obtenValorDesdeArregloDeObjetos(
					BeanItemContainer.class,
					recorreListaDeObjetosByValue(definicionCampos,
							definicionesLocales.getNombreColumna()),
					VALOR_BEANCONTAINER);
			ancho += 13;
			ComboBox combo = new ComboBox();
			combo.setContainerDataSource(containerCombo);
			combo.setItemCaptionPropertyId("nombre");
			combo.setImmediate(true);
			combo.setNullSelectionAllowed(false);
			combo.setWidth(ancho.toString());
			combo.setInputPrompt(definicionesLocales.getNombreVisibleColumna());
			combo.setNullSelectionAllowed(true);
			combo.setNullSelectionItemId(null);
			combo.addListener(new ValueChangeListener() {
				private static final long serialVersionUID = 1L;

				@Override
				public void valueChange(ValueChangeEvent event) {
					asignaValoresDeBusqueda(
							definicionesLocales.getNombreColumna(),
							tipoColumna, event.getProperty().getValue());

				}

			});
			return combo;
		}
		return null;
	}

	private void asignaValoresDeBusqueda(String nombreColumna,
			Class<?> tipoColumna, Object nuevoValor) {
		if (nuevaInstancia == null) {
			try {
				nuevaInstancia = modelo.getConstructor().newInstance();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		setValueForObject(nuevaInstancia, nuevaInstancia,
				getNameForMetod(SETPREFIX, nombreColumna), tipoColumna,
				nuevoValor);
		crearNuevaTabla(nuevaInstancia);
	}

	@SuppressWarnings("unchecked")
	private void crearNuevaTabla(M instancia) {
		try {
			List<M> nuevaLista = (List<M>) servicioOrigenListaObjetos
					.getClass()
					.getDeclaredMethod(nombreMetodoOrigenDatos,
							new Class<?>[] { nuevaInstancia.getClass() })
					.invoke(servicioOrigenListaObjetos,
							new Object[] { nuevaInstancia });
			

			construirTablaSimpleInterna(nuevaLista);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void construirTablaSimpleInterna(List<M> nuevaLista) {		
		container.removeAllItems();
		int con = 1;
		for (M valor : nuevaLista) {
			Item item = container.addItem(con++);
			List<Method> metodos = new ArrayList<Method>();
			metodos = (new TableConstructor()).getAllElements(metodos, modelo,
					Method.class);
			for (Method metodo : metodos) {
				if (metodo.getName().startsWith(GETPREFIX)) {
					propiedadesObjetoRecursivas(item, metodo, valor, null);
				}
			}

		}
	}

	@SuppressWarnings("unchecked")
	private <ML, MLS> void setValueForObject(ML instanciaLocal,
			MLS instanciaLocalBase, String nombreMetodo, Class<?> tipoColumna,
			Object nuevoValor) {
		try {
			instanciaLocal
					.getClass()
					.getDeclaredMethod(nombreMetodo,
							new Class<?>[] { tipoColumna })
					.invoke(instanciaLocalBase,
							new Object[] { getConvertedType(tipoColumna,
									nuevoValor) });
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			/***
			 * Usamos la excepción NoSuchMethodException para enviar la
			 * Actualización del parámetro a la superclass
			 */
			if (instanciaLocal.getClass().getSuperclass() != null) {
				SC superInstancia;
				try {
					superInstancia = (SC) instanciaLocal.getClass()
							.getSuperclass().getConstructor().newInstance();
					setValueForObject(superInstancia, instanciaLocal,
							nombreMetodo, tipoColumna, nuevoValor);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			} else {

				e.printStackTrace();
			}
		} catch (SecurityException e) {
			e.printStackTrace();
		}
	}

	private String getNameForMetod(String prefix, String property) {
		String nombreMetodo = prefix + property.substring(0, 1).toUpperCase()
				+ property.substring(1);
		return nombreMetodo;
	}

	private <AT> Object getConvertedType(Class<AT> claseFutura, Object valor) {
		if (claseFutura == Long.class)
			return (StringUtils.isNotBlank(valor.toString())) ? Long
					.parseLong(valor.toString()) : null;
		if (claseFutura == String.class)
			return (StringUtils.isNotBlank(valor.toString())) ? valor
					.toString() : null;
		if (claseFutura == Date.class)
			return (valor != null) ? valor : null;
		if (claseFutura == Valor.class)
			return (valor != null) ? valor : null;
		return null;

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
	private <T> void propiedadesObjetoRecursivas(Item item, Method metodo,
			T valor, String nombreColumna) {

		if (nombreColumna == null)
			nombreColumna = metodo.getName().substring(3, 4).toLowerCase()
					+ metodo.getName().substring(4);
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
				if (item.getItemProperty(nombreColumna) != null)

					item.getItemProperty(nombreColumna).setValue(
							metodo.invoke(valor, null));
			} else {
				if (anotacionLocal.nombrePropiedadRelacion().equals("")) {
					if (item.getItemProperty(nombreColumna) != null) {

						if (anotacionLocal.convertToStringWithFormat().equals(
								"")) {
							item.getItemProperty(nombreColumna).setValue(
									metodo.invoke(valor, null));
						} else {
							item.getItemProperty(nombreColumna)
									.setValue(
											formatterToString(
													metodo.invoke(valor, null),
													anotacionLocal
															.convertToStringWithFormat()));
						}
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
	private <T> Object formatterToString(T value, String format) {
		String cadenaFormateada = "";
		if (value != null) {
			if (value.getClass().equals(Timestamp.class)) {
				cadenaFormateada = (new SimpleDateFormat(format)).format(value);
			}
		}
		return cadenaFormateada;

	}

	/***
	 * Recorre la lista de los objetos para traerse una coleccion de objetos por
	 * valor
	 * 
	 * @param arreglo
	 *            Arreglo a recorrer
	 * @param value
	 *            Valor a buscar, en el indice 0 de la coleccion
	 * @return Coleccion de objetos.
	 */
	private Object[] recorreListaDeObjetosByValue(ArrayList<Object[]> arreglo,
			String value) {
		for (Object[] objeto : arreglo) {
			if (objeto[NOMBRE_COLUMNA].toString().equals(value))
				return objeto;
		}

		return null;
	}

	/***
	 * Obtiene un valor único dentro del arreglo de objetos.
	 * 
	 * @param tipo
	 *            Tipo de dato a obtener
	 * @param arreglo
	 *            Arreglo a procesar
	 * @param valorAObtener
	 *            Enumeración del valor a obtener
	 * @return Devuelve un genérico con el valor que se solicito
	 */
	@SuppressWarnings("unchecked")
	private <T> T obtenValorDesdeArregloDeObjetos(Class<T> tipo,
			Object[] arreglo, short valorAObtener) {
		try {
			return (T) arreglo[valorAObtener];
		} catch (Exception e) {
			return null;
		}
	}

	/***
	 * Crea el arreglo de columnas visibles
	 * 
	 * @param arreglo
	 *            Arreglo original
	 * @return un arreglo de objetos
	 */
	private ArrayList<Object> createVisibleColumns(ArrayList<Object[]> arreglo) {
		ArrayList<Object> objetos = new ArrayList<Object>();
		for (Object[] objeto : arreglo) {
			objetos.add(objeto[NOMBRE_COLUMNA]);
		}
		return objetos;

	}

	public M getNuevaInstancia() {
		return nuevaInstancia;
	}

	public void setNuevaInstancia(M nuevaInstancia) {
		this.nuevaInstancia = nuevaInstancia;
	}

	public IndexedContainer getContainer() {
		return container;
	}

	public void setContainer(IndexedContainer container) {
		this.container = container;
	}

	public Class<M> getModelo() {
		return modelo;
	}

	public void setModelo(Class<M> modelo) {
		this.modelo = modelo;
	}

	public Table getTblTablaLocal() {
		return tblTablaLocal;
	}

	public void setTblTablaLocal(Table tblTablaLocal) {
		this.tblTablaLocal = tblTablaLocal;
	}

	/***
	 * Clase para la relación de las columnas con su tipo. Necesario en el
	 * momento de creación de los filtros.
	 * 
	 * @author CDA Informática.
	 * 
	 */
	protected class DefinicionesLocales {

		private String nombreColumna;

		private Class<?> tipoColumna;

		private String nombreVisibleColumna;

		public DefinicionesLocales(String nombre, Class<?> tipo) {
			this.nombreColumna = nombre;
			this.tipoColumna = tipo;
		}

		public String getNombreColumna() {
			return nombreColumna;
		}

		public void setNombreColumna(String nombreColumna) {
			this.nombreColumna = nombreColumna;
		}

		public Class<?> getTipoColumna() {
			return tipoColumna;
		}

		public void setTipoColumna(Class<?> tipoColumna) {
			this.tipoColumna = tipoColumna;
		}

		public String getNombreVisibleColumna() {
			return nombreVisibleColumna;
		}

		public void setNombreVisibleColumna(String nombreVisibleColumna) {
			this.nombreVisibleColumna = nombreVisibleColumna;
		}

	}

}
