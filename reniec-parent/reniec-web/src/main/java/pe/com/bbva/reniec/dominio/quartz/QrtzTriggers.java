package pe.com.bbva.reniec.dominio.quartz;
// Generated 09-ago-2012 10:28:08 by Hibernate Tools 3.4.0.CR1

import java.util.List;

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
@Table(name="QRTZ_TRIGGERS")
@IdClass(QrtzTriggersId.class)
public class QrtzTriggers  implements java.io.Serializable {

	
	@Id
	@Column(name="TRIGGER_NAME")
    private String triggerName;
	
	@Id
	@Column(name="TRIGGER_GROUP")
    private String triggerGroup;
	
//     private QrtzTriggersId id;
//     private QrtzJobDetails qrtzJobDetails;
	
	@Column(name="JOB_NAME")
    private String jobName;
	
	@Column(name="JOB_GROUP")
    private String jobGroup;
	
	@Column(name="IS_VOLATILE", nullable = false)
    private String isVolatile;
	
	@Column(name="DESCRIPTION")
    private String description;
	
	@Column(name="NEXT_FIRE_TIME")
    private Long nextFireTime;
	
	@Column(name="PREV_FIRE_TIME")
    private Long prevFireTime;
	
	@Column(name="PRIORITY")
    private Integer priority;
    
	@Column(name="TRIGGER_STATE", nullable = false)
    private String triggerState;
	
	@Column(name="TRIGGER_TYPE", nullable = false)
    private String triggerType;
    
	@Column(name="START_TIME", nullable = false)
    private long startTime;
	
	@Column(name="END_TIME")
    private Long endTime;
	
	@Column(name="CALENDAR_NAME")
	private String calendarName;
    
	@Column(name="MISFIRE_INSTR")
	private Short misfireInstr;
	
	@Column(name="JOB_DATA")
	private byte[] jobData;
	
  
    public QrtzTriggers() {
    }

	
    public QrtzTriggers(String isVolatile, String triggerState, String triggerType, long startTime) {
        this.isVolatile = isVolatile;
        this.triggerState = triggerState;
        this.triggerType = triggerType;
        this.startTime = startTime;
    }
    public QrtzTriggers(String isVolatile, String description, Long nextFireTime, Long prevFireTime, Integer priority, String triggerState, String triggerType, long startTime, Long endTime, String calendarName, Short misfireInstr, byte[] jobData, List<QrtzSimpleTriggers> qrtzSimpleTriggerses, List<QrtzCronTriggers> qrtzCronTriggerses) {
       this.isVolatile = isVolatile;
       this.description = description;
       this.nextFireTime = nextFireTime;
       this.prevFireTime = prevFireTime;
       this.priority = priority;
       this.triggerState = triggerState;
       this.triggerType = triggerType;
       this.startTime = startTime;
       this.endTime = endTime;
       this.calendarName = calendarName;
       this.misfireInstr = misfireInstr;
       this.jobData = jobData;    
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


	public String getIsVolatile() {
		return isVolatile;
	}


	public void setIsVolatile(String isVolatile) {
		this.isVolatile = isVolatile;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Long getNextFireTime() {
		return nextFireTime;
	}


	public void setNextFireTime(Long nextFireTime) {
		this.nextFireTime = nextFireTime;
	}


	public Long getPrevFireTime() {
		return prevFireTime;
	}


	public void setPrevFireTime(Long prevFireTime) {
		this.prevFireTime = prevFireTime;
	}


	public Integer getPriority() {
		return priority;
	}


	public void setPriority(Integer priority) {
		this.priority = priority;
	}


	public String getTriggerState() {
		return triggerState;
	}


	public void setTriggerState(String triggerState) {
		this.triggerState = triggerState;
	}


	public String getTriggerType() {
		return triggerType;
	}


	public void setTriggerType(String triggerType) {
		this.triggerType = triggerType;
	}


	public long getStartTime() {
		return startTime;
	}


	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}


	public Long getEndTime() {
		return endTime;
	}


	public void setEndTime(Long endTime) {
		this.endTime = endTime;
	}


	public String getCalendarName() {
		return calendarName;
	}


	public void setCalendarName(String calendarName) {
		this.calendarName = calendarName;
	}


	public Short getMisfireInstr() {
		return misfireInstr;
	}


	public void setMisfireInstr(Short misfireInstr) {
		this.misfireInstr = misfireInstr;
	}


	public byte[] getJobData() {
		return jobData;
	}


	public void setJobData(byte[] jobData) {
		this.jobData = jobData;
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

}


