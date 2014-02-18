package pe.com.bbva.reniec.negocio.impl;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Hibernate;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.hibernate.type.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequest;
import com.pe.bbva.reniec.ws.RefRequestHeader;
import com.pe.bbva.reniec.ws.UsuarioResponse;

import pe.com.bbva.procesarUsuarioRENIEC.ProcesarUsuarioRENIEC;
import pe.com.bbva.reniec.dominio.Carga;
import pe.com.bbva.reniec.dominio.Consultante;
import pe.com.bbva.reniec.dominio.Detalle;
import pe.com.bbva.reniec.dominio.Parametro;
import pe.com.bbva.reniec.dominio.Usuario;
import pe.com.bbva.reniec.dominio.Valor;
import pe.com.bbva.reniec.dominioLDAP.Ldapperu2;
import pe.com.bbva.reniec.exception.ValidacionException;
import pe.com.bbva.reniec.negocio.ConsultantesService;
import pe.com.bbva.reniec.negocio.LDAPService;
import pe.com.bbva.reniec.persistencia.CargaDAO;
import pe.com.bbva.reniec.persistencia.ConsultanteDAO;
import pe.com.bbva.reniec.persistencia.DetalleDAO;
import pe.com.bbva.reniec.persistencia.UsuarioDAO;
import pe.com.bbva.reniec.utileria.Busqueda;
import pe.com.bbva.reniec.utileria.Constante;
import pe.com.bbva.reniec.utileria.ReniecUtil;
import pe.gob.reniec.www.ProcesoType;
import pe.gob.reniec.www.TipoType;

@Service
@SuppressWarnings("serial")
public class ConsultantesServiceImpl extends ConfiguracionServiceImpl 
		implements ConsultantesService{

	Logger logger = LogManager.getLogger(ConsultantesService.class.getName());
	
	@Autowired
	ConsultanteDAO consultanteDAO;
	@Autowired
	CargaDAO cargaDAO;
	@Autowired
	DetalleDAO detalleDAO;
	@Autowired
	UsuarioDAO usuarioDAO;
	@Autowired
	LDAPService ldapService;
	
	
	public Consultante obtenerConsultantePorIdentificador(String identificador){
		Consultante consultante = consultanteDAO.obtenerHql("select cons from Consultante cons where identificador = ?", identificador);
		return consultante;
	}
	
	
	@Override
	public List<Consultante> obtenerConsultante(Consultante consultante) {
		Busqueda filtro = Busqueda.forClass(Consultante.class);
		if (consultante != null) {
			if (consultante.getIdentificador() != null) {
				filtro.add(Restrictions.ilike("identificador", consultante.getIdentificador(), MatchMode.ANYWHERE));
			}
			if (consultante.getNombres() != null) {
				filtro.add(Restrictions.sqlRestriction("lower(paterno||' '||materno||' '||nombres) like lower(?)", "%"+consultante.getNombres().trim()+"%",Hibernate.STRING));
			}
			if (consultante.getCodigoReniec() != null) {
				filtro.add(Restrictions.ilike("codigoReniec", consultante.getCodigoReniec(), MatchMode.ANYWHERE));
			}
			if (consultante.getCreacion() != null) {
				Calendar calendar=Calendar.getInstance();
				calendar.setTime(consultante.getCreacion());
				calendar.set(Calendar.HOUR, 0);
				calendar.set(Calendar.MINUTE, 0);
				Date desde=calendar.getTime();
				calendar.set(Calendar.HOUR, 24);
				calendar.set(Calendar.MINUTE, 24);
				Date hasta=calendar.getTime();
				filtro.add(Restrictions.sqlRestriction("coalesce(this_.edicion,this_.creacion) between ? and ?", new Object[]{desde,hasta},new Type[]{Hibernate.DATE,Hibernate.DATE}));
			}
			if (consultante.getNacionalidad() != null && consultante.getNacionalidad().getNombre() != null) {
				filtro.createAlias("nacionalidad", "n");
				filtro.createAlias("n.lista", "ln");
				filtro.add(Restrictions.eq("ln.codigo", Constante.LISTA.CODIGO.NACIONALIDAD_TIPO));
				filtro.add(Restrictions.ilike("n.nombre", consultante.getNacionalidad().getNombre(), MatchMode.ANYWHERE));
			}
			if (consultante.getCentro() != null) {
				filtro.add(Restrictions.ilike("centro", consultante.getCentro(), MatchMode.ANYWHERE));
			}
			if (consultante.getEstado() != null && consultante.getEstado().getNombre() != null) {
				filtro.createAlias("estado", "e");
				filtro.createAlias("e.lista", "le");
				filtro.add(Restrictions.eq("le.codigo", Constante.LISTA.CODIGO.USUARIO_ESTADO));
				filtro.add(Restrictions.ilike("e.nombre", consultante.getEstado().getNombre(), MatchMode.ANYWHERE));
			}
			if (consultante.getSituacion() != null && consultante.getSituacion().getNombre() != null) {
				filtro.createAlias("situacion", "s");
				filtro.createAlias("s.lista", "ls");
				filtro.add(Restrictions.eq("ls.codigo", Constante.LISTA.CODIGO.RENIEC_SITUACION));
				filtro.add(Restrictions.ilike("s.nombre", consultante.getSituacion().getNombre(), MatchMode.ANYWHERE));
			}
			if (consultante.getOrigen() != null) {
				filtro.createAlias("origen", "o");
				filtro.createAlias("o.lista", "lo");
				filtro.add(Restrictions.eq("lo.codigo", Constante.LISTA.CODIGO.ORIGEN));
				filtro.add(Restrictions.ilike("o.nombre", consultante.getOrigen().getNombre(), MatchMode.ANYWHERE));
			}
		}
		filtro.addOrder(Order.asc("id"));
		return consultanteDAO.buscar(filtro);
	}
	
	@Override
	public List<Consultante> obtenerConsultanteDarBaja(Consultante consultante) {
		Busqueda filtro = Busqueda.forClass(Consultante.class);
		if (consultante != null) {
			filtro.createAlias("estado", "e");
			filtro.createAlias("e.lista", "le");
			filtro.add(Restrictions.eq("le.codigo", Constante.LISTA.CODIGO.USUARIO_ESTADO));
			filtro.add(Restrictions.ne("e.codigo", Constante.VALOR.USUARIO_ESTADO.CODIGO.BAJA_TEMPORAL));
			filtro.createAlias("nacionalidad", "n");
			filtro.createAlias("n.lista", "ln");
			filtro.add(Restrictions.eq("ln.codigo", Constante.LISTA.CODIGO.NACIONALIDAD_TIPO));
			filtro.add(Restrictions.ne("n.codigo", Constante.VALOR.NACIONALIDAD_TIPO.CODIGO.EXTRANJERO));
			if (consultante.getOrigen() != null) {
				filtro.createAlias("origen", "o");
				filtro.createAlias("o.lista", "lo");
				filtro.add(Restrictions.eq("lo.codigo", Constante.LISTA.CODIGO.ORIGEN));
				filtro.add(Restrictions.ilike("o.nombre", consultante.getOrigen().getNombre(), MatchMode.ANYWHERE));
			}
		}
		filtro.addOrder(Order.asc("id"));
		return consultanteDAO.buscar(filtro);
	}
	
	@Override
	public String guardarConsultante(Consultante consultante) {
		String resultado="";
		String proceso="";
		boolean reprosesoErrorReniec=false;
		if(!consultante.getNacionalidad().getCodigo().equals(Constante.VALOR.NACIONALIDAD_TIPO.CODIGO.EXTRANJERO)){
			if(consultante.getEstado().getCodigo().equals(Constante.VALOR.USUARIO_ESTADO.CODIGO.ACTIVO)){
				Valor situacion=obtenerEstadoReniec(consultante);
				if(situacion!=null && situacion.getCodigo().equals(Constante.VALOR.RENIEC_SITUACION.CODIGO.BAJA_TEMPORAL)){
					proceso=Constante.WS_RENIEC.ENTRADA.PROCESO.REACTIVAR_USUARIO;
				}else{
					proceso=Constante.WS_RENIEC.ENTRADA.PROCESO.ACTIVAR_USUARIO;
				}
			}
			if(consultante.getEstado().getCodigo().equals(Constante.VALOR.USUARIO_ESTADO.CODIGO.BAJA_TEMPORAL)){
				proceso=Constante.WS_RENIEC.ENTRADA.PROCESO.BAJA_TEMPORAL;
			}
			if(consultante.getEstado().getCodigo().equals(Constante.VALOR.USUARIO_ESTADO.CODIGO.BAJA_DEFINITIVA)){
				proceso=Constante.WS_RENIEC.ENTRADA.PROCESO.BAJA_DEFINITIVA;
			}
			if(consultante.getEstado().getCodigo().equals(Constante.VALOR.USUARIO_ESTADO.CODIGO.ERROR_RENIEC)){
				Valor reniecSituacion=obtenerEstadoReniec(consultante);
				consultante.setSituacion(reniecSituacion);
				if(consultante.getSituacion()==null){
					reniecSituacion=obtenerValorxCodigo(Constante.LISTA.CODIGO.RENIEC_SITUACION, 
							Constante.VALOR.RENIEC_SITUACION.CODIGO.ERROR_RENIEC);
					consultante.setSituacion(reniecSituacion);
				}
				reprosesoErrorReniec=true;
			}
			
			UsuarioResponse usuarioResponse=null;
			if(!reprosesoErrorReniec){
				usuarioResponse=obtenerRENIECWS(consultante, proceso);
				resultado=nuevoMensajeRENIECWS(usuarioResponse);
				if(usuarioResponse.getRefResponseHeader().getCodigoRespuesta().equals(Constante.WS_RENIEC.SALIDA.ERROR.NINGUN_ERROR)){
					if(validarRENIECWS(usuarioResponse,proceso)){
						if(proceso.equals(Constante.WS_RENIEC.ENTRADA.PROCESO.ACTIVAR_USUARIO)){
							Valor reniecSituacion=obtenerValorxCodigo(Constante.LISTA.CODIGO.RENIEC_SITUACION, 
									Constante.VALOR.RENIEC_SITUACION.CODIGO.ACTIVO);
							consultante.setSituacion(reniecSituacion);
						}
						if(proceso.equals(Constante.WS_RENIEC.ENTRADA.PROCESO.BAJA_TEMPORAL)){
							Valor reniecSituacion=obtenerValorxCodigo(Constante.LISTA.CODIGO.RENIEC_SITUACION, 
									Constante.VALOR.RENIEC_SITUACION.CODIGO.BAJA_TEMPORAL);
							consultante.setSituacion(reniecSituacion);
						}
						if(proceso.equals(Constante.WS_RENIEC.ENTRADA.PROCESO.BAJA_DEFINITIVA)){
							Valor reniecSituacion=obtenerValorxCodigo(Constante.LISTA.CODIGO.RENIEC_SITUACION, 
									Constante.VALOR.RENIEC_SITUACION.CODIGO.BAJA_DEFINITIVA);
							consultante.setSituacion(reniecSituacion);
						}
					}else{
						Valor usuarioEstado=obtenerValorxCodigo(Constante.LISTA.CODIGO.USUARIO_ESTADO, 
								Constante.VALOR.USUARIO_ESTADO.CODIGO.ERROR_RENIEC);
						consultante.setEstado(usuarioEstado);
						consultante.setSituacion(obtenerValorxCodigo(Constante.LISTA.CODIGO.RENIEC_SITUACION, 
								Constante.VALOR.RENIEC_SITUACION.CODIGO.ERROR_RENIEC));
					}
				}else{
					Valor usuarioEstado=obtenerValorxCodigo(Constante.LISTA.CODIGO.USUARIO_ESTADO, 
							Constante.VALOR.USUARIO_ESTADO.CODIGO.ERROR_RENIEC);
					consultante.setEstado(usuarioEstado);
					consultante.setSituacion(obtenerValorxCodigo(Constante.LISTA.CODIGO.RENIEC_SITUACION, 
							Constante.VALOR.RENIEC_SITUACION.CODIGO.ERROR_RENIEC));
				}
			
			}
		}else{
			if(consultante.getEstado().getCodigo().equals(Constante.VALOR.USUARIO_ESTADO.CODIGO.ACTIVO)){
				Valor reniecSituacion=obtenerValorxCodigo(Constante.LISTA.CODIGO.RENIEC_SITUACION, 
						Constante.VALOR.RENIEC_SITUACION.CODIGO.ACTIVO);
				consultante.setSituacion(reniecSituacion);
			}
			if(consultante.getEstado().getCodigo().equals(Constante.VALOR.USUARIO_ESTADO.CODIGO.BAJA_TEMPORAL)){
				Valor reniecSituacion=obtenerValorxCodigo(Constante.LISTA.CODIGO.RENIEC_SITUACION, 
						Constante.VALOR.RENIEC_SITUACION.CODIGO.BAJA_TEMPORAL);
				consultante.setSituacion(reniecSituacion);
			}
			if(consultante.getEstado().getCodigo().equals(Constante.VALOR.USUARIO_ESTADO.CODIGO.BAJA_DEFINITIVA)){
				Valor reniecSituacion=obtenerValorxCodigo(Constante.LISTA.CODIGO.RENIEC_SITUACION, 
						Constante.VALOR.RENIEC_SITUACION.CODIGO.BAJA_DEFINITIVA);
				consultante.setSituacion(reniecSituacion);
			}
		}
		if(consultante.getId()==null){
			consultanteDAO.crear(consultante);
		}else{
			consultanteDAO.actualizar(consultante);
		}
		return resultado;
	}
	
	private boolean validarRENIECWS(UsuarioResponse usuarioResponse, String proceso){
		if(!proceso.equals(Constante.WS_RENIEC.ENTRADA.PROCESO.ACTIVAR_USUARIO)){
			return true;
		}
		if(usuarioResponse.getRefUsuarioWSResponse().getOkDni().equals(Constante.WS_RENIEC.SALIDA.OKDNI.OK) &&
				usuarioResponse.getRefUsuarioWSResponse().getOkNombres().equals(Constante.WS_RENIEC.SALIDA.OKNOMBRES.OK) &&
				usuarioResponse.getRefUsuarioWSResponse().getOkApellidoPaterno().equals(Constante.WS_RENIEC.SALIDA.OKAPPRIMER.OK) &&
				usuarioResponse.getRefUsuarioWSResponse().getOkApellidoMaterno().equals(Constante.WS_RENIEC.SALIDA.OKAPSEGUNDO.OK) &&
				usuarioResponse.getRefUsuarioWSResponse().getOkFechaNacimiento().equals(Constante.WS_RENIEC.SALIDA.OKFECNACE.OK)){
			return true;
		}
		return false;
	}

	private String mensajeRENIECWS(UsuarioResponse usuarioResponse){
		String resultado=usuarioResponse.getRefResponseHeader().getCodigoRespuesta();
		if(usuarioResponse.getRefResponseHeader().getCodigoRespuesta().equals(Constante.WS_RENIEC.SALIDA.ERROR.NINGUN_ERROR)){
			if(usuarioResponse.getRefUsuarioWSResponse().getOkDni().equals(Constante.WS_RENIEC.SALIDA.OKDNI.ERROR)){
				resultado="DNI ERROR";
				return resultado;
			}
			if(usuarioResponse.getRefUsuarioWSResponse().getOkNombres().equals(Constante.WS_RENIEC.SALIDA.OKNOMBRES.ERROR)){
				resultado="Nombres ERROR";
				return resultado;
			}
			if(usuarioResponse.getRefUsuarioWSResponse().getOkApellidoPaterno().equals(Constante.WS_RENIEC.SALIDA.OKAPPRIMER.ERROR)){
				resultado="Apellido Paterno ERROR";
				return resultado;
			}
			if(usuarioResponse.getRefUsuarioWSResponse().getOkApellidoMaterno().equals(Constante.WS_RENIEC.SALIDA.OKAPSEGUNDO.ERROR)){
				resultado="Apellido Materno ERROR";
				return resultado;
			}
			if(usuarioResponse.getRefUsuarioWSResponse().getOkFechaNacimiento().equals(Constante.WS_RENIEC.SALIDA.OKFECNACE.ERROR)){
				resultado="Fecha Nacimiento ERROR";
				return resultado;
			}
		}
		return resultado;
	}
	
	private String codigoRENIECWS(UsuarioResponse usuarioResponse){
		String resultado=usuarioResponse.getRefResponseHeader().getCodigoRespuesta();
		if(usuarioResponse.getRefResponseHeader().getCodigoRespuesta().equals(Constante.WS_RENIEC.SALIDA.ERROR.NINGUN_ERROR)){
			if(usuarioResponse.getRefUsuarioWSResponse().getOkDni().equals(Constante.WS_RENIEC.SALIDA.OKDNI.ERROR)){
				resultado="DNI";
				return resultado;
			}
			if(usuarioResponse.getRefUsuarioWSResponse().getOkNombres().equals(Constante.WS_RENIEC.SALIDA.OKNOMBRES.ERROR)){
				resultado="Nombres";
				return resultado;
			}
			if(usuarioResponse.getRefUsuarioWSResponse().getOkApellidoPaterno().equals(Constante.WS_RENIEC.SALIDA.OKAPPRIMER.ERROR)){
				resultado="Apellido Paterno";
				return resultado;
			}
			if(usuarioResponse.getRefUsuarioWSResponse().getOkApellidoMaterno().equals(Constante.WS_RENIEC.SALIDA.OKAPSEGUNDO.ERROR)){
				resultado="Apellido Materno";
				return resultado;
			}
			if(usuarioResponse.getRefUsuarioWSResponse().getOkFechaNacimiento().equals(Constante.WS_RENIEC.SALIDA.OKFECNACE.ERROR)){
				resultado="Fecha Nacimiento";
				return resultado;
			}
		}
		return resultado;
	}
	
	private String nuevoMensajeRENIECWS(UsuarioResponse usuarioResponse){
		StringBuilder resultado=new StringBuilder();
		resultado.append(usuarioResponse.getRefResponseHeader().getCodigoRespuesta());
		resultado.append(" ");
		resultado.append(usuarioResponse.getRefResponseHeader().getMensajeRespuesta());
		if(usuarioResponse.getRefUsuarioWSResponse()!=null){
			if(usuarioResponse.getRefUsuarioWSResponse().getOkDni()!=null){
			resultado.append(" DNI: ");
			resultado.append(usuarioResponse.getRefUsuarioWSResponse().getOkDni());
			}
			if(usuarioResponse.getRefUsuarioWSResponse().getOkNombres()!=null){
			resultado.append(" NOM: ");
			resultado.append(usuarioResponse.getRefUsuarioWSResponse().getOkNombres());
			}
			if(usuarioResponse.getRefUsuarioWSResponse().getOkApellidoPaterno()!=null){
			resultado.append(" APP: ");
			resultado.append(usuarioResponse.getRefUsuarioWSResponse().getOkApellidoPaterno());
			}
			if(usuarioResponse.getRefUsuarioWSResponse().getOkApellidoMaterno()!=null){
			resultado.append(" APM: ");
			resultado.append(usuarioResponse.getRefUsuarioWSResponse().getOkApellidoMaterno());
			}
			if(usuarioResponse.getRefUsuarioWSResponse().getOkFechaNacimiento()!=null){
			resultado.append(" FEN: ");
			resultado.append(usuarioResponse.getRefUsuarioWSResponse().getOkFechaNacimiento());
			}
		}
		return resultado.toString();
	}
	
	@Override
	public String guardarConsultanteUI(Consultante consultante) {
		String resultado="";
		String proceso="";
		if(!consultante.getNacionalidad().getCodigo().equals(Constante.VALOR.NACIONALIDAD_TIPO.CODIGO.EXTRANJERO)){
			if(consultante.getEstado().getCodigo().equals(Constante.VALOR.USUARIO_ESTADO.CODIGO.ACTIVO)){
				Valor situacion=obtenerEstadoReniec(consultante);
				if(situacion!=null && situacion.getCodigo().equals(Constante.VALOR.RENIEC_SITUACION.CODIGO.BAJA_TEMPORAL)){
					proceso=Constante.WS_RENIEC.ENTRADA.PROCESO.REACTIVAR_USUARIO;
				}else{
					proceso=Constante.WS_RENIEC.ENTRADA.PROCESO.ACTIVAR_USUARIO;
				}
			}
			if(consultante.getEstado().getCodigo().equals(Constante.VALOR.USUARIO_ESTADO.CODIGO.BAJA_TEMPORAL)){
				proceso=Constante.WS_RENIEC.ENTRADA.PROCESO.BAJA_TEMPORAL;
			}
			if(consultante.getEstado().getCodigo().equals(Constante.VALOR.USUARIO_ESTADO.CODIGO.BAJA_DEFINITIVA)){
				proceso=Constante.WS_RENIEC.ENTRADA.PROCESO.BAJA_DEFINITIVA;
			}
			if(consultante.getEstado().getCodigo().equals(Constante.VALOR.USUARIO_ESTADO.CODIGO.ERROR_RENIEC)){
				consultante.setSituacion(obtenerValorxCodigo(Constante.LISTA.CODIGO.RENIEC_SITUACION, 
						Constante.VALOR.RENIEC_SITUACION.CODIGO.ERROR_RENIEC));
			}
			UsuarioResponse usuarioResponse=null;
			if(StringUtils.isNotBlank(proceso)){
				usuarioResponse=obtenerRENIECWS(consultante, proceso);
				resultado=nuevoMensajeRENIECWS(usuarioResponse);
				if(usuarioResponse.getRefResponseHeader().getCodigoRespuesta().equals(Constante.WS_RENIEC.SALIDA.ERROR.NINGUN_ERROR)){
					if(validarRENIECWS(usuarioResponse,proceso)){
						if(proceso.equals(Constante.WS_RENIEC.ENTRADA.PROCESO.ACTIVAR_USUARIO)){
							Valor reniecSituacion=obtenerValorxCodigo(Constante.LISTA.CODIGO.RENIEC_SITUACION, 
									Constante.VALOR.RENIEC_SITUACION.CODIGO.ACTIVO);
							consultante.setSituacion(reniecSituacion);
						}else if(proceso.equals(Constante.WS_RENIEC.ENTRADA.PROCESO.BAJA_TEMPORAL)){
							Valor reniecSituacion=obtenerValorxCodigo(Constante.LISTA.CODIGO.RENIEC_SITUACION, 
									Constante.VALOR.RENIEC_SITUACION.CODIGO.BAJA_TEMPORAL);
							consultante.setSituacion(reniecSituacion);
						}else if(proceso.equals(Constante.WS_RENIEC.ENTRADA.PROCESO.BAJA_DEFINITIVA)){
							Valor reniecSituacion=obtenerValorxCodigo(Constante.LISTA.CODIGO.RENIEC_SITUACION, 
									Constante.VALOR.RENIEC_SITUACION.CODIGO.BAJA_DEFINITIVA);
							consultante.setSituacion(reniecSituacion);
						}else{
							consultante.setSituacion(obtenerValorxCodigo(Constante.LISTA.CODIGO.RENIEC_SITUACION, 
									Constante.VALOR.RENIEC_SITUACION.CODIGO.ERROR_RENIEC));
						}
					}else{
						Valor usuarioEstado=obtenerValorxCodigo(Constante.LISTA.CODIGO.USUARIO_ESTADO, 
								Constante.VALOR.USUARIO_ESTADO.CODIGO.ERROR_RENIEC);
						consultante.setEstado(usuarioEstado);
						consultante.setSituacion(obtenerValorxCodigo(Constante.LISTA.CODIGO.RENIEC_SITUACION, 
								Constante.VALOR.RENIEC_SITUACION.CODIGO.ERROR_RENIEC));
					}
				}else{
					Valor usuarioEstado=obtenerValorxCodigo(Constante.LISTA.CODIGO.USUARIO_ESTADO, 
							Constante.VALOR.USUARIO_ESTADO.CODIGO.ERROR_RENIEC);
					consultante.setEstado(usuarioEstado);
					consultante.setSituacion(obtenerValorxCodigo(Constante.LISTA.CODIGO.RENIEC_SITUACION, 
							Constante.VALOR.RENIEC_SITUACION.CODIGO.ERROR_RENIEC));
				}
			}
		}else{
			if(consultante.getEstado().getCodigo().equals(Constante.VALOR.USUARIO_ESTADO.CODIGO.ACTIVO)){
				Valor reniecSituacion=obtenerValorxCodigo(Constante.LISTA.CODIGO.RENIEC_SITUACION, 
						Constante.VALOR.RENIEC_SITUACION.CODIGO.ACTIVO);
				consultante.setSituacion(reniecSituacion);
			}
			if(consultante.getEstado().getCodigo().equals(Constante.VALOR.USUARIO_ESTADO.CODIGO.BAJA_TEMPORAL)){
				Valor reniecSituacion=obtenerValorxCodigo(Constante.LISTA.CODIGO.RENIEC_SITUACION, 
						Constante.VALOR.RENIEC_SITUACION.CODIGO.BAJA_TEMPORAL);
				consultante.setSituacion(reniecSituacion);
			}
			if(consultante.getEstado().getCodigo().equals(Constante.VALOR.USUARIO_ESTADO.CODIGO.BAJA_DEFINITIVA)){
				Valor reniecSituacion=obtenerValorxCodigo(Constante.LISTA.CODIGO.RENIEC_SITUACION, 
						Constante.VALOR.RENIEC_SITUACION.CODIGO.BAJA_DEFINITIVA);
				consultante.setSituacion(reniecSituacion);
			}
			if(consultante.getEstado().getCodigo().equals(Constante.VALOR.USUARIO_ESTADO.CODIGO.ERROR_RENIEC)){
				consultante.setSituacion(obtenerValorxCodigo(Constante.LISTA.CODIGO.RENIEC_SITUACION, 
						Constante.VALOR.RENIEC_SITUACION.CODIGO.ERROR_RENIEC));
			}
		}
		if(consultante.getId()==null){
			consultanteDAO.crear(consultante);
		}else{
			consultanteDAO.actualizar(consultante);
		}
		return resultado;
	}
	
	@Override
	public UsuarioResponse guardarConsultanteWS(Consultante consultante, String proceso) {
		UsuarioResponse usuarioResponse=obtenerRENIECWS(consultante, proceso);
		if(usuarioResponse.getRefResponseHeader().getCodigoRespuesta().equals(Constante.WS_RENIEC.SALIDA.ERROR.NINGUN_ERROR)){
			if(proceso.equals(Constante.WS_RENIEC.ENTRADA.PROCESO.ACTIVAR_USUARIO)){
				Valor reniecSituacion=obtenerValorxCodigo(Constante.LISTA.CODIGO.RENIEC_SITUACION, 
						Constante.VALOR.RENIEC_SITUACION.CODIGO.ACTIVO);
				Valor usuarioEstado=obtenerValorxCodigo(Constante.LISTA.CODIGO.USUARIO_ESTADO, 
						Constante.VALOR.USUARIO_ESTADO.CODIGO.ACTIVO);
				consultante.setEstado(usuarioEstado);
				consultante.setSituacion(reniecSituacion);
			}
			if(proceso.equals(Constante.WS_RENIEC.ENTRADA.PROCESO.BAJA_TEMPORAL)){
				Valor reniecSituacion=obtenerValorxCodigo(Constante.LISTA.CODIGO.RENIEC_SITUACION, 
						Constante.VALOR.RENIEC_SITUACION.CODIGO.BAJA_TEMPORAL);
				Valor usuarioEstado=obtenerValorxCodigo(Constante.LISTA.CODIGO.USUARIO_ESTADO, 
						Constante.VALOR.USUARIO_ESTADO.CODIGO.BAJA_TEMPORAL);
				consultante.setEstado(usuarioEstado);
				consultante.setSituacion(reniecSituacion);
			}
			if(proceso.equals(Constante.WS_RENIEC.ENTRADA.PROCESO.BAJA_DEFINITIVA)){
				Valor reniecSituacion=obtenerValorxCodigo(Constante.LISTA.CODIGO.RENIEC_SITUACION, 
						Constante.VALOR.RENIEC_SITUACION.CODIGO.BAJA_DEFINITIVA);
				Valor usuarioEstado=obtenerValorxCodigo(Constante.LISTA.CODIGO.USUARIO_ESTADO, 
						Constante.VALOR.USUARIO_ESTADO.CODIGO.BAJA_DEFINITIVA);
				consultante.setEstado(usuarioEstado);
				consultante.setSituacion(reniecSituacion);
			}
		}else{
			Valor usuarioEstado=obtenerValorxCodigo(Constante.LISTA.CODIGO.USUARIO_ESTADO, 
					Constante.VALOR.USUARIO_ESTADO.CODIGO.ERROR_RENIEC);
			consultante.setEstado(usuarioEstado);
			consultante.setSituacion(obtenerValorxCodigo(Constante.LISTA.CODIGO.RENIEC_SITUACION, 
					Constante.VALOR.RENIEC_SITUACION.CODIGO.ERROR_RENIEC));
		}
		if(consultante.getId()==null){
			consultanteDAO.crear(consultante);
		}else{
			consultanteDAO.actualizar(consultante);
		}
		return usuarioResponse;
	}

	@Override
	public Valor obtenerEstadoReniec(Consultante consultante) {
		UsuarioResponse usuarioResponse=obtenerRENIECWS(consultante, Constante.WS_RENIEC.ENTRADA.PROCESO.CONSULTA);
		if(usuarioResponse!=null && usuarioResponse.getRefUsuarioWSResponse()!=null &&
				usuarioResponse.getRefUsuarioWSResponse().getMensaje()!=null){
			if(usuarioResponse.getRefUsuarioWSResponse().getMensaje().
					equals(Constante.WS_RENIEC.SALIDA.MENSAJE.ACTIVAR_USUARIO)){
				return obtenerValorxCodigo(Constante.LISTA.CODIGO.RENIEC_SITUACION, 
						Constante.VALOR.RENIEC_SITUACION.CODIGO.ACTIVO);
			}else if(usuarioResponse.getRefUsuarioWSResponse().getMensaje().
					equals(Constante.WS_RENIEC.SALIDA.MENSAJE.BAJA_TEMPORAL)){
				return obtenerValorxCodigo(Constante.LISTA.CODIGO.RENIEC_SITUACION, 
						Constante.VALOR.RENIEC_SITUACION.CODIGO.BAJA_TEMPORAL);
			}else if(usuarioResponse.getRefUsuarioWSResponse().getMensaje().
					equals(Constante.WS_RENIEC.SALIDA.MENSAJE.BAJA_DEFINITIVA)){
				return obtenerValorxCodigo(Constante.LISTA.CODIGO.RENIEC_SITUACION, 
						Constante.VALOR.RENIEC_SITUACION.CODIGO.BAJA_DEFINITIVA);
			}else{
				return obtenerValorxCodigo(Constante.LISTA.CODIGO.RENIEC_SITUACION, 
						Constante.VALOR.RENIEC_SITUACION.CODIGO.ERROR_RENIEC);
			}
		}
		return null;
	}
	
	private UsuarioResponse obtenerRENIECWS(Consultante consultante,String proceso) {
		Usuario usuario=ReniecUtil.obtenerUsuarioSesion();
		if(usuario==null){
			usuario=usuarioDAO.obtener(1L);
		}
		Parametro wsURL=obtenerParametroxCodigo(Constante.PARAMETRO.WS_URL);
		Parametro wsTimeOut=obtenerParametroxCodigo(Constante.PARAMETRO.WS_TIMEOUT);
		Parametro empresaCodigo=obtenerParametroxCodigo(Constante.PARAMETRO.EMPRESA_CODIGO);
		Parametro canal=obtenerParametroxCodigo(Constante.PARAMETRO.CANAL);
		Parametro codigoAplicacion=obtenerParametroxCodigo(Constante.PARAMETRO.COD_APP);
		Parametro idEmpresa=obtenerParametroxCodigo(Constante.PARAMETRO.ID_EMPRESA);
		Parametro codigoInterfaz=obtenerParametroxCodigo(Constante.PARAMETRO.COD_INT);
		DateFormat fmt = new SimpleDateFormat("yyyyMMdd");
		DateFormat fmtH = new SimpleDateFormat("yyyy-MM-dd-HH.mm.ss.SSS");
		DateFormat fmtH2 = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		ProcesarUsuarioRENIEC procesarUsuarioRENIEC=new ProcesarUsuarioRENIEC();
		procesarUsuarioRENIEC.setUrl(wsURL.getValor());
		procesarUsuarioRENIEC.setTimeOut(Long.parseLong(wsTimeOut.getValor()));
		RefRequestHeader refRequestHeader=RefRequestHeader.Factory.newInstance();
		refRequestHeader.setCanal(canal.getValor());
		refRequestHeader.setCodigoAplicacion(codigoAplicacion.getValor());
		refRequestHeader.setIdEmpresa(idEmpresa.getValor());
		refRequestHeader.setUsuario(usuario.getRegistro());
		refRequestHeader.setFechaHoraEnvio(fmtH.format(new Date()));
		refRequestHeader.setIdTransaccion(fmtH2.format(new Date()));
		refRequestHeader.setCodigoInterfaz(codigoInterfaz.getValor());
		ProcesarUsuarioRENIECRequest refprocesarUsuarioRENIECRequest=ProcesarUsuarioRENIECRequest.Factory.newInstance();
		refprocesarUsuarioRENIECRequest.setEmpresa(empresaCodigo.getValor());
		refprocesarUsuarioRENIECRequest.setCodigo(consultante.getCodigoReniec());
		refprocesarUsuarioRENIECRequest.setNombres(consultante.getNombres());
		refprocesarUsuarioRENIECRequest.setApellidoPaterno(consultante.getPaterno());
		refprocesarUsuarioRENIECRequest.setApellidoMaterno(consultante.getMaterno());
		if(consultante.getNacimiento()!=null){
			refprocesarUsuarioRENIECRequest.setFechaNacimiento(fmt.format(consultante.getNacimiento()));
		}
		refprocesarUsuarioRENIECRequest.setTipo(TipoType.DNI);
		if(ProcesoType.AC.toString().equals(proceso)){
			refprocesarUsuarioRENIECRequest.setProceso(ProcesoType.AC);
		}
		if(ProcesoType.BT.toString().equals(proceso)){
			refprocesarUsuarioRENIECRequest.setProceso(ProcesoType.BT);
		}
		if(ProcesoType.BD.toString().equals(proceso)){
			refprocesarUsuarioRENIECRequest.setProceso(ProcesoType.BD);
		}
		if(ProcesoType.RA.toString().equals(proceso)){
			refprocesarUsuarioRENIECRequest.setProceso(ProcesoType.RA);
		}
		if(ProcesoType.CO.toString().equals(proceso)){
			refprocesarUsuarioRENIECRequest.setProceso(ProcesoType.CO);
		}
		
		UsuarioResponse usuarioResponse=null;
		
		try {
			usuarioResponse=procesarUsuarioRENIEC.respuestaTransaccion(refRequestHeader, refprocesarUsuarioRENIECRequest);
		} catch (Exception e) {
			throw new ValidacionException(Constante.CODIGO_MENSAJE.WS_ERROR, null, e.getCause());
		}
		logger.info(usuarioResponse);
		
		return usuarioResponse;
	}


	@Override
	public Consultante obtenerConsultanteLDAP(String registro, Valor origen) {
		Consultante consultante=
				consultanteDAO.obtenerHql("select cons from Consultante cons where identificador = ? and origen.id=?", 
						registro, origen.getId());
		if(consultante==null){
			Ldapperu2 usuario=ldapService.obtenerUsuarioLDAP(registro);
			if(usuario!=null){
				Valor tipoDoi = obtenerValorxCodigo(
						Constante.LISTA.CODIGO.DOI_TIPO,
						Constante.VALOR.DOI_TIPO.CODIGO.DNI);
				Valor nacionalidad;
				if (usuario.getCodpais().equals("0504")) {
					nacionalidad = obtenerValorxCodigo(
							Constante.LISTA.CODIGO.NACIONALIDAD_TIPO,
							Constante.VALOR.NACIONALIDAD_TIPO.CODIGO.PERUANA);
				} else {
					nacionalidad = obtenerValorxCodigo(
									Constante.LISTA.CODIGO.NACIONALIDAD_TIPO,
									Constante.VALOR.NACIONALIDAD_TIPO.CODIGO.EXTRANJERO);
				}
				consultante=new Consultante();
				consultante.setIdentificador(usuario.getCodusu());
				consultante.setCodigoReniec(usuario.getNumdoc());
				consultante.setTipoDOI(tipoDoi);
				consultante.setDoi(usuario.getNumdoc());
				consultante.setNombres(usuario.getNombre());
				consultante.setPaterno(usuario.getApepat());
				consultante.setMaterno(usuario.getApemat());
				String nacimiento = usuario.getFecnac();
				if (nacimiento != null){
					SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd-MM-yyyy");
					try {
						consultante.setNacimiento(formatoDelTexto.parse(nacimiento));
					} catch (ParseException e) {
						e.printStackTrace();
					}
				}
				
				consultante.setNacionalidad(nacionalidad);
				consultante.setCentro(usuario.getCodofi());
				consultante.setOrigen(origen);
				return consultante;
			}
		}else{
			return consultante;
		}
		return null;
	}


	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void cargarMasivaLDAP() {
		Carga carga=new Carga();
		String codPaisPeru = "0504";
		Long nroFilaInterno = 2L;
		DateFormat formatoDelTexto=new SimpleDateFormat("dd-MM-yyyy");
		Valor usuarioEstadoError=obtenerValorxCodigo(Constante.LISTA.CODIGO.USUARIO_ESTADO, 
				Constante.VALOR.USUARIO_ESTADO.CODIGO.ERROR_RENIEC);
		Valor reniecSituacionError=obtenerValorxCodigo(Constante.LISTA.CODIGO.RENIEC_SITUACION, 
				Constante.VALOR.RENIEC_SITUACION.CODIGO.ERROR_RENIEC);
		Valor origen = obtenerValorxCodigo(
				Constante.LISTA.CODIGO.ORIGEN,
				Constante.VALOR.ORIGEN.CODIGO.LDAP);
		Valor estado = obtenerValorxCodigo(
				Constante.LISTA.CODIGO.REGISTRO_ESTADO,
				Constante.VALOR.REGISTRO_ESTADO.CODIGO.ACTIVO);
		Valor tipoDoi = obtenerValorxCodigo(
				Constante.LISTA.CODIGO.DOI_TIPO,
				Constante.VALOR.DOI_TIPO.CODIGO.DNI);
		Valor tipoCarga = obtenerValorxCodigo(
				Constante.LISTA.CODIGO.CARGA_TIPO,
				Constante.VALOR.CARGA_TIPO.CODIGO.AUTOMATICA);
		carga.setTipo(tipoCarga);
		carga.setOrigen(origen);
		carga.setFecha(new Date());
		carga.setEstado(estado);
		carga.setInicio(new Date());
		cargaDAO.crear(carga);
		
		List<Consultante> consultantesLDAP = new ArrayList<Consultante>();
		List<Detalle> detalles=new ArrayList<Detalle>();
		Consultante consultante = null;
		Detalle detalle = null;
		List<Ldapperu2> usuariosLdap = ldapService.obtenerUsuariosLDAP();
		loopConsultante: for (Ldapperu2 usuario : usuariosLdap) {
			detalle = new Detalle();
			detalle.setCarga(carga);
			detalle.setNroFila(nroFilaInterno++);
			consultante = obtenerConsultantePorIdentificador(usuario.getCodusu());
			consultante = consultante==null ? new Consultante() : consultante;
			consultante.setIdentificador(usuario.getCodusu());
			detalle.setIdentificador(usuario.getCodusu());
			consultante.setCodigoReniec(usuario.getNumdoc());
			detalle.setCodigoReniec(usuario.getNumdoc());
			consultante.setTipoDOI(tipoDoi);
			detalle.setTipoDoi(tipoDoi.getCodigo());
			consultante.setDoi(usuario.getNumdoc());
			detalle.setNumeroDoi(usuario.getNumdoc());
			consultante.setNombres(usuario.getNombre());
			detalle.setNombres(usuario.getNombre());
			consultante.setPaterno(usuario.getApepat());
			detalle.setPaterno(usuario.getApepat());
			consultante.setMaterno(usuario.getApemat());
			detalle.setMaterno(usuario.getApemat());
			
			String nacimiento = usuario.getFecnac();
			if(nacimiento == null){
				continue loopConsultante;
			}
			try {
				consultante.setNacimiento(formatoDelTexto.parse(nacimiento));
			} catch (ParseException e) {
				Calendar calendar=Calendar.getInstance();
				calendar.add(Calendar.YEAR, -18);
				consultante.setNacimiento(calendar.getTime());
				e.printStackTrace();
			}
			detalle.setNacimiento(nacimiento);
			
			Valor nacionalidad;
			if (usuario.getCodpais().equals(codPaisPeru)) {
				nacionalidad = obtenerValorxCodigo(
						Constante.LISTA.CODIGO.NACIONALIDAD_TIPO,
						Constante.VALOR.NACIONALIDAD_TIPO.CODIGO.PERUANA);
			} else {
				nacionalidad = obtenerValorxCodigo(
								Constante.LISTA.CODIGO.NACIONALIDAD_TIPO,
								Constante.VALOR.NACIONALIDAD_TIPO.CODIGO.EXTRANJERO);
			}
			Valor estadoUsuario = obtenerValorxCodigo(
					Constante.LISTA.CODIGO.USUARIO_ESTADO,
					Constante.VALOR.USUARIO_ESTADO.CODIGO.ACTIVO);
			
			consultante.setNacionalidad(nacionalidad);
			detalle.setNacionalidad(nacionalidad.getCodigo());
			if (usuario.getCodofi() == null){
				continue loopConsultante;
			}
			consultante.setCentro(usuario.getCodofi());
			detalle.setCentro(usuario.getCodofi());
			consultante.setOrigen(origen);
			detalle.setOrigen(origen.getCodigo());
			
			String resultado="";
			if (consultante.getEstado() == null){
				consultante.setEstado(estadoUsuario);
				try {
					resultado=guardarConsultante(consultante);	
				} catch (Exception e) {
					consultante.setEstado(usuarioEstadoError);
					consultante.setSituacion(reniecSituacionError);
					if(consultante.getId()==null){
						consultanteDAO.crear(consultante);
					}else{
						consultanteDAO.actualizar(consultante);
					}
					resultado=e.getMessage();
				}
				consultantesLDAP.add(consultante);
			}else {
				if(consultante
						.getEstado()
						.getCodigo()
						.equals(Constante.VALOR.USUARIO_ESTADO.CODIGO.ACTIVO)){
					consultantesLDAP.add(consultante);
					continue loopConsultante;
				}else if (consultante
								.getEstado()
								.getCodigo()
								.equals(Constante.VALOR.USUARIO_ESTADO.CODIGO.BAJA_TEMPORAL)
								|| consultante
								.getEstado()
								.getCodigo()
								.equals(Constante.VALOR.USUARIO_ESTADO.CODIGO.ERROR_RENIEC)) {
					consultante.setEstado(estadoUsuario);
					try {
						resultado=guardarConsultante(consultante);	
					} catch (Exception e) {
						consultante.setEstado(usuarioEstadoError);
						consultante.setSituacion(reniecSituacionError);
						if(consultante.getId()==null){
							consultanteDAO.crear(consultante);
						}else{
							consultanteDAO.actualizar(consultante);
						}
						resultado=e.getMessage();
					}
					consultantesLDAP.add(consultante);
				} else {
					continue loopConsultante;
				}
			}
			
			detalle.setAccion(Constante.VALOR.ACCION.CODIGO.ACTIVACION);
			/*String msj=Constante.WS_RENIEC.SALIDA.CODIGO_ERROR.get(resultado);
			msj=StringUtils.isBlank(msj)?resultado:msj;*/
			detalle.setMensaje(resultado);
			detalle.setConsultante(consultante);
			detalles.add(detalle);
			
		}
		
		Consultante consultanteReniec = new Consultante();
		consultanteReniec.setOrigen(origen);
		List<Consultante> consultantesReniec = obtenerConsultanteDarBaja(consultanteReniec);
		List<Consultante> consultanteBajaTemporal = new  ArrayList<Consultante>();		
		
		iteradorLdap: for(Consultante consultanteReniecLocal: consultantesReniec){			
			for(Consultante consultanteLdap : consultantesLDAP){
				if(consultanteReniecLocal.getId().equals(consultanteLdap.getId()))
					continue iteradorLdap;
			}
			consultanteBajaTemporal.add(consultanteReniecLocal);	
		}

		Valor estadoBT = obtenerValorxCodigo(
				Constante.LISTA.CODIGO.USUARIO_ESTADO,
				Constante.VALOR.USUARIO_ESTADO.CODIGO.BAJA_TEMPORAL);
		for(Consultante consultanteBT : consultanteBajaTemporal){
			if(!consultanteBT.getEstado().getCodigo().equals(Constante.VALOR.USUARIO_ESTADO.CODIGO.BAJA_DEFINITIVA)){
				detalle = new Detalle();
				detalle.setCarga(carga);
				detalle.setNroFila(nroFilaInterno++);
				detalle.setIdentificador(consultanteBT.getIdentificador());
				detalle.setCodigoReniec(consultanteBT.getCodigoReniec());
				detalle.setTipoDoi(consultanteBT.getTipoDOI().getCodigo());
				detalle.setNumeroDoi(consultanteBT.getDoi());
				detalle.setNombres(consultanteBT.getNombres());
				detalle.setPaterno(consultanteBT.getPaterno());
				detalle.setMaterno(consultanteBT.getMaterno());
				detalle.setNacimiento(formatoDelTexto.format(consultanteBT.getNacimiento()));
				detalle.setNacionalidad(consultanteBT.getNacionalidad().getCodigo());
				detalle.setCentro(consultanteBT.getCentro());
				detalle.setOrigen(origen.getCodigo());
				detalle.setAccion(Constante.VALOR.ACCION.CODIGO.BAJA_TEMPORAL);
				consultanteBT.setEstado(estadoBT);
				
				String resultado="";
				try {
					resultado=guardarConsultante(consultanteBT);	
				} catch (Exception e) {
					consultanteBT.setEstado(usuarioEstadoError);
					consultanteBT.setSituacion(reniecSituacionError);
					if(consultanteBT.getId()==null){
						consultanteDAO.crear(consultanteBT);
					}else{
						consultanteDAO.actualizar(consultanteBT);
					}
					resultado=e.getMessage();
				}
				/*String msj=Constante.WS_RENIEC.SALIDA.CODIGO_ERROR.get(resultado);
				msj=StringUtils.isBlank(msj)?resultado:msj;*/
				detalle.setMensaje(resultado);
				detalle.setConsultante(consultanteBT);
				detalles.add(detalle);
			}
		}
		
		detalleDAO.grabarTodos(detalles);
		carga.setFin(new Date());
		carga.setMensaje("Se cargo satisfactoriamente");
		cargaDAO.actualizar(carga);
	}

}
