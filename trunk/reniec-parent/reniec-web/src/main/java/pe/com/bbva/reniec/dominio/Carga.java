package pe.com.bbva.reniec.dominio;

import java.io.Serializable;

import javax.persistence.*;

import pe.com.bbva.reniec.dominio.util.IdBean;
import pe.com.bbva.reniec.utileria.Constante;
import pe.com.bbva.reniec.utileria.annotations.DefinicionVista;

import java.sql.Timestamp;
import java.util.List;

/***
 * 
 * Clase entidad de la tabla CTL_Carga.
 * 
 * @author CDA Informática
 * @since 11/10/2013
 *
 */
@Entity
@Table(name="CTL_CARGA", schema=Constante.SCHEMA.CONREC)
public class Carga extends IdBean implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Column
	@DefinicionVista(nombreVista = "Fecha")
	private Timestamp fecha;
	public Timestamp getFecha() {return this.fecha;}
	public void setFecha(Timestamp fecha) {this.fecha = fecha;}

	@Column(length=250)
	@DefinicionVista(nombreVista = "Fichero")
	private String fichero;
	public String getFichero() {return this.fichero;}
	public void setFichero(String fichero) {this.fichero = fichero;}

	@Column
	@DefinicionVista(nombreVista = "Fecha/Hora Final", tipoFinal="java.lang.String")
	private Timestamp fin;
	@DefinicionVista(convertToStringWithFormat = "dd/MM/yyyy HH:mm:ss")
	public Timestamp getFin() {return this.fin;}
	public void setFin(Timestamp fin) {this.fin = fin;}

	@Column
	@DefinicionVista(nombreVista = "Fecha/Hora Inicial", tipoFinal="java.lang.String")
	private Timestamp inicio;
	@DefinicionVista(convertToStringWithFormat = "dd/MM/yyyy HH:mm:ss")
	public Timestamp getInicio() {return this.inicio;}
	public void setInicio(Timestamp inicio) {this.inicio = inicio;}

	@Column(length=250)
	@DefinicionVista(nombreVista = "Mensaje")
	private String mensaje;
	public String getMensaje() {return this.mensaje;}
	public void setMensaje(String mensaje) {this.mensaje = mensaje;}
	

	@ManyToOne
	@JoinColumn(name="TIPO")
	@DefinicionVista(nombreVista = "Tipo", tipoFinal="java.lang.String")
	private Valor tipo;
	@DefinicionVista(nombrePropiedadRelacion = "nombre")
	public Valor getTipo() {return tipo;}
	public void setTipo(Valor tipo) {this.tipo = tipo;}

	@ManyToOne
	@JoinColumn(name="ORIGEN")
	@DefinicionVista(nombreVista = "Aplicación Origen", tipoFinal="java.lang.String")
	private Valor origen;
	@DefinicionVista(nombrePropiedadRelacion = "nombre")
	public Valor getOrigen() {return origen;}
	public void setOrigen(Valor origen) {this.origen = origen;}

	@ManyToOne
	@JoinColumn(name="ESTADO")
	@DefinicionVista(nombreVista = "Estado", tipoFinal="java.lang.String")
	private Valor estado;
	@DefinicionVista(nombrePropiedadRelacion = "nombre")
	public Valor getEstado() {return estado;}
	public void setEstado(Valor estado) {this.estado = estado;}

	
	@OneToMany(mappedBy="carga")
	private List<Detalle> detalles;
	@Transient
	public List<Detalle> getDetalles() {return detalles;}
	public void setDetalles(List<Detalle> detalles) {this.detalles = detalles;}

	public Carga() {
	}

	public Detalle addDetalle(Detalle detalle) {
		getDetalles().add(detalle);
		detalle.setCarga(this);
		return detalle;
	}

	public Detalle removeDetalle(Detalle detalle) {
		getDetalles().remove(detalle);
		detalle.setCarga(null);
		return detalle;
	}

}