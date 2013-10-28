package pe.com.bbva.reniec.negocio.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Random;

import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grupobbva.pe.simr.ents.body.mantenimientousuario.UsuarioRequest;
import com.grupobbva.pe.simr.ents.header.RequestHeader;
import com.grupobbva.pe.simr.ents.header.ResponseHeader;
import com.grupobbva.pe.simr.service.message.UsuarioResponse;



import pe.com.bbva.adminUsuReniec.ProcesarUsuarioRENIEC;
import pe.com.bbva.reniec.dominio.Consultante;
import pe.com.bbva.reniec.dominio.Valor;
import pe.com.bbva.reniec.exception.ValidacionException;
import pe.com.bbva.reniec.negocio.ConsultantesService;
import pe.com.bbva.reniec.persistencia.ConsultanteDAO;
import pe.com.bbva.reniec.utileria.Busqueda;
import pe.com.bbva.reniec.utileria.Constante;

@Service
@SuppressWarnings("serial")
public class ConsultantesServiceImpl extends ConfiguracionServiceImpl 
		implements ConsultantesService{

	@Autowired
	ConsultanteDAO consultanteDAO;
	
	
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
		}
		UsuarioResponse usuarioResponse=obtenerMockRENIECWS(consultante, proceso);
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
		}
		if(consultante.getId()==null){
			consultanteDAO.crear(consultante);
		}else{
			consultanteDAO.actualizar(consultante);
		}
	}
	
	
	@Override
	public UsuarioResponse guardarConsultanteWS(Consultante consultante, String proceso) {
		//FIXME llamar al método correcto.
		UsuarioResponse usuarioResponse=obtenerMockRENIECWS(consultante, proceso);
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
			Valor reniecSituacion=obtenerEstadoReniec(consultante);
			consultante.setSituacion(reniecSituacion);
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
		UsuarioResponse usuarioResponse=obtenerMockRENIECWS(consultante, Constante.WS_RENIEC.ENTRADA.PROCESO.CONSULTA);
		if(usuarioResponse.getRefUsuarioResponse().getMensaje().
				equals(Constante.WS_RENIEC.SALIDA.MENSAJE.ACTIVAR_USUARIO)){
			return obtenerValorxCodigo(Constante.LISTA.CODIGO.RENIEC_SITUACION, 
					Constante.VALOR.RENIEC_SITUACION.CODIGO.ACTIVO);
		}else if(usuarioResponse.getRefUsuarioResponse().getMensaje().
				equals(Constante.WS_RENIEC.SALIDA.MENSAJE.BAJA_TEMPORAL)){
			return obtenerValorxCodigo(Constante.LISTA.CODIGO.RENIEC_SITUACION, 
					Constante.VALOR.RENIEC_SITUACION.CODIGO.BAJA_TEMPORAL);
		}else if(usuarioResponse.getRefUsuarioResponse().getMensaje().
				equals(Constante.WS_RENIEC.SALIDA.MENSAJE.BAJA_DEFINITIVA)){
			return obtenerValorxCodigo(Constante.LISTA.CODIGO.RENIEC_SITUACION, 
					Constante.VALOR.RENIEC_SITUACION.CODIGO.BAJA_DEFINITIVA);
		}
		return null;
	}
	
	@SuppressWarnings("unused")
	private UsuarioResponse obtenerRENIECWS(Consultante consultante,String proceso) {
		//FIXME probar el funcionamiento del WS consumido
		DateFormat fmt = new SimpleDateFormat("yyyyMMdd");
		ProcesarUsuarioRENIEC procesarUsuarioRENIEC=new ProcesarUsuarioRENIEC();
		RequestHeader refRequestHeader=RequestHeader.Factory.newInstance();
		UsuarioRequest refUsuarioRequest=UsuarioRequest.Factory.newInstance();
		refUsuarioRequest.setEmpresa(null);//Definir Dato Empresa
		refUsuarioRequest.setCodigo(consultante.getCodigoReniec());
		refUsuarioRequest.setNombres(consultante.getNombres());
		refUsuarioRequest.setApellidoPaterno(consultante.getPaterno());
		refUsuarioRequest.setApellidoMaterno(consultante.getMaterno());
		refUsuarioRequest.setFechaNacimiento(fmt.format(consultante.getNacimiento()));
		refUsuarioRequest.setTipo(consultante.getTipoDOI().getCodigo());//Definir Tipo DNI
		refUsuarioRequest.setProceso(proceso);
		
		UsuarioResponse usuarioResponse=null;
		
		try {
			usuarioResponse=procesarUsuarioRENIEC.respuestaTransaccion(refRequestHeader, refUsuarioRequest);
		} catch (Exception e) {
			throw new ValidacionException("Prueba", null, e.getCause());
		}
		
		return usuarioResponse;
	}
	
	private UsuarioResponse obtenerMockRENIECWS(Consultante consultante,String proceso) {
		UsuarioResponse usuarioResponse=UsuarioResponse.Factory.newInstance();
		usuarioResponse.setRefResponseHeader(ResponseHeader.Factory.newInstance());
		usuarioResponse.setRefUsuarioResponse(com.grupobbva.pe.simr.ents.body.mantenimientousuario.UsuarioResponse.Factory.newInstance());
		if(proceso.equals(Constante.WS_RENIEC.ENTRADA.PROCESO.CONSULTA)){
			usuarioResponse.getRefUsuarioResponse().setMensaje(Constante.WS_RENIEC.SALIDA.MENSAJE.ACTIVAR_USUARIO);
		}else{
			
			
			if(new Random().nextBoolean()){				
				usuarioResponse.getRefResponseHeader().setCodigoRespuesta("1111");
				usuarioResponse.getRefResponseHeader().setMensajeRespuesta("ERROR");
			}else{
				usuarioResponse.getRefResponseHeader().setCodigoRespuesta(Constante.WS_RENIEC.SALIDA.ERROR.NINGUN_ERROR);
				usuarioResponse.getRefResponseHeader().setMensajeRespuesta("OK");
			}
		}
		return usuarioResponse;
	}

}
