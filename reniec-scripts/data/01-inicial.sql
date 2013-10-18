--Carga de Usuarios
INSERT INTO CONREC.SEG_USUARIO (ID,NOMBRES,PATERNO,MATERNO,REGISTRO,CARGO,CENTRO,CREADOR,CREACION) values (1,'ADMIN','ADMIN','ADMIN','P015740','ADMI','OFC',1,SYSDATE);
INSERT INTO CONREC.SEG_USUARIO (ID,NOMBRES,PATERNO,MATERNO,REGISTRO,CARGO,CENTRO,CREADOR,CREACION) values (2,'ADMIN','ADMIN','ADMIN','P017433','ADMI','OFC',1,SYSDATE);
INSERT INTO CONREC.SEG_USUARIO (ID,NOMBRES,PATERNO,MATERNO,REGISTRO,CARGO,CENTRO,CREADOR,CREACION) values (3,'ADMIN','ADMIN','ADMIN','P015285','ADMI','OFC',1,SYSDATE);
INSERT INTO CONREC.SEG_USUARIO (ID,NOMBRES,PATERNO,MATERNO,REGISTRO,CARGO,CENTRO,CREADOR,CREACION) values (4,'ADMIN','ADMIN','ADMIN','P017432','ADMI','OFC',1,SYSDATE);
INSERT INTO CONREC.SEG_USUARIO (ID,NOMBRES,PATERNO,MATERNO,REGISTRO,CARGO,CENTRO,CREADOR,CREACION) values (5,'ADMIN','ADMIN','ADMIN','P016244','ADMI','OFC',1,SYSDATE);
INSERT INTO CONREC.SEG_USUARIO (ID,NOMBRES,PATERNO,MATERNO,REGISTRO,CARGO,CENTRO,CREADOR,CREACION) values (6,'ADMIN','ADMIN','ADMIN','P016390','ADMI','OFC',1,SYSDATE);
INSERT INTO CONREC.SEG_USUARIO (ID,NOMBRES,PATERNO,MATERNO,REGISTRO,CARGO,CENTRO,CREADOR,CREACION) values (7,'ADMIN','ADMIN','ADMIN','P007396','ADMI','OFC',1,SYSDATE);
INSERT INTO CONREC.SEG_USUARIO (ID,NOMBRES,PATERNO,MATERNO,REGISTRO,CARGO,CENTRO,CREADOR,CREACION) values (8,'ADMIN','ADMIN','ADMIN','P014212','ADMI','OFC',1,SYSDATE);
INSERT INTO CONREC.SEG_USUARIO (ID,NOMBRES,PATERNO,MATERNO,REGISTRO,CARGO,CENTRO,CREADOR,CREACION) values (9,'ADMIN','ADMIN','ADMIN','P016459','ADMI','OFC',1,SYSDATE);
INSERT INTO CONREC.SEG_USUARIO (ID,NOMBRES,PATERNO,MATERNO,REGISTRO,CARGO,CENTRO,CREADOR,CREACION) values (10,'ADMIN','ADMIN','ADMIN','P017431','ADMI','OFC',1,SYSDATE);
INSERT INTO CONREC.SEG_USUARIO (ID,NOMBRES,PATERNO,MATERNO,REGISTRO,CARGO,CENTRO,CREADOR,CREACION) values (11,'ADMIN','ADMIN','ADMIN','P014205','ADMI','OFC',1,SYSDATE);
INSERT INTO CONREC.SEG_USUARIO (ID,NOMBRES,PATERNO,MATERNO,REGISTRO,CARGO,CENTRO,CREADOR,CREACION) values (12,'ADMIN','ADMIN','ADMIN','P016711','ADMI','OFC',1,SYSDATE);

--Carga de Listas
INSERT into CONREC.CFG_LISTA (ID,CODIGO,NOMBRE,DESCRIPCION,ESTADO,CREADOR,CREACION) values (1,'REGISTRO_ESTADO','Estado de registro','Estado de registro','A',1,SYSDATE);
INSERT into CONREC.CFG_LISTA (ID,CODIGO,NOMBRE,DESCRIPCION,ESTADO,CREADOR,CREACION) values (2,'MEMBRESIA_TIPO','Tipo de membres�a','Tipo de membres�a','A',1,SYSDATE);
INSERT into CONREC.CFG_LISTA (ID,CODIGO,NOMBRE,DESCRIPCION,ESTADO,CREADOR,CREACION) values (3,'OPCION_TIPO','Tipo de opci�n','Tipo de opci�n','A',1,SYSDATE);
INSERT into CONREC.CFG_LISTA (ID,CODIGO,NOMBRE,DESCRIPCION,ESTADO,CREADOR,CREACION) values (4,'ORIGEN','ORIGEN','ORIGEN','A',1,SYSDATE);
INSERT into CONREC.CFG_LISTA (ID,CODIGO,NOMBRE,DESCRIPCION,ESTADO,CREADOR,CREACION) values (5,'DOI_TIPO','DOI_TIPO','DOI_TIPO','A',1,SYSDATE);
INSERT into CONREC.CFG_LISTA (ID,CODIGO,NOMBRE,DESCRIPCION,ESTADO,CREADOR,CREACION) values (6,'NACIONALIDAD_TIPO','NACIONALIDAD_TIPO','NACIONALIDAD_TIPO','A',1,SYSDATE);
INSERT into CONREC.CFG_LISTA (ID,CODIGO,NOMBRE,DESCRIPCION,ESTADO,CREADOR,CREACION) values (7,'ACCION','ACCION','ACCION','A',1,SYSDATE);
INSERT into CONREC.CFG_LISTA (ID,CODIGO,NOMBRE,DESCRIPCION,ESTADO,CREADOR,CREACION) values (8,'USUARIO_ESTADO','USUARIO_ESTADO','USUARIO_ESTADO','A',1,SYSDATE);
INSERT into CONREC.CFG_LISTA (ID,CODIGO,NOMBRE,DESCRIPCION,ESTADO,CREADOR,CREACION) values (9,'RENIEC_SITUACION','RENIEC_SITUACION','RENIEC_SITUACION','A',1,SYSDATE);
INSERT into CONREC.CFG_LISTA (ID,CODIGO,NOMBRE,DESCRIPCION,ESTADO,CREADOR,CREACION) values (10,'CARGA_TIPO','Tipo de Carga','Tipo de Carga','A',1,SYSDATE);


--Carga de Valores (REGISTRO_ESTADO)
INSERT into CONREC.CFG_VALOR (ID,LISTA,CODIGO,NOMBRE,DESCRIPCION,ORDEN,ESTADO,CREADOR,CREACION) values (1,1,'A','Activo','Activo',1,'A',1,SYSDATE);
INSERT into CONREC.CFG_VALOR (ID,LISTA,CODIGO,NOMBRE,DESCRIPCION,ORDEN,ESTADO,CREADOR,CREACION) values (2,1,'I','Inactivo','Inactivo',2,'A',1,SYSDATE);

--Carga de Valores (MEMBRESIA_TIPO)
INSERT into CONREC.CFG_VALOR (ID,LISTA,CODIGO,NOMBRE,DESCRIPCION,ORDEN,ESTADO,CREADOR,CREACION) values (3,2,'REG','REGISTRO','Tipo de membres�a para usuarios uno por uno',1,'A',1,SYSDATE);
INSERT into CONREC.CFG_VALOR (ID,LISTA,CODIGO,NOMBRE,DESCRIPCION,ORDEN,ESTADO,CREADOR,CREACION) values (4,2,'CARG','CARGO','Tipo de membres�a para grupos de usuarios',2,'A',1,SYSDATE);

--Carga de Valores (OPCION_TIPO)
INSERT into CONREC.CFG_VALOR (ID,LISTA,CODIGO,NOMBRE,DESCRIPCION,ORDEN,ESTADO,CREADOR,CREACION) values (5,3,'MEN','Men�','Opci�n que sirve para construir el men� de la aplicaci�n',1,'A',1,SYSDATE);
INSERT into CONREC.CFG_VALOR (ID,LISTA,CODIGO,NOMBRE,DESCRIPCION,ORDEN,ESTADO,CREADOR,CREACION) values (6,3,'VEN','Ventana','Opci�n que sirve para controlar permisos sobre ventanas (que no se abren desde men�)',2,'A',1,SYSDATE);
INSERT into CONREC.CFG_VALOR (ID,LISTA,CODIGO,NOMBRE,DESCRIPCION,ORDEN,ESTADO,CREADOR,CREACION) values (7,3,'ACC','Acci�n','Opci�n que permite controlar comportamiento sobre los botones de opciones de men� o ventanas',3,'A',1,SYSDATE);

--Carga de Valores (ORIGEN)
INSERT into CONREC.CFG_VALOR (ID,LISTA,CODIGO,NOMBRE,DESCRIPCION,ORDEN,ESTADO,CREADOR,CREACION) values (8,4,'LDAP2','BD LDAP2','Base de datos LDAP2',1,'A',1,SYSDATE);
INSERT into CONREC.CFG_VALOR (ID,LISTA,CODIGO,NOMBRE,DESCRIPCION,ORDEN,ESTADO,CREADOR,CREACION) values (9,4,'BODEGUERO','Bodeguero','Aplicaci�n Bodeguero',2,'A',1,SYSDATE);

--Carga de Valores (DOI_TIPO)
INSERT into CONREC.CFG_VALOR (ID,LISTA,CODIGO,NOMBRE,DESCRIPCION,ORDEN,ESTADO,CREADOR,CREACION) values (10,5,'A','CODIGO C.U.S.P.P.','CODIGO C.U.S.P.P.',1,'A',1,SYSDATE);
INSERT into CONREC.CFG_VALOR (ID,LISTA,CODIGO,NOMBRE,DESCRIPCION,ORDEN,ESTADO,CREADOR,CREACION) values (11,5,'D','CARNET DIPLOMATICO','CARNET DIPLOMATICO',2,'A',1,SYSDATE);
INSERT into CONREC.CFG_VALOR (ID,LISTA,CODIGO,NOMBRE,DESCRIPCION,ORDEN,ESTADO,CREADOR,CREACION) values (12,5,'E','CARNET DE EXTRANJERIA','CARNET DE EXTRANJERIA',3,'A',1,SYSDATE);
INSERT into CONREC.CFG_VALOR (ID,LISTA,CODIGO,NOMBRE,DESCRIPCION,ORDEN,ESTADO,CREADOR,CREACION) values (13,5,'F','NRO. SOLICITUD AFPHO','NRO. SOLICITUD AFPHO',4,'A',1,SYSDATE);
INSERT into CONREC.CFG_VALOR (ID,LISTA,CODIGO,NOMBRE,DESCRIPCION,ORDEN,ESTADO,CREADOR,CREACION) values (14,5,'J','MENOR DE EDAD','MENOR DE EDAD',5,'A',1,SYSDATE);
INSERT into CONREC.CFG_VALOR (ID,LISTA,CODIGO,NOMBRE,DESCRIPCION,ORDEN,ESTADO,CREADOR,CREACION) values (15,5,'L','DNI','DNI',6,'A',1,SYSDATE);
INSERT into CONREC.CFG_VALOR (ID,LISTA,CODIGO,NOMBRE,DESCRIPCION,ORDEN,ESTADO,CREADOR,CREACION) values (16,5,'X','DOI DOC EXTRANJERO','DOI DOC EXTRANJERO',7,'A',1,SYSDATE);
INSERT into CONREC.CFG_VALOR (ID,LISTA,CODIGO,NOMBRE,DESCRIPCION,ORDEN,ESTADO,CREADOR,CREACION) values (17,5,'N','RUC ANTIGUO(8)','RUC ANTIGUO(8)',8,'A',1,SYSDATE);
INSERT into CONREC.CFG_VALOR (ID,LISTA,CODIGO,NOMBRE,DESCRIPCION,ORDEN,ESTADO,CREADOR,CREACION) values (18,5,'M','CARNET IDENT. MILITAR','CARNET IDENT. MILITAR',9,'A',1,SYSDATE);
INSERT into CONREC.CFG_VALOR (ID,LISTA,CODIGO,NOMBRE,DESCRIPCION,ORDEN,ESTADO,CREADOR,CREACION) values (19,5,'R','RUC','RUC',10,'A',1,SYSDATE);
INSERT into CONREC.CFG_VALOR (ID,LISTA,CODIGO,NOMBRE,DESCRIPCION,ORDEN,ESTADO,CREADOR,CREACION) values (20,5,'S','SIN DOCUMENTO','SIN DOCUMENTO',11,'A',1,SYSDATE);
INSERT into CONREC.CFG_VALOR (ID,LISTA,CODIGO,NOMBRE,DESCRIPCION,ORDEN,ESTADO,CREADOR,CREACION) values (21,5,'T','CARNET DE FUERZAS PO','CARNET DE FUERZAS PO',12,'A',1,SYSDATE);
INSERT into CONREC.CFG_VALOR (ID,LISTA,CODIGO,NOMBRE,DESCRIPCION,ORDEN,ESTADO,CREADOR,CREACION) values (22,5,'U','R.U.S.','R.U.S.',13,'A',1,SYSDATE);
INSERT into CONREC.CFG_VALOR (ID,LISTA,CODIGO,NOMBRE,DESCRIPCION,ORDEN,ESTADO,CREADOR,CREACION) values (23,5,'P','PASAPORTE','PASAPORTE',14,'A',1,SYSDATE);

--Carga de Valores (NACIONALIDAD_TIPO)
INSERT into CONREC.CFG_VALOR (ID,LISTA,CODIGO,NOMBRE,DESCRIPCION,ORDEN,ESTADO,CREADOR,CREACION) values (24,6,'P','Peruano','Nacionalidad peruana',1,'A',1,SYSDATE);
INSERT into CONREC.CFG_VALOR (ID,LISTA,CODIGO,NOMBRE,DESCRIPCION,ORDEN,ESTADO,CREADOR,CREACION) values (25,6,'E','Extranjero','Nacionalidad extranjera',2,'A',1,SYSDATE);

--Carga de Valores (ACCION)
INSERT into CONREC.CFG_VALOR (ID,LISTA,CODIGO,NOMBRE,DESCRIPCION,ORDEN,ESTADO,CREADOR,CREACION) values (26,7,'AC','Activar','Cuando se desea registrar nuevos usuarios',1,'A',1,SYSDATE);
INSERT into CONREC.CFG_VALOR (ID,LISTA,CODIGO,NOMBRE,DESCRIPCION,ORDEN,ESTADO,CREADOR,CREACION) values (27,7,'BT','Dar baja temporal','Cuando se desea dar de Baja Temporalmente a un usuario que est� Activo.',2,'A',1,SYSDATE);
INSERT into CONREC.CFG_VALOR (ID,LISTA,CODIGO,NOMBRE,DESCRIPCION,ORDEN,ESTADO,CREADOR,CREACION) values (28,7,'BD','Dar baja definitiva','Cuando se desea dar de Baja Definitivamente a un usuario que est� Activo o de Baja Temporal',3,'A',1,SYSDATE);
INSERT into CONREC.CFG_VALOR (ID,LISTA,CODIGO,NOMBRE,DESCRIPCION,ORDEN,ESTADO,CREADOR,CREACION) values (29,7,'RA','Reactivar','Cuando se desea reactivar a un usuario. S�lo para usuarios que est� con Baja Temporal',4,'A',1,SYSDATE);

--Carga de Valores (USUARIO_ESTADO)
INSERT into CONREC.CFG_VALOR (ID,LISTA,CODIGO,NOMBRE,DESCRIPCION,ORDEN,ESTADO,CREADOR,CREACION) values (30,8,'ACTIVO','Activo','Cuando se realiza la activaci�n del usuario en RENIEC',1,'A',1,SYSDATE);
INSERT into CONREC.CFG_VALOR (ID,LISTA,CODIGO,NOMBRE,DESCRIPCION,ORDEN,ESTADO,CREADOR,CREACION) values (31,8,'BAJA_TEMPORAL','Baja temporal','Cuando se realiza la baja temporal del usuario en RENIEC',2,'A',1,SYSDATE);
INSERT into CONREC.CFG_VALOR (ID,LISTA,CODIGO,NOMBRE,DESCRIPCION,ORDEN,ESTADO,CREADOR,CREACION) values (32,8,'BAJA_DEFINITIVA','Baja definitiva','Cuando se realiza la baja definitiva del usuario en RENIEC',3,'A',1,SYSDATE);
INSERT into CONREC.CFG_VALOR (ID,LISTA,CODIGO,NOMBRE,DESCRIPCION,ORDEN,ESTADO,CREADOR,CREACION) values (33,8,'ERROR_RENIEC','Error Reniec','ERROR RENIEC Cuando el aplicativo no puede ejecutar la acci�n del usuario en RENIEC',4,'A',1,SYSDATE);

--Carga de Valores (RENIEC_SITUACION)
INSERT into CONREC.CFG_VALOR (ID,LISTA,CODIGO,NOMBRE,DESCRIPCION,ORDEN,ESTADO,CREADOR,CREACION) values (34,9,'ACTIVO','Activo','Alta o Reactivaci�n de Usuario en RENIEC',1,'A',1,SYSDATE);
INSERT into CONREC.CFG_VALOR (ID,LISTA,CODIGO,NOMBRE,DESCRIPCION,ORDEN,ESTADO,CREADOR,CREACION) values (35,9,'BAJA_TEMPORAL','Baja temporal','Baja temporal de Usuario en RENIEC',2,'A',1,SYSDATE);
INSERT into CONREC.CFG_VALOR (ID,LISTA,CODIGO,NOMBRE,DESCRIPCION,ORDEN,ESTADO,CREADOR,CREACION) values (36,9,'BAJA_DEFINITIVA','Baja definitiva','Baja definitiva de usuario en RENIEC',3,'A',1,SYSDATE);

--Carga de Valores (CARGA_TIPO)
INSERT into CONREC.CFG_VALOR (ID,LISTA,CODIGO,NOMBRE,DESCRIPCION,ORDEN,ESTADO,CREADOR,CREACION) values (37,10,'CARGA_AUTO','Autom�tica','Carga Autom�tica de usuarios RENIEC',1,'A',1,SYSDATE);
INSERT into CONREC.CFG_VALOR (ID,LISTA,CODIGO,NOMBRE,DESCRIPCION,ORDEN,ESTADO,CREADOR,CREACION) values (38,10,'CARGA_MANUAL','Manual','Carga Manual de usuarios RENIEC',2,'A',1,SYSDATE);



--Carga de Parametros
INSERT into CONREC.CFG_PARAMETRO (CODIGO,NOMBRE,DESCRIPCION,VALOR,ESTADO,CREADOR,CREACION) values ('RENIEC_OFICINA','Oficina Consulta Reniec','Oficina Consulta Reniec','0756',1,1,SYSDATE);
INSERT into CONREC.CFG_PARAMETRO (CODIGO,NOMBRE,DESCRIPCION,VALOR,ESTADO,CREADOR,CREACION) values ('CONSULTA_URI','Parámetro de Consulta','{null}','Consulta',1,1,SYSDATE);
INSERT into CONREC.CFG_PARAMETRO (CODIGO,NOMBRE,DESCRIPCION,VALOR,ESTADO,CREADOR,CREACION) values ('WS_TIMEOUT','WS Time Out','Tiempo en milisegundos que se espera la respuesta de un servicio Web','15000',1,1,SYSDATE);
INSERT into CONREC.CFG_PARAMETRO (CODIGO,NOMBRE,DESCRIPCION,VALOR,ESTADO,CREADOR,CREACION) values ('CANTMAXDIGCEL','Cantidad Max.Digitos Celular','Cantidad Maxima de Digitos de Celular','9',1,1,SYSDATE);
INSERT into CONREC.CFG_PARAMETRO (CODIGO,NOMBRE,DESCRIPCION,VALOR,ESTADO,CREADOR,CREACION) values ('WS_CONTAB_URL','URL de Servicio Contabilización QH','URL de Servicio de Contabilización QH','http://118.180.34.15:9088/Modcon/ContabilizacionQH',1,1,SYSDATE);
INSERT into CONREC.CFG_PARAMETRO (CODIGO,NOMBRE,DESCRIPCION,VALOR,ESTADO,CREADOR,CREACION) values ('RENIEC_REGISTRO','Usuario Consulta Reniec','Usuario Consulta Reniec','P004266',1,1,SYSDATE);
INSERT into CONREC.CFG_PARAMETRO (CODIGO,NOMBRE,DESCRIPCION,VALOR,ESTADO,CREADOR,CREACION) values ('APP_URL_BASE','URL BASE','{null}','http://118.180.14.18/Harec',1,1,SYSDATE);
INSERT into CONREC.CFG_PARAMETRO (CODIGO,NOMBRE,DESCRIPCION,VALOR,ESTADO,CREADOR,CREACION) values ('EQUI_AUT','Equipo Autorizador','Equipo Autorizador','GER_TRR',1,1,SYSDATE);
INSERT into CONREC.CFG_PARAMETRO (CODIGO,NOMBRE,DESCRIPCION,VALOR,ESTADO,CREADOR,CREACION) values ('WS_RENIEC_URL','URL de Servicio RENIEC','URL de Servicio RENIEC','http://118.180.11.76:7800/BBVA_RENIEC_WSDLSOAP_HTTP_Service',1,1,SYSDATE);
INSERT into CONREC.CFG_PARAMETRO (CODIGO,NOMBRE,DESCRIPCION,VALOR,ESTADO,CREADOR,CREACION) values ('CORIGENHAREC','Centro Origen HAREC','Centro Origen HAREC','0756',1,1,SYSDATE);
INSERT into CONREC.CFG_PARAMETRO (CODIGO,NOMBRE,DESCRIPCION,VALOR,ESTADO,CREADOR,CREACION) values ('INF_REC','Definición de reclamo','Definición de reclamo','RECLAMO: Disconformidad relacionada a los productos y servicios',1,1,SYSDATE);
INSERT into CONREC.CFG_PARAMETRO (CODIGO,NOMBRE,DESCRIPCION,VALOR,ESTADO,CREADOR,CREACION) values ('PLANTILLAS_PATH','Directorio para plantillas','Ruta (con / al final) del directorio que almacena plantillas','/mnt/compartido/harec/reportes/',1,1,SYSDATE);
INSERT into CONREC.CFG_PARAMETRO (CODIGO,NOMBRE,DESCRIPCION,VALOR,ESTADO,CREADOR,CREACION) values ('CARGA_USUARIO','Usuario para cargas','Registro de usuario usado como creador/editor en los procesos programados de carga de datos desde WS','P015740',1,1,SYSDATE);
INSERT into CONREC.CFG_PARAMETRO (CODIGO,NOMBRE,DESCRIPCION,VALOR,ESTADO,CREADOR,CREACION) values ('ASUN_ENV_CONS','Asunto Envío de Constancia','Asunto Envío de Constancia','BBVA Atención de Reclamos',1,1,SYSDATE);
INSERT into CONREC.CFG_PARAMETRO (CODIGO,NOMBRE,DESCRIPCION,VALOR,ESTADO,CREADOR,CREACION) values ('EQUIPORETORNO','Codigo del Equipo a retornar','Codigo del Equipo a retornar','ATT_BCKEXP',1,1,SYSDATE);
INSERT into CONREC.CFG_PARAMETRO (CODIGO,NOMBRE,DESCRIPCION,VALOR,ESTADO,CREADOR,CREACION) values ('WS_SMS_URL','URL de Servicio SMS','URL de Servicio SMS','http://118.220.20.82:14041/BBVASMS/services/EnviarSMS',1,1,SYSDATE);
INSERT into CONREC.CFG_PARAMETRO (CODIGO,NOMBRE,DESCRIPCION,VALOR,ESTADO,CREADOR,CREACION) values ('ADJUNTOS_PATH','Directorio para adjuntos','Ruta (con / al final) del directorio que almacena adjuntos','/mnt/compartido/harec/adjuntos/',1,1,SYSDATE);
INSERT into CONREC.CFG_PARAMETRO (CODIGO,NOMBRE,DESCRIPCION,VALOR,ESTADO,CREADOR,CREACION) values ('CORREO_TIMEOUT','Timeout para abrir conexión SMTP','Tiempo de espera para establecer conexión con el servidor SMTP (setSocketConnectionTimeout)','10000',1,1,SYSDATE);
INSERT into CONREC.CFG_PARAMETRO (CODIGO,NOMBRE,DESCRIPCION,VALOR,ESTADO,CREADOR,CREACION) values ('CAB_DOCRPTA','Cabecera de la carta de respuesta','Cabecera de la carta de respuesta','/servidor/cabeceras/cabeceracartaderespuesta.jasper',1,1,SYSDATE);
INSERT into CONREC.CFG_PARAMETRO (CODIGO,NOMBRE,DESCRIPCION,VALOR,ESTADO,CREADOR,CREACION) values ('LOV_ESTADO','Estados para LOV','Estados base para registros en CFG_LISTA y CFG_VALOR (LOVs: List of Values)','A,I',1,1,SYSDATE);
INSERT into CONREC.CFG_PARAMETRO (CODIGO,NOMBRE,DESCRIPCION,VALOR,ESTADO,CREADOR,CREACION) values ('PRE_OPER','Prefijo Operador','Prefijo Operador','51',1,1,SYSDATE);
INSERT into CONREC.CFG_PARAMETRO (CODIGO,NOMBRE,DESCRIPCION,VALOR,ESTADO,CREADOR,CREACION) values ('FMT_MAIL_INT','Formato de correo para envío de consultas','Formato de correo para envío de consultas','/servidor/formatos/correoconsultas.jasper',1,1,SYSDATE);
INSERT into CONREC.CFG_PARAMETRO (CODIGO,NOMBRE,DESCRIPCION,VALOR,ESTADO,CREADOR,CREACION) values ('INF_QUEJ','Definición de queja','Definición de queja','QUEJA: Disconformidad no relacionada a los productos o servicios o  malestar o descontento respecto a la atención al público',1,1,SYSDATE);
INSERT into CONREC.CFG_PARAMETRO (CODIGO,NOMBRE,DESCRIPCION,VALOR,ESTADO,CREADOR,CREACION) values ('CORREO_BUZON','Remitente SMTP','Buzón remitente de correos enviados automáticamente','bbvacontinental_reclamos@bbva.com',1,1,SYSDATE);
INSERT into CONREC.CFG_PARAMETRO (CODIGO,NOMBRE,DESCRIPCION,VALOR,ESTADO,CREADOR,CREACION) values ('ASUN_ENV_CINT','Asunto Envio Consulta Interna','Asunto Envio Consulta Interna','<<TipoREQ>> <<NroREQ>> -',1,1,SYSDATE);
INSERT into CONREC.CFG_PARAMETRO (CODIGO,NOMBRE,DESCRIPCION,VALOR,ESTADO,CREADOR,CREACION) values ('MSG_ACCPROVHR','Mensaje de acciones tomadas por el proveedor mostrado en la Hoja de Reclamación','Mensaje de acciones tomadas por el proveedor mostrado en la Hoja de Reclamación','Su reclamo ha sido registrado y se procederá a su evaluación',1,1,SYSDATE);
INSERT into CONREC.CFG_PARAMETRO (CODIGO,NOMBRE,DESCRIPCION,VALOR,ESTADO,CREADOR,CREACION) values ('CAN_MAX_REQ','Cantidad Maxima de requerimientos','Cantidad Maxima de requerimientos','1000',1,1,SYSDATE);
INSERT into CONREC.CFG_PARAMETRO (CODIGO,NOMBRE,DESCRIPCION,VALOR,ESTADO,CREADOR,CREACION) values ('ASUN_ENV_DOC','Asunto Envío de Documento','Asunto Envío de Documento','BBVA Atención de Reclamos',1,1,SYSDATE);
INSERT into CONREC.CFG_PARAMETRO (CODIGO,NOMBRE,DESCRIPCION,VALOR,ESTADO,CREADOR,CREACION) values ('WS_TABLAS_URL','URL de Servicio Tablas Generales','URL de Servicio Tablas Generales','http://118.180.36.123/general/services/TablaGeneral',1,1,SYSDATE);
INSERT into CONREC.CFG_PARAMETRO (CODIGO,NOMBRE,DESCRIPCION,VALOR,ESTADO,CREADOR,CREACION) values ('PLA_ATE_REC','Información sobre el plazo de atención de un reclamo','Información sobre el plazo de atención de un reclamo','30 días como máximo de acuerdo al reglamento G-1/ SBS Servicio de Atención al Usuario',1,1,SYSDATE);
INSERT into CONREC.CFG_PARAMETRO (CODIGO,NOMBRE,DESCRIPCION,VALOR,ESTADO,CREADOR,CREACION) values ('CORREO_REMITE','Nombre Remitente SMTP','Nombre de buzón remitente de correos enviados automáticamente','BBVA Atención de Reclamos',1,1,SYSDATE);
INSERT into CONREC.CFG_PARAMETRO (CODIGO,NOMBRE,DESCRIPCION,VALOR,ESTADO,CREADOR,CREACION) values ('CODCONTAPP','Codigo de Aplicación','Codigo de Aplicación','RL2',1,1,SYSDATE);
INSERT into CONREC.CFG_PARAMETRO (CODIGO,NOMBRE,DESCRIPCION,VALOR,ESTADO,CREADOR,CREACION) values ('ENVCONSTREG','Flag de envio por correo de constancia para tipo de requerimiento distintos a Reclamos','Flag de envio por correo de constancia para tipo de requerimiento distintos a Reclamos','1',1,1,SYSDATE);
INSERT into CONREC.CFG_PARAMETRO (CODIGO,NOMBRE,DESCRIPCION,VALOR,ESTADO,CREADOR,CREACION) values ('PIE_DOCRPTA','Pie de pagina de la carta de respuesta','Pie de pagina de la carta de respuesta','/servidor/piedepagina/piecartaderespuesta.jasper',1,1,SYSDATE);
INSERT into CONREC.CFG_PARAMETRO (CODIGO,NOMBRE,DESCRIPCION,VALOR,ESTADO,CREADOR,CREACION) values ('CORREO_WAIT','Tiempo de espera para confirmación de envío de correo','Tiempo de espera para confirmación de envío de correo por parte del servidor SMTP (setSocketTimeout)','30000',1,1,SYSDATE);
INSERT into CONREC.CFG_PARAMETRO (CODIGO,NOMBRE,DESCRIPCION,VALOR,ESTADO,CREADOR,CREACION) values ('MSG_ACCPROVCON','Mensaje de acciones tomadas por el proveedor mostrado en la Constancia de la Solicitud','Mensaje de acciones tomadas por el proveedor mostrado en la Constancia de la Solicitud','Su requerimiento ha sido registrado y se procederá a su evaluación',1,1,SYSDATE);
INSERT into CONREC.CFG_PARAMETRO (CODIGO,NOMBRE,DESCRIPCION,VALOR,ESTADO,CREADOR,CREACION) values ('CORREO_SERVIDOR','Host SMTP','Nombre o dirección IP de servidor de correos','118.180.54.25',1,1,SYSDATE);
INSERT into CONREC.CFG_PARAMETRO (CODIGO,NOMBRE,DESCRIPCION,VALOR,ESTADO,CREADOR,CREACION) values ('ENVCONSCOMP','Flag Envío Constancia Completar','Flag Envío Constancia Completar','1',1,1,SYSDATE);
INSERT into CONREC.CFG_PARAMETRO (CODIGO,NOMBRE,DESCRIPCION,VALOR,ESTADO,CREADOR,CREACION) values ('PRE_ASUN','Prefijo automático del asunto de la consulta y del correo generado','{null}','BBVA Continental',1,1,SYSDATE);
INSERT into CONREC.CFG_PARAMETRO (CODIGO,NOMBRE,DESCRIPCION,VALOR,ESTADO,CREADOR,CREACION) values ('RUTA_RESPONDER','Ruta HAREC para Responder Consulta Interna','Ruta HAREC para Responder Consulta Interna','A',1,1,SYSDATE);
INSERT into CONREC.CFG_PARAMETRO (CODIGO,NOMBRE,DESCRIPCION,VALOR,ESTADO,CREADOR,CREACION) values ('ENVHOJAREG','Flag de envio por correo de hoja de reclamación para Reclamos','Flag de envio por correo de hoja de reclamación para Reclamos','1',1,1,SYSDATE);
INSERT into CONREC.CFG_PARAMETRO (CODIGO,NOMBRE,DESCRIPCION,VALOR,ESTADO,CREADOR,CREACION) values ('TAM_MAX_ANEXO','Tamaño Maximo Anexos','Tamaño Maximo Anexos','20',1,1,SYSDATE);
INSERT into CONREC.CFG_PARAMETRO (CODIGO,NOMBRE,DESCRIPCION,VALOR,ESTADO,CREADOR,CREACION) values ('GRP_NOCLASIF','Grupo de Segmento por defecto para No clasificados','Grupo de Segmento por defecto para No clasificados','NC',1,1,SYSDATE);
INSERT into CONREC.CFG_PARAMETRO (CODIGO,NOMBRE,DESCRIPCION,VALOR,ESTADO,CREADOR,CREACION) values ('GRP_NOCLIENTE','Grupo de Segmento por defecto para No clientes','Grupo de Segmento por defecto para No clientes','NCL',1,1,SYSDATE);
INSERT into CONREC.CFG_PARAMETRO (CODIGO,NOMBRE,DESCRIPCION,VALOR,ESTADO,CREADOR,CREACION) values ('ENVHOJACOMP','Flag Envío Hoja Reclamación Completar','Flag Envío Hoja Reclamación Completar','1',1,1,SYSDATE);
INSERT into CONREC.CFG_PARAMETRO (CODIGO,NOMBRE,DESCRIPCION,VALOR,ESTADO,CREADOR,CREACION) values ('WS_PERSONA_URL','URL de Servicio PEA','URL de Servicio PEA','http://118.180.36.26:7820/PosicionPersonaWS/',1,1,SYSDATE);
INSERT into CONREC.CFG_PARAMETRO (CODIGO,NOMBRE,DESCRIPCION,VALOR,ESTADO,CREADOR,CREACION) values ('DIAS_REIT','Cantidad de días del Requerimiento reiterativo','{null}','2',1,1,SYSDATE);
INSERT into CONREC.CFG_PARAMETRO (CODIGO,NOMBRE,DESCRIPCION,VALOR,ESTADO,CREADOR,CREACION) values ('CORREO_PUERTO','Puerto SMTP','Número de puerto del servidor de correos','25',1,1,SYSDATE);

--Carga de Roles
INSERT into CONREC.SEG_ROL (ID, CODIGO, NOMBRE, ESTADO, CREADOR, CREACION) VALUES (1,'ADM','ADMINISTRADOR',1,1,SYSDATE);
INSERT into CONREC.SEG_ROL (ID, CODIGO, NOMBRE, ESTADO, CREADOR, CREACION) VALUES (2,'OFI','USUARIO OFICINA',1,1,SYSDATE);
INSERT into CONREC.SEG_ROL (ID, CODIGO, NOMBRE, ESTADO, CREADOR, CREACION) VALUES (3,'ANA','ANALISTA',1,1,SYSDATE);
INSERT into CONREC.SEG_ROL (ID, CODIGO, NOMBRE, ESTADO, CREADOR, CREACION) VALUES (4,'ATE-F','FRONT',1,1,SYSDATE);
INSERT into CONREC.SEG_ROL (ID, CODIGO, NOMBRE, ESTADO, CREADOR, CREACION) VALUES (5,'ATE-B','BACK EXPRESS',1,1,SYSDATE);
INSERT into CONREC.SEG_ROL (ID, CODIGO, NOMBRE, ESTADO, CREADOR, CREACION) VALUES (6,'A-EXP','AGENTE EXPRESS PLUS',1,1,SYSDATE);
INSERT into CONREC.SEG_ROL (ID, CODIGO, NOMBRE, ESTADO, CREADOR, CREACION) VALUES (7,'G-TER','GERENTE TERRITORIAL',1,1,SYSDATE);
INSERT into CONREC.SEG_ROL (ID, CODIGO, NOMBRE, ESTADO, CREADOR, CREACION) VALUES (8,'CON','CONSOLIDADOR',1,1,SYSDATE);
INSERT into CONREC.SEG_ROL (ID, CODIGO, NOMBRE, ESTADO, CREADOR, CREACION) VALUES (9,'RCA','RESPONSABLE CARGA',1,1,SYSDATE);
INSERT into CONREC.SEG_ROL (ID, CODIGO, NOMBRE, ESTADO, CREADOR, CREACION) VALUES (10,'JEE','JEFE EQUIPO',1,1,SYSDATE);
INSERT into CONREC.SEG_ROL (ID, CODIGO, NOMBRE, ESTADO, CREADOR, CREACION) VALUES (11,'UES','UNIDADES ESPECIALIZADAS',1,1,SYSDATE);
INSERT into CONREC.SEG_ROL (ID, CODIGO, NOMBRE, ESTADO, CREADOR, CREACION) VALUES (12,'ATE-BB','ATENTO BACK BEC',1,1,SYSDATE);
INSERT into CONREC.SEG_ROL (ID, CODIGO, NOMBRE, ESTADO, CREADOR, CREACION) VALUES (13,'TRS','TRANSPARENCIA',1,1,SYSDATE);
INSERT into CONREC.SEG_ROL (ID, CODIGO, NOMBRE, ESTADO, CREADOR, CREACION) VALUES (14,'RSP_SUP','RESPONSABLES SUPERIORES',1,1,SYSDATE);
INSERT into CONREC.SEG_ROL (ID, CODIGO, NOMBRE, ESTADO, CREADOR, CREACION) VALUES (15,'ESP','ESPECIALISTA',1,1,SYSDATE);


--Carga de Opciones
INSERT into CONREC.SEG_OPCION (ID,PADRE,CODIGO,NOMBRE,ORDEN,TIPO,ESTADO,CREADOR,CREACION) VALUES (1,null,'CON','Control',1,5,1,1,SYSDATE);
INSERT into CONREC.SEG_OPCION (ID,PADRE,CODIGO,NOMBRE,ORDEN,TIPO,ESTADO,CREADOR,CREACION) VALUES (2,1,'CON_CONS','Consultantes',1,6,1,1,SYSDATE);
INSERT into CONREC.SEG_OPCION (ID,PADRE,CODIGO,NOMBRE,ORDEN,TIPO,ESTADO,CREADOR,CREACION) VALUES (3,1,'CON_CARG_MAS','Carga Masiva',2,6,1,1,SYSDATE);
INSERT into CONREC.SEG_OPCION (ID,PADRE,CODIGO,NOMBRE,ORDEN,TIPO,ESTADO,CREADOR,CREACION) VALUES (4,null,'CONF','Configuraci�n',2,5,1,1,SYSDATE);
INSERT into CONREC.SEG_OPCION (ID,PADRE,CODIGO,NOMBRE,ORDEN,TIPO,ESTADO,CREADOR,CREACION) VALUES (5,4,'CONF_PARAM','Par�metros',1,6,1,1,SYSDATE);
INSERT into CONREC.SEG_OPCION (ID,PADRE,CODIGO,NOMBRE,ORDEN,TIPO,ESTADO,CREADOR,CREACION) VALUES (6,4,'CONF_LISTAS','Listas y Valores',2,6,1,1,SYSDATE);
INSERT into CONREC.SEG_OPCION (ID,PADRE,CODIGO,NOMBRE,ORDEN,TIPO,ESTADO,CREADOR,CREACION) VALUES (7,4,'CONF_JOB','Programador de Tareas',3,6,1,1,SYSDATE);
INSERT into CONREC.SEG_OPCION (ID,PADRE,CODIGO,NOMBRE,ORDEN,TIPO,ESTADO,CREADOR,CREACION) VALUES (8,4,'CONF_DIAG','Diagnosticador de Datos',4,6,1,1,SYSDATE);
INSERT into CONREC.SEG_OPCION (ID,PADRE,CODIGO,NOMBRE,ORDEN,TIPO,ESTADO,CREADOR,CREACION) VALUES (9,4,'CONF_FICHER','Visor de Ficheros',5,6,1,1,SYSDATE);
INSERT into CONREC.SEG_OPCION (ID,PADRE,CODIGO,NOMBRE,ORDEN,TIPO,ESTADO,CREADOR,CREACION) VALUES (10,null,'SEG','Seguridad',3,5,1,1,SYSDATE);
INSERT into CONREC.SEG_OPCION (ID,PADRE,CODIGO,NOMBRE,ORDEN,TIPO,ESTADO,CREADOR,CREACION) VALUES (11,10,'SEG_ROL_MEMB','Roles y membres�as',1,6,1,1,SYSDATE);
INSERT into CONREC.SEG_OPCION (ID,PADRE,CODIGO,NOMBRE,ORDEN,TIPO,ESTADO,CREADOR,CREACION) VALUES (12,10,'SEG_OPCION','Opciones',2,6,1,1,SYSDATE);
INSERT into CONREC.SEG_OPCION (ID,PADRE,CODIGO,NOMBRE,ORDEN,TIPO,ESTADO,CREADOR,CREACION) VALUES (13,10,'SEG_PERM','Permisos',3,6,1,1,SYSDATE);


--Carga de Permisos
INSERT into CONREC.SEG_PERMISO (ID,OPCION,ROL,ESTADO,CREADOR,CREACION) VALUES (1,1,1,1,1,SYSDATE);
INSERT into CONREC.SEG_PERMISO (ID,OPCION,ROL,ESTADO,CREADOR,CREACION) VALUES (2,2,1,1,1,SYSDATE);
INSERT into CONREC.SEG_PERMISO (ID,OPCION,ROL,ESTADO,CREADOR,CREACION) VALUES (3,3,1,1,1,SYSDATE);
INSERT into CONREC.SEG_PERMISO (ID,OPCION,ROL,ESTADO,CREADOR,CREACION) VALUES (4,4,1,1,1,SYSDATE);
INSERT into CONREC.SEG_PERMISO (ID,OPCION,ROL,ESTADO,CREADOR,CREACION) VALUES (5,5,1,1,1,SYSDATE);
INSERT into CONREC.SEG_PERMISO (ID,OPCION,ROL,ESTADO,CREADOR,CREACION) VALUES (6,6,1,1,1,SYSDATE);
INSERT into CONREC.SEG_PERMISO (ID,OPCION,ROL,ESTADO,CREADOR,CREACION) VALUES (7,9,1,1,1,SYSDATE);
INSERT into CONREC.SEG_PERMISO (ID,OPCION,ROL,ESTADO,CREADOR,CREACION) VALUES (8,10,1,1,1,SYSDATE);
INSERT into CONREC.SEG_PERMISO (ID,OPCION,ROL,ESTADO,CREADOR,CREACION) VALUES (9,11,1,1,1,SYSDATE);
INSERT into CONREC.SEG_PERMISO (ID,OPCION,ROL,ESTADO,CREADOR,CREACION) VALUES (10,12,1,1,1,SYSDATE);
INSERT into CONREC.SEG_PERMISO (ID,OPCION,ROL,ESTADO,CREADOR,CREACION) VALUES (11,13,1,1,1,SYSDATE);

--Carga de Membresias
INSERT into CONREC.SEG_MEMBRESIA (ID,ROL,TIPO,VALOR,ESTADO,CREADOR,CREACION) VALUES (1,1,3,'P017433',1,1,SYSDATE);
INSERT into CONREC.SEG_MEMBRESIA (ID,ROL,TIPO,VALOR,ESTADO,CREADOR,CREACION) VALUES (2,3,3,'P015285',1,1,SYSDATE);
INSERT into CONREC.SEG_MEMBRESIA (ID,ROL,TIPO,VALOR,ESTADO,CREADOR,CREACION) VALUES (3,3,3,'P017432',1,1,SYSDATE);
INSERT into CONREC.SEG_MEMBRESIA (ID,ROL,TIPO,VALOR,ESTADO,CREADOR,CREACION) VALUES (4,4,3,'P016244',1,1,SYSDATE);
INSERT into CONREC.SEG_MEMBRESIA (ID,ROL,TIPO,VALOR,ESTADO,CREADOR,CREACION) VALUES (5,5,3,'P016390',1,1,SYSDATE);
INSERT into CONREC.SEG_MEMBRESIA (ID,ROL,TIPO,VALOR,ESTADO,CREADOR,CREACION) VALUES (6,10,3,'P007396',1,1,SYSDATE);
INSERT into CONREC.SEG_MEMBRESIA (ID,ROL,TIPO,VALOR,ESTADO,CREADOR,CREACION) VALUES (7,10,3,'P014212',1,1,SYSDATE);
INSERT into CONREC.SEG_MEMBRESIA (ID,ROL,TIPO,VALOR,ESTADO,CREADOR,CREACION) VALUES (8,10,3,'P016459',1,1,SYSDATE);
INSERT into CONREC.SEG_MEMBRESIA (ID,ROL,TIPO,VALOR,ESTADO,CREADOR,CREACION) VALUES (9,10,3,'P017431',1,1,SYSDATE);
INSERT into CONREC.SEG_MEMBRESIA (ID,ROL,TIPO,VALOR,ESTADO,CREADOR,CREACION) VALUES (10,10,3,'P014205',1,1,SYSDATE);
INSERT into CONREC.SEG_MEMBRESIA (ID,ROL,TIPO,VALOR,ESTADO,CREADOR,CREACION) VALUES (11,10,3,'P016711',1,1,SYSDATE);
INSERT into CONREC.SEG_MEMBRESIA (ID,ROL,TIPO,VALOR,ESTADO,CREADOR,CREACION) VALUES (12,1,3,'P015740',1,1,SYSDATE);
INSERT into CONREC.SEG_MEMBRESIA (ID,ROL,TIPO,VALOR,ESTADO,CREADOR,CREACION) VALUES (13,15,3,'P015780',1,1,SYSDATE);

COMMIT;
