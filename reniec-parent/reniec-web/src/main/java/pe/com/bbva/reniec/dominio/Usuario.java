package pe.com.bbva.reniec.dominio;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import pe.com.bbva.reniec.utileria.Constante;

@Entity
@Table(name="SEG_USUARIO", schema=Constante.SCHEMA.HAREC)
@SuppressWarnings("serial")
public class Usuario implements Serializable {

	@Id
	@Column(unique=true, nullable=false, precision=16)
	private Long id;
	public Long getId() { return id; }
	public void setId(Long id) { this.id = id; }

	@Column(nullable=false, length=200)
	protected String nombres;
	public String getNombres() { return nombres; }
	public void setNombres(String nombres) { this.nombres = nombres; }
	
	@Column(name="PATERNO", length=150)
	protected String paterno;
	public String getPaterno() { return paterno; }
	public void setPaterno(String paterno) { this.paterno = paterno; }

	@Column(name="MATERNO", length=150)
	protected String materno;
	public String getMaterno() { return materno; }
	public void setMaterno(String materno) { this.materno = materno; }
	
	@Column(name="REGISTRO", nullable=false, length=14)
	private String registro;
	public String getRegistro() { return registro; }
	public void setRegistro(String registro) { this.registro = registro; }

	@Column(name="CLAVE", nullable=false, length=10)
	private String clave;
	public String getClave() { return clave; }
	public void setClave(String clave) { this.clave = clave; }
	
	@Column(nullable=false, length=8)
	private String cargo;
	public String getCargo() { return cargo; }
	public void setCargo(String cargo) { this.cargo = cargo; }

	@Column(name="DESC_CARGO", length=45)
	private String descripcionCargo;
	public String getDescripcionCargo() { return descripcionCargo; }
	public void setDescripcionCargo(String descripcionCargo) { this.descripcionCargo = descripcionCargo; }

	@Column(name="CORREO", length=90)
	private String correo;
	public String getCorreo() { return correo; }
	public void setCorreo(String correo) { this.correo = correo; }

	@Column(name="OFICINA", nullable=false, length=8)
	private String oficina;
	public String getOficina() { return oficina; }
	public void setOficina(String oficina) { this.oficina = oficina; }

	@Column(name="DESC_OFICINA", length=45)
	private String descripcionOficina;
	public String getDescripcionOficina() { return descripcionOficina; }
	public void setDescripcionOficina(String descripcionOficina) { this.descripcionOficina = descripcionOficina; }
	
	@ManyToOne(fetch= FetchType.LAZY)
	@JoinColumn(name="CREADOR", nullable=false, insertable = true, updatable = false)
	private Usuario creador;
	
	@Column(name = "CREACION", nullable = false, insertable = true, updatable = false)
	@Temporal( TemporalType.TIMESTAMP)
	private Date creacion;
	
	@ManyToOne(fetch= FetchType.LAZY)
	@JoinColumn(name = "EDITOR", insertable = false, updatable = true)
	private Usuario editor;
	
	@Column(name = "EDICION", insertable = false, updatable = true)
	@Temporal( TemporalType.TIMESTAMP)
	private Date edicion;
	
}