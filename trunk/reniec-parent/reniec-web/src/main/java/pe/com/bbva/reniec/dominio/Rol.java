package pe.com.bbva.reniec.dominio;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.NotBlank;

import pe.com.bbva.reniec.dominio.util.IdBean;
import pe.com.bbva.reniec.utileria.Constante;

@Entity
@Table(name="SEG_ROL")
@SuppressWarnings("serial")
public class Rol extends IdBean implements Serializable {

	@ManyToOne
	@JoinColumn(name="PADRE")
	private Rol padre;
	public Rol getPadre() {	return padre;}
	public void setPadre(Rol padre) { this.padre = padre;}
	
	@NotBlank(message=Constante.CODIGO_MENSAJE.VALIDAR_TEXTBOX)
	@Column(length=20)
	private String codigo;
	public String getCodigo() { return codigo;}
	public void setCodigo(String codigo) { this.codigo = codigo;}

	@NotBlank(message=Constante.CODIGO_MENSAJE.VALIDAR_TEXTBOX)
	@Column(length=100)
	private String nombre;
	public String getNombre() { return nombre;}
	public void setNombre(String nombre) { this.nombre = nombre;}
	
	@Column(length=500)
	private String descripcion;
	public String getDescripcion() { return descripcion;}
	public void setDescripcion(String descripcion) { this.descripcion = descripcion;}

	@NotNull(message=Constante.CODIGO_MENSAJE.VALIDAR_COMBOBOX)
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
		if (obj instanceof Rol) {
			Rol bean = (Rol) obj;
			EqualsBuilder equalsBuilder = new EqualsBuilder();
			equalsBuilder.append(codigo, bean.codigo);
			equals = equalsBuilder.isEquals();
		}
		return equals;
	}
	
}