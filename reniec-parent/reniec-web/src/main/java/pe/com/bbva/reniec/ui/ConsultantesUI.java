package pe.com.bbva.reniec.ui;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import pe.com.bbva.reniec.dominio.Consultante;
import pe.com.bbva.reniec.dominio.Valor;
import pe.com.bbva.reniec.negocio.ConsultantesService;
import pe.com.bbva.reniec.utileria.Constante;
import pe.com.bbva.reniec.utileria.Inject;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.data.Item;
import com.vaadin.data.Property;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.data.Property.ValueChangeListener;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.data.util.IndexedContainer;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.PopupDateField;
import com.vaadin.ui.Table;
import com.vaadin.ui.Table.ColumnGenerator;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
public class ConsultantesUI extends CustomComponent implements ClickListener{

	@AutoGenerated
	private VerticalLayout mainLayout;
	@AutoGenerated
	private VerticalLayout pnlLayout;
	@AutoGenerated
	private HorizontalLayout pnlConsultanteLayout;
	@AutoGenerated
	private VerticalLayout pnlConsultanteContenido;
	@AutoGenerated
	private HorizontalLayout pnlConsultanteBoton;
	@AutoGenerated
	private Button btnEstadoReniec;
	@AutoGenerated
	private Button btnGuardar;
	@AutoGenerated
	private HorizontalLayout pnlConsultanteFila7;
	@AutoGenerated
	private HorizontalLayout pnlEstadoReniec;
	@AutoGenerated
	private ComboBox cmbEstadoReniec;
	@AutoGenerated
	private Label lblEstadoReniec;
	@AutoGenerated
	private HorizontalLayout pnlConsultanteFila6;
	@AutoGenerated
	private ComboBox cmbEstado;
	@AutoGenerated
	private Label lblEstado;
	@AutoGenerated
	private ComboBox cmbAplicativo;
	@AutoGenerated
	private Label lblAplicativo;
	@AutoGenerated
	private HorizontalLayout pnlConsultanteFila5;
	@AutoGenerated
	private TextField txtCentro;
	@AutoGenerated
	private Label lblCentro;
	@AutoGenerated
	private TextField txtMaterno;
	@AutoGenerated
	private Label lblMaterno;
	@AutoGenerated
	private HorizontalLayout pnlConsultanteFila4;
	@AutoGenerated
	private TextField txtNumero;
	@AutoGenerated
	private Label lblNumero;
	@AutoGenerated
	private TextField txtPaterno;
	@AutoGenerated
	private Label lblPaterno;
	@AutoGenerated
	private HorizontalLayout pnlConsultanteFila3;
	@AutoGenerated
	private ComboBox cmbTipoDOI;
	@AutoGenerated
	private Label lblTipoDOI;
	@AutoGenerated
	private TextField txtNombres;
	@AutoGenerated
	private Label lblNombres;
	@AutoGenerated
	private HorizontalLayout pnlConsultanteFila2;
	@AutoGenerated
	private PopupDateField pdfFecha;
	@AutoGenerated
	private Label lblFecha;
	@AutoGenerated
	private ComboBox cmbNacionalidad;
	@AutoGenerated
	private Label lblNacionalidad;
	@AutoGenerated
	private HorizontalLayout pnlConsultanteFila1;
	@AutoGenerated
	private TextField txtCodigo;
	@AutoGenerated
	private Label lblCodigo;
	@AutoGenerated
	private TextField txtRegistro;
	@AutoGenerated
	private Label lblRegistro;
	@AutoGenerated
	private Label lblTituloConsultante;
	@AutoGenerated
	private VerticalLayout pnlTablaContenido;
	@AutoGenerated
	private Table tblConsultante;

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	@Autowired
	ConsultantesService consultantesService;
	
	private DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
	
	public ConsultantesUI() {
		buildMainLayout();
		setCompositionRoot(mainLayout);
		Inject.inject(this);
		postConstruct();
	}

	public void postConstruct(){
		
		tblConsultante.setSelectable(true);
		tblConsultante.setImmediate(true);
		tblConsultante.setNullSelectionAllowed(true);
		tblConsultante.setNullSelectionItemId(null);
		tblConsultante.addListener(new ValueChangeListener() {

			@Override
			public void valueChange(ValueChangeEvent event) {
				boolean esModoNuevo = tblConsultante.getValue() == null;
				if(esModoNuevo){
					tblConsultante.setValue(null);
					//habilitarEdicion(!esModoNuevo);
					//limpiar();
				}
				else
				{
					Item item = tblConsultante.getItem(tblConsultante.getValue());
					
					txtRegistro.setValue(item.getItemProperty("registro").getValue());
					txtCodigo.setValue(item.getItemProperty("codigo").getValue());
					cmbTipoDOI.setValue(item.getItemProperty("tipoDOI").getValue());
					txtNumero.setValue(item.getItemProperty("numero").getValue());
					txtNombres.setValue(item.getItemProperty("nombres").getValue());
					txtPaterno.setValue(item.getItemProperty("paterno").getValue());
					txtMaterno.setValue(item.getItemProperty("materno").getValue());
					pdfFecha.setValue(item.getItemProperty("fecha").getValue());
					cmbNacionalidad.setValue(item.getItemProperty("nacionalidad").getValue());
					txtCentro.setValue(item.getItemProperty("centro").getValue());
					cmbAplicativo.setValue(item.getItemProperty("aplicativo").getValue());
					cmbEstado.setValue(item.getItemProperty("estado").getValue());
					
				}
			}
		});
		
		cargarConsultante();
		
		List<Valor> listTipoNacionalidad=consultantesService.obtenerValoresxLista(Constante.LISTA.CODIGO.NACIONALIDAD_TIPO);
		BeanItemContainer<Valor> bicTipoNacionalidad = new BeanItemContainer<Valor>(Valor.class,  listTipoNacionalidad);
		cmbNacionalidad.setInputPrompt("Nacionalidad");
		cmbNacionalidad.setContainerDataSource(bicTipoNacionalidad);
		cmbNacionalidad.setItemCaptionPropertyId("nombre");
		cmbNacionalidad.setImmediate(true);
		
		pdfFecha.setDateFormat("dd/MM/yyyy");
		
		List<Valor> listTipoDOI=consultantesService.obtenerValoresxLista(Constante.LISTA.CODIGO.DOI_TIPO);
		BeanItemContainer<Valor> bicTipoDOI = new BeanItemContainer<Valor>(Valor.class,  listTipoDOI);
		cmbTipoDOI.setInputPrompt("Tipo DOI");
		cmbTipoDOI.setContainerDataSource(bicTipoDOI);
		cmbTipoDOI.setItemCaptionPropertyId("nombre");
		cmbTipoDOI.setImmediate(true);
		
		List<Valor> listOrigen=consultantesService.obtenerValoresxLista(Constante.LISTA.CODIGO.ORIGEN);
		BeanItemContainer<Valor> bicOrigen = new BeanItemContainer<Valor>(Valor.class,  listOrigen);
		cmbAplicativo.setInputPrompt("Aplicativo Origen");
		cmbAplicativo.setContainerDataSource(bicOrigen);
		cmbAplicativo.setItemCaptionPropertyId("nombre");
		cmbAplicativo.setImmediate(true);
		
		List<Valor> listEstadoUsuario=consultantesService.obtenerValoresxLista(Constante.LISTA.CODIGO.USUARIO_ESTADO);
		BeanItemContainer<Valor> bicEstadoUsuario = new BeanItemContainer<Valor>(Valor.class,  listEstadoUsuario);
		cmbEstado.setInputPrompt("Estado");
		cmbEstado.setContainerDataSource(bicEstadoUsuario);
		cmbEstado.setItemCaptionPropertyId("nombre");
		cmbEstado.setImmediate(true);
		
		List<Valor> listSituacionReniec=consultantesService.obtenerValoresxLista(Constante.LISTA.CODIGO.RENIEC_SITUACION);
		BeanItemContainer<Valor> bicSituacionReniec = new BeanItemContainer<Valor>(Valor.class,  listSituacionReniec);
		cmbEstadoReniec.setInputPrompt("Estado Reniec");
		cmbEstadoReniec.setContainerDataSource(bicSituacionReniec);
		cmbEstadoReniec.setItemCaptionPropertyId("nombre");
		cmbEstadoReniec.setEnabled(false);
		
		btnGuardar.addListener(this);
		
	}
	
	private void cargarConsultante(){
		List<Consultante> listConsultante=consultantesService.obtenerConsultante();
		
		IndexedContainer container = new IndexedContainer();
		
		container.addContainerProperty("registro", String.class,  null);
		container.addContainerProperty("nombreCompleto", String.class,  null);
		container.addContainerProperty("nombres", String.class,  null);
		container.addContainerProperty("paterno", String.class,  null);
		container.addContainerProperty("materno", String.class,  null);
		container.addContainerProperty("codigo", String.class,  null);
		container.addContainerProperty("tipoDOI", Valor.class,  null);
		container.addContainerProperty("nacionalidadNombre", String.class,  null);
		container.addContainerProperty("nacionalidad", Valor.class,  null);
		container.addContainerProperty("centro", String.class,  null);
		container.addContainerProperty("estadoNombre", String.class,  null);
		container.addContainerProperty("estado", Valor.class,  null);
		container.addContainerProperty("fecha", Date.class,  null);
		container.addContainerProperty("aplicativoNombre", String.class,  null);
		container.addContainerProperty("aplicativo", Valor.class,  null);
		container.addContainerProperty("numero", String.class,  null);
		
		int con=1;
		for (Consultante consultante : listConsultante) {
			Item item = container.addItem(con++);
            item.getItemProperty("registro").setValue(consultante.getIdentificador());
            item.getItemProperty("nombreCompleto").setValue(consultante.getNombreCompleto());
            item.getItemProperty("nombres").setValue(consultante.getNombres());
            item.getItemProperty("paterno").setValue(consultante.getPaterno());
            item.getItemProperty("materno").setValue(consultante.getMaterno());
            item.getItemProperty("codigo").setValue(consultante.getCodigoReniec());
            item.getItemProperty("tipoDOI").setValue(consultante.getTipoDOI());
            item.getItemProperty("nacionalidadNombre").setValue(consultante.getNacionalidad()==null ?
            		null : consultante.getNacionalidad().getNombre());
            item.getItemProperty("nacionalidad").setValue(consultante.getNacionalidad());
            item.getItemProperty("centro").setValue(consultante.getCentro());
            item.getItemProperty("estadoNombre").setValue(consultante.getEstado() == null ? 
            		null : consultante.getEstado().getNombre());
            item.getItemProperty("estado").setValue(consultante.getEstado());
            item.getItemProperty("fecha").setValue(consultante.getNacimiento());
            item.getItemProperty("aplicativoNombre").setValue(consultante.getOrigen() == null ? 
            		null : consultante.getOrigen().getNombre());
            item.getItemProperty("aplicativo").setValue(consultante.getOrigen());
            item.getItemProperty("numero").setValue(consultante.getDoi());
		}
		
		tblConsultante.setContainerDataSource(container);
		tblConsultante.setVisibleColumns(new Object[]{"registro", "nombreCompleto", "codigo", "nacionalidadNombre",
				"centro","estadoNombre","fecha","aplicativoNombre"});
		tblConsultante.setColumnWidth("registro", 50);
		tblConsultante.setColumnWidth("nombreCompleto", 130);
		tblConsultante.setColumnWidth("codigo", 60);
		tblConsultante.setColumnWidth("nacionalidadNombre", 70);
		tblConsultante.setColumnWidth("centro", 45);
		tblConsultante.setColumnWidth("estadoNombre", 50);
		tblConsultante.setColumnWidth("fecha", 65);
		tblConsultante.setColumnWidth("aplicativoNombre", 65);
		tblConsultante.setColumnHeader("registro", "Registro");
		tblConsultante.setColumnHeader("nombreCompleto", "Nombres");
		tblConsultante.setColumnHeader("codigo", "Codigo");
		tblConsultante.setColumnHeader("nacionalidadNombre", "Nacionalidad");
		tblConsultante.setColumnHeader("centro", "Centro");
		tblConsultante.setColumnHeader("estadoNombre", "Estado");
		tblConsultante.setColumnHeader("fecha", "Fecha");
		tblConsultante.setColumnHeader("aplicativoNombre", "Aplicativo");
	}
	
	@Override
	public void buttonClick(ClickEvent event) {
		if(event.getButton().equals(btnGuardar)){
			Consultante consultante=new Consultante();
			consultante.setIdentificador((String)txtRegistro.getValue());
			consultante.setCodigoReniec((String)txtCodigo.getValue());
			consultante.setTipoDOI((Valor)cmbTipoDOI.getValue());
			consultante.setDoi((String)txtNumero.getValue());
			consultante.setNombres((String)txtNombres.getValue());
			consultante.setPaterno((String)txtPaterno.getValue());
			consultante.setMaterno((String)txtMaterno.getValue());
			consultante.setNacimiento((Date)pdfFecha.getValue());
			consultante.setNacionalidad((Valor)cmbNacionalidad.getValue());
			consultante.setCentro((String)txtCentro.getValue());
			consultante.setOrigen((Valor)cmbAplicativo.getValue());
			consultante.setEstado((Valor)cmbEstado.getValue());
			Valor estadoReniec=null;
			for (Object obj : cmbEstadoReniec.getItemIds()) {
				estadoReniec=(Valor)obj;
			}
			consultante.setSituacion(estadoReniec);
			consultantesService.crearConsultante(consultante);
		}
	}
	
	@AutoGenerated
	private VerticalLayout buildMainLayout() {
		// common part: create layout
		mainLayout = new VerticalLayout();
		mainLayout.setImmediate(false);
		mainLayout.setWidth("100%");
		mainLayout.setHeight("100%");
		mainLayout.setMargin(false);
		
		// top-level component properties
		setWidth("100.0%");
		setHeight("100.0%");
		
		// pnlLayout
		pnlLayout = buildPnlLayout();
		mainLayout.addComponent(pnlLayout);
		
		return mainLayout;
	}

	@AutoGenerated
	private VerticalLayout buildPnlLayout() {
		// common part: create layout
		pnlLayout = new VerticalLayout();
		pnlLayout.setImmediate(false);
		pnlLayout.setWidth("-1px");
		pnlLayout.setHeight("-1px");
		pnlLayout.setMargin(false);
		
		// pnlConsultanteLayout
		pnlConsultanteLayout = buildPnlConsultanteLayout();
		pnlLayout.addComponent(pnlConsultanteLayout);
		
		return pnlLayout;
	}

	@AutoGenerated
	private HorizontalLayout buildPnlConsultanteLayout() {
		// common part: create layout
		pnlConsultanteLayout = new HorizontalLayout();
		pnlConsultanteLayout.setImmediate(false);
		pnlConsultanteLayout.setWidth("-1px");
		pnlConsultanteLayout.setHeight("-1px");
		pnlConsultanteLayout.setMargin(false);
		pnlConsultanteLayout.setSpacing(true);
		
		// pnlTablaContenido
		pnlTablaContenido = buildPnlTablaContenido();
		pnlConsultanteLayout.addComponent(pnlTablaContenido);
		
		// pnlConsultanteContenido
		pnlConsultanteContenido = buildPnlConsultanteContenido();
		pnlConsultanteLayout.addComponent(pnlConsultanteContenido);
		
		return pnlConsultanteLayout;
	}

	@AutoGenerated
	private VerticalLayout buildPnlTablaContenido() {
		// common part: create layout
		pnlTablaContenido = new VerticalLayout();
		pnlTablaContenido.setImmediate(false);
		pnlTablaContenido.setWidth("-1px");
		pnlTablaContenido.setHeight("-1px");
		pnlTablaContenido.setMargin(false);
		
		// tblConsultante
		tblConsultante = new Table(){
			@Override
			protected String formatPropertyValue(Object rowId, Object colId,
					Property property) {
				if (property.getType() == Date.class && property.getValue()!=null) {
					return fmt.format((Date)property.getValue());
		        }
				return super.formatPropertyValue(rowId, colId, property);
			}
		};
		tblConsultante.setImmediate(false);
		tblConsultante.setWidth("650px");
		tblConsultante.setHeight("300px");
		pnlTablaContenido.addComponent(tblConsultante);
		
		return pnlTablaContenido;
	}

	@AutoGenerated
	private VerticalLayout buildPnlConsultanteContenido() {
		// common part: create layout
		pnlConsultanteContenido = new VerticalLayout();
		pnlConsultanteContenido.setImmediate(false);
		pnlConsultanteContenido.setWidth("-1px");
		pnlConsultanteContenido.setHeight("-1px");
		pnlConsultanteContenido.setMargin(false);
		pnlConsultanteContenido.setSpacing(true);
		
		// lblTituloConsultante
		lblTituloConsultante = new Label();
		lblTituloConsultante.setImmediate(false);
		lblTituloConsultante.setWidth("-1px");
		lblTituloConsultante.setHeight("-1px");
		lblTituloConsultante.setValue("USUARIO RENIEC");
		pnlConsultanteContenido.addComponent(lblTituloConsultante);
		pnlConsultanteContenido.setComponentAlignment(lblTituloConsultante,
				new Alignment(20));
		
		// pnlConsultanteFila1
		pnlConsultanteFila1 = buildPnlConsultanteFila1();
		pnlConsultanteContenido.addComponent(pnlConsultanteFila1);
		
		// pnlConsultanteFila2
		pnlConsultanteFila2 = buildPnlConsultanteFila2();
		pnlConsultanteContenido.addComponent(pnlConsultanteFila2);
		
		// pnlConsultanteFila3
		pnlConsultanteFila3 = buildPnlConsultanteFila3();
		pnlConsultanteContenido.addComponent(pnlConsultanteFila3);
		
		// pnlConsultanteFila4
		pnlConsultanteFila4 = buildPnlConsultanteFila4();
		pnlConsultanteContenido.addComponent(pnlConsultanteFila4);
		
		// pnlConsultanteFila5
		pnlConsultanteFila5 = buildPnlConsultanteFila5();
		pnlConsultanteContenido.addComponent(pnlConsultanteFila5);
		
		// pnlConsultanteFila6
		pnlConsultanteFila6 = buildPnlConsultanteFila6();
		pnlConsultanteContenido.addComponent(pnlConsultanteFila6);
		
		// pnlConsultanteFila7
		pnlConsultanteFila7 = buildPnlConsultanteFila7();
		pnlConsultanteContenido.addComponent(pnlConsultanteFila7);
		
		// pnlConsultanteBoton
		pnlConsultanteBoton = buildPnlConsultanteBoton();
		pnlConsultanteContenido.addComponent(pnlConsultanteBoton);
		
		return pnlConsultanteContenido;
	}

	@AutoGenerated
	private HorizontalLayout buildPnlConsultanteFila1() {
		// common part: create layout
		pnlConsultanteFila1 = new HorizontalLayout();
		pnlConsultanteFila1.setImmediate(false);
		pnlConsultanteFila1.setWidth("-1px");
		pnlConsultanteFila1.setHeight("-1px");
		pnlConsultanteFila1.setMargin(false);
		pnlConsultanteFila1.setSpacing(true);
		
		// lblRegistro
		lblRegistro = new Label();
		lblRegistro.setImmediate(false);
		lblRegistro.setWidth("130px");
		lblRegistro.setHeight("-1px");
		lblRegistro.setValue("REGISTRO/USUARIO:");
		pnlConsultanteFila1.addComponent(lblRegistro);
		
		// txtRegistro
		txtRegistro = new TextField();
		txtRegistro.setImmediate(false);
		txtRegistro.setWidth("100px");
		txtRegistro.setHeight("-1px");
		txtRegistro.setSecret(false);
		pnlConsultanteFila1.addComponent(txtRegistro);
		
		// lblCodigo
		lblCodigo = new Label();
		lblCodigo.setImmediate(false);
		lblCodigo.setWidth("130px");
		lblCodigo.setHeight("-1px");
		lblCodigo.setValue("C�DIGO/DNI:");
		pnlConsultanteFila1.addComponent(lblCodigo);
		
		// txtCodigo
		txtCodigo = new TextField();
		txtCodigo.setImmediate(false);
		txtCodigo.setWidth("100px");
		txtCodigo.setHeight("-1px");
		txtCodigo.setSecret(false);
		pnlConsultanteFila1.addComponent(txtCodigo);
		
		return pnlConsultanteFila1;
	}

	@AutoGenerated
	private HorizontalLayout buildPnlConsultanteFila2() {
		// common part: create layout
		pnlConsultanteFila2 = new HorizontalLayout();
		pnlConsultanteFila2.setImmediate(false);
		pnlConsultanteFila2.setWidth("-1px");
		pnlConsultanteFila2.setHeight("-1px");
		pnlConsultanteFila2.setMargin(false);
		pnlConsultanteFila2.setSpacing(true);
		
		// lblNacionalidad
		lblNacionalidad = new Label();
		lblNacionalidad.setImmediate(false);
		lblNacionalidad.setWidth("130px");
		lblNacionalidad.setHeight("-1px");
		lblNacionalidad.setValue("NACIONALIDAD:");
		pnlConsultanteFila2.addComponent(lblNacionalidad);
		
		// cmbNacionalidad
		cmbNacionalidad = new ComboBox();
		cmbNacionalidad.setImmediate(false);
		cmbNacionalidad.setWidth("100px");
		cmbNacionalidad.setHeight("-1px");
		pnlConsultanteFila2.addComponent(cmbNacionalidad);
		
		// lblFecha
		lblFecha = new Label();
		lblFecha.setImmediate(false);
		lblFecha.setWidth("130px");
		lblFecha.setHeight("-1px");
		lblFecha.setValue("FEC. NACIMIENTO:");
		pnlConsultanteFila2.addComponent(lblFecha);
		
		// pdfFecha
		pdfFecha = new PopupDateField();
		pdfFecha.setImmediate(false);
		pdfFecha.setWidth("100px");
		pdfFecha.setHeight("-1px");
		pdfFecha.setInvalidAllowed(false);
		pdfFecha.setResolution(4);
		pnlConsultanteFila2.addComponent(pdfFecha);
		
		return pnlConsultanteFila2;
	}

	@AutoGenerated
	private HorizontalLayout buildPnlConsultanteFila3() {
		// common part: create layout
		pnlConsultanteFila3 = new HorizontalLayout();
		pnlConsultanteFila3.setImmediate(false);
		pnlConsultanteFila3.setWidth("-1px");
		pnlConsultanteFila3.setHeight("-1px");
		pnlConsultanteFila3.setMargin(false);
		pnlConsultanteFila3.setSpacing(true);
		
		// lblNombres
		lblNombres = new Label();
		lblNombres.setImmediate(false);
		lblNombres.setWidth("130px");
		lblNombres.setHeight("-1px");
		lblNombres.setValue("NOMBRES:");
		pnlConsultanteFila3.addComponent(lblNombres);
		
		// txtNombres
		txtNombres = new TextField();
		txtNombres.setImmediate(false);
		txtNombres.setWidth("100px");
		txtNombres.setHeight("-1px");
		txtNombres.setSecret(false);
		pnlConsultanteFila3.addComponent(txtNombres);
		
		// lblTipoDOI
		lblTipoDOI = new Label();
		lblTipoDOI.setImmediate(false);
		lblTipoDOI.setWidth("130px");
		lblTipoDOI.setHeight("-1px");
		lblTipoDOI.setValue("TIPO DOI:");
		pnlConsultanteFila3.addComponent(lblTipoDOI);
		
		// cmbTipoDOI
		cmbTipoDOI = new ComboBox();
		cmbTipoDOI.setImmediate(false);
		cmbTipoDOI.setWidth("100px");
		cmbTipoDOI.setHeight("-1px");
		pnlConsultanteFila3.addComponent(cmbTipoDOI);
		
		return pnlConsultanteFila3;
	}

	@AutoGenerated
	private HorizontalLayout buildPnlConsultanteFila4() {
		// common part: create layout
		pnlConsultanteFila4 = new HorizontalLayout();
		pnlConsultanteFila4.setImmediate(false);
		pnlConsultanteFila4.setWidth("-1px");
		pnlConsultanteFila4.setHeight("-1px");
		pnlConsultanteFila4.setMargin(false);
		pnlConsultanteFila4.setSpacing(true);
		
		// lblPaterno
		lblPaterno = new Label();
		lblPaterno.setImmediate(false);
		lblPaterno.setWidth("130px");
		lblPaterno.setHeight("-1px");
		lblPaterno.setValue("AP. PATERNO:");
		pnlConsultanteFila4.addComponent(lblPaterno);
		
		// txtPaterno
		txtPaterno = new TextField();
		txtPaterno.setImmediate(false);
		txtPaterno.setWidth("100px");
		txtPaterno.setHeight("-1px");
		txtPaterno.setSecret(false);
		pnlConsultanteFila4.addComponent(txtPaterno);
		
		// lblNumero
		lblNumero = new Label();
		lblNumero.setImmediate(false);
		lblNumero.setWidth("130px");
		lblNumero.setHeight("-1px");
		lblNumero.setValue("NUMERO DOI:");
		pnlConsultanteFila4.addComponent(lblNumero);
		
		// txtNumero
		txtNumero = new TextField();
		txtNumero.setImmediate(false);
		txtNumero.setWidth("100px");
		txtNumero.setHeight("-1px");
		txtNumero.setSecret(false);
		pnlConsultanteFila4.addComponent(txtNumero);
		
		return pnlConsultanteFila4;
	}

	@AutoGenerated
	private HorizontalLayout buildPnlConsultanteFila5() {
		// common part: create layout
		pnlConsultanteFila5 = new HorizontalLayout();
		pnlConsultanteFila5.setImmediate(false);
		pnlConsultanteFila5.setWidth("-1px");
		pnlConsultanteFila5.setHeight("-1px");
		pnlConsultanteFila5.setMargin(false);
		pnlConsultanteFila5.setSpacing(true);
		
		// lblMaterno
		lblMaterno = new Label();
		lblMaterno.setImmediate(false);
		lblMaterno.setWidth("130px");
		lblMaterno.setHeight("-1px");
		lblMaterno.setValue("AP. MATERNO:");
		pnlConsultanteFila5.addComponent(lblMaterno);
		
		// txtMaterno
		txtMaterno = new TextField();
		txtMaterno.setImmediate(false);
		txtMaterno.setWidth("100px");
		txtMaterno.setHeight("-1px");
		txtMaterno.setSecret(false);
		pnlConsultanteFila5.addComponent(txtMaterno);
		
		// lblCentro
		lblCentro = new Label();
		lblCentro.setImmediate(false);
		lblCentro.setWidth("130px");
		lblCentro.setHeight("-1px");
		lblCentro.setValue("CENTRO DE COSTO:");
		pnlConsultanteFila5.addComponent(lblCentro);
		
		// txtCentro
		txtCentro = new TextField();
		txtCentro.setImmediate(false);
		txtCentro.setWidth("100px");
		txtCentro.setHeight("-1px");
		txtCentro.setSecret(false);
		pnlConsultanteFila5.addComponent(txtCentro);
		
		return pnlConsultanteFila5;
	}

	@AutoGenerated
	private HorizontalLayout buildPnlConsultanteFila6() {
		// common part: create layout
		pnlConsultanteFila6 = new HorizontalLayout();
		pnlConsultanteFila6.setImmediate(false);
		pnlConsultanteFila6.setWidth("-1px");
		pnlConsultanteFila6.setHeight("-1px");
		pnlConsultanteFila6.setMargin(false);
		pnlConsultanteFila6.setSpacing(true);
		
		// lblAplicativo
		lblAplicativo = new Label();
		lblAplicativo.setImmediate(false);
		lblAplicativo.setWidth("130px");
		lblAplicativo.setHeight("-1px");
		lblAplicativo.setValue("APLICATIVO ORIGEN:");
		pnlConsultanteFila6.addComponent(lblAplicativo);
		
		// cmbAplicativo
		cmbAplicativo = new ComboBox();
		cmbAplicativo.setImmediate(false);
		cmbAplicativo.setWidth("100px");
		cmbAplicativo.setHeight("-1px");
		pnlConsultanteFila6.addComponent(cmbAplicativo);
		
		// lblEstado
		lblEstado = new Label();
		lblEstado.setImmediate(false);
		lblEstado.setWidth("130px");
		lblEstado.setHeight("-1px");
		lblEstado.setValue("ESTADO:");
		pnlConsultanteFila6.addComponent(lblEstado);
		
		// cmbEstado
		cmbEstado = new ComboBox();
		cmbEstado.setImmediate(false);
		cmbEstado.setWidth("100px");
		cmbEstado.setHeight("-1px");
		pnlConsultanteFila6.addComponent(cmbEstado);
		
		return pnlConsultanteFila6;
	}

	@AutoGenerated
	private HorizontalLayout buildPnlConsultanteFila7() {
		// common part: create layout
		pnlConsultanteFila7 = new HorizontalLayout();
		pnlConsultanteFila7.setImmediate(false);
		pnlConsultanteFila7.setWidth("478px");
		pnlConsultanteFila7.setHeight("-1px");
		pnlConsultanteFila7.setMargin(false);
		pnlConsultanteFila7.setSpacing(true);
		
		// pnlEstadoReniec
		pnlEstadoReniec = buildPnlEstadoReniec();
		pnlConsultanteFila7.addComponent(pnlEstadoReniec);
		pnlConsultanteFila7.setComponentAlignment(pnlEstadoReniec,
				new Alignment(6));
		
		return pnlConsultanteFila7;
	}

	@AutoGenerated
	private HorizontalLayout buildPnlEstadoReniec() {
		// common part: create layout
		pnlEstadoReniec = new HorizontalLayout();
		pnlEstadoReniec.setImmediate(false);
		pnlEstadoReniec.setWidth("-1px");
		pnlEstadoReniec.setHeight("-1px");
		pnlEstadoReniec.setMargin(false);
		pnlEstadoReniec.setSpacing(true);
		
		// lblEstadoReniec
		lblEstadoReniec = new Label();
		lblEstadoReniec.setImmediate(false);
		lblEstadoReniec.setWidth("130px");
		lblEstadoReniec.setHeight("-1px");
		lblEstadoReniec.setValue("ESTADO RENIEC:");
		pnlEstadoReniec.addComponent(lblEstadoReniec);
		
		// cmbEstadoReniec
		cmbEstadoReniec = new ComboBox();
		cmbEstadoReniec.setImmediate(false);
		cmbEstadoReniec.setWidth("100px");
		cmbEstadoReniec.setHeight("-1px");
		pnlEstadoReniec.addComponent(cmbEstadoReniec);
		
		return pnlEstadoReniec;
	}

	@AutoGenerated
	private HorizontalLayout buildPnlConsultanteBoton() {
		// common part: create layout
		pnlConsultanteBoton = new HorizontalLayout();
		pnlConsultanteBoton.setImmediate(false);
		pnlConsultanteBoton.setWidth("480px");
		pnlConsultanteBoton.setHeight("-1px");
		pnlConsultanteBoton.setMargin(false);
		
		// btnGuardar
		btnGuardar = new Button();
		btnGuardar.setCaption("GUARDAR");
		btnGuardar.setImmediate(true);
		btnGuardar.setWidth("-1px");
		btnGuardar.setHeight("-1px");
		pnlConsultanteBoton.addComponent(btnGuardar);
		pnlConsultanteBoton
				.setComponentAlignment(btnGuardar, new Alignment(20));
		
		// btnEstadoReniec
		btnEstadoReniec = new Button();
		btnEstadoReniec.setCaption("ESTADO RENIEC");
		btnEstadoReniec.setImmediate(true);
		btnEstadoReniec.setWidth("-1px");
		btnEstadoReniec.setHeight("-1px");
		pnlConsultanteBoton.addComponent(btnEstadoReniec);
		pnlConsultanteBoton.setComponentAlignment(btnEstadoReniec,
				new Alignment(20));
		
		return pnlConsultanteBoton;
	}

}
