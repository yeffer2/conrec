package pe.com.bbva.reniec.job;

import java.sql.Timestamp;

import org.apache.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;


/**
 * Clase Job que ejecuta el proceso de carga de Consultantes desde ldap y archivos externos-
 * 
 * @author CDA Informática
 * @since 02/10/2013
 */
public class CargarConsultantes implements Job {
	
	Logger log = Logger.getLogger("cargarConsultantes");


	/**
	 * Ejecut del job.
	 */
	public void execute(JobExecutionContext context) throws JobExecutionException  {
		Timestamp tstInicio = new Timestamp(new java.util.Date().getTime());
		log.info("+++ INICIA CARGA DE CONSULTANTES A LAS " + tstInicio);
		//System.out.println("CARGANDO");
		
	
		Timestamp tstFin = new Timestamp(new java.util.Date().getTime());
		log.info("+++ TERMINA CARGA DE CONSULTANTES A LAS " + tstFin);
	}




}
