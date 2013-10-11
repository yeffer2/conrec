package pe.com.bbva.reniec.dominio;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import pe.com.bbva.reniec.dominio.util.IdBean;
import pe.com.bbva.reniec.utileria.Constante;

@Entity
@Table(name="SEG_USUARIO", schema=Constante.SCHEMA.CONREC)
@SuppressWarnings("serial")
public class Usuario extends IdBean implements Serializable {

	@Column(nullable=false)
	protected String nombres;
	public String getNombres() { return nombres; }
	public void setNombres(String nombres) { this.nombres = nombres; }
	
	@Column(name="PATERNO")
	protected String paterno;
	public String getPaterno() { return paterno; }
	public void setPaterno(String paterno) { this.paterno = paterno; }

	@Column(name="MATERNO")
	protected String materno;
	public String getMaterno() { return materno; }
	public void setMaterno(String materno) { this.materno = materno; }
	
	@Column(name="REGISTRO", nullable=false)
	private String registro;
	public String getRegistro() { return registro; }
	public void setRegistro(String registro) { this.registro = registro; }

	
	@Column(name="CARGO",nullable=false)
	private String cargo;
	public String getCargo() { return cargo; }
	public void setCargo(String cargo) { this.cargo = cargo; }

	@Column(name="CARGO_NOMBRE")
	private String cargoNombre;
	public String getCargoNombre() { return cargoNombre; }
	public void setCargoNombre(String cargoNombre) { this.cargoNombre = cargoNombre; }

	@Column(name="CORREO")
	private String correo;
	public String getCorreo() { return correo; }
	public void setCorreo(String correo) { this.correo = correo; }

	@Column(name="CENTRO", nullable=false)
	private String centro;
	public String getCentro() { return centro; }
	public void setCentro(String centro) { this.centro = centro; }

	@Column(name="CENTRO_NOMBRE")
	private String centroNombre;	
	public String getCentroNombre() { return centroNombre;}
	public void setCentroNombre(String centroNombre) { this.centroNombre = centroNombre; }
	
}