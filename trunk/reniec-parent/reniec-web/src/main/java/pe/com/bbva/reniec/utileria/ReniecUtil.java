package pe.com.bbva.reniec.utileria;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.vaadin.ui.Window;

import pe.com.bbva.reniec.dominio.Opcion;
import pe.com.bbva.reniec.dominio.Usuario;
import pe.com.bbva.reniec.exception.ValidacionException;

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
	
	public static void validar (Window window, Object object){
		ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Field[] allFields = object.getClass().getDeclaredFields();
	    for (Field field : allFields) {
	        if (Modifier.isPrivate(field.getModifiers())) {
	            Set<ConstraintViolation<Object>> constraintViolations = validator.validateProperty(object, field.getName());
	            for (ConstraintViolation<Object> constraintViolation : constraintViolations) {
	            	throw new ValidacionException(constraintViolation.getMessage(),
	            			new Object[]{constraintViolation.getPropertyPath()});
	    		}
	        }
	    }
	}
	
	public static void validar (Window window, Object object, BeanValidar[] listValidar){
		ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
	    for (BeanValidar validar : listValidar) {
            Set<ConstraintViolation<Object>> constraintViolations = validator.validateProperty(object, validar.getPropiedad());
            for (ConstraintViolation<Object> constraintViolation : constraintViolations) {
            	if(validar.getObjecto()!=null){
            		validar.getObjecto().focus();
            	}
            	throw new ValidacionException(constraintViolation.getMessage(),validar.getArgs());
    		}
	    }
	}
	
}
