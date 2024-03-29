package pe.com.bbva.reniec.ui;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import pe.com.bbva.reniec.dominio.Lista;
import pe.com.bbva.reniec.dominio.Membresia;
import pe.com.bbva.reniec.dominio.Rol;
import pe.com.bbva.reniec.dominio.Valor;
import pe.com.bbva.reniec.negocio.SeguridadService;
import pe.com.bbva.reniec.utileria.BeanValidar;
import pe.com.bbva.reniec.utileria.Constante;
import pe.com.bbva.reniec.utileria.Inject;
import pe.com.bbva.reniec.utileria.ReniecUtil;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.data.Item;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.data.Property.ValueChangeListener;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.data.util.IndexedContainer;
import com.vaadin.event.FieldEvents.TextChangeEvent;
import com.vaadin.event.FieldEvents.TextChangeListener;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Table;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
public class MembresiasUI extends CustomComponent implements TextChangeListener, ClickListener{

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	@AutoGenerated
	private VerticalLayout mainLayout;

	@AutoGenerated
	private HorizontalLayout pnlMembresiaContenido;

	@AutoGenerated
	private VerticalLayout pnlGrabarMembresia;

	@AutoGenerated
	private HorizontalLayout pnlMembresiaFila4;

	@AutoGenerated
	private Button btnEliminarMembresia;

	@AutoGenerated
	private Button btnGrabarMembresia;

	@AutoGenerated
	private HorizontalLayout pnlMembresiaFila3;

	@AutoGenerated
	private ComboBox cmbEstadoMembresia;

	@AutoGenerated
	private HorizontalLayout pnlMembresiaFila2;

	@AutoGenerated
	private TextField txtValorMembresia;

	@AutoGenerated
	private ComboBox cmbTipoMembresia;

	@AutoGenerated
	private HorizontalLayout pnlMembresiaFila1;

	@AutoGenerated
	private ComboBox cmbRolMembresia;

	@AutoGenerated
	private TextField txtIdMembresia;

	@AutoGenerated
	private Label lblGrabarMembresia;

	@AutoGenerated
	private VerticalLayout pnlMembresias;

	@AutoGenerated
	private Table tblMembresias;

	@AutoGenerated
	private HorizontalLayout pnlFiltroMembresia;

	@AutoGenerated
	private TextField txtFiltroEstadoMembresia;

	@AutoGenerated
	private TextField txtFiltroValorMembresia;

	@AutoGenerated
	private TextField txtFiltroTipoMembresia;

	@AutoGenerated
	private TextField txtFiltroIdMembresia;

	@AutoGenerated
	private Label lblMembresias;

	@Autowired
	private SeguridadService seguridadService;
	
	private boolean flagNuevoMembresia;
	private Rol rolSeleccionado;

	public MembresiasUI() {
		buildMainLayout();
		setCompositionRoot(mainLayout);
		Inject.inject(this);
	}
	
	public void postConstruct() {
		inicializarComponentes();
		cargarMembresias();
		llenarCombos();
		habilitarEventosTablas();
		habilitarEventosFiltros();
	}

	
	
	private void inicializarComponentes(){
		txtIdMembresia.setValue("");		
		habilitarEdicion("rol",false);
		pnlMembresiaContenido.setVisible(false);
	}

	private void cargarMembresias(){
		Membresia membresia = new Membresia();
		membresia.setRol(this.rolSeleccionado);
		List<Membresia> membresias = seguridadService.buscarMembresias(membresia);
		cargarMembresias(membresias, true);
		
		habilitarEdicion("membresia",false);
		
		pnlMembresiaContenido.setVisible(true);
	}

	
	
	private void llenarCombos(){
		List<Rol> roles = seguridadService.buscarRoles(null);
		BeanItemContainer<Rol> bicRoles = new BeanItemContainer<Rol>(Rol.class,  roles);
		
		List<Valor> valores = seguridadService.obtenerValoresxLista(Constante.LISTA.CODIGO.REGISTRO_ESTADO);
		BeanItemContainer<Valor> bicValores = new BeanItemContainer<Valor>(Valor.class,  valores);
		
		cmbEstadoMembresia.setInputPrompt("Estado");
		cmbEstadoMembresia.setContainerDataSource(bicValores);
		cmbEstadoMembresia.setItemCaptionPropertyId("nombre");
		
		
		valores = seguridadService.obtenerValoresxLista(Constante.LISTA.CODIGO.MEMBRESIA_TIPO);
		bicValores = new BeanItemContainer<Valor>(Valor.class,  valores);
		
		cmbTipoMembresia.setInputPrompt("Tipo");
		cmbTipoMembresia.setContainerDataSource(bicValores);
		cmbTipoMembresia.setItemCaptionPropertyId("nombre");
		
		
		cmbRolMembresia.setInputPrompt("Rol");
		cmbRolMembresia.setContainerDataSource(bicRoles);
		cmbRolMembresia.setItemCaptionPropertyId("nombre");
		cmbRolMembresia.select(rolSeleccionado);
	}
	
	private void habilitarEventosTablas(){
		tblMembresias.setSelectable(true);
		tblMembresias.setImmediate(true);
		tblMembresias.setNullSelectionAllowed(true);
		tblMembresias.setNullSelectionItemId(null);
		
		tblMembresias.addListener(new ValueChangeListener() {

			private static final long serialVersionUID = 1L;

			@Override
			public void valueChange(ValueChangeEvent event) {
				boolean esModoNuevo = tblMembresias.getValue() == null;
				if(esModoNuevo){
					tblMembresias.setValue(null);
					habilitarEdicion("membresia",!esModoNuevo);
					txtIdMembresia.setValue("");
					limpiar("membresia");
				}
				else
				{
					Item item = tblMembresias.getItem(tblMembresias.getValue());
					txtIdMembresia.setValue(item.getItemProperty("id").getValue());
					Rol rol = new Rol();
					rol.setId((Long)item.getItemProperty("rol.id").getValue());
					rol.setCodigo((String)item.getItemProperty("rol.codigo").getValue());
					cmbRolMembresia.select(rol);
					Valor tipo = new Valor();
					tipo.setId((Long)item.getItemProperty("tipo.id").getValue());
					tipo.setCodigo((String)item.getItemProperty("tipo.codigo").getValue());
					tipo.setNombre((String)item.getItemProperty("tipo.nombre").getValue());
					tipo.setLista(new Lista());
					tipo.getLista().setCodigo((String)item.getItemProperty("tipo.lista.codigo").getValue());
					cmbTipoMembresia.select(tipo);
					txtValorMembresia.setValue(item.getItemProperty("valor").getValue());
					Valor estado = new Valor();
					estado.setId((Long)item.getItemProperty("estado.id").getValue());
					estado.setCodigo((String)item.getItemProperty("estado.codigo").getValue());
					estado.setLista(new Lista());
					estado.getLista().setCodigo((String)item.getItemProperty("estado.lista.codigo").getValue());
					cmbEstadoMembresia.select(estado);
					
					habilitarEdicion("membresia",!esModoNuevo);
					
				}
			}
		});
		
	}
	
	private void habilitarEventosFiltros(){
		txtFiltroIdMembresia.setImmediate(true);
		txtFiltroTipoMembresia.setImmediate(true);
		txtFiltroValorMembresia.setImmediate(true);
		txtFiltroEstadoMembresia.setImmediate(true);
		
		txtFiltroIdMembresia.addListener((TextChangeListener)this);
		txtFiltroTipoMembresia.addListener((TextChangeListener)this);
		txtFiltroValorMembresia.addListener((TextChangeListener)this);
		txtFiltroEstadoMembresia.addListener((TextChangeListener)this);
		
		btnGrabarMembresia.addListener((ClickListener)this);
		btnEliminarMembresia.addListener((ClickListener)this);
	}
	
	
	private void habilitarEdicion(String nombre, boolean flag)
	{
		if(nombre.equals("rol")){
			
		}else if(nombre.equals("membresia")){
			flagNuevoMembresia= !flag;
			btnEliminarMembresia.setVisible(flag);
			if(flag)
			{
				btnGrabarMembresia.setCaption("Actualizar");
			}
			else
			{
				btnGrabarMembresia.setCaption("Crear");
			}
		}
	}
	
	private void limpiar(String nombre){
		if(nombre.equals("rol")){
		}else if(nombre.equals("membresia")){
			txtIdMembresia.setValue("");
			cmbRolMembresia.select(rolSeleccionado);	
			cmbTipoMembresia.setValue(null);
			txtValorMembresia.setValue("");
			cmbEstadoMembresia.setValue(null);
		}
	}
	
	
	private void cargarMembresias(List<Membresia> membresias, boolean flagLimpiar)
	{
		IndexedContainer container = new IndexedContainer();
		
		container.addContainerProperty("id", Long.class,  null);
		container.addContainerProperty("tipo.id", Long.class, null);
		container.addContainerProperty("tipo.codigo", String.class, null);
		container.addContainerProperty("tipo.lista.codigo", String.class, null);
		container.addContainerProperty("tipo.nombre", String.class, null);
		container.addContainerProperty("valor", String.class,  null);
		container.addContainerProperty("estado.id", Long.class, null);
		container.addContainerProperty("estado.nombre", String.class, null);
		container.addContainerProperty("rol.id", Long.class, null);
		container.addContainerProperty("rol.nombre", String.class, null);
		container.addContainerProperty("estado.codigo", String.class, null);
		container.addContainerProperty("estado.lista.codigo", String.class, null);
		container.addContainerProperty("rol.codigo", String.class, null);
		
		int con=1;
		for (Membresia membresia : membresias) {
			Item item = container.addItem(con++);
            item.getItemProperty("id").setValue(membresia.getId());
            item.getItemProperty("tipo.id").setValue(membresia.getTipo() == null ? null : membresia.getTipo().getId());
            item.getItemProperty("tipo.codigo").setValue(membresia.getTipo() == null ? null : membresia.getTipo().getCodigo());
            item.getItemProperty("tipo.lista.codigo").setValue(membresia.getTipo() == null && membresia.getTipo().getLista() == null  ? null : membresia.getTipo().getLista().getCodigo());
            item.getItemProperty("tipo.nombre").setValue(membresia.getTipo() == null ? null : membresia.getTipo().getNombre());
            item.getItemProperty("valor").setValue(membresia.getValor());
            item.getItemProperty("estado.id").setValue(membresia.getEstado() == null ? null : membresia.getEstado().getId());
            item.getItemProperty("estado.nombre").setValue(membresia.getEstado() == null ? null : membresia.getEstado().getNombre());
            item.getItemProperty("rol.id").setValue(membresia.getRol() == null ? null : membresia.getRol().getId());
            item.getItemProperty("rol.nombre").setValue(membresia.getRol() == null ? null : membresia.getRol().getId());
            item.getItemProperty("rol.codigo").setValue(membresia.getRol() == null ? null : membresia.getRol().getCodigo());
            item.getItemProperty("estado.codigo").setValue(membresia.getEstado() == null ? null : membresia.getEstado().getCodigo());
            item.getItemProperty("estado.lista.codigo").setValue(membresia.getEstado() == null && membresia.getEstado().getLista() == null ? null : membresia.getEstado().getLista().getCodigo());
		}
		
		tblMembresias.setContainerDataSource(container);
		tblMembresias.setVisibleColumns(new Object[]{"id", "tipo.nombre", "valor", "estado.nombre"});
		tblMembresias.setColumnWidth("id", 37);
		tblMembresias.setColumnWidth("tipo.nombre", 137);
		tblMembresias.setColumnWidth("valor", 137);
		tblMembresias.setColumnWidth("estado.nombre", 137);
		tblMembresias.setColumnHeader("id", "Id");
		tblMembresias.setColumnHeader("tipo.nombre", "Tipo");
		tblMembresias.setColumnHeader("valor", "Valor");
		tblMembresias.setColumnHeader("estado.nombre", "Estado");
		
		if(flagLimpiar)
		{
			txtFiltroIdMembresia.setValue("");
			txtFiltroTipoMembresia.setValue("");
			txtFiltroValorMembresia.setValue("");
			txtFiltroEstadoMembresia.setValue("");
		}
		
	}
	
	@Override
	public void textChange(TextChangeEvent event) {
		Membresia membresia = null;
		
		if(event.getSource().equals(txtFiltroIdMembresia))
		{
			membresia = new Membresia();
			
			if(StringUtils.isNumeric(event.getText())){
				if(StringUtils.isNotBlank(event.getText()))
				{
					membresia.setId(Long.parseLong(event.getText()));
				}
				if(StringUtils.isNotBlank(txtFiltroTipoMembresia.getValue().toString()))
				{
					Valor tipo = new Valor();
					tipo.setNombre(txtFiltroTipoMembresia.getValue().toString());
					membresia.setTipo(tipo);
				}
				if(StringUtils.isNotBlank(txtFiltroValorMembresia.getValue().toString()))
				{
					membresia.setValor(txtFiltroValorMembresia.getValue().toString());
				}
				if(StringUtils.isNotBlank(txtFiltroEstadoMembresia.getValue().toString()))
				{
					Valor estado = new Valor();
					estado.setNombre(txtFiltroEstadoMembresia.getValue().toString());
					membresia.setEstado(estado);
				}
			}else{
				txtFiltroIdMembresia.setValue(txtFiltroIdMembresia.getValue());
			}
		}
		if(event.getSource().equals(txtFiltroTipoMembresia))
		{
			membresia = new Membresia();
			if(StringUtils.isNotBlank(txtFiltroIdMembresia.getValue().toString()))
			{
				membresia.setId(Long.parseLong(txtFiltroIdMembresia.getValue().toString()));
			}
			if(StringUtils.isNotBlank(event.getText()))
			{
				Valor tipo = new Valor();
				tipo.setNombre(event.getText());
				membresia.setTipo(tipo);
			}
			if(StringUtils.isNotBlank(txtFiltroValorMembresia.getValue().toString()))
			{
				membresia.setValor(txtFiltroValorMembresia.getValue().toString());
			}
			if(StringUtils.isNotBlank(txtFiltroEstadoMembresia.getValue().toString()))
			{
				Valor estado = new Valor();
				estado.setNombre(txtFiltroEstadoMembresia.getValue().toString());
				membresia.setEstado(estado);
			}
		}
		if(event.getSource().equals(txtFiltroValorMembresia))
		{
			membresia = new Membresia();
			if(StringUtils.isNotBlank(txtFiltroIdMembresia.getValue().toString()))
			{
				membresia.setId(Long.parseLong(txtFiltroIdMembresia.getValue().toString()));
			}
			if(StringUtils.isNotBlank(txtFiltroTipoMembresia.getValue().toString()))
			{
				Valor tipo = new Valor();
				tipo.setNombre(txtFiltroTipoMembresia.getValue().toString());
				membresia.setTipo(tipo);
			}
			if(StringUtils.isNotBlank(event.getText()))
			{
				membresia.setValor(event.getText());
			}
			if(StringUtils.isNotBlank(txtFiltroEstadoMembresia.getValue().toString()))
			{
				Valor estado = new Valor();
				estado.setNombre(txtFiltroEstadoMembresia.getValue().toString());
				membresia.setEstado(estado);
			}
		}
		if(event.getSource().equals(txtFiltroEstadoMembresia))
		{
			membresia = new Membresia();
			if(StringUtils.isNotBlank(txtFiltroIdMembresia.getValue().toString()))
			{
				membresia.setId(Long.parseLong(txtFiltroIdMembresia.getValue().toString()));
			}
			if(StringUtils.isNotBlank(txtFiltroTipoMembresia.getValue().toString()))
			{
				Valor tipo = new Valor();
				tipo.setNombre(txtFiltroTipoMembresia.getValue().toString());
				membresia.setTipo(tipo);
			}
			if(StringUtils.isNotBlank(txtFiltroValorMembresia.getValue().toString()))
			{
				membresia.setValor(txtFiltroValorMembresia.getValue().toString());
			}
			if(StringUtils.isNotBlank(event.getText()))
			{
				Valor estado = new Valor();
				estado.setNombre(event.getText());
				membresia.setEstado(estado);
			}
		}
		if(membresia!=null){
			membresia.setRol(rolSeleccionado);
			List<Membresia> membresias = seguridadService.buscarMembresias(membresia);
			cargarMembresias(membresias, false);
			limpiar("membresia");
			habilitarEdicion("membresia",false);
		}
	}

	@Override
	public void buttonClick(ClickEvent event) {
		
		if(event.getButton().equals(btnGrabarMembresia))
		{
			buttonClickGrabar();
		}
		if(event.getButton().equals(btnEliminarMembresia))
		{
			buttonClickEliminar();
		}
	}
	
	private void buttonClickGrabar(){

		Membresia membresia = new Membresia();
		membresia.setRol((Rol)cmbRolMembresia.getValue());
		membresia.setTipo((Valor)cmbTipoMembresia.getValue());
		membresia.setValor((String)txtValorMembresia.getValue());
		membresia.setEstado((Valor)cmbEstadoMembresia.getValue());

		if(!flagNuevoMembresia)
		{
			membresia.setId(Long.parseLong(txtIdMembresia.getValue().toString()));
		}
		ReniecUtil.validar(getWindow(), membresia, 
				new BeanValidar[]{new BeanValidar("rol", new Object[]{"Rol"}, cmbRolMembresia),
					new BeanValidar("tipo", new Object[]{"Tipo"}, cmbTipoMembresia),
					new BeanValidar("valor", new Object[]{"Valor"}, txtValorMembresia),
					new BeanValidar("estado", new Object[]{"Estado"}, cmbEstadoMembresia)});
		seguridadService.guardarMembresia(membresia);
		refrescar("membresia");
	
	}
	
	private void buttonClickEliminar(){

		seguridadService.eliminarMembresia(Long.parseLong(txtIdMembresia.getValue().toString()));
		refrescar("membresia");
	
	}
	
	private void refrescar(String nombre)
	{
		habilitarEdicion(nombre,false);
		limpiar(nombre);
		if(nombre.equals("rol")){
		}else if(nombre.equals("membresia")){
//			Rol rol = new Rol();
//			rol.setId(1L);
			Membresia membresia = new Membresia();
			membresia.setRol(rolSeleccionado);
			List<Membresia> membresias = seguridadService.buscarMembresias(membresia);
			cargarMembresias(membresias, true);
		}
	}
	
	
	
	
	
	public Rol getRolSeleccionado() {
		return rolSeleccionado;
	}

	public void setRolSeleccionado(Rol rolSeleccionado) {
		this.rolSeleccionado = rolSeleccionado;
		postConstruct();
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
		
		// pnlMembresiaContenido
		pnlMembresiaContenido = buildPnlMembresiaContenido();
		mainLayout.addComponent(pnlMembresiaContenido);
		
		return mainLayout;
	}

	@AutoGenerated
	private HorizontalLayout buildPnlMembresiaContenido() {
		// common part: create layout
		pnlMembresiaContenido = new HorizontalLayout();
		pnlMembresiaContenido.setImmediate(false);
		pnlMembresiaContenido.setWidth("950px");
		pnlMembresiaContenido.setHeight("-1px");
		pnlMembresiaContenido.setMargin(false);
		
		// pnlMembresias
		pnlMembresias = buildPnlMembresias();
		pnlMembresiaContenido.addComponent(pnlMembresias);
		
		// pnlGrabarMembresia
		pnlGrabarMembresia = buildPnlGrabarMembresia();
		pnlMembresiaContenido.addComponent(pnlGrabarMembresia);
		
		return pnlMembresiaContenido;
	}

	@AutoGenerated
	private VerticalLayout buildPnlMembresias() {
		// common part: create layout
		pnlMembresias = new VerticalLayout();
		pnlMembresias.setImmediate(false);
		pnlMembresias.setWidth("530px");
		pnlMembresias.setHeight("-1px");
		pnlMembresias.setMargin(false);
		
		// lblMembresias
		lblMembresias = new Label();
		lblMembresias.setImmediate(false);
		lblMembresias.setWidth("-1px");
		lblMembresias.setHeight("-1px");
		lblMembresias.setValue("Membres�as");
		pnlMembresias.addComponent(lblMembresias);
		
		// pnlFiltroMembresia
		pnlFiltroMembresia = buildPnlFiltroMembresia();
		pnlMembresias.addComponent(pnlFiltroMembresia);
		
		// tblMembresias
		tblMembresias = new Table();
		tblMembresias.setImmediate(false);
		tblMembresias.setWidth("520px");
		tblMembresias.setHeight("180px");
		pnlMembresias.addComponent(tblMembresias);
		
		return pnlMembresias;
	}

	@AutoGenerated
	private HorizontalLayout buildPnlFiltroMembresia() {
		// common part: create layout
		pnlFiltroMembresia = new HorizontalLayout();
		pnlFiltroMembresia.setImmediate(false);
		pnlFiltroMembresia.setWidth("-1px");
		pnlFiltroMembresia.setHeight("-1px");
		pnlFiltroMembresia.setMargin(false);
		
		// txtFiltroIdMembresia
		txtFiltroIdMembresia = new TextField();
		txtFiltroIdMembresia.setImmediate(false);
		txtFiltroIdMembresia.setWidth("50px");
		txtFiltroIdMembresia.setHeight("-1px");
		txtFiltroIdMembresia.setInputPrompt("Id");
		pnlFiltroMembresia.addComponent(txtFiltroIdMembresia);
		
		// txtFiltroTipoMembresia
		txtFiltroTipoMembresia = new TextField();
		txtFiltroTipoMembresia.setImmediate(false);
		txtFiltroTipoMembresia.setWidth("150px");
		txtFiltroTipoMembresia.setHeight("-1px");
		txtFiltroTipoMembresia.setInputPrompt("Tipo");
		pnlFiltroMembresia.addComponent(txtFiltroTipoMembresia);
		
		// txtFiltroValorMembresia
		txtFiltroValorMembresia = new TextField();
		txtFiltroValorMembresia.setImmediate(false);
		txtFiltroValorMembresia.setWidth("150px");
		txtFiltroValorMembresia.setHeight("-1px");
		txtFiltroValorMembresia.setInputPrompt("Valor");
		pnlFiltroMembresia.addComponent(txtFiltroValorMembresia);
		
		// txtFiltroEstadoMembresia
		txtFiltroEstadoMembresia = new TextField();
		txtFiltroEstadoMembresia.setImmediate(false);
		txtFiltroEstadoMembresia.setWidth("150px");
		txtFiltroEstadoMembresia.setHeight("-1px");
		txtFiltroEstadoMembresia.setInputPrompt("Estado");
		pnlFiltroMembresia.addComponent(txtFiltroEstadoMembresia);
		
		return pnlFiltroMembresia;
	}

	@AutoGenerated
	private VerticalLayout buildPnlGrabarMembresia() {
		// common part: create layout
		pnlGrabarMembresia = new VerticalLayout();
		pnlGrabarMembresia.setImmediate(false);
		pnlGrabarMembresia.setWidth("370px");
		pnlGrabarMembresia.setHeight("-1px");
		pnlGrabarMembresia.setMargin(false);
		pnlGrabarMembresia.setSpacing(true);
		
		// lblGrabarMembresia
		lblGrabarMembresia = new Label();
		lblGrabarMembresia.setImmediate(false);
		lblGrabarMembresia.setWidth("-1px");
		lblGrabarMembresia.setHeight("-1px");
		lblGrabarMembresia.setValue("Membres�a");
		pnlGrabarMembresia.addComponent(lblGrabarMembresia);
		
		// pnlMembresiaFila1
		pnlMembresiaFila1 = buildPnlMembresiaFila1();
		pnlGrabarMembresia.addComponent(pnlMembresiaFila1);
		
		// pnlMembresiaFila2
		pnlMembresiaFila2 = buildPnlMembresiaFila2();
		pnlGrabarMembresia.addComponent(pnlMembresiaFila2);
		
		// pnlMembresiaFila3
		pnlMembresiaFila3 = buildPnlMembresiaFila3();
		pnlGrabarMembresia.addComponent(pnlMembresiaFila3);
		
		// pnlMembresiaFila4
		pnlMembresiaFila4 = buildPnlMembresiaFila4();
		pnlGrabarMembresia.addComponent(pnlMembresiaFila4);
		
		return pnlGrabarMembresia;
	}

	@AutoGenerated
	private HorizontalLayout buildPnlMembresiaFila1() {
		// common part: create layout
		pnlMembresiaFila1 = new HorizontalLayout();
		pnlMembresiaFila1.setImmediate(false);
		pnlMembresiaFila1.setWidth("-1px");
		pnlMembresiaFila1.setHeight("-1px");
		pnlMembresiaFila1.setMargin(false);
		pnlMembresiaFila1.setSpacing(true);
		
		// txtIdMembresia
		txtIdMembresia = new TextField();
		txtIdMembresia.setEnabled(false);
		txtIdMembresia.setImmediate(false);
		txtIdMembresia.setWidth("40px");
		txtIdMembresia.setHeight("-1px");
		txtIdMembresia.setInputPrompt("Id");
		pnlMembresiaFila1.addComponent(txtIdMembresia);
		
		// cmbRolMembresia
		cmbRolMembresia = new ComboBox();
		cmbRolMembresia.setImmediate(false);
		cmbRolMembresia.setWidth("200px");
		cmbRolMembresia.setHeight("-1px");
		pnlMembresiaFila1.addComponent(cmbRolMembresia);
		
		return pnlMembresiaFila1;
	}

	@AutoGenerated
	private HorizontalLayout buildPnlMembresiaFila2() {
		// common part: create layout
		pnlMembresiaFila2 = new HorizontalLayout();
		pnlMembresiaFila2.setImmediate(false);
		pnlMembresiaFila2.setWidth("-1px");
		pnlMembresiaFila2.setHeight("-1px");
		pnlMembresiaFila2.setMargin(false);
		pnlMembresiaFila2.setSpacing(true);
		
		// cmbTipoMembresia
		cmbTipoMembresia = new ComboBox();
		cmbTipoMembresia.setImmediate(false);
		cmbTipoMembresia.setWidth("180px");
		cmbTipoMembresia.setHeight("-1px");
		pnlMembresiaFila2.addComponent(cmbTipoMembresia);
		
		// txtValorMembresia
		txtValorMembresia = new TextField();
		txtValorMembresia.setStyleName("fieldRequired");
		txtValorMembresia.setImmediate(false);
		txtValorMembresia.setWidth("180px");
		txtValorMembresia.setHeight("-1px");
		txtValorMembresia.setInputPrompt("Valor");
		pnlMembresiaFila2.addComponent(txtValorMembresia);
		
		return pnlMembresiaFila2;
	}

	@AutoGenerated
	private HorizontalLayout buildPnlMembresiaFila3() {
		// common part: create layout
		pnlMembresiaFila3 = new HorizontalLayout();
		pnlMembresiaFila3.setImmediate(false);
		pnlMembresiaFila3.setWidth("-1px");
		pnlMembresiaFila3.setHeight("-1px");
		pnlMembresiaFila3.setMargin(false);
		pnlMembresiaFila3.setSpacing(true);
		
		// cmbEstadoMembresia
		cmbEstadoMembresia = new ComboBox();
		cmbEstadoMembresia.setImmediate(false);
		cmbEstadoMembresia.setWidth("180px");
		cmbEstadoMembresia.setHeight("-1px");
		pnlMembresiaFila3.addComponent(cmbEstadoMembresia);
		
		return pnlMembresiaFila3;
	}

	@AutoGenerated
	private HorizontalLayout buildPnlMembresiaFila4() {
		// common part: create layout
		pnlMembresiaFila4 = new HorizontalLayout();
		pnlMembresiaFila4.setImmediate(false);
		pnlMembresiaFila4.setWidth("370px");
		pnlMembresiaFila4.setHeight("-1px");
		pnlMembresiaFila4.setMargin(false);
		pnlMembresiaFila4.setSpacing(true);
		
		// btnGrabarMembresia
		btnGrabarMembresia = new Button();
		btnGrabarMembresia.setCaption("Actualizar");
		btnGrabarMembresia.setImmediate(true);
		btnGrabarMembresia.setWidth("-1px");
		btnGrabarMembresia.setHeight("-1px");
		pnlMembresiaFila4.addComponent(btnGrabarMembresia);
		pnlMembresiaFila4.setComponentAlignment(btnGrabarMembresia, new Alignment(20));
		
		// btnEliminarMembresia
		btnEliminarMembresia = new Button();
		btnEliminarMembresia.setCaption("Eliminar");
		btnEliminarMembresia.setImmediate(true);
		btnEliminarMembresia.setWidth("-1px");
		btnEliminarMembresia.setHeight("-1px");
		pnlMembresiaFila4.addComponent(btnEliminarMembresia);
		pnlMembresiaFila4.setComponentAlignment(btnEliminarMembresia, new Alignment(20));
		
		return pnlMembresiaFila4;
	}



}
