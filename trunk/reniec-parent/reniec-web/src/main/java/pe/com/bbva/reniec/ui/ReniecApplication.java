package pe.com.bbva.reniec.ui;

import com.vaadin.Application;
import com.vaadin.ui.Window;

@SuppressWarnings("serial")
public class ReniecApplication extends Application{

	Window windowReniec;
	
	@Override
	public void init() {
		
		setTheme("reniec");
		
		windowReniec=new Window();
		windowReniec.setCaption("Login");
		windowReniec.addComponent(new LoginUI());
		
		setMainWindow(windowReniec);
		
	}

}
