package pe.com.bbva.reniec.dominio;

import java.io.Serializable;
import javax.persistence.*;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import pe.com.bbva.reniec.dominio.util.IdBean;

@Entity
@Table(name="SEG_PERMISO")
@SuppressWarnings("serial")
public class Permiso extends IdBean implements Serializable {

	@ManyToOne
	@JoinColumn(name="OPCION", nullable=false)
	private Opcion opcion;
	public Opcion getOpcion() { return opcion;}
	public void setOpcion(Opcion opcion) { this.opcion = opcion;}

	@ManyToOne
	@JoinColumn(name="ROL", nullable=false)
	private Rol rol;
	public Rol getRol() { return rol;}
	public void setRol(Rol rol) { this.rol = rol;}
	
	@ManyToOne
	@JoinColumn(name="ESTADO", nullable=false)
	private Valor estado;
	public Valor getEstado() { return estado;}
	public void setEstado(Valor estado) { this.estado = estado;}
	
	@Override
	public int hashCode() {
		HashCodeBuilder hashCodeBuilder = new HashCodeBuilder(5, 31);
		if(rol != null && opcion != null)
		{
			hashCodeBuilder.append(rol.getCodigo());
			hashCodeBuilder.append(opcion.getCodigo());
		}
		else
		{
			hashCodeBuilder.append(getId());
		}
		return hashCodeBuilder.toHashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null)
		{
			return false;
		}
		if (obj instanceof Permiso) {
			Permiso bean = (Permiso) obj;
			EqualsBuilder equalsBuilder = new EqualsBuilder();
			if(rol != null && opcion != null && bean.rol != null && bean.opcion != null)
			{
				equalsBuilder.append(rol.getId(), bean.rol.getId());
				equalsBuilder.append(opcion.getId(), bean.opcion.getId());
			}
			else
			{
				equalsBuilder.append(getId(), bean.getId());
			}
			return equalsBuilder.isEquals();
			
		}
		return false;
	}
	
}