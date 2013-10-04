package pe.com.bbva.reniec.utileria;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import pe.com.bbva.reniec.dominio.Opcion;
import pe.com.bbva.reniec.dominio.Usuario;

public abstract class ReniecUtil {

	public static Usuario obtenerUsuarioSesion()
	{
		Usuario usuario = null;
		if(RequestContextHolder.getRequestAttributes()!=null){
			ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder
					.currentRequestAttributes();
			HttpServletRequest request = requestAttributes.getRequest();
			HttpSession session = request.getSession(false);
			if(session != null)
			{
				usuario = (Usuario) session.getAttribute(Constante.SESION.USUARIO);
			}	
		}
		return usuario;
	}
	
	public static Map<String, List<Opcion>> ordenarOpciones(final List<Opcion> opciones)
	{
		String padre;
		Map<String, List<Opcion>> map=new HashMap<String, List<Opcion>>();
		for (Opcion opcion : opciones) {
			padre=opcion.getPadre()==null?Constante.OPCION.KEY_PADRE:opcion.getPadre().getCodigo();
			if(map.get(padre)==null){
				List<Opcion> list=new ArrayList<Opcion>();
				list.add(opcion);
				map.put(padre, list);
			}else{
				List<Opcion> list=map.get(padre);
				list.add(opcion);
				map.put(padre, list);
			}
		}
		
		return map;
	}
	

}
