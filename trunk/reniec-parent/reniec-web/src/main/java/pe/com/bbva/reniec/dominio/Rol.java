package pe.com.bbva.reniec.dominio;

import java.io.Serializable;

import javax.persistence.*;

import pe.com.bbva.reniec.dominio.util.IdBean;
import pe.com.bbva.reniec.utileria.Constante;

@Entity
@Table(name="SEG_ROL", schema=Constante.SCHEMA.CONREC)
@SuppressWarnings("serial")
public class Rol extends IdBean implements Serializable {

	@ManyToOne
	@JoinColumn(name="PADRE")
	private Rol padre;
	public Rol getPadre() {	return padre;}
	public void setPadre(Rol padre) { this.padre = padre;}
	
	@Column(length=20)
	private String codigo;
	public String getCodigo() { return codigo;}
	public void setCodigo(String codigo) { this.codigo = codigo;}

	@Column(length=100)
	private String nombre;
	public String getNombre() { return nombre;}
	public void setNombre(String nombre) { this.nombre = nombre;}
	
	@Column(length=500)
	private String descripcion;
	public String getDescripcion() { return descripcion;}
	public void setDescripcion(String descripcion) { this.descripcion = descripcion;}

	@ManyToOne
	@JoinColumn(name="ESTADO", nullable=false)
	private Valor estado;
	public Valor getEstado() { return estado;}
	public void setEstado(Valor estado) { this.estado = estado;}
	
}