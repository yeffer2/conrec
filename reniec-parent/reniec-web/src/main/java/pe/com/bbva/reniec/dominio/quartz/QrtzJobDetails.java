package pe.com.bbva.reniec.dominio.quartz;
// Generated 09-ago-2012 10:28:08 by Hibernate Tools 3.4.0.CR1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

/**
 *  Victor More
 */

@SuppressWarnings("serial")
@Entity
@Table(name="QRTZ_JOB_DETAILS")
@IdClass(QrtzJobDetailsId.class)
public class QrtzJobDetails implements java.io.Serializable {

	@Id
	@Column(name="JOB_NAME")
    private String jobName;
	
	@Id
	@Column(name="JOB_GROUP")
    private String jobGroup;
	
	/*@EmbeddedId
	private QrtzJobDetailsId pk;*/
	
	@Column(name="DESCRIPTION")
    private String description;
	
	@Column(name="JOB_CLASS_NAME", nullable = false)
    private String jobClassName;
	
	@Column(name="IS_DURABLE", nullable = false)
    private String isDurable;
	
	@Column(name="IS_VOLATILE", nullable = false)
    private String isVolatile;
	
	@Column(name="IS_STATEFUL", nullable = false)
    private String isStateful;
	
	@Column(name="REQUESTS_RECOVERY", nullable = false)
    private String requestsRecovery;
	
	@Column(name="JOB_DATA")
    private byte[] jobData;
	
    /*private Set<QrtzTriggers> qrtzTriggerses = new HashSet<QrtzTriggers>(0);
    private Set<QrtzJobListeners> qrtzJobListenerses = new HashSet<QrtzJobListeners>(0);*/

    public QrtzJobDetails() {
    }

	
   /* public QrtzJobDetails(QrtzJobDetailsId id, String jobClassName, String isDurable, String isVolatile, String isStateful, String requestsRecovery) {
        this.id = id;
        this.jobClassName = jobClassName;
        this.isDurable = isDurable;*
        this.isVolatile = isVolatile;
        this.isStateful = isStateful;
        this.requestsRecovery = requestsRecovery;
    }
    public QrtzJobDetails(QrtzJobDetailsId id, String description, String jobClassName, String isDurable, String isVolatile, String isStateful, String requestsRecovery, byte[] jobData, Set<QrtzTriggers> qrtzTriggerses, Set<QrtzJobListeners> qrtzJobListenerses) {
       this.id = id;
       this.description = description;
       this.jobClassName = jobClassName;
       this.isDurable = isDurable;
       this.isVolatile = isVolatile;
       this.isStateful = isStateful;
       this.requestsRecovery = requestsRecovery;
       this.jobData = jobData;
       this.qrtzTriggerses = qrtzTriggerses;
       this.qrtzJobListenerses = qrtzJobListenerses;
    }
   */
   /* public QrtzJobDetailsId getId() {
        return this.id;
    }
    
    public void setId(QrtzJobDetailsId id) {
        this.id = id;
    }*/
    
    public String getDescription() {
        return this.description;
    }
    
    public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getJobGroup() {
		return jobGroup;
	}

	public void setJobGroup(String jobGroup) {
		this.jobGroup = jobGroup;
	}

    
	public void setDescription(String description) {
        this.description = description;
    }
    /*public QrtzJobDetailsId getPk() {
		return pk;
	}
	public void setPk(QrtzJobDetailsId pk) {
		this.pk = pk;
	}*/
	public String getJobClassName() {
        return this.jobClassName;
    }
    
    public void setJobClassName(String jobClassName) {
        this.jobClassName = jobClassName;
    }
    public String getIsDurable() {
        return this.isDurable;
    }
    
    public void setIsDurable(String isDurable) {
        this.isDurable = isDurable;
    }
    public String getIsVolatile() {
        return this.isVolatile;
    }
    
    public void setIsVolatile(String isVolatile) {
        this.isVolatile = isVolatile;
    }
    public String getIsStateful() {
        return this.isStateful;
    }
    
    public void setIsStateful(String isStateful) {
        this.isStateful = isStateful;
    }
    public String getRequestsRecovery() {
        return this.requestsRecovery;
    }
    
    public void setRequestsRecovery(String requestsRecovery) {
        this.requestsRecovery = requestsRecovery;
    }
    public byte[] getJobData() {
        return this.jobData;
    }
    
    public void setJobData(byte[] jobData) {
        this.jobData = jobData;
    }
    /*public Set<QrtzTriggers> getQrtzTriggerses() {
        return this.qrtzTriggerses;
    }
    
    public void setQrtzTriggerses(Set<QrtzTriggers> qrtzTriggerses) {
        this.qrtzTriggerses = qrtzTriggerses;
    }
    public Set<QrtzJobListeners> getQrtzJobListenerses() {
        return this.qrtzJobListenerses;
    }
    
    public void setQrtzJobListenerses(Set<QrtzJobListeners> qrtzJobListenerses) {
        this.qrtzJobListenerses = qrtzJobListenerses;
    }*/

}


