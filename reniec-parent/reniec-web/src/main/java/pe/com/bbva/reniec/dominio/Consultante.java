package pe.com.bbva.reniec.dominio;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;

@Entity
@Table(name="CTL_CONSULTANTE")
public class Consultante implements Serializable {

	@Id
	@Column(unique=true, nullable=false, precision=16)
	private long id;

	@Column(nullable=false, length=20)
	private String centro;

	@Column(name="CODIGO_RENIEC", nullable=false, length=40)
	private String codigoReniec;

	@Column(nullable=false)
	private Timestamp creacion;

	@Column(nullable=false, precision=16)
	private BigDecimal creador;

	@Column(nullable=false, length=40)
	private String doi;

	private Timestamp edicion;

	@Column(precision=16)
	private BigDecimal editor;

	@Column(nullable=false, length=40)
	private String identificador;

	@Column(length=80)
	private String materno;

	@Column(nullable=false)
	private Timestamp nacimiento;

	@Column(nullable=false, length=120)
	private String nombres;

	@Column(nullable=false, length=80)
	private String paterno;

	@ManyToOne
	@JoinColumn(name="SITUACION", nullable=false)
	private Valor situacion;

	@ManyToOne
	@JoinColumn(name="ORIGEN", nullable=false)
	private Valor origen;

	@ManyToOne
	@JoinColumn(name="TIPO_DOI", nullable=false)
	private Valor tipoDOI;

	@ManyToOne
	@JoinColumn(name="ESTADO", nullable=false)
	private Valor estado;

	@ManyToOne
	@JoinColumn(name="NACIONALIDAD", nullable=false)
	private Valor nacionalidad;

}