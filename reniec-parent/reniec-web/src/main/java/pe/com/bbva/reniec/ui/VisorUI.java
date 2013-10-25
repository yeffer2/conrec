package pe.com.bbva.reniec.ui;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import pe.com.bbva.reniec.dominio.Valor;
import pe.com.bbva.reniec.negocio.ConfiguracionService;
import pe.com.bbva.reniec.utileria.AdjuntarReceiver;
import pe.com.bbva.reniec.utileria.CollapsibleFileSystemContainer;
import pe.com.bbva.reniec.utileria.ConfirmDialog;
import pe.com.bbva.reniec.utileria.Constante;
import pe.com.bbva.reniec.utileria.Inject;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.data.Property;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.event.ItemClickEvent;
import com.vaadin.event.MouseEvents;
import com.vaadin.event.ShortcutAction;
import com.vaadin.event.ShortcutAction.KeyCode;
import com.vaadin.terminal.StreamResource;
import com.vaadin.terminal.ThemeResource;
import com.vaadin.terminal.gwt.server.WebApplicationContext;
import com.vaadin.terminal.gwt.server.WebBrowser;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Embedded;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.TreeTable;
import com.vaadin.ui.Upload;
import com.vaadin.ui.Upload.FailedEvent;
import com.vaadin.ui.Upload.FinishedEvent;
import com.vaadin.ui.Upload.StartedEvent;
import com.vaadin.ui.Upload.SucceededEvent;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window.Notification;

/**
 * @author vmorepal
 * 
 */
public class VisorUI extends CustomComponent implements
		Property.ValueChangeListener, com.vaadin.event.MouseEvents.ClickListener, ClickListener {

	private static final long serialVersionUID = 1L;

	private static final Logger log = LoggerFactory
			.getLogger(VisorUI.class);

	@AutoGenerated
	private VerticalLayout mainLayout;

	@AutoGenerated
	private VerticalLayout pnlContenido;

	@AutoGenerated
	private Panel vLayoutDatos;

	@AutoGenerated
	private VerticalLayout vLayoutRuta;

	@AutoGenerated
	private VerticalLayout vLayoutTreeTable;

	@AutoGenerated
	private VerticalLayout verticalLayout_Separador;

	@AutoGenerated
	private Label lblTitulo;

	@AutoGenerated
	private Label lblRuta;

	@AutoGenerated
	private VerticalLayout vLayoutMensaje;

	@AutoGenerated
	private ComboBox cboRuta;

	private Valor ruta;

	@AutoGenerated
	private HorizontalLayout hLayout;
	
	@AutoGenerated
	private VerticalLayout pnlUploadAdj;
	
	@AutoGenerated
	private Embedded embedAccion;
	
	AdjuntarReceiver receiver=new AdjuntarReceiver();
	
	private Upload uploadDocumento = new Upload(null, receiver);
	
	@AutoGenerated
	private Button btnMostrarPanel;

	@Autowired
	private ConfiguracionService configuracionService;

	private List<Valor> listaRutas;

	private String path;

	private File file;
	
	private TreeTable treeTable;

	public VisorUI() {
		path = "";
		buildMainLayout();
		setCompositionRoot(mainLayout);
		Inject.inject(this);
		postConstruct();
	}
	
	@PostConstruct
	public void postConstruct() {
		try {
			listaRutas = configuracionService.obtenerValoresxLista(Constante.LISTA.CODIGO.RUTAS_ARCHIVOS);
			BeanItemContainer<Valor> lstRuta = new BeanItemContainer<Valor>(Valor.class, listaRutas);
			cboRuta.setContainerDataSource(lstRuta);
			cboRuta.setItemCaptionPropertyId("descripcion");
			pnlUploadAdj.addComponent(uploadDocumento);
			uploadDocumento.setImmediate(true);
			uploadDocumento.setButtonCaption("Subir fichero");
			uploadDocumento.setVisible(false);
			uploadDocumentoAddListener();			
		} catch (Exception e) {
			getWindow().showNotification("ERROR: " + e.getMessage(), Notification.TYPE_ERROR_MESSAGE);
			e.printStackTrace();
		}		
	}

	@AutoGenerated
	private VerticalLayout buildMainLayout() {
		// common part: create layout
		mainLayout = new VerticalLayout();
		mainLayout.setImmediate(false);
		mainLayout.setWidth("100.0%");
		mainLayout.setHeight("100.0%");
		mainLayout.setMargin(false);

		// top-level component properties
		setWidth("100.0%");
		setHeight("100.0%");

		pnlContenido = this.buildPanelContenido();
		mainLayout.addComponent(pnlContenido);
//		mainLayout.setComponentAlignment(pnlContenido, new Alignment(48));

		return mainLayout;
	}

	private VerticalLayout buildPanelContenido() {
		pnlContenido = new VerticalLayout();
		pnlContenido.setImmediate(false);
		pnlContenido.setWidth("100.0%"); // 98.0
		pnlContenido.setHeight("-1px");
		pnlContenido.setMargin(false);
		pnlContenido.setSpacing(true);

		vLayoutDatos = buildvLayoutDatos();
		pnlContenido.addComponent(vLayoutDatos);

		return pnlContenido;
	}

	@AutoGenerated
	private Panel buildvLayoutDatos() {
		// common part: create layout
		vLayoutDatos = new Panel();
		vLayoutDatos.setImmediate(false);
		vLayoutDatos.setWidth("100.0%");
		vLayoutDatos.setHeight("-1px");

		lblTitulo = new Label();
		lblTitulo.setValue("Consulta de Logs");
		lblTitulo.setStyleName("v-label-newLabel");
		lblTitulo.setWidth("-1px");
		lblTitulo.setHeight("50px");

		vLayoutRuta = this.buildvLayoutRuta();
		vLayoutTreeTable = this.buildvLayoutTreeTable();
		verticalLayout_Separador = buildVerticalLayout_Separador();

		//vLayoutDatos.addComponent(lblTitulo);
		vLayoutDatos.addComponent(vLayoutRuta);
		vLayoutDatos.addComponent(verticalLayout_Separador);
		vLayoutDatos.addComponent(vLayoutTreeTable);

		return vLayoutDatos;
	}

	private VerticalLayout buildvLayoutRuta() {
		vLayoutRuta = new VerticalLayout();
		vLayoutRuta.setImmediate(false);
		vLayoutRuta.setWidth("100.0%");
		vLayoutRuta.setHeight("-1px");
		vLayoutRuta.setMargin(false);
		vLayoutRuta.setSpacing(true);

		hLayout = this.buildhLayoutRuta();
		vLayoutRuta.addComponent(hLayout);

		return vLayoutRuta;
	}

	private VerticalLayout buildvLayoutTreeTable() {
		vLayoutTreeTable = new VerticalLayout();
		vLayoutTreeTable.setImmediate(false);
		vLayoutTreeTable.setWidth("100.0%");
		vLayoutTreeTable.setHeight("-1px"); 
		vLayoutTreeTable.setMargin(false);
		vLayoutTreeTable.setSpacing(true);

		vLayoutTreeTable.addComponent(this.withFileSystemContainer());
		vLayoutTreeTable.setVisible(false);
		return vLayoutTreeTable;
	}

	private HorizontalLayout buildhLayoutRuta() {
		hLayout = new HorizontalLayout();
		hLayout.setImmediate(false);
		hLayout.setWidth("-1px");
		hLayout.setHeight("-1px");
		hLayout.setMargin(false);
		hLayout.setSpacing(true);

		lblRuta = new Label();
		lblRuta.setImmediate(false);
		lblRuta.setWidth("150px");
		lblRuta.setHeight("-1px");
		lblRuta.setValue("Rutas configuradas:");
		hLayout.addComponent(lblRuta);

		cboRuta = new ComboBox();
		cboRuta.setImmediate(true);
		cboRuta.setWidth("-1px");
		cboRuta.setHeight("-1px");
		cboRuta.setInputPrompt("Rutas");
		cboRuta.addListener(ValueChangeEvent.class, this, "valueChange");
		hLayout.addComponent(cboRuta);
		
		pnlUploadAdj = buildPanelUpload();
		hLayout.addComponent(pnlUploadAdj);
		
		btnMostrarPanel = buildButtonMostrarSentencia();
		hLayout.addComponent(btnMostrarPanel);

		return hLayout;
	}
	
	private Button buildButtonMostrarSentencia(){
		btnMostrarPanel = new Button();
		btnMostrarPanel.setCaption("");
		btnMostrarPanel.setImmediate(false);
		btnMostrarPanel.setWidth("0px"); //0 
		btnMostrarPanel.setHeight("0px");
		btnMostrarPanel.setClickShortcut(KeyCode.Q, ShortcutAction.ModifierKey.CTRL);
		btnMostrarPanel.addListener((ClickListener) this);
		return btnMostrarPanel;
	}
	
	private VerticalLayout buildPanelUpload(){
		pnlUploadAdj = new VerticalLayout();
		pnlUploadAdj.setImmediate(false);
		pnlUploadAdj.setWidth("-1px");
		pnlUploadAdj.setHeight("-1px");
		pnlUploadAdj.setMargin(false);
		return pnlUploadAdj; 
	}

	private VerticalLayout buildVerticalLayout_Separador() {
		verticalLayout_Separador = new VerticalLayout();
		verticalLayout_Separador.setImmediate(false);
		verticalLayout_Separador.setWidth("100.0%");
		verticalLayout_Separador.setHeight("35px");
		verticalLayout_Separador.setMargin(false);
		verticalLayout_Separador.setSpacing(true);
		
		embedAccion = new Embedded("", new ThemeResource("img/icon_delete.png"));
    	embedAccion.setDescription("Eliminar fichero");
    	embedAccion.setVisible(false);
    	embedAccion.addListener((MouseEvents.ClickListener)this);
    	
    	verticalLayout_Separador.addComponent(embedAccion);
		verticalLayout_Separador.setComponentAlignment(embedAccion, Alignment.TOP_RIGHT);
		return verticalLayout_Separador;
	}

	@SuppressWarnings("serial")
	private TreeTable withFileSystemContainer() {
		CollapsibleFileSystemContainer collapsibleFileSystemContainer = new CollapsibleFileSystemContainer(
				new File(path));
		treeTable = new TreeTable();
		treeTable.setImmediate(false);
		treeTable.setCaption("�rbol de ficheros");
		treeTable.setWidth("100.0%"); 
		treeTable.setHeight("100.0%"); 
		treeTable.setContainerDataSource(collapsibleFileSystemContainer);
		treeTable.setColumnExpandRatio(CollapsibleFileSystemContainer.PROPERTY_NAME, 1);
		treeTable.setItemIconPropertyId(CollapsibleFileSystemContainer.PROPERTY_ICON);
		treeTable.setColumnReorderingAllowed(true);
		treeTable.setVisibleColumns(new Object[] {
				CollapsibleFileSystemContainer.PROPERTY_NAME,
				CollapsibleFileSystemContainer.PROPERTY_SIZE,
				CollapsibleFileSystemContainer.PROPERTY_LASTMODIFIED});

		treeTable.setSelectable(true);
		treeTable.addListener(new ItemClickEvent.ItemClickListener() {
			public void itemClick(ItemClickEvent event) {
				try {
					if (event!= null) { 
						if(event.isDoubleClick())
							if(file!=null)
								abrirArchivo(file);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		treeTable.addListener(new Property.ValueChangeListener() {
			public void valueChange(ValueChangeEvent event) {
				try {
					file = null;
					if(event.getProperty()!=null){
						leerArchivo(treeTable, false);	
					}
				} catch (Exception e) {
					log.error("+++ OCURRIO UN ERROR AL SELECCIONAR EL ARCHIVO " + e.getMessage());
					e.printStackTrace();
				}
			}
		});
		treeTable.setColumnIcon(CollapsibleFileSystemContainer.PROPERTY_NAME,
				new ThemeResource("../runo/icons/16/document.png"));
		return treeTable;
	}

	private void leerArchivo(TreeTable treeTable, boolean isDirectory) throws Exception {
		File value = (File) treeTable.getValue();
		if (value!=null && !isDirectory && !value.isDirectory()) {
			file = value;
		}else if(value!=null && isDirectory){
			file = value;
		}/*else{
			file= null; // se agrego el else
		}*/
	}
	
	public void valueChange(ValueChangeEvent event) {
		ruta = (Valor) event.getProperty().getValue();
		if (ruta != null) {
			path = ruta.getDescripcion();
			vLayoutTreeTable.removeAllComponents();
			vLayoutTreeTable.addComponent(this.withFileSystemContainer());
			vLayoutTreeTable.setVisible(true);
//			embedAccion.setVisible(true);
		} else {
			vLayoutTreeTable.setVisible(false);
//			embedAccion.setVisible(false);
		}
	}
	
	public void listarDirectorio(){
		if (path != null) {
			VerticalLayout vLayoutTree = vLayoutTreeTable;
			vLayoutTreeTable = buildvLayoutTreeTable();
			vLayoutTreeTable.setVisible(true);
			
			vLayoutDatos.replaceComponent(vLayoutTree, vLayoutTreeTable);
			vLayoutDatos.requestRepaintRequests();
		}
	}

	public void abrirArchivo(File file) {
		if (file != null) {
			try {
				openFile();
			} catch (IOException e) {
				log.error("ERROR AL ABRIR EL ARCHIVO: " + e.getMessage());
				getWindow().showNotification("No existe el archivo " + file.getName(), Notification.TYPE_ERROR_MESSAGE);
			}
		} 
	}
	
	private void openFile() throws IOException {
		StreamResource.StreamSource source = new StreamResource.StreamSource() {
            private static final long serialVersionUID = 1L;
            public InputStream getStream() { 
            	if (file!=null){
            		try {
						return new FileInputStream(file);
					} catch (FileNotFoundException e) {
						e.printStackTrace();
					}
            	}
            	return null;
            }  
		};
		StreamResource resource = new StreamResource(source, file.getPath(), getApplication());
		resource.setMIMEType("application/x-unknown");
		resource.setCacheTime(0);
		WebApplicationContext context = ((WebApplicationContext) 
				getParent().getParent().getParent().getApplication().getContext());
        WebBrowser webBrowser = context.getBrowser();
        if(webBrowser.isIE()){
        	getParent().getParent().getParent().getWindow().open(resource,"_blank");
		}else{
			getParent().getParent().getParent().getWindow().open(resource);
		}
	}
	
	private void eliminarArchivo(){
		if(file!=null && file.exists()){
			deleteFile(file);
			listarDirectorio();
		}
		file = null;
	}
	
	private void uploadDocumentoAddListener(){
        uploadDocumento.addListener(new Upload.StartedListener() {
            private static final long serialVersionUID = -4333306723016937219L;
			public void uploadStarted(StartedEvent event) {
				cboRuta.setEnabled(false);
            	if(cboRuta.getValue()!=null){
	            	uploadDocumento.setEnabled(false);
            	}else{
            		getWindow().showNotification("Ingresar un directorio v�lido", Notification.TYPE_ERROR_MESSAGE);
            		uploadDocumento.interruptUpload();
            		return;
            	}
            }
        });
        
        uploadDocumento.addListener(new Upload.SucceededListener() {
			private static final long serialVersionUID = -3769903056311972921L;
			public void uploadSucceeded(SucceededEvent event) {
				ReniecApplication reniecApplication = (ReniecApplication)getApplication();
				try {
	            	AdjuntarReceiver receiver = (AdjuntarReceiver)uploadDocumento.getReceiver();
	            	ByteArrayOutputStream outputStream= receiver.getOutputStream();
	            	File file = new File(((Valor)cboRuta.getValue()).getDescripcion() + "/" + receiver.getFileName());
	                FileOutputStream foi = new FileOutputStream(file);
	                foi.write(outputStream.toByteArray());
	                foi.flush();
	                foi.close();
	                listarDirectorio();
				} catch (Exception e) {
					//FIXME corregir validacion
					//InesperadoException inesperadoException = new InesperadoException(Constante.CODIGO_MENSAJE.ERROR_GENERICO, null, e);
					//com.vaadin.terminal.Terminal.ErrorEvent errorEvent = new HarecErrorEvent(inesperadoException);
					//reniecApplication.terminalError(errorEvent);
				}
            }
        });

        uploadDocumento.addListener(new Upload.FailedListener() {
            private static final long serialVersionUID = 7920554199992944051L;
			public void uploadFailed(FailedEvent event) {
               //Mensaje de Error
				if(cboRuta.getValue()!=null){
					getWindow().showNotification(event.getReason().getMessage(), Notification.TYPE_ERROR_MESSAGE);	
					uploadDocumento.setEnabled(true);
				}
            }
        });

        uploadDocumento.addListener(new Upload.FinishedListener() {
			private static final long serialVersionUID = 6264348242537253603L;
			public void uploadFinished(FinishedEvent event) {
				cboRuta.setEnabled(true);
				uploadDocumento.setEnabled(true);
            }
        });
	}

	@Override
	public void click(com.vaadin.event.MouseEvents.ClickEvent event) {
		try {
			leerArchivo(treeTable, true);
			if(file!=null){
				ConfirmDialog.show(getWindow().getParent() , "�Est� seguro de eliminar el fichero o directorio: " + file.getAbsolutePath() + "?",
				        new ConfirmDialog.Listener() {
					private static final long serialVersionUID = 1L;
					public void onClose(ConfirmDialog dialog) {
		                if (dialog.isConfirmed()) {
		                	eliminarArchivo();
		                } 
		            }
		        });	
			}else{
				log.error("+++ No se seleccion� ning�n archivo " );
				getWindow().showNotification("No se seleccion� ning�n archivo ", Notification.TYPE_WARNING_MESSAGE);
			}
			
		} catch (Exception e) {
			log.error("+++ Ocurri� un error al leer archivo " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	private boolean deleteFile(File dir) {  
		if(dir.canWrite()){
			if(dir.isDirectory()){
				File[] children = dir.listFiles();
			    boolean childrenDeleted = true;  
			    for (int i = 0; children != null && i < children.length; i++) {  
			        File child = children[i];  
			        if (child.isDirectory()) {  
			            childrenDeleted = this.deleteFile(child) && childrenDeleted;  
			        }  
			        if (child.exists()) {  
			            childrenDeleted = child.delete() && childrenDeleted;  
			        }  
			    }
			}
			return dir.delete();
		}else{
			getWindow().showNotification("Fichero no se puede eliminar... Verificar permisos", Notification.TYPE_WARNING_MESSAGE);
		}
		return false;
	}

	@Override
	public void buttonClick(ClickEvent event) {
		if (event.getButton().equals(btnMostrarPanel)) {
			mostrarOcultarPanel();
		}		
	}  
	
	private void mostrarOcultarPanel(){
		if(uploadDocumento.isVisible()){
			uploadDocumento.setVisible(false);
			embedAccion.setVisible(false);			
		}else{
			uploadDocumento.setVisible(true);
			embedAccion.setVisible(true);
		}
	}
}