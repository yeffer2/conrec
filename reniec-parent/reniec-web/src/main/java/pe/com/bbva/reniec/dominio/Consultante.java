package pe.com.bbva.reniec.dominio;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import pe.com.bbva.reniec.utileria.Constante;

@Entity
@Table(name="CTL_CONSULTANTE", schema=Constante.SCHEMA.CONREC)
@SuppressWarnings("serial")
public class Consultante implements Serializable {

	@Id
	@Column(unique=true, nullable=false, precision=16)
	private Long id;
	public Long getId() { return id;}
	public void setId(Long id) { this.id = id;}

	@Column(nullable=false, length=40)
	private String identificador;
	public String getIdentificador() { return identificador;}
	public void setIdentificador(String identificador) { this.identificador = identificador;}

	@Column(name="CODIGO_RENIEC", nullable=false, length=40)
	private String codigoReniec;
	public String getCodigoReniec() { return codigoReniec;}
	public void setCodigoReniec(String codigoReniec) { this.codigoReniec = codigoReniec;}

	@ManyToOne
	@JoinColumn(name="TIPO_DOI", nullable=false)
	private Valor tipoDOI;
	public Valor getTipoDOI() { return tipoDOI;}
	public void setTipoDOI(Valor tipoDOI) { this.tipoDOI = tipoDOI;}
	
	@Column(nullable=false, length=40)
	private String doi;
	public String getDoi() { return doi;}
	public void setDoi(String doi) { this.doi = doi;}

	@Column(nullable=false, length=120)
	private String nombres;
	public String getNombres() { return nombres;}
	public void setNombres(String nombres) { this.nombres = nombres;}

	@Column(nullable=false, length=80)
	private String paterno;
	public String getPaterno() { return paterno;}
	public void setPaterno(String paterno) { this.paterno = paterno;}
	
	@Column(length=80)
	private String materno;
	public String getMaterno() { return materno;}
	public void setMaterno(String materno) { this.materno = materno;}
	
	@Column(nullable=false)
	private Date nacimiento;
	public Date getNacimiento() { return nacimiento;}
	public void setNacimiento(Date nacimiento) { this.nacimiento = nacimiento;}

	@ManyToOne
	@JoinColumn(name="NACIONALIDAD", nullable=false)
	private Valor nacionalidad;
	public Valor getNacionalidad() { return nacionalidad;}
	public void setNacionalidad(Valor nacionalidad) { this.nacionalidad = nacionalidad;}
	
	@Column(nullable=false, length=20)
	private String centro;
	public String getCentro() { return centro;}
	public void setCentro(String centro) { this.centro = centro;}

	@ManyToOne
	@JoinColumn(name="ORIGEN", nullable=false)
	private Valor origen;
	public Valor getOrigen() { return origen;}
	public void setOrigen(Valor origen) { this.origen = origen;}

	@ManyToOne
	@JoinColumn(name="ESTADO", nullable=false)
	private Valor estado;
	public Valor getEstado() { return estado;}
	public void setEstado(Valor estado) { this.estado = estado;}

	@ManyToOne
	@JoinColumn(name="SITUACION", nullable=false)
	private Valor situacion;
	public Valor getSituacion() { return situacion;}
	public void setSituacion(Valor situacion) { this.situacion = situacion;}

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