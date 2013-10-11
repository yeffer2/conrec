package pe.com.bbva.reniec.dominio.util;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import pe.com.bbva.reniec.dominio.Usuario;

@MappedSuperclass
public class AuditoriaBean {

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
