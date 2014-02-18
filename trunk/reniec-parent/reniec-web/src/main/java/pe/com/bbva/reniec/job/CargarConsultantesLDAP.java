package pe.com.bbva.reniec.job;

import java.sql.Timestamp;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.SchedulerContext;
import org.quartz.SchedulerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import pe.com.bbva.reniec.negocio.ConfiguracionService;
import pe.com.bbva.reniec.utileria.Inject;
import pe.com.bbva.reniec.utileria.ProcesarCargaLDAP;

/**
 * Clase Job que ejecuta el proceso de carga de Consultantes desde ldap
 * 
 * @author CDA Informática
 * @since 02/10/2013
 */
public class CargarConsultantesLDAP implements Job {

	Logger log = LogManager.getLogger("cargarConsultantesLDAP");

	SchedulerContext schedulerContext;
	JobExecutionContext contextoJob;
	ApplicationContext applicationContextScheduler;

	@Autowired
	ConfiguracionService configuracionService;

	protected String formatoDateArchivo = "yyyyMMdd";

	/**
	 * Ejecute del job.
	 */
	public void execute(JobExecutionContext context)
			throws JobExecutionException {
		Timestamp tstInicio = new Timestamp(new java.util.Date().getTime());
		log.info("+++ INICIA CARGA DE CONSULTANTES LDAP A LAS " + tstInicio);
		contextoJob = context;
		cargaAutomaticaLDAP();

		Timestamp tstFin = new Timestamp(new java.util.Date().getTime());
		log.info("+++ TERMINA CARGA DE CONSULTANTES LDAP A LAS " + tstFin);
	}

	private void cargaAutomaticaLDAP() {
		ProcesarCargaLDAP procesoLDAP = new ProcesarCargaLDAP(
				getApplicationContext());
		procesoLDAP.procesarCarga();
	}

	public ConfiguracionService getConfiguracionService() {
		if (configuracionService == null)
			Inject.injectScheduler(this, getApplicationContext());
		return configuracionService;
	}

	private ApplicationContext getApplicationContext() {
		if (schedulerContext == null) {
			try {
				schedulerContext = contextoJob.getScheduler().getContext();
			} catch (SchedulerException e) {
				e.printStackTrace();
			}
		}
		if (applicationContextScheduler == null) {
			applicationContextScheduler = (ApplicationContext) schedulerContext
					.get("applicationContext");
		}
		return applicationContextScheduler;
	}

}
