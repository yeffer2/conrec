package pe.com.bbva.reniec.utileria;

public abstract class Constante 
{
	
	public static abstract class SCHEMA
	{
		public static final String RENIEC = "RENIEC";
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
				
		}
	}
	
	public static abstract class VALOR
	{
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
		//Ejemplo public final static String ESTADO_LOV = "LOV_ESTADO";
	}
	
	public static abstract class CODIGO_MENSAJE
	{
		public final static String ERROR_GENERICO = "error.generico";
		public final static String VALIDAR_TEXTBOX = "validar.textbox";
		public final static String VALIDAR_COMBOBOX = "validar.combobox";
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
			public static abstract class MENSAJE
			{
				public static final String ACTIVAR_USUARIO = "ACTIVO";
				public static final String BAJA_TEMPORAL = "BAJA TEMPORAL";
				public static final String BAJA_DEFINITIVA = "BAJA DEFINITIVA";
			}
		}
	}
	
}

