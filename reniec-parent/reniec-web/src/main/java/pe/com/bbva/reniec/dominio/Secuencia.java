package pe.com.bbva.reniec.dominio;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="SEQ_ENTIDAD")
@SuppressWarnings("serial")
public class Secuencia implements Serializable {

	@Id
	@Column(unique=true, nullable=false, length=500)
	private String entidad;
	public String getEntidad() { return this.entidad;}
	public void setEntidad(String entidad) { this.entidad = entidad;}

	@Column(name="ULTIMO_ID", nullable=false, precision=16)
	private Long ultimoId;
	public Long getUltimoId() { return this.ultimoId;}
	public void setUltimoId(Long ultimoId) { this.ultimoId = ultimoId;}

}