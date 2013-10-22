package pe.com.bbva.reniec.dominio;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import pe.com.bbva.reniec.dominio.util.AuditoriaBean;
import pe.com.bbva.reniec.utileria.Constante;

@Entity
@Table(name="CFG_PARAMETRO")
@SuppressWarnings("serial")
public class Parametro extends AuditoriaBean implements Serializable {

	@Id
	@NotBlank(message=Constante.CODIGO_MENSAJE.VALIDAR_TEXTBOX)
	@Column(unique=true, nullable=false, length=30)
	private String codigo;
	public String getCodigo() { return codigo;}
	public void setCodigo(String codigo) { this.codigo = codigo;}

	@Column(nullable=false, length=200)
	@NotBlank(message=Constante.CODIGO_MENSAJE.VALIDAR_TEXTBOX)
	private String nombre;
	public String getNombre() { return nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}
	
	@Column(length=500)
	private String descripcion;
	public String getDescripcion() { return descripcion;}
	public void setDescripcion(String descripcion) { this.descripcion = descripcion;}

	@Column(nullable=false, length=1000)
	@NotBlank(message=Constante.CODIGO_MENSAJE.VALIDAR_TEXTBOX)
	private String valor;
	public String getValor() { return valor;}
	public void setValor(String valor) { this.valor = valor;}

	@ManyToOne
	@JoinColumn(name="ESTADO", nullable=false)
	@NotNull(message=Constante.CODIGO_MENSAJE.VALIDAR_COMBOBOX)
	private Valor estado;
	public Valor getEstado() { return estado;	}
	public void setEstado(Valor estado) { this.estado = estado;}
	
	@Transient
	private String codigoAnterior;
	public String getCodigoAnterior() {	return codigoAnterior; }
	public void setCodigoAnterior(String codigoAnterior) { this.codigoAnterior = codigoAnterior; }

}