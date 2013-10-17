package pe.com.bbva.reniec.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

import pe.com.bbva.reniec.exception.AlertaException;
import pe.com.bbva.reniec.utileria.Constante;
import pe.com.bbva.reniec.utileria.Inject;

import com.vaadin.Application;
import com.vaadin.ui.Window;
import com.vaadin.ui.Window.Notification;
import com.vaadin.terminal.Terminal;

@SuppressWarnings("serial")
public class ReniecApplication extends Application{

	@Autowired
	private MessageSource messageSource;
	
	Window windowReniec;
	
	@Override
	public void init() {
		Inject.inject(this);
		
		setTheme("reniec");
		
		windowReniec=new Window();
		windowReniec.setCaption("Login");
		windowReniec.addComponent(new LoginUI());
		
		setMainWindow(windowReniec);
		
	}

	@Override
	public void terminalError(Terminal.ErrorEvent event) {
		String defaultMessage = "Mensaje no especificado";
		if(event.getThrowable().getCause() instanceof AlertaException){
			resolverAlertaException((AlertaException) event.getThrowable().getCause(), defaultMessage);
		}else{
			resolverException(event.getThrowable().getCause(), defaultMessage);
			super.terminalError(event);
		}
	}

	private void resolverAlertaException(AlertaException alertaException,
			String defaultMessage) {
		String mensaje = messageSource.getMessage(
				alertaException.getCodigoMensaje(), 
				alertaException.getArgs(), 
        		defaultMessage, this.getLocale());
		
		windowReniec.showNotification(
				alertaException.getTitulo(),
				mensaje,
                Notification.TYPE_WARNING_MESSAGE);
	}
	
	private void resolverException(Throwable cause, String defaultMessage) {
		windowReniec.showNotification(
                "ERROR inesperado",
                messageSource.getMessage(
                		Constante.CODIGO_MENSAJE.ERROR_GENERICO, 
                		null, 
                		defaultMessage, this.getLocale()),
                Notification.TYPE_ERROR_MESSAGE);
	}
	
}
