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
		public static final String CORREO = "correo.prueba.182@gmail.com";
		public static final String CORREO_CLAVE = "C4ndy.uh";
		public static String VARIABLE_APLICACION = "Prueba01";
	}
	
	public static abstract class LISTA
	{
		public static abstract class CODIGO
		{
			public final static String ESTADO = "REGISTRO_ESTADO";
			public final static String TIPO_OPCION = "OPCION_TIPO";
			public final static String MEMBRESIA_TIPO = "MEMBRESIA_TIPO";
			public final static String DOI_TIPO = "DOI_TIPO";
			public final static String TELEFONO_TIPO = "TELEFONO_TIPO";
			public final static String INTERPOS_CANAL = "INTERPOS_CANAL";
			public final static String ADJUNTO_TIPO = "ADJUNTO_TIPO";
			public final static String PRODUCTO_TIPO = "PRODUCTO_TIPO";
			public final static String PERSONA_ORIGEN = "PERSONA_ORIGEN";
			public final static String TIPO_REGLA = "REGLA_CATEGORIA";
			public final static String ASIGNACION_TIPO = "ASIGNACION_TIPO";
			public final static String TAREA_AMBITO = "TAREA_AMBITO";
			public final static String EVENTO = "EVENTO";
			public final static String EVENTO_TIPO = "EVENTO_TIPO";
			public final static String DICTAMEN = "DICTAMEN";
			public final static String FUNDAMENTO = "FUNDAMENTO";
			public final static String CLASE_DICTAMEN = "CLASE_DICTAMEN";
			public final static String OPERACION_FUENTE = "OPER_FUENTE";
			public final static String OPERACION_TIPO = "OPER_TIPO";
			public final static String MONEDA_TIPO = "MONEDA";
			public final static String DOCUMENTO_TIPO = "DOCUMENTO_TIPO";
			public final static String DOCUMENTO_ESTADO = "DOCUMENTO_ESTADO";
			public final static String TRIMESTRE = "TRIMESTRE";
			public final static String RUTAS_ARCHIVOS = "RUTAS_ARCHIVOS";
			public final static String ABONO_MODO = "ABONO_MODO";
			public final static String MOVIMIENTO_TIPO = "MOVIMIENTO_TIPO";
			public final static String TCAMBIO_TIPO = "TCAMBIO_TIPO";
			public final static String CARGO_TIPO = "CARGO_TIPO";
			public final static String DES_MOVIMIENTO = "DEVOLUC_DESTINO";
			public final static String RESPUESTA_CANAL = "RESPUESTA_CANAL";
			public final static String TIPO_COMENTARIO = "COMENTARIO_TIPO";
			public final static String MOTIVO_DESISTIR = "DESISTIR_MOTIVO";
			public final static String MOTIVO_RETORNO = "RETORNO_MOTIVO";
			public final static String DEVOLUC_CUENTA = "DEVOLUC_CUENTA";
			public final static String QH_CODIGO = "QH_CODIGO";
			public final static String DEVOLUCION_DESTINO = "DEVOLUC_DESTINO";
			public final static String CONSULTA_TIPO = "CONSULTA_TIPO";
			public final static String ESTADO_CONSULTA = "ESTADO_CONSULTA";
			public final static String MOD_ENVIO = "MOD_ENVIO";
			public final static String ENT_EXTERNAS = "ENT_EXTERNAS";
			public final static String ENT_EXT_CONTACT = "ENT_EXT_CONTACT";
			public final static String PLANTILLA_CORREO = "PLANT_MAIL_RPTA";
			public final static String FIRMA_ENV_RPTA = "FIRMA_ENV_RPTA";
			public final static String RANGO_REQ_VENCIDOS = "RNG_RPT_VENC";			
		}
	}
	
	public static abstract class VALOR
	{
		public static abstract class CODIGO
		{
			public final static String ACTIVO = "A";
			public final static String INACTIVO = "I";
			
			public final static String MENU = "MEN";
			public final static String SUBMENU = "VEN";
			public final static String ACCION = "ACC";
			
			public final static String REGLA_TRANSICION = "TRAN";
			public final static String REGLA_DERIVACION = "DERI";
			
			public final static String REGISTRO = "REG";
			public final static String CARGO = "CARG";
			
			public final static String DNI = "L";
			
			public final static String TELEFONO_CASA = "H";
			
			public final static String MIS_TAREAS = "INDI";
			public final static String TAREAS_EQUIPO_SUBORDINADOS = "GRUP";
			public final static String TODAS_TAREAS = "TODO";
			
			public final static String EVENTO_TIPO_TRANSICION = "TRANS";
			public final static String EVENTO_TIPO_DERIVACION = "DERIV";
			public final static String EVENTO_TIPO_SEGUIMIENTO = "NOTIF";
			public final static String EVENTO_TIPO_TRAZA = "TRAZA";
			public final static String EVENTO_TIPO_ASIG = "ASIG";
			public final static String EVENTO_DOCUMENTO_EMITIDO = "CONS_DEM";
			public final static String EVENTO_DOCUMENTO_CONSOLIDADO = "CONS_DCON";
			public final static String EVENTO_CAMBIO_ESTADO = "CMB_EST";
			public final static String EVENTO_DERIVACION_EQUIPO = "DER_EQP";
			public final static String EVENTO_ASIGNACION_INTEGRANTE = "ASIG_INT";
			public final static String EVENTO_ASIGNACION_TIEMPO = "ASIG_TIME";
			public final static String EVENTO_CARGAR_FORMULARIO = "ING_VEN";
			public final static String EVENTO_ENVIO_CORREO = "ENV_MAIL";
			public final static String EVENTO_GRABO_REGISTRAR = "ING_VEN";
			public final static String EVENTO_INICIO_COMPLETAR = "ING_VEN";
			public final static String EVENTO_GRABO_COMPLETAR = "ING_VEN";
			public final static String EVENTO_INICIO_MODIFICAR = "ING_VEN";
			public final static String EVENTO_GRABO_MODIFICAR = "MODIF_REQ";
			public final static String EVENTO_INICIO_ANALIZAR = "ING_VEN";
			public final static String EVENTO_GRABO_ANALIZAR = "ING_VEN";
			public final static String EVENTO_INICIO_ENVIAR_RPTA = "ING_VEN";
			public final static String EVENTO_REASIGNAR = "ING_VEN";
			public final static String EVENTO_DESISTIR = "ING_VEN";
			public final static String EVENTO_RETORNAR = "ING_VEN";
			public final static String EVENTO_AUT_DEV = "ING_VEN";
			
			public final static String EVENTO_ASIG_TIEMPO = "ASIG_TIME";
			public final static String EVENTO_ASIG_INTEGRANTE = "ASIG_INT";
			public final static String EVENTO_ENVIO_MAIL = "ENV_MAIL";
			public final static String EVENTO_ENVIO_SMS = "ENV_SMS";
			public final static String EVENTO_REQ_DESBLOQUEADO = "REQ_DESB";
			
			public final static String OPER_FUENTE_ESTADO_CUENTA = "XEDC";
			public final static String OPER_FUENTE_CUENTA = "XCON";
			public static final String ORIGEN_HAREC = "HAREC";
			public static final String ORIGEN_HOST = "HOST";
			public static final String ORIGEN_RENIEC = "RENIEC";
			

			public final static String DESTINO_DEVOL_TARJETA_CREDITO = "TC";
			public final static String DESTINO_DEVOL_CUENTA_AHORRO = "CA";
			public final static String DESTINO_DEVOL_CUENTA_CORRIENTE = "CC";
			public final static String DESTINO_DEVOL_ACREEDORA_OF = "AOF";
			
			public final static String TIPO_CARGO_INTERNO = "CI";
			public final static String TIPO_CARGO_EXTERNO = "CE";
			
			public final static String TRIMESTRE1 = "TRIM1";
			public final static String TRIMESTRE2 = "TRIM2";
			public final static String TRIMESTRE3 = "TRIM3";
			public final static String TRIMESTRE4 = "TRIM4";
			
			public final static String TIPO_CAMBIO_AVANCE = "TCA";
			public static final String BALANCEO = "BAL";
			public static final String RUS = "U";
			public static final String RUC = "R";
			public static final String CARNE_EXTRANJERIA = "E";
			public static final String PASAPORTE = "P";
			
			public final static String DOCUMENTO_TIPO_CARRPTA = "CARRPTA";
			public final static String DOCUMENTO_TIPO_CARTRAN = "CARTRAN";
			public final static String DOCUMENTO_TIPO_CARAMP = "CARAMP";
			public final static String DOCUMENTO_TIPO_CARDES = "CARDES";
			public final static String DOCUMENTO_TIPO_CARCONT = "CARCONT";
			
			public final static String DOCUMENTO_ESTADO_PENDIENTE = "PEN";
			public final static String DOCUMENTO_ESTADO_CONSOLIDAR = "CON";
			public final static String DOCUMENTO_ESTADO_POR_ENTREGAR = "PET";
			public final static String DOCUMENTO_ESTADO_ENTREGADO = "ENT";
			public final static String DOCUMENTO_ESTADO_MOTIVADO = "MOT";
	
			public final static String TIPO_REGLA_TIEMPOS = "TIEM";
			
			public final static String COMENTARIO_OT = "OT";
			public final static String COMENTARIO_DC = "DC";
			public static final String CNL_RPTA_CORRE = "EMA";
			public static final String CNL_RPTA_CARTA = "CAR";
			public static final String CNL_RPTA_PDT = "PDT"; 
			public static final String CNL_INTERNA = "CON_INT";
			public static final String CNL_EXTERNA = "CON_EXT";
			
			public static final String CNL_ESC = "ESC";
			public static final String CNL_ATE = "ATE";
			public static final String CNL_CER = "CER";
			public static final Object CNL_SCP = "SCP";
			
			public static final String MOVIMIENTO_TIPO_ABONO = "A";
			public static final Object MOVIMIENTO_TIPO_CARGO = "C";
			
			public static final String ASIG_TIPO_MANUAL = "MAN";
			public static final String ASIG_TIPO_BALANCEO = "BAL";
			
			public static final String CLASIF_DICTAMEN_DEFINITIVO = "DEFI";
			public static final String CLASIF_DICTAMEN_TRANSITORIO = "TRAN";
			
			public static final String MODO_ENVIO_CORREO = "MENV_001";
			public static final String MODO_ENVIO_FISICO = "MENV_002";
			
			public static final String MONEDA_PEN = "PEN";
			public static final String MONEDA_USD = "USD";
			
		}
		
	}
	
	public static abstract class PARAMETRO
	{
		public final static String ESTADO_LOV = "LOV_ESTADO";
		public final static String HOSTNAME_SERV = "CORREO_SERVIDOR";
		public final static String PUERTO_SERV = "CORREO_PUERTO";
		public final static String ENV_CORREO = "CORREO_BUZON";
		public final static String PLANTILLAS_PATH = "PLANTILLAS_PATH";
		public final static String ADJUNTOS_PATH = "ADJUNTOS_PATH";
		public static final String SEGMENTO_DEFECTO = "GRP_NOCLIENTE";
		public final static String DIAS_REITERATIVO = "DIA_REIT";
		public static final String DEFECTO_SEGMENTO_NO_CLASIFICADO = "GRP_NOCLASIF";
		public static final String DEFECTO_SEGMENTO_NO_CLIENTE = "GRP_NOCLIENTE";
		public static final String WSDL_PEA = "WS_PERSONA_URL";
		public static final String WSDL_SMS = "WS_SMS_URL";
		public final static String ENVHOJAREC = "ENVHOJAREG";
		public final static String ENVCONSTREG = "ENVCONSTREG";
		public final static String ENVHOJACOMP = "ENVHOJACOMP";
		public final static String ENVCONSCOMP = "ENVCONSCOMP";
		public static final String WSDL_RENIEC = "WS_RENIEC_URL";
		public static final String OFICINA_RENIEC = "RENIEC_OFICINA";
		public static final String REGISTRO_RENIEC = "RENIEC_REGISTRO";
		public static final String CORREO_REMITE = "CORREO_REMITE";
		public static final String MSG_ACCPROVHR = "MSG_ACCPROVHR";
		public static final String MSG_ACCPROVCON = "MSG_ACCPROVCON";
		public static final String INF_QUEJ = "INF_QUEJ";
		public static final String INF_REC = "INF_REC";
		public static final String PLA_ATE_REC = "PLA_ATE_REC";
		public static final String EQUI_AUT = "EQUI_AUT";
		public static final String CONSULTA_URI = "CONSULTA_URI";
		public static final String ASUN_ENV_CINT = "ASUN_ENV_CINT";
		public static final String CONS_ASUN_PREF = "CONS_ASUN_PREF";
		public static final String WS_TIMEOUT = "WS_TIMEOUT";
		public static final String WSDL_TABLAS_GENERALES = "WS_TABLAS_URL";
		public static final String PRE_ASUN = "PRE_ASUN";
		public static final String CARGA_USUARIO = "CARGA_USUARIO";
		public static final String APP_URL_BASE = "APP_URL_BASE";
		public static final String EQUIPORETORNO = "EQUIPORETORNO";
		public static final String VARIABLE_NROREQ = "<<NroREQ>>";
		public static final String VARIABLE_TITULAR = "<<Titular>>";
		public static final String VARIABLE_TIPOREQ = "<<TipoREQ>>";
		public static final String ASUN_ENV_DOC = "ASUN_ENV_DOC";
		public static final String PRE_OPER = "PRE_OPER";
		public static final String CORREO_TIMEOUT = "CORREO_TIMEOUT";
		public static final String CORREO_WAIT = "CORREO_WAIT";
	}
	
	public static abstract class CODIGO_MENSAJE
	{
		public final static String ERROR_GENERICO = "error.generico";
		public final static String VALIDAR_ELIMINAR_GENERICO= "validar.eliminar.generico";

		
		
		public final static String VALIDAR_TEXTBOX = "validar.textbox";
		public final static String VALIDAR_COMBOBOX = "validar.combobox";
		public final static String VALIDAR_DUPLICADO = "validar.duplicado";
		public final static String VALIDAR_FECHAS = "validar.fechas";
		
		public final static String VALIDAR_MAX_TAMANHO = "validar.textbox.maxtamanho";
		
		public final static String VALIDAR_TEXTO_TAMANHO = "validar.textbox.tamanho";
		
		public final static String VALIDAR_PARAMETRO_EXISTENTE = "validar.parametro.existente";
		
		public final static String VALIDAR_PARAMETRO_EXISTENTE_COLUMNA = "validar.parametro.existente.columna";
		
		
		public final static String VALIDAR_LISTA_EXISTENTE = "validar.lista.existente";
		
		public final static String VALIDAR_LISTA_EXISTENTE_NOMBRE="validar.lista.existente.nombre";
		
		public final static String VALIDAR_VALOR_EXISTENTE = "validar.valor.existente";
		
		public final static String VALIDAR_ROL_EXISTENTE = "validar.rol.existente";
		
		public final static String VALIDAR_ROL_NOMBRE_EXISTENTE = "validar.rol.nombre.existente";
		
		public final static String VALIDAR_ROL_PADRE_IGUAL = "validar.rol_padre.igual";
		
		public final static String VALIDAR_ROL_ES_PADRE = "validar.rol.es_padre";
		
		public final static String VALIDAR_MEMBRESIA_EXISTENTE = "validar.membresia.existente";
		
		public final static String VALIDAR_MEMBRESIA_USUARIO_EXISTENTE = "validar.membresia.usuarui.existente";
		

		public final static String VALIDAR_OPCION_EXISTENTE = "validar.opcion.existente";
		
		public final static String VALIDAR_OPCION_PADRE_IGUAL = "validar.opcion_padre.igual";
		
		public final static String VALIDAR_OPCION_TIENE_SUBOPCIONES= "validar.opcion.tiene.subopciones";

		public final static String VALIDAR_ADJUNTO = "validar.adjunto";
		
		public final static String VALIDAR_DESCARGA = "validar.descarga";
		
		public final static String VALIDAR_FOLDER_EXISTE = "validar.folder.existe";
		
		public final static String VALIDAR_DIRECCION_CORREO = "validar.direccion.correo";
		
		public final static String VALIDAR_REGLA = "validar.regla";
		public final static String VALIDAR_REGLA_NO_ENCONTRADA="validar.regla.no.encontrada";
		
		public final static String VALIDAR_REGLA_TRANS_COMP = "validar.regla.transicion.completar";
		
		public static final String VALIDAR_CODIGO_NO_ENCONTRADO = "validar.codigo_no_encontrado";

		public static final String ERROR_CARGAR_CLASES = "error.cargar_clase";

		public static final String ERROR_VALIDACION = "error.drools.validar";

		public static final String VALIDAR_REQUERIMIENTO = "validar.req";
		
		public static final String VALIDAR_REQUERIMIENTO_ESTADO = "validar.req.estado";
		
		public static final String BLOQUEO_REQUERIMIENTO = "validar.req.bloqueo";
		
		public static final String BLOQUEO_REQUERIMIENTO_SOLICITAR_GC = "validar.req.bloqueo";
		
		public static final String ASIGNADO_REQUERIMIENTO = "validar.req.asignado";
		
		public static final String VALIDAR_TAXONIMIA = "validar.taxonomia";
		
		public final static String VALIDAR_INTEGRANTE_EXISTENTE = "validar.integrante.existe";
		
		public final static String VALIDAR_EQUIPO_LIDER = "validar.equipo.lider";
		
		public final static String VALIDAR_EQUIPO_ELIMINAR_INTEGRANTE 		= "validar.equipo.eliminar.integrante";
		public final static String VALIDAR_EQUIPO_ELIMINAR_SUBEQUIPO 			= "validar.equipo.eliminar.subequipo";
		public final static String VALIDAR_EQUIPO_ELIMINAR_REQUERIMIENTO 	= "validar.equipo.eliminar.requerimiento";
		public final static String VALIDAR_EQUIPO_ELIMINAR_OTROS 			= "validar.equipo.eliminar.otros";
		
		public final static String VALIDAR_REGLA_ELIMINAR = "validar.regla.dependencia";
		
		public final static String VALIDAR_REGISTRO_REPETIDO = "validar.registro.repetido";
		
		public final static String VALIDAR_REGISTRO_DEPENDENCIA = "validar.registro.dependencia";
		
		public final static String VALIDAR_REITERATIVO = "validar.req.reiterativo";

		public final static String VALIDAR_COMENTARIO_DC = "validar.comentario.dc";

		public final static String VALIDAR_DESISTIR = "validar.req.desistir";
		
		public final static String VALIDAR_REASIGNAR_EQUIPO = "validar.req.reasignar.equipo";
		
		public final static String VALIDAR_REASIGNAR_INTEGRANTE = "validar.req.reasignar.integrante";
		
		public final static String VALIDAR_RETORNAR_EQUIPO = "validar.req.retornar.equipo";
		
		public final static String VALIDAR_RETORNAR_INTEGRANTE = "validar.req.retornar.integrante";
		
		public final static String VALIDAR_RETORNAR_MOTIVO_RETORNO = "validar.req.retornar.motivo";
		
		public final static String VALIDAR_DESISTIR_MOTIVO_DESISTIR = "validar.req.desistir.motivo";
		
		public final static String VALIDAR_DESBLOQUEAR_NO_BLOQUEADO = "validar.req.desbloquear.no.bloqueado";
		
		public final static String VALIDAR_TAXONOMIA_DUPLICADO = "validar.tax.duplicado";

		public final static String VALIDAR_TAXONOMIA_PRODUCTO = "validar.tax.producto";
		
		public final static String VALIDAR_TAXONOMIA_MOTIVO = "validar.tax.motivo";
		
		public final static String VALIDAR_TAXONOMIA_SUBMOTIVO = "validar.tax.submotivo";
		
		public final static String VALIDAR_TAXONOMIA_REQUERIMIENTO_TIPO = "validar.tax.requerimiento.tipo";

		public final static String VALIDAR_TAXONOMIA_EMPRESA = "validar.tax.empresa";
		public final static String VALIDAR_TAXONOMIA_COMPLEJIDAD = "validar.tax.complejidad";
		
		public final static String VALIDAR_TAXONOMIA_ESTADO = "validar.tax.estado";
		
		public final static String VALIDAR_TAXONOMIA_DUPLICADOS = "validar.tax.duplicados";
	
		public final static String VALIDAR_TIEMPO_CODIGO = "validar.tiempo.codigo";

		public final static String VALIDAR_TIEMPO_NOMBRE = "validar.tiempo.nombre";
		
		public final static String VALIDAR_TIEMPO_TOR = "validar.tiempo.tor";
		
		public final static String VALIDAR_TIEMPO_ESTADO = "validar.tiempo.estado";
		
		public final static String VALIDAR_TIEMPO_COLOR_VERDE = "validar.tiempo.color.verde";
		public final static String VALIDAR_TIEMPO_COLOR_AMBAR = "validar.tiempo.color.ambar";
		public final static String VALIDAR_TIEMPO_COLOR_ROJO = "validar.tiempo.color.rojo";
		public final static String VALIDAR_TIEMPO_PORCENTAJE_100 = "validar.tiempo.porcentaje.100";
		
		public final static String VALIDAR_TIEMPO_CODIGO_DUPLICADO = "validar.tiempo.codigo.duplicado";
		
		public static final String VALIDAR_REGLA_DROOLS = "validar.drools.regla";
		
		public final static String VALIDAR_TAM_ADJUNTO = "validar.tamAdjunto";
		
		public final static String VALIDAR_TAM_MAXIMO = "validar.tamMaximo";
		
		public final static String VALIDAR_NOMBRE_DOCUMENTO = "validar.adjunto.repetido";
		
		public final static String VALIDAR_ANS_REQ_ESTADO = "validar.ans.req.estado";
		
		public final static String VALIDAR_ANS_PLAZO_MAXIMO = "validar.ans.plazo.maximo";
		
		public final static String VALIDAR_ANS_ESTADO = "validar.ans.estado";

		public final static String VALIDAR_ANS_REQ_ESTADO_DUPLICADO = "validar.ans.req.estado.duplicado";
		
		public final static String VALIDAR_QH_CODIGO_DUPLICADO = "validar.qh.codigo.duplicado";
		
		public final static String VALIDAR_PLANTILLA_CODIGO = "validar.plantilla.codigo";
		
		public final static String VALIDAR_PLANTILLA_NOMBRE = "validar.plantilla.nombre";
		
		public final static String VALIDAR_PLANTILLA_TIPO_DOCUMENTO = "validar.plantilla.tipo.documento";
		
		public final static String VALIDAR_PLANTILLA_ESTADO = "validar.plantilla.estado";
		
		public final static String VALIDAR_PLANTILLA_FORMATO = "validar.plantilla.formato";

		public final static String VALIDAR_PLANTILLA_CODIGO_DUPLICADO = "validar.plantilla.codigo.duplicado";
		
		public final static String VALIDAR_CODIGO = "validar.codigo";
		
		public final static String VALIDAR_NOMBRE_DE = "validar.nombre.de";
		
		public final static String VALIDAR_SEGMENTO_MAPEO = "validar.segmento.mapeo";
		
		public final static String VALIDAR_ESTADO = "validar.estado";
		
		public final static String VALIDAR_GRABAR_COMP = "validar.req.grabar.completar";
		
		public final static String VALIDAR_GRABAR_COMP_DC = "validar.req.grabar.completar.dc";
		
		public final static String VALIDAR_GRABAR_TAXONOMIA = "validar.req.grabar.taxonomia";

		public final static String VALIDAR_MENSAJE_GENERICO = "validar.mensaje.generico";
		
		public final static String VALIDAR_ELIMINAR_ARCHIVO = "validar.eliminar.archivo";
		
		public final static String VALIDAR_ELIMINAR_CONTACTO = "validar.eliminar.contacto";
		
		public final static String VALIDAR_ENVIAR_RPTA_ANEXAR = "validar.enviar.rpta.anexar";
		
		public final static String VALIDAR_ACTUALIZAR = "validar.actualizar";
		public final static String VALIDAR_EMPRESA_REPETIDO = "validar.empresa.repetido";
		public final static String VALIDAR_EMPRESA_PREFIJO = "validar.empresa.prefijo";
		public final static String VALIDAR_EMPRESA_NOMBRE = "validar.empresa.nombre";
		public final static String VALIDAR_EMPRESA_REFERENCIAS = "validar.empresa.referencias";
		
		public final static String VALIDAR_CORREO_REPETIDO = "validar.correo.repetido";
		public final static String VALIDAR_CONSOLIDAR_ESTADO = "validar.consolidar.estado";
		public final static String VALIDAR_DETALLE_MODALIDAD = "Modalidad no permitida.";
		
		public final static String VALIDAR_REASIGNACION_NINGUNO_CUMPLE = "validar.resignar.ninguno";
		public final static String VALIDAR_REASIGNACION_ALGUNOS_CUMPLE = "validar.resignar.alguno";
		
		
		public final static String VALIDAR_MOTIVO_SBS_EXISTENTE_CODIGO 			= "validar.motivo.sbs.existente.codigo";
		public final static String VALIDAR_MOTIVO_SBS_EXISTENTE_NOMBRE 			= "validar.motivo.sbs.existente.nombre";
		public final static String VALIDAR_MOTIVO_SBS_EXISTENTE_ABREVIACION 	= "validar.motivo.sbs.existente.abreviacion";

		public final static String VALIDAR_MOTIVO_EXISTENTE_CODIGO 			= "validar.motivo.existente.codigo";
		public final static String VALIDAR_MOTIVO_EXISTENTE_NOMBRE 			= "validar.motivo.existente.nombre";
		
		public final static String VALIDAR_PARAMETRO_EXISTENTE_CODIGO 			= "validar.parametro.existente.codigo";
		public final static String VALIDAR_PARAMETRO_EXISTENTE_NOMBRE 			= "validar.parametro.existente.nombre";
	
		public final static String VALIDAR_PRODUCTO_SBS_EXISTENTE_CODIGO 			= "validar.producto.sbs.existente.codigo";
		public final static String VALIDAR_PRODUCTO_SBS_EXISTENTE_NOMBRE 			= "validar.producto.sbs.existente.nombre";
		public final static String VALIDAR_PRODUCTO_SBS_EXISTENTE_ABREVIACION		= "validar.producto.sbs.existente.abreviacion";
		
		public final static String VALIDAR_REGLA_EXISTENTE_CODIGO		= "validar.regla.existente.codigo";
		public final static String VALIDAR_REGLA_EXISTENTE_NOMBRE		= "validar.regla.existente.nombre";
		
		public final static String VALIDAR_ESTADO_REQUERIMIENTO_DUPLICADO="validad.esta.requerimiento.duplicado";
		public static final String CONSOLIDADOR_SIN_EQUIPO = "validar.consolidador.sin.equipo";
		
		public static final String REPORTE_GENERAL_RANGO_FECHAS = "validar.reporte.general.rango.fechas";
		public static final String REPORTE_GENERAL_SIN_RESULTADOS = "validar.reporte.general.sin.resultados";
		
	}
	
	public static abstract class SESION
	{
		public final static String USUARIO = "SESION_USUARIO";
		public final static String USUARIO_ADMIN_ROL = "ADM";
	}
	
	public static abstract class OPCION
	{
		public final static String KEY_PADRE = "padre";
		
		public final static String CODIGO_ADMIN_PARM = "ADMIN_PARM";
		public final static String CODIGO_ADMIN_LOV = "ADMIN_LOV";
		public final static String CODIGO_ADMIN_ROL_MEMB = "ADMIN_ROL_MEMB";
		public final static String CODIGO_ADMIN_OPCION = "ADMIN_OPCION";
		public final static String CODIGO_ADMIN_PERM = "ADMIN_PERM";

		public final static String CODIGO_BND_TRA = "BND_TRA";
		public final static String CODIGO_BND_TRA_REQ = "REQ_BND";
		public final static String CODIGO_BND_TRA_CON = "REQ_BND_CONS";
		public final static String CODIGO_REQ_REG = "REQ_REG";
		public final static String CODIGO_REQ_BNDBUSQ = "REQ_BNDBUSQ";
		public final static String CODIGO_REQ_REASIG = "REQ_REASIG";
		
		public final static String CODIGO_CORREO = "COD_CORREO";//FIXME
		
		public final static String CODIGO_ORG_EQUIPO = "ADMIN_EQUIPO";
		public final static String CODIGO_SEG_OPCION = "SEG_OPCION";
		public final static String CODIGO_CFG_REGLA = "ADMIN_REGLA";
		public final static String CODIGO_TIPO_REQ = "ADMIN_TIPO_REQ";
		public final static String CODIGO_ESTADO_REQ = "ADMIN_EST_REQ";
		public final static String CODIGO_TAX_PRODUCTO = "ADMIN_PRODUCTOS";
		public static final String CODIGO_REQ_COMPLETAR = "REQ_COMPLETAR";
		public static final String CODIGO_REQ_MODIFICAR = "REQ_MODIFICAR";
		public static final String CODIGO_REQ_ANALIZAR = "REQ_ANALIZAR";
		public static final String CODIGO_REQ_VER = "REQ_VER";
		public final static String CODIGO_CFG_EMPRESA = "ADMIN_EMP";		
		public final static String CODIGO_CFG_MOTIVO = "ADMIN_MOTIVOS";
		public final static String CODIGO_CFG_SBS_MOTIVO = "ADMIN_MOTIVOS_SBS";
		public final static String CODIGO_TAX_TAXONOMIAS = "ADMIN_TAXONOMIAS";

		public static final String CODIGO_REQ_CONSULTAR = "REQ_CONSIE";
		public static final String CODIGO_REQ_RESPONDER = "REQ_RESPCONSI";
		public static final String CODIGO_REQ_DEVOLUCION = "REQ_DEVOLUCION";
		public static final String CODIGO_REQ_REVERSION = "REQ_REVERSION";
		public static final String CODIGO_REQ_AUT_DEV = "REQ_AUTDEVOL";
		public static final String CODIGO_REQ_ENVIAR_RPTA = "REQ_ENVRPTA";
		public static final String CODIGO_REQ_RETORNAR = "REQ_RETORNAR";
		public static final String CODIGO_REQ_ANULAR = "REQ_DESISTIR";
		public static final String CODIGO_REQ_AUT_AT_PREF = "REQ_AUTGESTO";
		public static final String CODIGO_REQ_CONSTANCIA = "REQ_IMPCONST";
		public static final String CODIGO_CFG_TIEMPOS = "ADMIN_ESQTIEMPOS";
		public final static String CODIGO_PER_SEGMENTO = "ADMIN_GRUPSEG";
		public final static String CODIGO_TAX_SUBMOTIVO = "ADMIN_SUBMOTIVOS";
		public final static String CODIGO_ADMIN_PLANTILLAS = "ADMIN_PLANTILLAS";
		public final static String CODIGO_ADMIN_RUTASQH = "ADMIN_RUTASQH";
		public static final String CODIGO_REQ_DESBLOQUEAR = "REQ_DESBLOQUEAR";
		public final static String CODIGO_REQ_CONSOLID = "REQ_CONSOLID";
		public final static String CODIGO_REQ_CARGACOU = "REQ_CARGACOU";
		
		public final static String REQ_ENVRPTA_CONS = "REQ_ENVRPTA_CONS";
		public final static String REQ_IMPCONST_CONS = "REQ_IMPCONST_CONS";
		
		public final static String REQ_ENVRPTA_PREV = "REQ_ENVRPTA_PREV";
		public final static String REQ_ENVRPTA_IMP = "REQ_ENVRPTA_IMP";
		
		public final static String REQ_ENVRPTA_PREV_CONS = "REQ_ENVRPTA_PREV_CONS";
		public final static String REQ_ENVRPTA_CONS_IMP = "REQ_ENVRPTA_CONS_IMP";
		
		public final static String REQ_CONSULTA = "REQ_CONSULTA";
		
		public final static String CODIGO_CONSOLIDAR_EMITIR = "REQ_CONSOLID_EMITIR";
		public final static String CODIGO_CONSOLIDAR_ENVIO = "REQ_CONSOLID_ENVIAR";
		
		public static final String CODIGO_REP_SBS = "REP_SBS";
		
		public static final String CODIGO_REQ_VENCIDOS = "REP_REP01";
		
		public static final String CODIGO_REPORTE_GENERAL = "REP_REP02";
		
		
		public static abstract class ACCION
		{

			public static final String REGISTRA_REQUERIMIENTO = "REQ_REG_GRABAR";
			public static final String GRABAR_COMPLETAR = "REQ_COMP_GRABAR";
			public static final String GRABAR_MODIFICAR = "REQ_MODIF_GRABAR";
			public static final String GRABAR_ANALIZAR = "REQ_ANALIZ_GRABAR";
			public static final String GRABAR_ENVIAR_RPTA = "REQ_ENVRPTA_GRABAR";
			
		}
		
		public static final String CODIGO_MAN_ARCH	= "MAN_ARCH";
		public static final String CODIGO_DIAG_DATOS = "DIAG_DATOS";
		public static final String CODIGO_SBS_PRODUCTO = "ADMIN_PRODUCTOS_SBS";
		public static final String CODIGO_CONFIG_TAREAS = "CONFIG_TAREAS";
		public static final String CODIGO_BANDEJA_CONTROL_CARGAS = "BAND_CONTR_CARG";
		public static final String CODIGO_REQ_SOLGESTO = "REQ_SOLGESTO";

		
		public static final String CODIGO_REQ_CONS_FICHADETREQ = "REQ_CONS_FICHADETREQ";
		public static final String CODIGO_REQ_CONS_FICHADETCOMP = "REQ_CONS_FICHADETCOMP";
		public static final String CODIGO_REQ_CONS_FICHAREQANT = "REQ_CONS_FICHAREQANT";
		public static final String CODIGO_REQ_CONS_FICHAOPER = "REQ_CONS_FICHAOPER";
		public static final String CODIGO_REQ_CONS_FICHACOMENT = "REQ_CONS_FICHACOMENT";
		public static final String CODIGO_REQ_CONS_FICHABITACORA = "REQ_CONS_FICHABITACORA";
				
		public static final String CODIGO_FICHA_GRAL_REQ = "FICHA_GRAL_REQ";
		
	}
	
	public static abstract class UBIGEO
	{
		public final static Long ID_DISTRITO_DEFECTO = 1350L;
	}
	
	public static abstract class RENIEC
	{
		public static final int    TTL = 0;
	    public static final int    LONG_CABECERA = 128;
	    public static final int    LONG_SUB_TRAMA_CONSULTA = 15;
	    public static final String FRAGMENTACION = "                      ";
	    public static final String RESERVADO_CHAR5  = "     ";
	    public static final String RESERVADO_CHAR10 = "          ";
	    public static final String CARACTER_VERIFICACION = " ";
	    public static final String TIPO_SERVICIO  = "000";
	    public static final String TIPO_CONSULTA  = "7";//2:Consulta con imagenes, 7: Consulta solo datos
	    public static final String TIPO_DOCUMENTO = " ";
	    public static final String VERSION = "0001";
	    public static final String CARACTERES_VERIFICACION = "RENIECPERURENIEC";
	    public static final String COD_INST_SOLICITANTE  = "LD2019"; //Valor anterior-> "LDD019"; //Cambiado 18-05-2011 DIMCO 
	    public static final String COD_SERVIDOR_RENIEC   = "RENIEC001";
	    public static final String HOST_INST_SOLICITANTE = "BBVA";
	    //public static final String FORMATO_FIRMA = "1"; //1:Imagen JPG, default(Espacion en blanco): TIF
	    
	    public static final String EXITO = "0000";
		public static final String NO_EXISTE = "5200";
		
		public static final String HTTP_PROXYSET = "http.proxySet";
		public static final String HTTP_PROXYHOST = "http.proxyHost";
		public static final String PROXYHOST = "proxyHost";
		
		public final static String RESULTADO_ACEPTADO = "Aceptado";
		public final static String RESULTADO_RECHAZADO = "Rechazado";
		public final static String RESULTADO_FALLIDO = "Fallido";
		
	}
	
	public static abstract class TIPOREQUERIMIENTO
	{
		public static abstract class CODIGO
		{
			public final static String RECLAMO = "REC";
			public final static String SOLICITUD = "SOL";
			public final static String QUEJA = "QUE";
		}
	}
	
	public static abstract class TIPOPRODUCTO
	{
		public final static String ES_PRODUCTO = "PROD";
		public final static String ES_SERVICIO = "SERV";
	}
	
	public static abstract class ESTADO_REQUERIMIENTO
	{
		public static abstract class CODIGO
		{
			public final static String REGISTRADO = "REG";
			public final static String TERMINADO = "TER";
			public final static String DESESTIMADO = "DES";
			public final static String DEVOLVER = "X_DEV";
			public final static String POR_CONF_ENT = "X_CON_ENT";
			public final static String REASIGNADO = "REA";
			public final static String OBSERVADO = "OBS";
			public final static String COMPLETAR_DATOS = "X_COM";
			public final static String DICTAMINAR_FRC = "X_DIC_FCR";
			public final static String DICTAMINAR = "X_DIC";
			public final static String SUBSANAR_DEV = "X_SUB_DEV";
			public final static String ENVIAR_RESPUESTA = "X_RES";
			public final static String AUTORIZAR_DEVOLUCION	 = "X_AUT_DEV";
			public final static String ENVIAR_RESPUESTA_TRANS = "X_RES_TRA";
			public final static String AUTORIZAR_GESTO = "X_AUT_GEST";
			public final static String PENDIENTE_COURIER = "PEN_COU";
		}
	}
	
	public static abstract class SEGMENTO
	{
		public static abstract class CODIGO
		{
			public final static String NO_PERSONALIZADO = "NP";
		}
		/*public final static Long NO_PERSONALIZADO = 1L;*/
	}
	
	public static abstract class EQUIPO
	{
		public static final String ASIGNACION_MANUAL = "MAN";
		public static final String ASIGNACION_BALANCEO = "BAL";
		public static final String AMBITO_TAREA_TODOS = "TODO";
		public static final String AMBITO_MIA_EQUIPOS = "GRUP";
		public static final String CASO_A = "A";
		public static final String CASO_B = "B";
		
		public static abstract class CODIGO
		{
			public static final String ATENTO_BACK_EXPRESS = "ATT_BCKEXP";
			public static final String ATENTO_BACK_EXPRESS_JEFE = "ATT_BCKEXJ";
			public static final String ATENTO_BACK_MINORISTA_JEFE = "ATT_BCKMIJ";
		}
	}
	
	public static abstract class BITACORA
	{
		public static final int MAX_LENGHT_COMENTARIO = 400;
	}
	
	public static abstract class MODO_REQUERIMIENTO
	{
		public final static String VER = "VER";
		public final static String COMPLETAR = "COMPLETAR";
		public final static String ANALIZAR = "ANALIZAR";
		public final static String MODIFICAR = "MODIFICAR";
	}
	
	public static final String NUEVA_LINEA = System.getProperty("line.separator");
	public static final String NUEVA_LINEA_HTML = "</br>";
	
	public static abstract class PEA
	{
		public final static String CODIGO_EXITO_HEAD = "0000";
		public final static String CODIGO_EXITO_BODY_RESULTADO = "1";
		public final static String CODIGO_EXITO_BODY_PERSONAS = "PS900";
		public final static String CODIGO_EXITO_BODY_DIRECCIONES = "0000";
		public final static String CODIGO_EXITO_BODY_CONTRATOS = "0000";
		
		public final static String CONTRATO_ALIAS_TARJETA_CREDITO = "MPTAR";
		public final static String CONTRATO_ALIAS_CUENTA_AHORRO = "AHORRO";
		public final static String CONTRATO_ALIAS_CUENTA_CORRIENTE = "CTACTE";
		
		public final static String ESTADO_CUENTA_CORTE_ABIERTO = "ABIERTO";
		public final static String ESTADO_CUENTA_NUMERO_VALIDACION = "1";
		
	}
	
	public static abstract class TABLAS_GENERALES
	{
		public final static String FERIADO_NACIONAL = "N";
		public final static String TIPO_CAMBIO_DEFAULT = "S";
	}
	
	public static abstract class SMS
	{
		public final static String EXITO = "true";
		public final static String RESULTADO_ACEPTADO = "Aceptado";
		public final static String RESULTADO_RECHAZADO = "Rechazado";
		public final static String RESULTADO_FALLIDO = "Fallido";
	}
	
	public static final String CODIGO_EMPRESA = "0011";
	public static final String NOMBRE_EMPRESA = "BBVA BANCO CONTINENTAL";
	
	public static abstract class MOTIVO
	{
		public static final String  NO_RECEPCION_DEMORA_CORRESPONDENCIA_TARJETAS = "01";
		public static final String  NO_RECEPCION_ECC = "18";
	}
	
	public static abstract class TIPO_ADJUNTO
	{
		public static final String  HOJA_REC = "HOJARECF0";
		public static final String  HOJA_REC_COM = "HOJARECF1";
		public static final String  HOJA_CONS_REQ = "CONSREQ";
	}
	
	public static abstract class ADJUNTO
	{
		public static final String  RUTA_TEMPORAL = ".";
		public static final String  SEPARADOR_NOMB_ARCHIVO = "#";
	}
	
	public static abstract class ROL
	{
		public static final String  ADMINISTRADOR = "ADM";
		public static final String  GESTOR_OFICINA = "OFI";
		public static final String  ANALISTA = "ANA";
		public static final String  FRONT = "ATE-F";
		public static final String  BACK_EXPRESS = "ATE-B";
		public static final String  AGENTE_EXPRESS = "A-EXP";
		public static final String  GESTOR_TERR = "G-TER";
		public static final String  CONSOLIDADOR = "CON";
		public static final String  RESPONSABLE_CARGA = "RCA";
		public static final String  JEFE_EQUIPO = "JEE";
		public static final String  UNIDADES_ESP = "UES";
		public static final String  ATENTO_BACK_BEC = "ATE-BB";
		public static final String  TRANSPARENCIA = "TRS";
		public static final String  RESPONSABLE_SUPERIORES = "RSP_SUP";
		
		
	}
	public static abstract class CLASE_DICTAMEN
	{
		public static final String  DEFINITIVO = "DEFI";
		public static final String  TRANSITORIO = "TRAN";
		
		
	}
	public static abstract class DICTAMEN
	{
		public static final String  PROCEDE_TOTAL = "PROT";
		public static final String  PROCEDE_PARCIAL = "PROP";
		public static final String  NO_PROCEDE = "NOPR";
		
		
	}
	
	public static abstract class NOTIFICACION
	{
		public static final String  REQUERIMIENTO_COMPLETADO = "Requerimiento completado";
		
		
	}
	
	public static abstract class CAMPOS_ESPECIALES
	{
		public static final String  NOM_APE = "${titularApeNom}";
	}
	
	public static abstract class COMENTARIO
	{
		public static final String  GESTO_COMERCIAL = "SUSTENTO SOLICITUD AUTORIZACIÓN GESTO COMERCIAL";
		
		
	}
	
	public static abstract class CENTROS
	{
		public static final String PADRE_CO = "CO";
		public static final String PADRE_AC = "AC";
		public static final String PADRE_OP = "OP";
		public static final String PADRE_RA = "RA";
	}
	
}

