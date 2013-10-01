package pe.com.bbva.reniec.exception;

public class BBVAException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1791184089405650760L;
	private Tipo tipo;	
	
	public BBVAException(String message, Tipo tipo) {
		super(message);
		setTipo(tipo);
	}

	public BBVAException(Throwable cause, Tipo tipo) {
		super(cause);
		setTipo(tipo);
	}

	public enum Tipo
	{
		PROBLEMAS_PEA,
		PROBLEMAS_RENIEC,
		PROBLEMAS_RENIEC_RPTA,
		PROBLEMAS_CONSISTENCIA,
		PROBLEMAS_TABLAGENERALES,
		PROBLEMAS_SMS,
		PROBLEMAS_SMS_RPTA
	}

	public Tipo getTipo() {
		return tipo;
	}

	private void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	
}
