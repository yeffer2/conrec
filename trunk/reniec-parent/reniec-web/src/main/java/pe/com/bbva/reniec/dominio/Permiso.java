package pe.com.bbva.reniec.dominio;

import java.io.Serializable;
import javax.persistence.*;

import pe.com.bbva.reniec.utileria.Constante;

import java.util.Date;

@Entity
@Table(name="SEG_PERMISO", schema=Constante.SCHEMA.CONREC)
@SuppressWarnings("serial")
public class Permiso implements Serializable {

	@Id
	@Column(unique=true, nullable=false, precision=16)
	private Long id;
	public Long getId() {return id;}
	public void setId(Long id) { this.id = id;}

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

	@ManyToOne(fetch= FetchType.LAZY)
	@JoinColumn(name="CREADOR", nullable=false, insertable = true, updatable = false)
	private Usuario creador;
	public Usuario getCreador() { return creador;}
	public void setCreador(Usuario creador) { this.creador = creador;}

	@Column(name = "CREACION", nullable = false, insertable = true, updatable = false)
	@Temporal( TemporalType.TIMESTAMP)
	private Date creacion;
	public Date getCreacion() {	return creacion;}
	public void setCreacion(Date creacion) { this.creacion = creacion;}
	
	@ManyToOne(fetch= FetchType.LAZY)
	@JoinColumn(name = "EDITOR", insertable = false, updatable = true)
	private Usuario editor;
	public Usuario getEditor() { return editor;}
	public void setEditor(Usuario editor) {	this.editor = editor;}
	
	@Column(name = "EDICION", insertable = false, updatable = true)
	@Temporal( TemporalType.TIMESTAMP)
	private Date edicion;
	public Date getEdicion() { return edicion;}
	public void setEdicion(Date edicion) { this.edicion = edicion;}
	
}