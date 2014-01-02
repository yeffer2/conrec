package pe.com.bbva.reniec.negocio.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pe.bbva.reniec.ws.ProcesarUsuarioRENIECRequest;
import com.pe.bbva.reniec.ws.RefRequestHeader;
import com.pe.bbva.reniec.ws.UsuarioResponse;

import pe.com.bbva.procesarUsuarioRENIEC.ProcesarUsuarioRENIEC;
import pe.com.bbva.reniec.dominio.Consultante;
import pe.com.bbva.reniec.dominio.Parametro;
import pe.com.bbva.reniec.dominio.Usuario;
import pe.com.bbva.reniec.dominio.Valor;
import pe.com.bbva.reniec.exception.ValidacionException;
import pe.com.bbva.reniec.negocio.ConsultantesService;
import pe.com.bbva.reniec.persistencia.ConsultanteDAO;
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
	UsuarioDAO usuarioDAO;
	
	
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
				filtro.add(Restrictions.ilike("nombres", consultante.getNombres(), MatchMode.ANYWHERE));
			}
			if (consultante.getCodigoReniec() != null) {
				filtro.add(Restrictions.ilike("codigoReniec", consultante.getCodigoReniec(), MatchMode.ANYWHERE));
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
	public void guardarConsultante(Consultante consultante) {
		String proceso="";
		boolean reprosesoErrorReniec=false;
		if(!consultante.getNacionalidad().getCodigo().equals(Constante.VALOR.NACIONALIDAD_TIPO.CODIGO.EXTRANJERO)){
			if(consultante.getEstado().getCodigo().equals(Constante.VALOR.USUARIO_ESTADO.CODIGO.ACTIVO)){
				proceso=Constante.WS_RENIEC.ENTRADA.PROCESO.ACTIVAR_USUARIO;
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
				//FIXME Definir Variable de ERROR
				if(usuarioResponse.getRefResponseHeader().getCodigoRespuesta().equals(Constante.WS_RENIEC.SALIDA.ERROR.NINGUN_ERROR)){
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
					Valor reniecSituacion=obtenerEstadoReniec(consultante);
					consultante.setSituacion(reniecSituacion);
					if(consultante.getSituacion()==null){
						reniecSituacion=obtenerValorxCodigo(Constante.LISTA.CODIGO.RENIEC_SITUACION, 
								Constante.VALOR.RENIEC_SITUACION.CODIGO.ERROR_RENIEC);
						consultante.setSituacion(reniecSituacion);
					}
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
	}
	
	@Override
	public void guardarConsultanteUI(Consultante consultante) {
		String proceso="";
		if(!consultante.getNacionalidad().getCodigo().equals(Constante.VALOR.NACIONALIDAD_TIPO.CODIGO.EXTRANJERO)){
			if(consultante.getEstado().getCodigo().equals(Constante.VALOR.USUARIO_ESTADO.CODIGO.ACTIVO)){
				proceso=Constante.WS_RENIEC.ENTRADA.PROCESO.ACTIVAR_USUARIO;
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
				//FIXME Definir Variable de ERROR
				if(usuarioResponse.getRefResponseHeader().getCodigoRespuesta().equals(Constante.WS_RENIEC.SALIDA.ERROR.NINGUN_ERROR)){
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
		System.out.println("++++RENIEC CONSULTA AL SERVICIO WEB INICIO++++");
		System.out.println(usuarioResponse);
		System.out.println("++++RENIEC CONSULTA AL SERVICIO WEB FIN++++");
		
		return usuarioResponse;
	}

}
