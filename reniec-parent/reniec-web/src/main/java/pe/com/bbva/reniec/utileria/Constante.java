package pe.com.bbva.reniec.utileria;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public abstract class Constante 
{
	
	public static abstract class SCHEMA
	{
		public static final String RENIEC = "RENIEC";
		public static final String IIWX = "IIWX";
	}
	
	public static abstract class DESARROLLO
	{
		public static final String MODO = "0";
	}
	
	public static abstract class LISTA
	{
		public static abstract class CODIGO
		{
			public final static String REGISTRO_ESTADO = "REGISTRO_ESTADO";
			public final static String MEMBRESIA_TIPO = "MEMBRESIA_TIPO";
			public final static String OPCION_TIPO = "OPCION_TIPO";
			public final static String ORIGEN = "ORIGEN";
			public final static String DOI_TIPO = "DOI_TIPO";
			public final static String NACIONALIDAD_TIPO = "NACIONALIDAD_TIPO";
			public final static String ACCION = "ACCION";
			public final static String USUARIO_ESTADO = "USUARIO_ESTADO";
			public final static String RENIEC_SITUACION = "RENIEC_SITUACION";
			public final static String CARGA_TIPO = "CARGA_TIPO";
			public final static String RUTAS_ARCHIVOS = "RUTAS_ARCHIVOS";
				
		}
	}
	
	public static abstract class VALOR
	{
		public static abstract class REGISTRO_ESTADO
		{
			public static abstract class CODIGO
			{
				public final static String ACTIVO = "A";
				public final static String INACTIVO = "I";
			}
		}
		
		public static abstract class CARGA_TIPO
		{
			public static abstract class CODIGO
			{
				public final static String AUTOMATICA = "CARGA_AUTO";
				public final static String MANUAL = "CARGA_MANUAL";
			}
		}
		
		public static abstract class NACIONALIDAD_TIPO
		{
			public static abstract class CODIGO
			{
				public final static String PERUANA = "P";
				public final static String EXTRANJERO = "E";
			}
		}
		
		
		public static abstract class ACCION
		{
			public static abstract class CODIGO
			{
				public final static String ACTIVACION = "AC";
				public final static String BAJA_TEMPORAL = "BT";
				public final static String BAJA_DEFINITIVA = "BD";
				public final static String REACTIVACION = "RA";
			}
		}
		
		public static abstract class ORIGEN
		{
			public static abstract class CODIGO
			{
				public final static String LDAP = "LDAP2";				
			}
		}
		
		public static abstract class OPCION_TIPO
		{
			public static abstract class CODIGO
			{
				public final static String MENU = "MEN";
				public final static String SUBMENU = "VEN";
				public final static String ACCION = "ACC";
			}
		}
		public static abstract class USUARIO_ESTADO
		{
			public static abstract class CODIGO
			{
				public final static String ACTIVO = "ACTIVO";
				public final static String BAJA_TEMPORAL = "BAJA_TEMPORAL";
				public final static String BAJA_DEFINITIVA = "BAJA_DEFINITIVA";
				public final static String ERROR_RENIEC = "ERROR_RENIEC";
			}
		}
		public static abstract class RENIEC_SITUACION
		{
			public static abstract class CODIGO
			{
				public final static String ACTIVO = "ACTIVO";
				public final static String BAJA_TEMPORAL = "BAJA_TEMPORAL";
				public final static String BAJA_DEFINITIVA = "BAJA_DEFINITIVA";
				public final static String ERROR_RENIEC = "ERROR_RENIEC";
			}
		}
		public static abstract class DOI_TIPO
		{
			public static abstract class CODIGO
			{
				public static final String CUSPP = "A";
				public static final String DIPLOMATICO = "D";
				public static final String EXTRANJERIA = "E";
				public static final String AFPHO = "F";
				public static final String MENOR_EDAD = "J";
				public static final String DNI = "L";
				public static final String DOC_EXTRANJERO = "X";
				public static final String RUC_ANTIGUO = "N";
				public static final String MILITAR = "M";
				public static final String RUC = "R";
				public static final String SIN_DOCUMENTO = "S";
				public static final String FUERZAS_PO = "T";
				public static final String RUS = "U";
				public static final String PASAPORTE = "P";
			}
			
			public static enum LONGITUD
			{
				A(11),
				D(11),
				E(11),
				F(11),
				J(11),
				L(8),
				X(11),
				N(8),
				M(11),
				R(11),
				S(11),
				T(11),
				U(11),
				P(9);
				
				private int valor;

				LONGITUD(int valor) {
					this.valor = valor;
				}

				public int getValor() {
					return valor;
				}
				
			}
		}
		
	}
	
	public static abstract class PARAMETRO
	{
		public final static String ESTADO_LOV = "LOV_ESTADO";
		public final static String WS_URL = "WS_URL";
		public final static String EMPRESA_CODIGO = "EMPRESA_CODIGO";
		public final static String WS_TIMEOUT = "WS_TIMEOUT";
		public final static String CANAL = "CANAL";
		public final static String COD_APP = "COD_APP";
		public final static String COD_INT = "COD_INT";
		public final static String ID_EMPRESA = "ID_EMPRESA";
		public final static String URL_LOGOUT = "URL_LOGOUT";
		
	}
	
	public static abstract class CODIGO_MENSAJE
	{
		public final static String ERROR_GENERICO = "error.generico";
		public final static String VALIDAR_TEXTBOX = "validar.textbox";
		public final static String VALIDAR_COMBOBOX = "validar.combobox";
		public final static String WS_ERROR = "ws.error";
		public final static String VALIDAR_EXISTE_VALOR = "validar.existe.valor";
		public final static String VALIDAR_DEPENDENCIA_OPCION = "validar.dependencia.opcion";
	}
	
	public static abstract class SESION
	{
		public final static String USUARIO = "SESION_USUARIO";
	}
	
	public static abstract class OPCION
	{
		public final static String KEY_PADRE = "padre";
		public final static String USUARIO = "USUARIO";
		public final static String CERRAR_SESION = "CERRAR_SESION";
		public final static String CON = "CON";
		public final static String CON_CONS = "CON_CONS";
		public final static String CON_CARG_MAS = "CON_CARG_MAS";
		public final static String CONF = "CONF";
		public final static String CONF_PARAM = "CONF_PARAM";
		public final static String CONF_LISTAS = "CONF_LISTAS";
		public final static String CONF_JOB = "CONF_JOB";
		public final static String CONF_DIAG = "CONF_DIAG";
		public final static String CONF_FICHER = "CONF_FICHER";
		public final static String SEG = "SEG";
		public final static String SEG_ROL_MEMB = "SEG_ROL_MEMB";
		public final static String SEG_OPCION = "SEG_OPCION";
		public final static String SEG_PERM = "SEG_PERM";
		
	}
	
	public static abstract class ROL
	{
		//Ejemplo public static final String  ADMINISTRADOR = "ADM";
		
	}
	
	public static abstract class WS_RENIEC
	{
		public static abstract class ENTRADA
		{
			
			public static abstract class PROCESO
			{
				public static final String ACTIVAR_USUARIO = "AC";
				public static final String BAJA_TEMPORAL = "BT";
				public static final String BAJA_DEFINITIVA = "BD";
				public static final String REACTIVAR_USUARIO = "RA";
				public static final String CONSULTA = "CO";
			}
		}
		public static abstract class SALIDA
		{
			public static abstract class ERROR
			{
				public static final String NINGUN_ERROR = "0000";
			}
			public static Map<String, String> CODIGO_ERROR=new HashMap<String, String>();
			static {
		        Map<String, String> aMap = new HashMap<String, String>();
		        aMap.put("5002", "Versión inválida");
		        aMap.put("5003", "Longitud de cabecera inválida");
		        aMap.put("5004", "Caracteres de verificación incorrectos");
		        aMap.put("5008", "Servidor no válido");
		        aMap.put("5009", "Tipo de consulta inválido");
		        aMap.put("5010", "Tipo de consulta no permitida");
		        aMap.put("5011", "No se ha ingresado subtipo de consulta");
		        aMap.put("5020", "No existe la empresa ingresada para usar el servicio");
		        aMap.put("5021", "La empresa registrada no está habilitada para usar el servicio");
		        aMap.put("5030", "El usuario final de consulta ingresado no es válido");
		        aMap.put("5031", "No se tiene información solicitada del usuario ingresado");
		        aMap.put("5032", "El DNI no puede realizar consultas por encontrarse cancelado en el RUIPN");
		        aMap.put("5033", "El DNI no puede realizar consultas por encontrarse restringido en el RUIPN");
		        aMap.put("5034", "El DNI no puede realizar consultas por encontrarse observado en el RUIPN");
		        aMap.put("5036", "El DNI se encuentra con baja temporal en el servicio");
		        aMap.put("5037", "El DNI se encuentra con baja definitiva en el servicio");
		        aMap.put("5100", "Longitud de trama de consulta inválida");
		        aMap.put("5101", "Error en número de coincidencias solicitadas o inicio de grupo");
		        aMap.put("5102", "Coincidencias superan el límite establecido");
		        aMap.put("5103", "Error en base de datos");
		        aMap.put("5104", "No se encontró información de la estructura solicitada");
		        aMap.put("5105", "No se encontró los campos a mostrar para la estructura solicitada");
		        aMap.put("5108", "Carácter ingresado en apellido paterno es inválido");
		        aMap.put("5109", "Carácter ingresado en apellido materno es inválido");
		        aMap.put("5110", "Carácter ingresado en nombres es inválido");
		        aMap.put("5111", "El DNI solicitado se encuentra cancelado en el archivo magnético del RUIPN");
		        aMap.put("5112", "El DNI solicitado se encuentra restringido en el archivo magnético del RUIPN");
		        aMap.put("5113", "El DNI solicitado se encuentra observado en el archivo magnético del RUIPN");
		        aMap.put("5114", "El DNI ingresado no es válido");
		        aMap.put("5200", "No existen los datos solicitados");
		        CODIGO_ERROR = Collections.unmodifiableMap(aMap);
		    }			 
			
			public static abstract class MENSAJE
			{
				public static final String ACTIVAR_USUARIO = "ACTIVO";
				public static final String BAJA_TEMPORAL = "BAJA TEMPORAL";
				public static final String BAJA_DEFINITIVA = "BAJA DEFINITIVA";
			}
			public static abstract class OKDNI
			{
				public static final String OK = "OK";
				public static final String ERROR = "ERROR";
			}
			public static abstract class OKNOMBRES
			{
				public static final String OK = "OK";
				public static final String ERROR = "ERROR";
			}
			public static abstract class OKAPPRIMER
			{
				public static final String OK = "OK";
				public static final String ERROR = "ERROR";
			}
			public static abstract class OKAPSEGUNDO
			{
				public static final String OK = "OK";
				public static final String ERROR = "ERROR";
			}
			public static abstract class OKFECNACE
			{
				public static final String OK = "OK";
				public static final String ERROR = "ERROR";
			}
		}
	}
	
}

