package pe.com.bbva.reniec.negocio.impl;

import java.util.List;

import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.bbva.reniec.dominio.Consultante;
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
				filtro.add(Restrictions.ilike("e.nombre", consultante.getNacionalidad().getNombre(), MatchMode.ANYWHERE));
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
		}
		filtro.addOrder(Order.asc("id"));
		return consultanteDAO.buscar(filtro);
		//return consultanteDAO.buscarHql("select c from Consultante c");
	}

	@Override
	public void guardarConsultante(Consultante consultante) {
		if(consultante.getId()==null){
			consultanteDAO.crear(consultante);
		}else{
			consultanteDAO.actualizar(consultante);
		}
	}

}
