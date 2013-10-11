package pe.com.bbva.reniec.dominio;

import java.io.Serializable;

import javax.persistence.*;

import pe.com.bbva.reniec.dominio.util.IdBean;
import pe.com.bbva.reniec.utileria.Constante;

@Entity
@Table(name="CFG_LISTA", schema=Constante.SCHEMA.CONREC)
@SuppressWarnings("serial")
public class Lista extends IdBean implements Serializable {

	@Column(nullable=false, length=40)
	private String codigo;
	public String getCodigo() { return codigo;}
	public void setCodigo(String codigo) { this.codigo = codigo;}

	@Column(nullable=false, length=100)
	private String nombre;
	public String getNombre() { return nombre;}
	public void setNombre(String nombre) { this.nombre = nombre;}
	
	@Column(length=500)
	private String descripcion;
	public String getDescripcion() { return descripcion;}
	public void setDescripcion(String descripcion) { this.descripcion = descripcion;}

	@Column(nullable=false, length=2)
	private String estado;
	public String getEstado() { return estado;}
	public void setEstado(String estado) { this.estado = estado;}

}