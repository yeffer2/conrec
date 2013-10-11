package pe.com.bbva.reniec.utileria;


public abstract class Constante 
{
	
	public static abstract class SCHEMA
	{
		public static final String CONREC = "CONREC";
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
				
		}
	}
	
	public static abstract class VALOR
	{
		public static abstract class CODIGO
		{
			//Ejemplo public final static String ACTIVO = "A";
			public final static String MENU = "MEN";
			public final static String SUBMENU = "VEN";
			public final static String ACCION = "ACC";
		}
		
	}
	
	public static abstract class PARAMETRO
	{
		//Ejemplo public final static String ESTADO_LOV = "LOV_ESTADO";
	}
	
	public static abstract class CODIGO_MENSAJE
	{
		//Ejemplo public final static String ERROR_GENERICO = "error.generico";
		
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
	
}

