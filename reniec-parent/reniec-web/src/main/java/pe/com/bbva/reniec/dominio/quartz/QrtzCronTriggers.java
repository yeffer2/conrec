package pe.com.bbva.reniec.dominio.quartz;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

/**
 * Victor More
 */

@SuppressWarnings("serial")
@Entity
@Table(name="QRTZ_CRON_TRIGGERS")
@IdClass(QrtzCronTriggersId.class)
public class QrtzCronTriggers  implements java.io.Serializable {


	@Id
	@Column(name="TRIGGER_NAME")
    private String triggerName;
	
	@Id
	@Column(name="TRIGGER_GROUP")
    private String triggerGroup;
	
	/*@Id
	@ManyToOne
	@JoinColumn(name="TRIGGER_NAME", nullable=false)
    private QrtzTriggers qrtzTriggers;*/
    
    @Column(name="CRON_EXPRESSION")
    private String cronExpression;
    
    @Column(name="TIME_ZONE_ID")	
    private String timeZoneId;

    public QrtzCronTriggers() {
    }

	
    public QrtzCronTriggers(String cronExpression) {
//        this.qrtzTriggers = qrtzTriggers;
        this.cronExpression = cronExpression;
    }
    public QrtzCronTriggers(String cronExpression, String timeZoneId) {
//       this.qrtzTriggers = qrtzTriggers;
       this.cronExpression = cronExpression;
       this.timeZoneId = timeZoneId;
    }
   
    /*public QrtzTriggers getQrtzTriggers() {
        return this.qrtzTriggers;
    }
    
    public void setQrtzTriggers(QrtzTriggers qrtzTriggers) {
        this.qrtzTriggers = qrtzTriggers;
    }*/
    public String getCronExpression() {
        return this.cronExpression;
    }
    
    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
    }
    public String getTimeZoneId() {
        return this.timeZoneId;
    }
    
    public void setTimeZoneId(String timeZoneId) {
        this.timeZoneId = timeZoneId;
    }


	public String getTriggerName() {
		return triggerName;
	}


	public void setTriggerName(String triggerName) {
		this.triggerName = triggerName;
	}


	public String getTriggerGroup() {
		return triggerGroup;
	}


	public void setTriggerGroup(String triggerGroup) {
		this.triggerGroup = triggerGroup;
	}

}


