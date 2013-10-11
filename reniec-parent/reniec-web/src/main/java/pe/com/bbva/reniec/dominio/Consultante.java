package pe.com.bbva.reniec.dominio;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import pe.com.bbva.reniec.dominio.util.IdBean;
import pe.com.bbva.reniec.utileria.Constante;

@Entity
@Table(name="CTL_CONSULTANTE", schema=Constante.SCHEMA.CONREC)
@SuppressWarnings("serial")
public class Consultante extends IdBean implements Serializable {

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

	public String getNombreCompleto(){
		return paterno+" "+materno+" "+nombres;
	}
	
}