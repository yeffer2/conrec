package pe.com.bbva.reniec.ui;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import pe.com.bbva.reniec.dominio.Opcion;
import pe.com.bbva.reniec.negocio.SeguridadService;
import pe.com.bbva.reniec.utileria.Constante;
import pe.com.bbva.reniec.utileria.Inject;
import pe.com.bbva.reniec.utileria.ReniecMenuBar;
import pe.com.bbva.reniec.utileria.ReniecMenuBar.ReniecMenuItem;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Label;
import com.vaadin.ui.MenuBar.Command;
import com.vaadin.ui.MenuBar.MenuItem;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;

@SuppressWarnings("serial")
public class PrincipalUI extends CustomComponent implements Command{

	@AutoGenerated
	private VerticalLayout mainLayout;
	@AutoGenerated
	private VerticalLayout mainLayoutContainer;
	@AutoGenerated
	private Label lblPie;
	@AutoGenerated
	private VerticalLayout pnlContenido;
	@AutoGenerated
	private Label lblContenido;
	@AutoGenerated
	private VerticalLayout pnlCabecera;
	@AutoGenerated
	private ReniecMenuBar mnuPrincipal;

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
	private SeguridadService seguridadService;
	
	public PrincipalUI() {
		buildMainLayout();
		setCompositionRoot(mainLayout);
		Inject.inject(this);
		postConstruct();
	}

	public void postConstruct(){
		Map<String, List<Opcion>> map=seguridadService.obtenerOpciones();
		agregarMenu(Constante.OPCION.KEY_PADRE, map, null);
	}
	
	private void agregarMenu(String codigo, Map<String, List<Opcion>> map, ReniecMenuItem padre) {
		if(!map.containsKey(codigo))
		{
			return;
		}
		for (Opcion opc : map.get(codigo)) {
			ReniecMenuItem mni;
			if(Constante.VALOR.CODIGO.MENU.equals(opc.getTipo().getCodigo()))
			{
				mni = mnuPrincipal.addItem(opc.getCodigo(), opc.getNombre(), null);
			}
			else if (Constante.VALOR.CODIGO.SUBMENU.equals(opc.getTipo().getCodigo()))
			{
				mni = padre.addItem(opc.getCodigo(), opc.getNombre(), this);
			}
			else
			{
				continue;
			}
			
			if (map.get(opc.getCodigo()) != null) {
				agregarMenu(opc.getCodigo(), map, mni);
			} 
		}
	}
	

	@Override
	public void menuSelected(MenuItem selectedItem) {
		ReniecMenuItem selectedReniecItem = (ReniecMenuItem) selectedItem;
		if(selectedReniecItem.getCodigo().equals(Constante.OPCION.CON_CONS)){
			Window window=new Window();
			window.setCaption("Consulta de Usuarios");
			window.setModal(false);
			window.setResizable(false);
			window.setWidth("940px");
			ConsultantesUI consultantesUI=new ConsultantesUI();
			window.addComponent(consultantesUI);
			getApplication().getMainWindow().getWindow().addWindow(window);
		}else if(selectedReniecItem.getCodigo().equals(Constante.OPCION.CON_CARG_MAS)){
			//TODO Logica de Opcion
		}else if(selectedReniecItem.getCodigo().equals(Constante.OPCION.CONF_PARAM)){
			//TODO Logica de Opcion
		}else if(selectedReniecItem.getCodigo().equals(Constante.OPCION.CONF_LISTAS)){
			//TODO Logica de Opcion
		}else if(selectedReniecItem.getCodigo().equals(Constante.OPCION.CONF_JOB)){
			//TODO Logica de Opcion
		}else if(selectedReniecItem.getCodigo().equals(Constante.OPCION.CONF_DIAG)){
			//TODO Logica de Opcion
		}else if(selectedReniecItem.getCodigo().equals(Constante.OPCION.CONF_FICHER)){
			//TODO Logica de Opcion
		}else if(selectedReniecItem.getCodigo().equals(Constante.OPCION.SEG_ROL_MEMB)){
			//TODO Logica de Opcion
		}else if(selectedReniecItem.getCodigo().equals(Constante.OPCION.SEG_OPCION)){
			//TODO Logica de Opcion
		}else if(selectedReniecItem.getCodigo().equals(Constante.OPCION.SEG_PERM)){
			//TODO Logica de Opcion
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
		
		// mainLayoutContainer
		mainLayoutContainer = buildMainLayoutContainer();
		mainLayout.addComponent(mainLayoutContainer);
		
		return mainLayout;
	}

	@AutoGenerated
	private VerticalLayout buildMainLayoutContainer() {
		// common part: create layout
		mainLayoutContainer = new VerticalLayout();
		mainLayoutContainer.setImmediate(false);
		mainLayoutContainer.setWidth("100.0%");
		mainLayoutContainer.setHeight("100.0%");
		mainLayoutContainer.setMargin(false);
		
		// pnlCabecera
		pnlCabecera = buildPnlCabecera();
		mainLayoutContainer.addComponent(pnlCabecera);
		
		// pnlContenido
		pnlContenido = buildPnlContenido();
		mainLayoutContainer.addComponent(pnlContenido);
		mainLayoutContainer.setExpandRatio(pnlContenido, 1.0f);
		
		// lblPie
		lblPie = new Label();
		lblPie.setImmediate(false);
		lblPie.setWidth("-1px");
		lblPie.setHeight("-1px");
		lblPie.setValue("Reniec 1.0.1 � Copyright 2013 BBVA Continental");
		mainLayoutContainer.addComponent(lblPie);
		mainLayoutContainer.setComponentAlignment(lblPie, new Alignment(20));
		
		return mainLayoutContainer;
	}

	@AutoGenerated
	private VerticalLayout buildPnlCabecera() {
		// common part: create layout
		pnlCabecera = new VerticalLayout();
		pnlCabecera.setImmediate(false);
		pnlCabecera.setWidth("100.0%");
		pnlCabecera.setHeight("-1px");
		pnlCabecera.setMargin(false);
		
		// mnuPrincipal
		mnuPrincipal = new ReniecMenuBar();
		mnuPrincipal.setImmediate(false);
		mnuPrincipal.setWidth("100.0%");
		mnuPrincipal.setHeight("-1px");
		pnlCabecera.addComponent(mnuPrincipal);
		
		return pnlCabecera;
	}

	@AutoGenerated
	private VerticalLayout buildPnlContenido() {
		// common part: create layout
		pnlContenido = new VerticalLayout();
		pnlContenido.setImmediate(false);
		pnlContenido.setWidth("100.0%");
		pnlContenido.setHeight("100.0%");
		pnlContenido.setMargin(false);
		
		// lblContenido
		lblContenido = new Label();
		lblContenido.setImmediate(false);
		lblContenido.setWidth("100.0%");
		lblContenido.setHeight("100.0%");
		pnlContenido.addComponent(lblContenido);
		pnlContenido.setExpandRatio(lblContenido, 1.0f);
		
		return pnlContenido;
	}

}
