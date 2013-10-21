package pe.com.bbva.reniec.dominio;

import java.io.Serializable;

import javax.persistence.*;

import pe.com.bbva.reniec.dominio.util.IdBean;
import pe.com.bbva.reniec.utileria.annotations.DefinicionVista;

import java.util.Date;
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
@Table(name="CTL_CARGA")
public class Carga extends IdBean implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Column
	@DefinicionVista(nombreVista = "FECHA")
	private Date fecha;
	public Date getFecha() {return this.fecha;}
	public void setFecha(Date fecha) {this.fecha = fecha;}

	@Column(length=250)
	@DefinicionVista(nombreVista = "FICHERO")
	private String fichero;
	public String getFichero() {return this.fichero;}
	public void setFichero(String fichero) {this.fichero = fichero;}

	@Column
	@DefinicionVista(nombreVista = "FECHA INICIO", tipoFinal="java.lang.String")
	private Date fin;
	@DefinicionVista(convertToStringWithFormat = "dd/MM/yyyy HH:mm:ss")
	public Date getFin() {return this.fin;}
	public void setFin(Date fin) {this.fin = fin;}

	@Column
	@DefinicionVista(nombreVista = "FECHA FINAL", tipoFinal="java.lang.String")
	private Date inicio;
	@DefinicionVista(convertToStringWithFormat = "dd/MM/yyyy HH:mm:ss")
	public Date getInicio() {return this.inicio;}
	public void setInicio(Date inicio) {this.inicio = inicio;}

	@Column(length=250)
	@DefinicionVista(nombreVista = "MENSAJE")
	private String mensaje;
	public String getMensaje() {return this.mensaje;}
	public void setMensaje(String mensaje) {this.mensaje = mensaje;}
	

	@ManyToOne
	@JoinColumn(name="TIPO")
	@DefinicionVista(nombreVista = "TIPO", tipoFinal="java.lang.String")
	private Valor tipo;
	@DefinicionVista(nombrePropiedadRelacion = "nombre")
	public Valor getTipo() {return tipo;}
	public void setTipo(Valor tipo) {this.tipo = tipo;}

	@ManyToOne
	@JoinColumn(name="ORIGEN")
	@DefinicionVista(nombreVista = "APLICACIÓN ORIGEN", tipoFinal="java.lang.String")
	private Valor origen;
	@DefinicionVista(nombrePropiedadRelacion = "nombre")
	public Valor getOrigen() {return origen;}
	public void setOrigen(Valor origen) {this.origen = origen;}

	@ManyToOne
	@JoinColumn(name="ESTADO")
	@DefinicionVista(nombreVista = "ESTADO", tipoFinal="java.lang.String")
	private Valor estado;
	@DefinicionVista(nombrePropiedadRelacion = "nombre")
	public Valor getEstado() {return estado;}
	public void setEstado(Valor estado) {this.estado = estado;}

	
	@OneToMany(mappedBy="carga", fetch = FetchType.EAGER)
	@DefinicionVista(nombreVista = "detalles")
	private List<Detalle> detalles;	
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