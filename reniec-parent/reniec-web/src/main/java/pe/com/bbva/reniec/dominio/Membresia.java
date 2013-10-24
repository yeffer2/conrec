package pe.com.bbva.reniec.dominio;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import pe.com.bbva.reniec.dominio.util.IdBean;
import pe.com.bbva.reniec.utileria.Constante;

@Entity
@Table(name="SEG_MEMBRESIA")
@SuppressWarnings("serial")
public class Membresia extends IdBean implements Serializable {

	@NotNull(message=Constante.CODIGO_MENSAJE.VALIDAR_COMBOBOX)
	@ManyToOne
	@JoinColumn(name="ROL", nullable=false)
	private Rol rol;
	public Rol getRol() { return rol;}
	public void setRol(Rol rol) { this.rol = rol;}

	@NotNull(message=Constante.CODIGO_MENSAJE.VALIDAR_COMBOBOX)
	@ManyToOne
	@JoinColumn(name="TIPO", nullable=false)
	private Valor tipo;
	public Valor getTipo() { return tipo;}
	public void setTipo(Valor tipo) { this.tipo = tipo;}
	
	@NotBlank(message=Constante.CODIGO_MENSAJE.VALIDAR_TEXTBOX)
	@Column(nullable=false, length=40)
	private String valor;
	public String getValor() { return valor;}
	public void setValor(String valor) { this.valor = valor;}

	@NotNull(message=Constante.CODIGO_MENSAJE.VALIDAR_COMBOBOX)
	@ManyToOne
	@JoinColumn(name="ESTADO", nullable=false)
	private Valor estado;
	public Valor getEstado() { return estado;}
	public void setEstado(Valor estado) { this.estado = estado;}
	
}