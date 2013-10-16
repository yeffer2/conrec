package pe.com.bbva.reniec.utileria.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Anotaci�n para definir el comportamiento de las propiedades dentro de un
 * modelo.
 * 
 * @author CDA Inform�tica
 * @since 15/04/2013
 * 
 */
@Target(value = { ElementType.FIELD, ElementType.METHOD })
@Retention(value = RetentionPolicy.RUNTIME)
public @interface DefinicionVista {

	/***
	 * Define el nombre del header que se mostrar� en la columna. Si es omitida,
	 * la columna no se mostrar�. 
	 * ElementType.FIELD
	 * 
	 * @return Devuelve el valor insertado en el atributo.
	 */
	String nombreVista() default "";

	/***
	 * Cuando el elemento es resultado de una relaci�n y se requiere alguna
	 * descripci�n tipo catalogo de la tabla relacionada se utiliza este
	 * atributo para nombrar el tipo final que tendr� la columna, este deber�
	 * ser el mismo que el tipo de la descripci�n o dato a mostrar del objeto
	 * relacionado.
	 * Opcional.
	 * ElementType.FIELD
	 * 
	 * @return Devuelve el nombre de qualified name dado a una columna de
	 *         relaci�n.
	 */
	String tipoFinal() default "";

	/***
	 * Cuando el tipo de dato es objeto relacionado, se especifica con este
	 * atributo el nombre de la propiedad interna del objeto a obtener para
	 * mostrar en la tabla. 
	 * Opcional 
	 * ElementType.METHOD
	 * 
	 * @return El nombre del elemento que se obtendr� de el objeto relacionado.
	 */
	String nombrePropiedadRelacion() default "";
	
	/***
	 * Etiqueta un m�todo get para su transformaci�n a string con un formato especifico 
 	 * Opcional 
	 * ElementType.METHOD
	 * 
	 * @return Formato de transformaci�n a String.
	 */
	String convertToStringWithFormat() default "";

}
