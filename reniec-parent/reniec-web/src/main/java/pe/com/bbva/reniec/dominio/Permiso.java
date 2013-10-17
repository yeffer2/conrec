package pe.com.bbva.reniec.dominio;

import java.io.Serializable;
import javax.persistence.*;

import pe.com.bbva.reniec.dominio.util.IdBean;

@Entity
@Table(name="SEG_PERMISO")
@SuppressWarnings("serial")
public class Permiso extends IdBean implements Serializable {

	@ManyToOne
	@JoinColumn(name="OPCION", nullable=false)
	private Opcion opcion;
	public Opcion getOpcion() { return opcion;}
	public void setOpcion(Opcion opcion) { this.opcion = opcion;}

	@ManyToOne
	@JoinColumn(name="ROL", nullable=false)
	private Rol rol;
	public Rol getRol() { return rol;}
	public void setRol(Rol rol) { this.rol = rol;}
	
	@ManyToOne
	@JoinColumn(name="ESTADO", nullable=false)
	private Valor estado;
	public Valor getEstado() { return estado;}
	public void setEstado(Valor estado) { this.estado = estado;}
	
}