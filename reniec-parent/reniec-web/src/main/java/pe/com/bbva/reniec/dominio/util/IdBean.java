package pe.com.bbva.reniec.dominio.util;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class IdBean extends AuditoriaBean{

	@Id
	@Column(unique=true, nullable=false, precision=16)
	private Long id;
	public Long getId() { return id;}
	public void setId(Long id) { this.id = id;}

}
