package pe.com.bbva.reniec.ws.dominio;

import java.io.Serializable;
import java.util.Date;

/**
 * Clase serializada para las respuestas del WS y de entrada para el autorizador.
 * 
 * @author CDA Informática
 * @since 04/10/2013
 *
 */
public class ConsultanteWS implements Serializable {

	private static final long serialVersionUID = 1L;
	
	String identificador;
	String codigo;
	String tipoDOI;
	String DOI;
	String nombres;
	String paterno;
	String materno;
	Date nacimiento;
	String nacionalidad;
	String centro;
	String origen;
	String estado;
	String accion;
	
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getTipoDOI() {
		return tipoDOI;
	}
	public void setTipoDOI(String tipoDOI) {
		this.tipoDOI = tipoDOI;
	}
	public String getDOI() {
		return DOI;
	}
	public void setDOI(String DOI) {
		this.DOI = DOI;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getPaterno() {
		return paterno;
	}
	public void setPaterno(String paterno) {
		this.paterno = paterno;
	}
	public String getMaterno() {
		return materno;
	}
	public void setMaterno(String materno) {
		this.materno = materno;
	}
	public Date getNacimiento() {
		return nacimiento;
	}
	public void setNacimiento(Date nacimiento) {
		this.nacimiento = nacimiento;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public String getCentro() {
		return centro;
	}
	public void setCentro(String centro) {
		this.centro = centro;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getAccion() {
		return accion;
	}
	public void setAccion(String accion) {
		this.accion = accion;
	}
	
	

}
