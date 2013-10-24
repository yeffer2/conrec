package pe.com.bbva.reniec.dominio.quartz;

import javax.persistence.Column;


/**
 * Victor More
 */

//@Embeddable
//@Access(AccessType.PROPERTY)
public class QrtzJobDetailsId  implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name="JOB_NAME", unique=true, nullable=false)
    private String jobName;
	
	@Column(name="JOB_GROUP", nullable=false)
    private String jobGroup;
	
	public QrtzJobDetailsId() {
	}

    public QrtzJobDetailsId(String jobName, String jobGroup) {
       this.jobName = jobName;
       this.jobGroup = jobGroup;
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


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof QrtzJobDetailsId) ) return false;
		 QrtzJobDetailsId castOther = ( QrtzJobDetailsId ) other; 
         
		 return ( (this.getJobName()==castOther.getJobName()) || ( this.getJobName()!=null && castOther.getJobName()!=null && this.getJobName().equals(castOther.getJobName()) ) )
 && ( (this.getJobGroup()==castOther.getJobGroup()) || ( this.getJobGroup()!=null && castOther.getJobGroup()!=null && this.getJobGroup().equals(castOther.getJobGroup()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getJobName() == null ? 0 : this.getJobName().hashCode() );
         result = 37 * result + ( getJobGroup() == null ? 0 : this.getJobGroup().hashCode() );
         return result;
   }   


}


