package pe.com.bbva.reniec.dominio.quartz;

// Generated 2/10/2013 03:54:44 PM by Hibernate Tools 3.4.0.CR1

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * QrtzTriggerListenersId generated by hbm2java
 */
@Embeddable
@SuppressWarnings("serial")
public class QrtzTriggerListenersId implements Serializable {

	private String triggerName;
	private String triggerGroup;
	private String triggerListener;

	public QrtzTriggerListenersId() {
	}

	public QrtzTriggerListenersId(String triggerName, String triggerGroup,
			String triggerListener) {
		this.triggerName = triggerName;
		this.triggerGroup = triggerGroup;
		this.triggerListener = triggerListener;
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

	@Column(name = "TRIGGER_LISTENER", nullable = false, length = 200)
	public String getTriggerListener() {
		return this.triggerListener;
	}

	public void setTriggerListener(String triggerListener) {
		this.triggerListener = triggerListener;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof QrtzTriggerListenersId))
			return false;
		QrtzTriggerListenersId castOther = (QrtzTriggerListenersId) other;

		return ((this.getTriggerName() == castOther.getTriggerName()) || (this
				.getTriggerName() != null && castOther.getTriggerName() != null && this
				.getTriggerName().equals(castOther.getTriggerName())))
				&& ((this.getTriggerGroup() == castOther.getTriggerGroup()) || (this
						.getTriggerGroup() != null
						&& castOther.getTriggerGroup() != null && this
						.getTriggerGroup().equals(castOther.getTriggerGroup())))
				&& ((this.getTriggerListener() == castOther
						.getTriggerListener()) || (this.getTriggerListener() != null
						&& castOther.getTriggerListener() != null && this
						.getTriggerListener().equals(
								castOther.getTriggerListener())));
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
		result = 37
				* result
				+ (getTriggerListener() == null ? 0 : this.getTriggerListener()
						.hashCode());
		return result;
	}

}
