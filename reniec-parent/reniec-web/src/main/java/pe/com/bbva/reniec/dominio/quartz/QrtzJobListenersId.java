package pe.com.bbva.reniec.dominio.quartz;
// Generated 09-ago-2012 10:28:08 by Hibernate Tools 3.4.0.CR1



/**
 * QrtzJobListenersId generated by hbm2java
 */
@SuppressWarnings("serial")
public class QrtzJobListenersId  implements java.io.Serializable {


     private String jobName;
     private String jobGroup;
     private String jobListener;

    public QrtzJobListenersId() {
    }

    public QrtzJobListenersId(String jobName, String jobGroup, String jobListener) {
       this.jobName = jobName;
       this.jobGroup = jobGroup;
       this.jobListener = jobListener;
    }
   
    public String getJobName() {
        return this.jobName;
    }
    
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }
    public String getJobGroup() {
        return this.jobGroup;
    }
    
    public void setJobGroup(String jobGroup) {
        this.jobGroup = jobGroup;
    }
    public String getJobListener() {
        return this.jobListener;
    }
    
    public void setJobListener(String jobListener) {
        this.jobListener = jobListener;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof QrtzJobListenersId) ) return false;
		 QrtzJobListenersId castOther = ( QrtzJobListenersId ) other; 
         
		 return ( (this.getJobName()==castOther.getJobName()) || ( this.getJobName()!=null && castOther.getJobName()!=null && this.getJobName().equals(castOther.getJobName()) ) )
 && ( (this.getJobGroup()==castOther.getJobGroup()) || ( this.getJobGroup()!=null && castOther.getJobGroup()!=null && this.getJobGroup().equals(castOther.getJobGroup()) ) )
 && ( (this.getJobListener()==castOther.getJobListener()) || ( this.getJobListener()!=null && castOther.getJobListener()!=null && this.getJobListener().equals(castOther.getJobListener()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getJobName() == null ? 0 : this.getJobName().hashCode() );
         result = 37 * result + ( getJobGroup() == null ? 0 : this.getJobGroup().hashCode() );
         result = 37 * result + ( getJobListener() == null ? 0 : this.getJobListener().hashCode() );
         return result;
   }   


}


