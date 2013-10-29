package pe.com.bbva.reniec.dominioLDAP;

import java.io.Serializable;

import javax.persistence.*;

import pe.com.bbva.reniec.utileria.Constante;

import java.math.BigDecimal;


@Entity
@Table(name="LDAPPERU2", schema=Constante.SCHEMA.IIWX)
public class Ldapperu2 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(length=25)
	private String apemat;
	public String getApemat() { return this.apemat;	}
	public void setApemat(String apemat) { this.apemat = apemat; }

	@Column(length=25)
	private String apepat;
	public String getApepat() {	return this.apepat;	}
	public void setApepat(String apepat) {this.apepat = apepat; }

	@Column(length=15)
	private String carblan;
	public String getCarblan() { return this.carblan; }
	public void setCarblan(String carblan) { this.carblan = carblan; }

	@Column(length=4)
	private String codcargo;
	public String getCodcargo() { return this.codcargo; }
	public void setCodcargo(String codcargo) { this.codcargo = codcargo; }

	@Column(length=4)
	private String codemp;
	public String getCodemp() { return this.codemp; }
	public void setCodemp(String codemp) { this.codemp = codemp; }

	@Column(length=4)
	private String codempant;
	public String getCodempant() { return this.codempant; }
	public void setCodempant(String codempant) { this.codempant = codempant; }


	@Column(length=8)
	private String codger;
	public String getCodger() { return this.codger; }
	public void setCodger(String codger) { this.codger = codger; }

	@Column(length=8)
	private String codnivel1;
	public String getCodnivel1() { return this.codnivel1; }
	public void setCodnivel1(String codnivel1) { this.codnivel1 = codnivel1; }


	@Column(length=8)
	private String codnivel10;
	public String getCodnivel10() { return this.codnivel10; }
	public void setCodnivel10(String codnivel10) { this.codnivel10 = codnivel10; }

	@Column(length=8)
	private String codnivel2;
	public String getCodnivel2() { return this.codnivel2; }
	public void setCodnivel2(String codnivel2) { this.codnivel2 = codnivel2; }

	@Column(length=8)
	private String codnivel3;
	public String getCodnivel3() { return this.codnivel3; }
	public void setCodnivel3(String codnivel3) { this.codnivel3 = codnivel3; }

	@Column(length=8)
	private String codnivel4;
	public String getCodnivel4() { return this.codnivel4; }
	public void setCodnivel4(String codnivel4) { this.codnivel4 = codnivel4; }

	@Column(length=8)
	private String codnivel5;
	public String getCodnivel5() { return this.codnivel5; }
	public void setCodnivel5(String codnivel5) { this.codnivel5 = codnivel5; }

	@Column(length=8)
	private String codnivel6;
	public String getCodnivel6() { return this.codnivel6; }
	public void setCodnivel6(String codnivel6) { this.codnivel6 = codnivel6; }

	@Column(length=8)
	private String codnivel7;
	public String getCodnivel7() { return this.codnivel7; }
	public void setCodnivel7(String codnivel7) { this.codnivel7 = codnivel7; }

	@Column(length=8)
	private String codnivel8;
	public String getCodnivel8() { return this.codnivel8; }
	public void setCodnivel8(String codnivel8) { this.codnivel8 = codnivel8; }

	@Column(length=8)
	private String codnivel9;
	public String getCodnivel9() { return this.codnivel9; }
	public void setCodnivel9(String codnivel9) { this.codnivel9 = codnivel9; }

	@Column(length=4)
	private String codofi;
	public String getCodofi() { return this.codofi; }
	public void setCodofi(String codofi) { this.codofi = codofi; }

	@Column(length=4)
	private String codpais;
	public String getCodpais() { return this.codpais; }
	public void setCodpais(String codpais) { this.codpais = codpais; }

	@Column(length=8)
	private String coduniorg;
	public String getCoduniorg() { return this.coduniorg; }
	public void setCoduniorg(String coduniorg) { this.coduniorg = coduniorg; }

	@Id
	@Column(length=7)
	private String codusu;
	public String getCodusu() { return this.codusu; }
	public void setCodusu(String codusu) { this.codusu = codusu; }

	@Column(length=7)
	private String codusujefe;
	public String getCodusujefe() { return this.codusujefe; }
	public void setCodusujefe(String codusujefe) { this.codusujefe = codusujefe; }

	@Column(length=45)
	private String corelec;
	public String getCorelec() { return this.corelec; }
	public void setCorelec(String corelec) { this.corelec = corelec; }

	@Column(length=45)
	private String desemp;
	public String getDesemp() { return this.desemp; }
	public void setDesemp(String desemp) { this.desemp = desemp; }

	@Column(length=45)
	private String desnivel1;
	public String getDesnivel1() { return this.desnivel1; }
	public void setDesnivel1(String desnivel1) { this.desnivel1 = desnivel1; }

	@Column(length=45)
	private String desnivel10;
	public String getDesnivel10() { return this.desnivel10; }
	public void setDesnivel10(String desnivel10) { this.desnivel10 = desnivel10; }

	@Column(length=45)
	private String desnivel2;
	public String getDesnivel2() { return this.desnivel2; }
	public void setDesnivel2(String desnivel2) { this.desnivel2 = desnivel2; }

	@Column(length=45)
	private String desnivel3;
	public String getDesnivel3() { return this.desnivel3; }
	public void setDesnivel3(String desnivel3) { this.desnivel3 = desnivel3; }

	@Column(length=45)
	private String desnivel4;
	public String getDesnivel4() { return this.desnivel4; }
	public void setDesnivel4(String desnivel4) { this.desnivel4 = desnivel4; }

	@Column(length=45)
	private String desnivel5;	
	public String getDesnivel5() { return this.desnivel5; }
	public void setDesnivel5(String desnivel5) { this.desnivel5 = desnivel5; }

	@Column(length=45)
	private String desnivel6;
	public String getDesnivel6() { return this.desnivel6; }
	public void setDesnivel6(String desnivel6) { this.desnivel6 = desnivel6; }

	@Column(length=45)
	private String desnivel7;
	public String getDesnivel7() { return this.desnivel7; }
	public void setDesnivel7(String desnivel7) { this.desnivel7 = desnivel7; }

	@Column(length=45)
	private String desnivel8;
	public String getDesnivel8() { return this.desnivel8; }
	public void setDesnivel8(String desnivel8) { this.desnivel8 = desnivel8; }

	@Column(length=45)
	private String desnivel9;
	public String getDesnivel9() { return this.desnivel9; }
	public void setDesnivel9(String desnivel9) { this.desnivel9 = desnivel9; }

	@Column(length=45)
	private String desofi;
	public String getDesofi() { return this.desofi; }
	public void setDesofi(String desofi) { this.desofi = desofi; }

	@Column(length=45)
	private String despais;
	public String getDespais() { return this.despais; }
	public void setDespais(String despais) { this.despais = despais; }

	@Column(length=45)
	private String desuniorg;
	public String getDesuniorg() { return this.desuniorg; }
	public void setDesuniorg(String desuniorg) { this.desuniorg = desuniorg; }

	@Column(length=10)
	private String fecing;
	public String getFecing() { return this.fecing; }
	public void setFecing(String fecing) { this.fecing = fecing; }

	@Column(length=10)
	private String fecnac;
	public String getFecnac() { return this.fecnac; }
	public void setFecnac(String fecnac) { this.fecnac = fecnac; }
	
	@Column(length=7)
	private String gesper;
	public String getGesper() { return this.gesper; }
	public void setGesper(String gesper) { this.gesper = gesper; }

	@Column(length=25)
	private String nombre;
	public String getNombre() { return this.nombre; }
	public void setNombre(String nombre) { this.nombre = nombre; }

	@Column(length=45)
	private String nomcargo;
	public String getNomcargo() { return this.nomcargo; }
	public void setNomcargo(String nomcargo) { this.nomcargo = nomcargo; }
	
	@Column(length=18)
	private String nomger;
	public String getNomger() { return this.nomger; }
	public void setNomger(String nomger) { this.nomger = nomger; }

	@Column(precision=2)
	private BigDecimal nrohijos;
	public BigDecimal getNrohijos() { return this.nrohijos; }
	public void setNrohijos(BigDecimal nrohijos) { this.nrohijos = nrohijos; }

	@Column(length=9)
	private String numdoc;
	public String getNumdoc() { return this.numdoc; }
	public void setNumdoc(String numdoc) { this.numdoc = numdoc; }

	@Column(length=7)
	private String nummat;
	public String getNummat() { return this.nummat; }
	public void setNummat(String nummat) { this.nummat = nummat; }

	@Column(length=1)
	private String proinf;
	public String getProinf() { return this.proinf; }
	public void setProinf(String proinf) { this.proinf = proinf; }

	@Column(length=7)
	private String registrop;
	public String getRegistrop() { return this.registrop; }
	public void setRegistrop(String registrop) { this.registrop = registrop; }

	@Column(length=7)
	private String registrou;
	public String getRegistrou() { return this.registrou; }
	public void setRegistrou(String registrou) { this.registrou = registrou; }

	@Column(length=1)
	private String sexo;
	public String getSexo() { return this.sexo; }
	public void setSexo(String sexo) { this.sexo = sexo; }

	@Column(length=9)
	private String telefono1;
	public String getTelefono1() { return this.telefono1; }
	public void setTelefono1(String telefono1) { this.telefono1 = telefono1; }

	@Column(length=9)
	private String telefono2;
	public String getTelefono2() { return this.telefono2; }
	public void setTelefono2(String telefono2) { this.telefono2 = telefono2; }

	@Column(length=18)
	private String telofi1;
	public String getTelofi1() { return this.telofi1; }
	public void setTelofi1(String telofi1) { this.telofi1 = telofi1; }

	@Column(length=18)
	private String telofi2;
	public String getTelofi2() { return this.telofi2; }
	public void setTelofi2(String telofi2) { this.telofi2 = telofi2; }

	@Column(length=1)
	private String tipdoc;
	public String getTipdoc() { return this.tipdoc; }
	public void setTipdoc(String tipdoc) { this.tipdoc = tipdoc; }

	@Column(length=1)
	private String tipofi;
	public String getTipofi() { return this.tipofi; }
	public void setTipofi(String tipofi) { this.tipofi = tipofi; }

	@Column(length=30)
	private String usofut1;
	public String getUsofut1() { return this.usofut1; }
	public void setUsofut1(String usofut1) { this.usofut1 = usofut1; }

	@Column(length=30)
	private String usofut10;
	public String getUsofut10() { return this.usofut10; }
	public void setUsofut10(String usofut10) { this.usofut10 = usofut10; }

	@Column(length=30)
	private String usofut2;
	public String getUsofut2() { return this.usofut2; }
	public void setUsofut2(String usofut2) { this.usofut2 = usofut2; }

	@Column(length=30)
	private String usofut3;
	public String getUsofut3() { return this.usofut3; }
	public void setUsofut3(String usofut3) { this.usofut3 = usofut3; }

	@Column(length=30)
	private String usofut4;
	public String getUsofut4() { return this.usofut4; }
	public void setUsofut4(String usofut4) { this.usofut4 = usofut4; }

	@Column(length=30)
	private String usofut5;
	public String getUsofut5() { return this.usofut5; }
	public void setUsofut5(String usofut5) { this.usofut5 = usofut5; }

	@Column(length=30)
	private String usofut6;
	public String getUsofut6() { return this.usofut6; }
	public void setUsofut6(String usofut6) { this.usofut6 = usofut6; }

	@Column(length=30)
	private String usofut7;
	public String getUsofut7() { return this.usofut7; }
	public void setUsofut7(String usofut7) { this.usofut7 = usofut7; }

	@Column(length=30)
	private String usofut8;
	public String getUsofut8() { return this.usofut8; }
	public void setUsofut8(String usofut8) { this.usofut8 = usofut8; }

	@Column(length=30)
	private String usofut9;
	public String getUsofut9() { return this.usofut9; }
	public void setUsofut9(String usofut9) { this.usofut9 = usofut9; }

	public Ldapperu2() {
	}

}