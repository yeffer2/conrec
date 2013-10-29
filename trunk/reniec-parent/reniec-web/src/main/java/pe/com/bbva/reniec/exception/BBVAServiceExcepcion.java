package pe.com.bbva.reniec.exception;



public class BBVAServiceExcepcion extends ErrorException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5964519934287080846L;
	private static final String TITULO_DEFECTO = "Error de conexión";	
	
	private static final String KEY_MESSAGE = "error.conexion.bbva";

	public BBVAServiceExcepcion(Throwable cause) {
		super(TITULO_DEFECTO, KEY_MESSAGE, null, cause);
	}
	
	public BBVAServiceExcepcion(String descipcion) {
		super(TITULO_DEFECTO, KEY_MESSAGE, new Object[]{descipcion});
	}

	public BBVAServiceExcepcion(String codigoMensaje, Object[] args,
			Throwable cause) {
		super(TITULO_DEFECTO, codigoMensaje, args, cause);
	}
	
	public BBVAServiceExcepcion(String codigoMensaje, Object[] args) {
		super(TITULO_DEFECTO, codigoMensaje, args);
	}

}
