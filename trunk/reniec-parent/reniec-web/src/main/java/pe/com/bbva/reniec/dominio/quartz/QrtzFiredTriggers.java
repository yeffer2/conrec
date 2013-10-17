package pe.com.bbva.reniec.dominio.quartz;

// Generated 2/10/2013 03:54:44 PM by Hibernate Tools 3.4.0.CR1

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * QrtzFiredTriggers generated by hbm2java
 */
@Entity
@Table(name = "QRTZ_FIRED_TRIGGERS")
@SuppressWarnings("serial")
public class QrtzFiredTriggers implements Serializable {

	private String entryId;
	private String triggerName;
	private String triggerGroup;
	private String isVolatile;
	private String instanceName;
	private long firedTime;
	private long priority;
	private String state;
	private String jobName;
	private String jobGroup;
	private String isStateful;
	private String requestsRecovery;

	public QrtzFiredTriggers() {
	}

	public QrtzFiredTriggers(String entryId, String triggerName,
			String triggerGroup, String isVolatile, String instanceName,
			long firedTime, long priority, String state) {
		this.entryId = entryId;
		this.triggerName = triggerName;
		this.triggerGroup = triggerGroup;
		this.isVolatile = isVolatile;
		this.instanceName = instanceName;
		this.firedTime = firedTime;
		this.priority = priority;
		this.state = state;
	}

	public QrtzFiredTriggers(String entryId, String triggerName,
			String triggerGroup, String isVolatile, String instanceName,
			long firedTime, long priority, String state, String jobName,
			String jobGroup, String isStateful, String requestsRecovery) {
		this.entryId = entryId;
		this.triggerName = triggerName;
		this.triggerGroup = triggerGroup;
		this.isVolatile = isVolatile;
		this.instanceName = instanceName;
		this.firedTime = firedTime;
		this.priority = priority;
		this.state = state;
		this.jobName = jobName;
		this.jobGroup = jobGroup;
		this.isStateful = isStateful;
		this.requestsRecovery = requestsRecovery;
	}

	@Id
	@Column(name = "ENTRY_ID", unique = true, nullable = false, length = 95)
	public String getEntryId() {
		return this.entryId;
	}

	public void setEntryId(String entryId) {
		this.entryId = entryId;
	}

	@Column(name = "TRIGGER_NAME", nullable = false, length = 200)
	public String getTriggerName() {
		return this.triggerName;
	}

	public void setTriggerName(String triggerName) {
		this.triggerName = triggerName;
	}

	@Column(name = "TRIGGER_GROUP", nullable = false, length = 200)
	public String getTriggerGroup() {
		return this.triggerGroup;
	}

	public void setTriggerGroup(String triggerGroup) {
		this.triggerGroup = triggerGroup;
	}

	@Column(name = "IS_VOLATILE", nullable = false, length = 1)
	public String getIsVolatile() {
		return this.isVolatile;
	}

	public void setIsVolatile(String isVolatile) {
		this.isVolatile = isVolatile;
	}

	@Column(name = "INSTANCE_NAME", nullable = false, length = 200)
	public String getInstanceName() {
		return this.instanceName;
	}

	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
	}

	@Column(name = "FIRED_TIME", nullable = false, precision = 13, scale = 0)
	public long getFiredTime() {
		return this.firedTime;
	}

	public void setFiredTime(long firedTime) {
		this.firedTime = firedTime;
	}

	@Column(name = "PRIORITY", nullable = false, precision = 13, scale = 0)
	public long getPriority() {
		return this.priority;
	}

	public void setPriority(long priority) {
		this.priority = priority;
	}

	@Column(name = "STATE", nullable = false, length = 16)
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "JOB_NAME", length = 200)
	public String getJobName() {
		return this.jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	@Column(name = "JOB_GROUP", length = 200)
	public String getJobGroup() {
		return this.jobGroup;
	}

	public void setJobGroup(String jobGroup) {
		this.jobGroup = jobGroup;
	}

	@Column(name = "IS_STATEFUL", length = 1)
	public String getIsStateful() {
		return this.isStateful;
	}

	public void setIsStateful(String isStateful) {
		this.isStateful = isStateful;
	}

	@Column(name = "REQUESTS_RECOVERY", length = 1)
	public String getRequestsRecovery() {
		return this.requestsRecovery;
	}

	public void setRequestsRecovery(String requestsRecovery) {
		this.requestsRecovery = requestsRecovery;
	}

}
