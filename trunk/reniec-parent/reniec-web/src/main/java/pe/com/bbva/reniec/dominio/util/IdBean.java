package pe.com.bbva.reniec.dominio.util;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import pe.com.bbva.reniec.utileria.annotations.DefinicionVista;

@MappedSuperclass
public class IdBean extends AuditoriaBean{

	@Id
	@Column(unique=true, nullable=false, precision=16)
	@DefinicionVista(nombreVista = "Id")
	private Long id;
	public Long getId() { return id;}
	public void setId(Long id) { this.id = id;}

}
