package pe.com.bbva.reniec.dominio;

import java.io.Serializable;

import javax.persistence.*;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import pe.com.bbva.reniec.dominio.util.IdBean;

@Entity
@Table(name="SEG_OPCION")
@SuppressWarnings("serial")
public class Opcion extends IdBean implements Serializable {

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

	@Override
	public int hashCode() {
		HashCodeBuilder hashCodeBuilder = new HashCodeBuilder(3, 7);
		hashCodeBuilder.append(codigo);
		return hashCodeBuilder.toHashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean equals = false;
		if (obj instanceof Opcion) {
			Opcion bean = (Opcion) obj;
			EqualsBuilder equalsBuilder = new EqualsBuilder();
			equalsBuilder.append(codigo, bean.codigo);
			equals = equalsBuilder.isEquals();
		}
		return equals;
	}
	
}