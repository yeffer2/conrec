package pe.com.bbva.reniec.utileria.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Anotación para definir el comportamiento de las propiedades dentro de un
 * modelo.
 * 
 * @author CDA Informática
 * @since 15/04/2013
 * 
 */
@Target(value = { ElementType.FIELD, ElementType.METHOD })
@Retention(value = RetentionPolicy.RUNTIME)
public @interface DefinicionVista {

	/***
	 * Define el nombre del header que se mostrará en la columna. Si es omitida,
	 * la columna no se mostrará. 
	 * ElementType.FIELD
	 * 
	 * @return Devuelve el valor insertado en el atributo.
	 */
	String nombreVista() default "";

	/***
	 * Cuando el elemento es resultado de una relación y se requiere alguna
	 * descripción tipo catalogo de la tabla relacionada se utiliza este
	 * atributo para nombrar el tipo final que tendrá la columna, este deberá
	 * ser el mismo que el tipo de la descripción o dato a mostrar del objeto
	 * relacionado.
	 * Opcional.
	 * ElementType.FIELD
	 * 
	 * @return Devuelve el nombre de qualified name dado a una columna de
	 *         relación.
	 */
	String tipoFinal() default "";

	/***
	 * Cuando el tipo de dato es objeto relacionado, se especifica con este
	 * atributo el nombre de la propiedad interna del objeto a obtener para
	 * mostrar en la tabla. 
	 * Opcional 
	 * ElementType.METHOD
	 * 
	 * @return El nombre del elemento que se obtendrá de el objeto relacionado.
	 */
	String nombrePropiedadRelacion() default "";
	
	/***
	 * Etiqueta un método get para su transformación a string con un formato especifico 
 	 * Opcional 
	 * ElementType.METHOD
	 * 
	 * @return Formato de transformación a String.
	 */
	String convertToStringWithFormat() default "";

}
