package pe.com.bbva.reniec.utileria;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
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
	
	/**
	 * Ordena las opciones segun el parametro "ordenarAcciones"
	 * </br>
	 * Ej. Tenemos la siguiente lista de opciones:
	 * </br>
	 * <code>
	 * List{
	 *		Opcion[codigo:OPT01, padre:null, tipo:MEN],      
	 *		Opcion[codigo:OPT02, padre:OPT01, tipo:VEN], 
	 *		Opcion[codigo:OPT03, padre:OPT02, tipo:ACC], 
	 *		Opcion[codigo:OPT04, padre:OPT02, tipo:ACC], 
	 *		Opcion[codigo:OPT05, padre:OPT01, tipo:VEN], 
	 *		Opcion[codigo:OPT06, padre:null, tipo:MEN], 
	 *		Opcion[codigo:OPT07, padre:OPT06, tipo:VEN], 
	 *		Opcion[codigo:OPT08, padre:OPT07, tipo:ACC], 
	 *		Opcion[codigo:OPT09, padre:OPT07, tipo:ACC], 
	 *		Opcion[codigo:OPT10, padre:OPT06, tipo:VEN], 
	 *		Opcion[codigo:OPT11, padre:OPT10, tipo:ACC], 
	 *		Opcion[codigo:OPT12, padre:OPT10, tipo:ACC]
	 *	}
	 *</code>
	 *<h1>Caso ordenarAcciones encendido</h1>
	 *<code>ordenarAcciones == true</code></br>
	 *<code>
	 *Map{
	 *		KEY_PADRE=[
	 *			Opcion[codigo:OPT01, padre:null, tipo:MEN], 
	 *			Opcion[codigo:OPT06, padre:null, tipo:MEN]
	 *		], 
	 *		OPT01=[
	 *			Opcion[codigo:OPT02, padre:OPT01, tipo:VEN, acciones:List[size=2]{}[
	 *				Opcion[codigo:OPT03, padre:OPT02, tipo:ACC], 
	 *				Opcion[codigo:OPT04, padre:OPT02, tipo:ACC]
	 *			]], 
	 *			Opcion[codigo:OPT05, padre:OPT01, tipo:VEN, acciones:List[size=0]{}]
	 *		], 
	 *		OPT06=[
	 *			Opcion[codigo:OPT07, padre:OPT06, tipo:VEN, acciones:List[size=2]{
	 *				Opcion[codigo:OPT08, padre:OPT07, tipo:ACC], 
	 *				Opcion[codigo:OPT09, padre:OPT07, tipo:ACC]
	 *			}], 
	 *			Opcion[codigo:OPT10, padre:OPT06, tipo:VEN, acciones:List[size=2]{
	 *				Opcion[codigo:OPT11, padre:OPT10, tipo:ACC], 
	 *				Opcion[codigo:OPT12, padre:OPT10, tipo:ACC]
	 *			}]
	 *		]
	 *	}
	 *</code></br>
	 * <h1>Caso ordenarAcciones apagado</h1>
	 *<code>ordenarAcciones == false</code></br>
	 *<code>
	 *Map{
	 *		KEY_PADRE=[
	 *			Opcion[codigo:OPT01, padre:null, tipo:MEN], 
	 *			Opcion[codigo:OPT06, padre:null, tipo:MEN]
	 *		], 
	 *		OPT01=[
	 *			Opcion[codigo:OPT02, padre:OPT01, tipo:VEN], 
	 *			Opcion[codigo:OPT05, padre:OPT01, tipo:VEN]
	 *		], 
	 *		OPT02=[
	 *			Opcion[codigo:OPT03, padre:OPT02, tipo:ACC], 
	 *			Opcion[codigo:OPT04, padre:OPT02, tipo:ACC]
	 *		], 
	 *		OPT06=[
	 *			Opcion[codigo:OPT07, padre:OPT06, tipo:VEN], 
	 *			Opcion[codigo:OPT10, padre:OPT06, tipo:VEN]
	 *		], 
	 *		OPT07=[
	 *			Opcion[codigo:OPT08, padre:OPT07, tipo:ACC], 
	 *			Opcion[codigo:OPT09, padre:OPT07, tipo:ACC]
	 *		], 
	 *		OPT10=[
	 *			Opcion[codigo:OPT11, padre:OPT10, tipo:ACC], 
	 *			Opcion[codigo:OPT12, padre:OPT10, tipo:ACC]
	 *		]
	 *	}
	 *</code>
	 * 
	 * @param opciones = Maestro de opciones a ordenar
	 * @param ordenarAcciones = flag para determinar que tipo de orden hacer (separa las acciones o no)
	 * @return Lista de opciones ordenadas
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static Map<String, List<Opcion>> ordenarOpciones(final List<Opcion> opciones, final boolean ordenarAcciones)
	{
		Map<String, List<Opcion>> map = new HashMap<String, List<Opcion>>();
		Map<String,Opcion> map2 = new HashMap<String, Opcion>();
		List<Opcion> list;
		List<Opcion> list2;
		Map<String,List<Opcion>> map3 = new HashMap<String, List<Opcion>>();
		String codigoPadre;
		for (Opcion opcion : opciones) {
			
			if(ordenarAcciones){			
				if(Constante.VALOR.CODIGO.SUBMENU.equals(opcion.getTipo().getCodigo()))
				{
					//opcion.setAcciones(new ArrayList<Opcion>());
					map2.put(opcion.getCodigo(), opcion);
				}
				
				if(Constante.VALOR.CODIGO.ACCION.equals(opcion.getTipo().getCodigo()))
				{
					String codigoPadreSubMenu = obtenerCodigoSubMenuSuperior(opcion);
					if(map3.containsKey(codigoPadreSubMenu))
					{
						list2 = map3.get(codigoPadreSubMenu);
					}
					else
					{
						list2 = new ArrayList<Opcion>();
						map3.put(codigoPadreSubMenu, list2);
					}					
					
					list2.add(opcion);
					continue;
				}
			}
			
			if(opcion.getPadre() == null)
			{
				codigoPadre = Constante.OPCION.KEY_PADRE;
			}
			else
			{
				codigoPadre = opcion.getPadre().getCodigo();
			}
			
			if(map.containsKey(codigoPadre))
			{
				list = map.get(codigoPadre);
			}
			else
			{
				list = new ArrayList<Opcion>();
				map.put(codigoPadre, list);
			}
			
			list.add(opcion);
		}
		
		if(ordenarAcciones){			
			Iterator iterator = map3.entrySet().iterator();
			while (iterator.hasNext()) {
				Map.Entry mapEntry = (Map.Entry) iterator.next();
				for (Opcion opcion : (List<Opcion>)mapEntry.getValue()) {
					/*if( map2.containsKey(mapEntry.getKey()) &&  map2.get(mapEntry.getKey()).getAcciones() != null)
					{
						map2.get(mapEntry.getKey()).getAcciones().add(opcion);
					}*/
					
				}
			}
		}
		
		return map;
	}
	
	private static String obtenerCodigoSubMenuSuperior(Opcion opcion) {
		if(opcion.getPadre() == null)
		{
			return null;
		}
		else if(Constante.VALOR.CODIGO.ACCION.equals(opcion.getTipo().getCodigo()) && 
				Constante.VALOR.CODIGO.SUBMENU.equals(opcion.getPadre().getTipo().getCodigo()))
		{
			return opcion.getPadre().getCodigo();
		}
		return obtenerCodigoSubMenuSuperior(opcion.getPadre());
	}

	/**
	 * Similar a ordenarOpciones(opciones, ordenarAcciones) pero ordenarAcciones = false.
	 * @param opciones = Maestro de opciones a ordenar
	 * @return Lista de opciones ordenadas sin diferenciar las acciones
	 */
	public static Map<String, List<Opcion>> ordenarOpciones(final List<Opcion> opciones)
	{
		return ordenarOpciones(opciones, false);
	}
	

}
