package pe.com.bbva.reniec.dominio.quartz;

// Generated 2/10/2013 03:54:44 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * QrtzCronTriggersId generated by hbm2java
 */
@Embeddable
public class QrtzCronTriggersId implements java.io.Serializable {

	private String triggerName;
	private String triggerGroup;

	public QrtzCronTriggersId() {
	}

	public QrtzCronTriggersId(String triggerName, String triggerGroup) {
		this.triggerName = triggerName;
		this.triggerGroup = triggerGroup;
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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof QrtzCronTriggersId))
			return false;
		QrtzCronTriggersId castOther = (QrtzCronTriggersId) other;

		return ((this.getTriggerName() == castOther.getTriggerName()) || (this
				.getTriggerName() != null && castOther.getTriggerName() != null && this
				.getTriggerName().equals(castOther.getTriggerName())))
				&& ((this.getTriggerGroup() == castOther.getTriggerGroup()) || (this
						.getTriggerGroup() != null
						&& castOther.getTriggerGroup() != null && this
						.getTriggerGroup().equals(castOther.getTriggerGroup())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getTriggerName() == null ? 0 : this.getTriggerName()
						.hashCode());
		result = 37
				* result
				+ (getTriggerGroup() == null ? 0 : this.getTriggerGroup()
						.hashCode());
		return result;
	}

}
