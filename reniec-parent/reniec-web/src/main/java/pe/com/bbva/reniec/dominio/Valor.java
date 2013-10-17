package pe.com.bbva.reniec.dominio;

import java.io.Serializable;

import javax.persistence.*;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import pe.com.bbva.reniec.dominio.util.IdBean;

@Entity
@Table(name="CFG_VALOR")
@SuppressWarnings("serial")
public class Valor extends IdBean implements Serializable {

	@ManyToOne
	@JoinColumn(name="LISTA", nullable=false)
	private Lista lista;
	public Lista getLista() { return lista;}
	public void setLista(Lista lista) { this.lista = lista;}
	
	@Column(nullable=false, length=30)
	private String codigo;
	public String getCodigo() { return codigo;}
	public void setCodigo(String codigo) { this.codigo = codigo;}

	@Column(nullable=false, length=200)
	private String nombre;
	public String getNombre() { return nombre;}
	public void setNombre(String nombre) { this.nombre = nombre;}

	@Column(precision=8)
	private Integer orden;
	public Integer getOrden() { return orden;}
	public void setOrden(Integer orden) { this.orden = orden;}
	
	@Column(length=500)
	private String descripcion;
	public String getDescripcion() { return descripcion;}
	public void setDescripcion(String descripcion) { this.descripcion = descripcion;}

	@Column(nullable=false, length=2)
	private String estado;
	public String getEstado() { return estado;}
	public void setEstado(String estado) { this.estado = estado;}

	@Override
	public int hashCode() {
		HashCodeBuilder hashCodeBuilder = new HashCodeBuilder(3, 7);
		hashCodeBuilder.append(codigo);
		if(lista != null)
		{
			hashCodeBuilder.append(lista.getCodigo());
		}
		return hashCodeBuilder.toHashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean equals = false;
		if (obj instanceof Valor) {
			Valor bean = (Valor) obj;
			EqualsBuilder equalsBuilder = new EqualsBuilder();
			equalsBuilder.append(codigo, bean.codigo);
			if(lista != null && bean.lista != null)
			{
				equalsBuilder.append(lista.getCodigo(), bean.lista.getCodigo());
			}
			equals = equalsBuilder.isEquals();
		}
		return equals;
	}
	
}