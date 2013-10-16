package pe.com.bbva.reniec.dominio;

import java.io.Serializable;

import javax.persistence.*;

import pe.com.bbva.reniec.dominio.util.IdBean;
import pe.com.bbva.reniec.utileria.Constante;

/***
 * Clase entidad de la tabla CTL_DETALLE.
 * 
 * @author CDA Informática
 * @since 11/10/2013
 *
 */
@Entity
@Table(name="CTL_DETALLE", schema=Constante.SCHEMA.CONREC)
public class Detalle extends IdBean implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Column
	private String accion;
	public String getAccion() {return this.accion;}
	public void setAccion(String accion) {this.accion = accion;}

	@Column
	private String centro;
	public String getCentro() {return this.centro;}
	public void setCentro(String centro) {this.centro = centro;}

	@Column(name="CODIGO_RENIEC")
	private String codigoReniec;
	public String getCodigoReniec() {return this.codigoReniec;}

	public void setCodigoReniec(String codigoReniec) {this.codigoReniec = codigoReniec;}
	
	@Column
	private String identificador;
	public String getIdentificador() {return this.identificador;}
	public void setIdentificador(String identificador) {this.identificador = identificador;}

	@Column
	private String materno;
	public String getMaterno() {return this.materno;}
	public void setMaterno(String materno) {this.materno = materno;}

	@Column
	private String mensaje;
	public String getMensaje() {return this.mensaje;}
	public void setMensaje(String mensaje) {this.mensaje = mensaje;}

	@Column
	private String nacimiento;
	public String getNacimiento() {return this.nacimiento;}
	public void setNacimiento(String nacimiento) {this.nacimiento = nacimiento;}

	@Column
	private String nacionalidad;
	public String getNacionalidad() {return this.nacionalidad;}
	public void setNacionalidad(String nacionalidad) {this.nacionalidad = nacionalidad;}

	@Column
	private String nombres;
	public String getNombres() {return this.nombres;}
	public void setNombres(String nombres) {this.nombres = nombres;}

	@Column(name="NUMERO_DOI")
	private String numeroDoi;
	public String getNumeroDoi() {return this.numeroDoi;}
	public void setNumeroDoi(String numeroDoi) {this.numeroDoi = numeroDoi;}

	@Column
	private String origen;
	public String getOrigen() {return this.origen;}

	public void setOrigen(String origen) {this.origen = origen;}

	@Column
	private String paterno;
	public String getPaterno() {return this.paterno;}
	public void setPaterno(String paterno) {this.paterno = paterno;}

	@Column(name="TIPO_DOI")
	private String tipoDoi;
	public String getTipoDoi() {return this.tipoDoi;}
	public void setTipoDoi(String tipoDoi) {this.tipoDoi = tipoDoi;}

	@ManyToOne
	@JoinColumn(name="CARGA")
	private Carga carga;
	public Carga getCarga() {return carga;}
	public void setCarga(Carga carga) {this.carga = carga;}

	@ManyToOne
	@JoinColumn(name="CONSULTANTE")
	private Consultante consultante;
	public Consultante getConsultante() {return consultante;}
	public void setConsultante(Consultante consultante) {this.consultante = consultante;}
	
	public Detalle() {
	}
}