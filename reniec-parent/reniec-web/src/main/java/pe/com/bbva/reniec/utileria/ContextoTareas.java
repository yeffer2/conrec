package pe.com.bbva.reniec.utileria;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContextoTareas {

	private static ContextoTareas instancia = new ContextoTareas();

	private ContextoTareas() {
	}

	private ApplicationContext contexto;
	
	private String frecuenciaCargaOficinas="";
	private String frecuenciaCargaTarjetas="";
	private String frecuenciaCargaTiposCambio="";
	private boolean isIniciadoContexto = false;
	
	public static ContextoTareas getInstance() {
		if (instancia == null) // SI ES NULL
			instancia = new ContextoTareas(); // LO INSTANCIAMOS
		return instancia;
	}

	public ApplicationContext obtenerContexto() {
		contexto = new ClassPathXmlApplicationContext(
				//"classpath*:pe/com/bbva/config/application-context*.xml");
				"classpath:applicationContext.xml"); //estaba
//				"classpath*:src/main/resources/applicationContext*.xml");
		setContexto(contexto);
		return contexto;
	}

	public ApplicationContext getContexto() {
		return contexto;
	}

	public void setContexto(ApplicationContext contexto) {
		this.contexto = contexto;
	}

	public String getFrecuenciaCargaOficinas() {
		return frecuenciaCargaOficinas;
	}

	public void setFrecuenciaCargaOficinas(String frecuenciaCargaOficinas) {
		this.frecuenciaCargaOficinas = frecuenciaCargaOficinas;
	}

	public String getFrecuenciaCargaTarjetas() {
		return frecuenciaCargaTarjetas;
	}

	public void setFrecuenciaCargaTarjetas(String frecuenciaCargaTarjetas) {
		this.frecuenciaCargaTarjetas = frecuenciaCargaTarjetas;
	}

	public String getFrecuenciaCargaTiposCambio() {
		return frecuenciaCargaTiposCambio;
	}

	public void setFrecuenciaCargaTiposCambio(String frecuenciaCargaTiposCambio) {
		this.frecuenciaCargaTiposCambio = frecuenciaCargaTiposCambio;
	}

	public boolean isIniciadoContexto() {
		return isIniciadoContexto;
	}

	public void setIniciadoContexto(boolean isIniciadoContexto) {
		this.isIniciadoContexto = isIniciadoContexto;
	}

	
	
	
	
}
