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
		        aMap.put("0000", "Sin error");
		        aMap.put("7001", "Solicitud enviada vacío o nulo");
		        aMap.put("7002", "Código de empresa nulo");
		        aMap.put("7003", "Código de empresa vacío");
		        aMap.put("7004", "Código de empresa inválido");
		        aMap.put("7005", "Código de usuario nulo");
		        aMap.put("7006", "Código de usuario vacío");
		        aMap.put("7007", "Código de usuario inválido");
		        aMap.put("7008", "Tipo de proceso nulo");
		        aMap.put("7009", "Tipo de proceso vacío");
		        aMap.put("7010", "Caracteres ingresados para el tipo de proceso son inválidos.");
		        aMap.put("7011", "Tipo de proceso no existe");
		        aMap.put("7012", "Nombres ingresados nulos");
		        aMap.put("7013", "Nombres ingresados vacíos");
		        aMap.put("7014", "Primer apellido nulo");
		        aMap.put("7015", "Primer apellido vacío");
		        aMap.put("7016", "Segundo apellido nulo");
		        aMap.put("7017", "Segundo apellido vacío");
		        aMap.put("7018", "Fecha de nacimiento nula");
		        aMap.put("7019", "Fecha de nacimiento vacía");
		        aMap.put("7020", "Caracteres ingresados para la fecha de nacimiento son inválidos");
		        aMap.put("7021", "Tipo de documento nulo");
		        aMap.put("7022", "Tipo de documento vacío");
		        aMap.put("7023", "Caracteres ingresados para el tipo de documento son inválidos");
		        aMap.put("7024", "Tipo de documento no existe");
		        aMap.put("7025", "El usuario no puede ser registrado por el webservice, contactarse con los encargados para su registro.");
		        aMap.put("7026", "Error al registrar al usuario enviado");
		        aMap.put("7027", "Error en la base de datos");
		        aMap.put("7028", "No se puede dar de baja temporal al usuario indicado");
		        aMap.put("7029", "No se puede dar de baja definitiva al usuario indicado");
		        aMap.put("7030", "No se puede reactivar al usuario indicado");
		        aMap.put("7031", "Estado de usuario es indefinido");
		        aMap.put("7032", "No se tiene información del usuario solicitado");
		        aMap.put("7033", "IP no está registrada para el servicio");
		        aMap.put("7034", "IP de consulta está inactivo");
		        aMap.put("7035", "Empresa no está registrada");
		        aMap.put("7036", "Empresa está inactiva para el servicio");
		        aMap.put("7037", "Los nombres ingresados deben tener una longitud menor o igual a 60 caracteres");
		        aMap.put("7038", "El primer apellido ingresado debe tener una longitud menor o igual a 40 caracteres");
		        aMap.put("7039", "El segundo apellido ingresado debe tener una longitud menor o igual a 40 caracteres");
		        aMap.put("7040", "El formato de fecha ingresado es incorrecta, usar YYYYMMDD");
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

