package pe.com.bbva.reniec.dominio;

import java.io.Serializable;
import javax.persistence.*;

import pe.com.bbva.reniec.utileria.Constante;

@Entity
@Table(name="SEQ_ENTIDAD", schema=Constante.SCHEMA.CONREC)
@SuppressWarnings("serial")
public class Entidad implements Serializable {

	@Id
	@Column(unique=true, nullable=false, length=500)
	private String entidad;
	public String getEntidad() { return this.entidad;}
	public void setEntidad(String entidad) { this.entidad = entidad;}

	@Column(name="ULTIMO_ID", nullable=false, precision=16)
	private Integer ultimoId;
	public Integer getUltimoId() { return this.ultimoId;}
	public void setUltimoId(Integer ultimoId) { this.ultimoId = ultimoId;}

}