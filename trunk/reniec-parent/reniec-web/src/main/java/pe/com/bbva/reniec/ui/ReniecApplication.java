package pe.com.bbva.reniec.ui;

import com.vaadin.Application;
import com.vaadin.ui.Button;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;

@SuppressWarnings("serial")
public class ReniecApplication extends Application{

	Window windowReniec;
	
	@Override
	public void init() {
		
		//setTheme("harec");
		
		windowReniec = new Window();
		windowReniec.setCaption("Reniec");
		Button button=new Button("Usuarios");
		windowReniec.addComponent(button);
		button.addListener(new ClickListener() {
			
			public void buttonClick(ClickEvent event) {
				Window window=new Window();
				window.setHeight("450px");
				window.setWidth("450px");
				window.setModal(false);
				window.addComponent(new PruebaUI());
				getMainWindow().getWindow().addWindow(window);
			}
		});
		
		setMainWindow(windowReniec);
		
	}

}
