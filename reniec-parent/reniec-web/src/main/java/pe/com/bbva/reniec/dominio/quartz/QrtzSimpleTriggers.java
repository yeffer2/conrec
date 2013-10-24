package pe.com.bbva.reniec.dominio.quartz;
// Generated 09-ago-2012 10:28:08 by Hibernate Tools 3.4.0.CR1



/**
 * QrtzSimpleTriggers generated by hbm2java
 */
@SuppressWarnings("serial")
public class QrtzSimpleTriggers  implements java.io.Serializable {


     private QrtzSimpleTriggersId id;
     private QrtzTriggers qrtzTriggers;
     private long repeatCount;
     private long repeatInterval;
     private long timesTriggered;

    public QrtzSimpleTriggers() {
    }

    public QrtzSimpleTriggers(QrtzSimpleTriggersId id, QrtzTriggers qrtzTriggers, long repeatCount, long repeatInterval, long timesTriggered) {
       this.id = id;
       this.qrtzTriggers = qrtzTriggers;
       this.repeatCount = repeatCount;
       this.repeatInterval = repeatInterval;
       this.timesTriggered = timesTriggered;
    }
   
    public QrtzSimpleTriggersId getId() {
        return this.id;
    }
    
    public void setId(QrtzSimpleTriggersId id) {
        this.id = id;
    }
    public QrtzTriggers getQrtzTriggers() {
        return this.qrtzTriggers;
    }
    
    public void setQrtzTriggers(QrtzTriggers qrtzTriggers) {
        this.qrtzTriggers = qrtzTriggers;
    }
    public long getRepeatCount() {
        return this.repeatCount;
    }
    
    public void setRepeatCount(long repeatCount) {
        this.repeatCount = repeatCount;
    }
    public long getRepeatInterval() {
        return this.repeatInterval;
    }
    
    public void setRepeatInterval(long repeatInterval) {
        this.repeatInterval = repeatInterval;
    }
    public long getTimesTriggered() {
        return this.timesTriggered;
    }
    
    public void setTimesTriggered(long timesTriggered) {
        this.timesTriggered = timesTriggered;
    }




}


