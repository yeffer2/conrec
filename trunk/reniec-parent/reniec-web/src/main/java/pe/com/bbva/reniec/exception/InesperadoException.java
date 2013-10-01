package pe.com.bbva.reniec.exception;

public class InesperadoException extends ErrorException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2290862193086193022L;
	
	private static final String TITULO_DEFECTO = "Error Inesperado";
	
	private static final String CODIGO_MENSAJE_DEFECTO = "error.generico";

	public InesperadoException(String codigoMensaje, Object[] args,
			Throwable cause) {
		super(TITULO_DEFECTO, codigoMensaje, args, cause);
	}
	
	public InesperadoException(Object[] args,
			Throwable cause) {
		super(TITULO_DEFECTO, CODIGO_MENSAJE_DEFECTO, args, cause);
	}
	
	public InesperadoException(Throwable cause) {
		super(TITULO_DEFECTO, CODIGO_MENSAJE_DEFECTO, null, cause);
	}

}
