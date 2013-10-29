package pe.com.bbva.reniec.ui;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import pe.com.bbva.reniec.dominio.Usuario;
import pe.com.bbva.reniec.exception.AlertaException;
import pe.com.bbva.reniec.exception.ErrorException;
import pe.com.bbva.reniec.negocio.SeguridadService;
import pe.com.bbva.reniec.utileria.Constante;
import pe.com.bbva.reniec.utileria.Inject;

import com.grupobbva.bc.per.tele.seguridad.ServiciosSeguridadBbva;
import com.vaadin.Application;
import com.vaadin.ui.Window;
import com.vaadin.ui.Window.Notification;
import com.vaadin.terminal.Terminal;

@SuppressWarnings("serial")
public class ReniecApplication extends Application{

	private static final Log logger = LogFactory.getLog(ReniecApplication.class);
	
	@Autowired
	private MessageSource messageSource;
	@Autowired
	private SeguridadService seguridadService;
	
	Window windowReniec;
	
	@Override
	public void init() {
		Inject.inject(this);
		
		setTheme("reniec");
		
		iniciarWebseal();
		
		setMainWindow(windowReniec);
		
	}

	@SuppressWarnings({ "deprecation" })
	private void iniciarWebseal(){
		windowReniec=new Window();
		String login=null;
		ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder
				.currentRequestAttributes();
		HttpServletRequest request = requestAttributes.getRequest();
		ServiciosSeguridadBbva ssBbva = new ServiciosSeguridadBbva(request);
		try {
			ssBbva.obtener_ID();
			login=ssBbva.getUsuario();
		} catch (Exception e) {
			logger.info("No se ingresa por WebSeal");
		}
		if(login==null){
			windowReniec.setCaption("Login");
			windowReniec.addComponent(new LoginUI());
		}else{
			Usuario usuario = seguridadService.login(login);
	        if(usuario != null)
	        {
	    		HttpSession session = request.getSession(true);
	    		session.setAttribute(Constante.SESION.USUARIO, usuario);
	    		windowReniec.addComponent(new PrincipalUI());
	    		windowReniec.getContent().setHeight("100%");
	    		windowReniec.getLayout().setMargin(false);
	        }
		}
	}
	
	@Override
	public void terminalError(Terminal.ErrorEvent event) {
		String defaultMessage = "Mensaje no especificado";
		if(event.getThrowable().getCause() instanceof AlertaException){
			resolverAlertaException((AlertaException) event.getThrowable().getCause(), defaultMessage);
		}else if(event.getThrowable().getCause() instanceof ErrorException){
			resolverErrorException((ErrorException) event.getThrowable().getCause(), defaultMessage);
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
		logger.info("Reniec Alerta [" + alertaException.getTitulo() + "=" + mensaje + "]");
	}
	
	private void resolverErrorException(ErrorException errorException,
			String defaultMessage) {
		
		String mensaje = messageSource.getMessage(
				errorException.getCodigoMensaje(), 
				errorException.getArgs(), 
        		defaultMessage, this.getLocale());
		
		windowReniec.showNotification(
				errorException.getTitulo(),
				mensaje,
                Notification.TYPE_ERROR_MESSAGE);		
		
		logger.error("Reniec Error [" + errorException.getTitulo() + "=" + mensaje + "]", errorException);
	}
	
	private void resolverException(Throwable cause, String defaultMessage) {
		windowReniec.showNotification(
                "ERROR inesperado",
                messageSource.getMessage(
                		Constante.CODIGO_MENSAJE.ERROR_GENERICO, 
                		null, 
                		defaultMessage, this.getLocale()),
                Notification.TYPE_ERROR_MESSAGE);
		logger.error("Reniec: Error inesperado", cause);
	}
	
	public static SystemMessages getSystemMessages() {
		CustomizedSystemMessages customizedSystemMessages = new CustomizedSystemMessages();
		
		customizedSystemMessages.setSessionExpiredCaption("Sesión expirada");
		customizedSystemMessages.setSessionExpiredMessage("Anote la información no guardada y haga <u>click aquí</u> para continuar.");
		customizedSystemMessages.setSessionExpiredNotificationEnabled(true);
		customizedSystemMessages.setSessionExpiredURL(null);
		
		return customizedSystemMessages;
	}
	
}
