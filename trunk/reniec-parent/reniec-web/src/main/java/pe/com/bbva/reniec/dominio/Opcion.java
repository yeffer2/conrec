package pe.com.bbva.reniec.dominio;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import pe.com.bbva.reniec.utileria.Constante;

@Entity
@Table(name="SEG_OPCION", schema=Constante.SCHEMA.CONREC)
@SuppressWarnings("serial")
public class Opcion implements Serializable {

	@Id
	@Column(unique=true, nullable=false, precision=8)
	private Long id;
	public Long getId() { return this.id;}
	public void setId(Long id) { this.id = id;}

	@ManyToOne
	@JoinColumn(name="PADRE")
	private Opcion padre;
	public Opcion getPadre() { return padre;}
	public void setPadre(Opcion padre) { this.padre = padre;}
	
	@Column(nullable=false, length=100)
	private String codigo;
	public String getCodigo() { return this.codigo;}
	public void setCodigo(String codigo) { this.codigo = codigo;}
	
	@Column(nullable=false, length=200)
	private String nombre;
	public String getNombre() { return this.nombre;}
	public void setNombre(String nombre) { this.nombre = nombre;}
	
	@Column(length=500)
	private String descripcion;
	public String getDescripcion() { return this.descripcion;}
	public void setDescripcion(String descripcion) { this.descripcion = descripcion;}

	@Column(precision=8)
	private Integer orden;
	public Integer getOrden() { return this.orden;}
	public void setOrden(Integer orden) { this.orden = orden;}
	
	@ManyToOne
	@JoinColumn(name="TIPO", nullable=false)
	private Valor tipo;
	public Valor getTipo() { return tipo;}
	public void setTipo(Valor tipo) { this.tipo = tipo;}

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