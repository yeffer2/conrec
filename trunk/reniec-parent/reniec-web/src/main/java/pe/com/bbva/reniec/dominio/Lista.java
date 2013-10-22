package pe.com.bbva.reniec.dominio;

import java.io.Serializable;

import javax.persistence.*;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.NotBlank;

import pe.com.bbva.reniec.dominio.util.IdBean;
import pe.com.bbva.reniec.utileria.Constante;

@Entity
@Table(name="CFG_LISTA")
@SuppressWarnings("serial")
public class Lista extends IdBean implements Serializable {

	@NotBlank(message=Constante.CODIGO_MENSAJE.VALIDAR_TEXTBOX)
	@Column(nullable=false, length=40)
	private String codigo;
	public String getCodigo() { return codigo;}
	public void setCodigo(String codigo) { this.codigo = codigo;}
	
	@NotBlank(message=Constante.CODIGO_MENSAJE.VALIDAR_TEXTBOX)
	@Column(nullable=false, length=100)
	private String nombre;
	public String getNombre() { return nombre;}
	public void setNombre(String nombre) { this.nombre = nombre;}
	
	@Column(length=500)
	private String descripcion;
	public String getDescripcion() { return descripcion;}
	public void setDescripcion(String descripcion) { this.descripcion = descripcion;}

	@NotBlank(message=Constante.CODIGO_MENSAJE.VALIDAR_COMBOBOX)
	@Column(nullable=false, length=2)
	private String estado;
	public String getEstado() { return estado;}
	public void setEstado(String estado) { this.estado = estado;}

	@Override
	public int hashCode() {
		HashCodeBuilder hashCodeBuilder = new HashCodeBuilder(3, 7);
		hashCodeBuilder.append(codigo);
		return hashCodeBuilder.toHashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean equals = false;
		if (obj instanceof Lista) {
			Lista bean = (Lista) obj;
			EqualsBuilder equalsBuilder = new EqualsBuilder();
			equalsBuilder.append(codigo, bean.codigo);
			equals = equalsBuilder.isEquals();
		}
		return equals;
	}
	
}