spool 01_MODEL.log

/*==============================================================*/
/* Table: CFG_LISTA                                             */
/*==============================================================*/
create table RENIEC.CFG_LISTA 
(
   ID                   NUMBER(16)            not null,
   CODIGO               NVARCHAR2(20)        not null,
   NOMBRE               NVARCHAR2(50)        not null,
   DESCRIPCION          NVARCHAR2(250),
   ESTADO               NCHAR(1)             not null,
   CREADOR              NUMBER(16)           not null,
   CREACION             TIMESTAMP            not null,
   EDITOR               NUMBER(16),
   EDICION              TIMESTAMP
);

alter table RENIEC.CFG_LISTA
   add constraint PK_CFG_LISTA primary key (ID);

/*==============================================================*/
/* Index: UNQ_CODIGO_LISTA                                      */
/*==============================================================*/
create unique index RENIEC.UNQ_CODIGO_LISTA on RENIEC.CFG_LISTA (
   CODIGO ASC
);

/*==============================================================*/
/* Table: CFG_PARAMETRO                                         */
/*==============================================================*/
create table RENIEC.CFG_PARAMETRO 
(
   CODIGO               NVARCHAR2(15)        not null,
   NOMBRE               NVARCHAR2(100)       not null,
   DESCRIPCION          NVARCHAR2(250),
   VALOR                NVARCHAR2(500)       not null,
   ESTADO               NUMBER(16)           not null,
   CREADOR              NUMBER(16)           not null,
   CREACION             TIMESTAMP            not null,
   EDITOR               NUMBER(16),
   EDICION              TIMESTAMP
);

alter table RENIEC.CFG_PARAMETRO
   add constraint PK_CFG_PARAMETRO primary key (CODIGO);

/*==============================================================*/
/* Table: CFG_VALOR                                             */
/*==============================================================*/
create table RENIEC.CFG_VALOR 
(
   ID                   NUMBER(16)           not null,
   LISTA                NUMBER(8)            not null,
   CODIGO               NVARCHAR2(15)        not null,
   NOMBRE               NVARCHAR2(100)       not null,
   ORDEN                NUMBER(8),
   DESCRIPCION          NVARCHAR2(250),
   ESTADO               NCHAR(1)             not null,
   CREADOR              NUMBER(16)           not null,
   CREACION             TIMESTAMP            not null,
   EDITOR               NUMBER(16),
   EDICION              TIMESTAMP
);

alter table RENIEC.CFG_VALOR
   add constraint PK_CFG_VALOR primary key (ID);

/*==============================================================*/
/* Index: UNQ_CODIGO_VALOR                                      */
/*==============================================================*/
create unique index RENIEC.UNQ_CODIGO_VALOR on RENIEC.CFG_VALOR (
   CODIGO ASC,
   LISTA ASC
);

/*==============================================================*/
/* Table: SEG_MEMBRESIA                                         */
/*==============================================================*/
create table RENIEC.SEG_MEMBRESIA 
(
   ID                   NUMBER(16)           not null,
   ROL                  NUMBER(8)            not null,
   TIPO                 NUMBER(16)           not null,
   VALOR                NVARCHAR2(20)        not null,
   ESTADO               NUMBER(16)           not null,
   CREADOR              NUMBER(16)           not null,
   CREACION             TIMESTAMP            not null,
   EDITOR               NUMBER(16),
   EDICION              TIMESTAMP
);

alter table RENIEC.SEG_MEMBRESIA
   add constraint PK_SEG_MEMBRESIA primary key (ID);

alter table RENIEC.SEG_MEMBRESIA
   add constraint AK_UNQ_MEMBRESIA_REGI_SEG_MEMB unique (TIPO, VALOR);

/*==============================================================*/
/* Table: SEG_OPCION                                            */
/*==============================================================*/
create table RENIEC.SEG_OPCION 
(
   ID                   NUMBER(8)            not null,
   PADRE                NUMBER(8),
   CODIGO               NVARCHAR2(50)        not null,
   NOMBRE               NVARCHAR2(100)        not null,
   DESCRIPCION          NVARCHAR2(250),
   ORDEN                NUMBER(8),
   TIPO                 NUMBER(16)           not null,
   ESTADO               NUMBER(16)           not null,
   CREADOR              NUMBER(16)           not null,
   CREACION             TIMESTAMP            not null,
   EDITOR               NUMBER(16),
   EDICION              TIMESTAMP
);

alter table RENIEC.SEG_OPCION
   add constraint PK_SEG_OPCION primary key (ID);

/*==============================================================*/
/* Index: UNQ_CODIGO_OPCION                                     */
/*==============================================================*/
create unique index RENIEC.UNQ_CODIGO_OPCION on RENIEC.SEG_OPCION (
   CODIGO ASC
);

/*==============================================================*/
/* Table: SEG_PERMISO                                           */
/*==============================================================*/
create table RENIEC.SEG_PERMISO 
(
   ID                   NUMBER(16)           not null,
   OPCION               NUMBER(16)            not null,
   ROL                  NUMBER(16)            not null,
   ESTADO               NUMBER(16)           not null,
   CREADOR              NUMBER(16)           not null,
   CREACION             TIMESTAMP            not null,
   EDITOR               NUMBER(16),
   EDICION              TIMESTAMP
);

alter table RENIEC.SEG_PERMISO
   add constraint PK_SEG_PERMISO primary key (ID);

/*==============================================================*/
/* Table: SEG_ROL                                               */
/*==============================================================*/
create table RENIEC.SEG_ROL 
(
   ID                   NUMBER(16)            not null,
   PADRE                NUMBER(8),
   CODIGO               NVARCHAR2(10),
   NOMBRE               NVARCHAR2(50),
   DESCRIPCION          NVARCHAR2(250),
   ESTADO               NUMBER(16)           not null,
   CREADOR              NUMBER(16),
   CREACION             TIMESTAMP            not null,
   EDITOR               NUMBER(16),
   EDICION              TIMESTAMP
);

alter table RENIEC.SEG_ROL
   add constraint PK_SEG_ROL primary key (ID);

/*==============================================================*/
/* Index: UNQ_CODIGO_ROL                                        */
/*==============================================================*/
create index RENIEC.UNQ_CODIGO_ROL on RENIEC.SEG_ROL (
   CODIGO ASC
);
	
/*==============================================================*/
/* Table: SEG_USUARIO                                           */
/*==============================================================*/
create table RENIEC.SEG_USUARIO 
(
   ID                   NUMBER(16)            not null,
   NOMBRES              NVARCHAR2(200)        not null,
   PATERNO              NVARCHAR2(150)        not null,
   MATERNO              NVARCHAR2(150)        not null,
   REGISTRO             NVARCHAR2(10)         not null,
   CARGO                NVARCHAR2(10)         not null,
   CARGO_NOMBRE         NVARCHAR2(50),
   CORREO               NVARCHAR2(100),
   CENTRO               NVARCHAR2(10)         not null,
   CENTRO_NOMBRE        NVARCHAR2(50),
   CREADOR              NUMBER(16),
   CREACION             TIMESTAMP             not null,
   EDITOR               NUMBER(16),
   EDICION              TIMESTAMP
);

alter table RENIEC.SEG_USUARIO
   add constraint PK_SEG_USUARIO primary key (ID);

/*==============================================================*/
/* Index: UNQ_USUARIO                                           */
/*==============================================================*/
create unique index RENIEC.UNQ_USUARIO on RENIEC.SEG_USUARIO (
   REGISTRO ASC
);

/*==============================================================*/
/* Table: SEQ_ENTIDAD                                           */
/*==============================================================*/
create table RENIEC.SEQ_ENTIDAD 
(
   ENTIDAD              NVARCHAR2(250)       not null,
   ULTIMO_ID            NUMBER(16)           not null
);

alter table RENIEC.SEQ_ENTIDAD
   add constraint PK_SEQ_ENTIDAD primary key (ENTIDAD);

alter table RENIEC.CFG_LISTA
   add constraint FK_CGF_LISTA_CREADOR foreign key (CREADOR)
      references RENIEC.SEG_USUARIO (ID);

alter table RENIEC.CFG_LISTA
   add constraint FK_CGF_LISTA_EDITOR foreign key (EDITOR)
      references RENIEC.SEG_USUARIO (ID);

alter table RENIEC.CFG_PARAMETRO
   add constraint FK_CFG_PARAMETRO_CREADOR foreign key (CREADOR)
      references RENIEC.SEG_USUARIO (ID);

alter table RENIEC.CFG_PARAMETRO
   add constraint FK_CFG_PARAMETRO_EDITOR foreign key (EDITOR)
      references RENIEC.SEG_USUARIO (ID);

alter table RENIEC.CFG_PARAMETRO
   add constraint FK_CFG_PARAMETRO_ESTADO foreign key (ESTADO)
      references RENIEC.CFG_VALOR (ID);
      
alter table RENIEC.CFG_VALOR
   add constraint FK_CGF_VALOR_CGF_LISTA foreign key (LISTA)
      references RENIEC.CFG_LISTA (ID);
      
 alter table RENIEC.CFG_VALOR
   add constraint FK_CGF_VALOR_CREADOR foreign key (CREADOR)
      references RENIEC.SEG_USUARIO (ID);

alter table RENIEC.CFG_VALOR
   add constraint FK_CGF_VALOR_EDITOR foreign key (EDITOR)
      references RENIEC.SEG_USUARIO (ID);

alter table RENIEC.SEG_MEMBRESIA
   add constraint FK_SEG_MEMBRESIA_CREADOR foreign key (CREADOR)
      references RENIEC.SEG_USUARIO (ID);

alter table RENIEC.SEG_MEMBRESIA
   add constraint FK_SEG_MEMBRESIA_EDITOR foreign key (EDITOR)
      references RENIEC.SEG_USUARIO (ID);

alter table RENIEC.SEG_MEMBRESIA
   add constraint FK_SEG_MEMBRESIA_ESTADO foreign key (ESTADO)
      references RENIEC.CFG_VALOR (ID);

alter table RENIEC.SEG_MEMBRESIA
   add constraint FK_SEG_MEMBRESIA_SEG_ROL foreign key (ROL)
      references RENIEC.SEG_ROL (ID);

alter table RENIEC.SEG_MEMBRESIA
   add constraint FK_SEG_MEMBRESIA_TIPO foreign key (TIPO)
      references RENIEC.CFG_VALOR (ID);

alter table RENIEC.SEG_OPCION
   add constraint FK_OPCION_ESTADO foreign key (ESTADO)
      references RENIEC.CFG_VALOR (ID);

alter table RENIEC.SEG_OPCION
   add constraint FK_SEG_OPCION_CREADOR foreign key (CREADOR)
      references RENIEC.SEG_USUARIO (ID);

alter table RENIEC.SEG_OPCION
   add constraint FK_SEG_OPCION_EDITOR foreign key (EDITOR)
      references RENIEC.SEG_USUARIO (ID);

alter table RENIEC.SEG_OPCION
   add constraint FK_SEG_OPCION_PADRE foreign key (PADRE)
      references RENIEC.SEG_OPCION (ID);

alter table RENIEC.SEG_OPCION
   add constraint FK_SEG_OPCION_TIPO foreign key (TIPO)
      references RENIEC.CFG_VALOR (ID);

alter table RENIEC.SEG_PERMISO
   add constraint FK_SEG_PERMISO_CREADOR foreign key (CREADOR)
      references RENIEC.SEG_USUARIO (ID);

alter table RENIEC.SEG_PERMISO
   add constraint FK_SEG_PERMISO_EDITOR foreign key (EDITOR)
      references RENIEC.SEG_USUARIO (ID);

alter table RENIEC.SEG_PERMISO
   add constraint FK_SEG_PERM_FK_SEG_PE_CFG_VALO foreign key (ESTADO)
      references RENIEC.CFG_VALOR (ID);

alter table RENIEC.SEG_PERMISO
   add constraint FK_SEG_PERMISO_SEG_OPCION foreign key (OPCION)
      references RENIEC.SEG_OPCION (ID);

alter table RENIEC.SEG_PERMISO
   add constraint FK_SEG_PERMISO_SEG_ROL foreign key (ROL)
      references RENIEC.SEG_ROL (ID);

alter table RENIEC.SEG_ROL
   add constraint FK_SEG_ROL_CREADOR foreign key (CREADOR)
      references RENIEC.SEG_USUARIO (ID);

alter table RENIEC.SEG_ROL
   add constraint FK_SEG_ROL_EDITOR foreign key (EDITOR)
      references RENIEC.SEG_USUARIO (ID);

alter table RENIEC.SEG_ROL
   add constraint FK_SEG_ROL_ESTADO foreign key (ESTADO)
      references RENIEC.CFG_VALOR (ID);

alter table RENIEC.SEG_ROL
   add constraint FK_SEG_ROL_PADRE foreign key (PADRE)
      references RENIEC.SEG_ROL (ID);

alter table RENIEC.SEG_USUARIO
   add constraint FK_USUARIO_CREADOR foreign key (CREADOR)
      references RENIEC.SEG_USUARIO (ID);

alter table RENIEC.SEG_USUARIO
   add constraint FK_USUARIO_EDITOR foreign key (EDITOR)
      references RENIEC.SEG_USUARIO (ID);
	  
/*==============================================================*/
/* Table: RENIEC.CTL_CONSULTANTE                                */
/*==============================================================*/

CREATE TABLE RENIEC.CTL_CONSULTANTE
  (
    ID            NUMBER(16),
    IDENTIFICADOR NVARCHAR2(20) NOT NULL,
    CODIGO_RENIEC NVARCHAR2(20) NOT NULL,
    TIPO_DOI      NUMBER(16)    NOT NULL,
    DOI           NVARCHAR2(20) NOT NULL,
    NOMBRES       NVARCHAR2(60) NOT NULL,
    PATERNO       NVARCHAR2(40) NOT NULL,
    MATERNO       NVARCHAR2(40),
    NACIMIENTO    TIMESTAMP(6)  NOT NULL,
    NACIONALIDAD  NUMBER(16)    NOT NULL,
    CENTRO        NVARCHAR2(10) NOT NULL,
    ORIGEN        NUMBER(16)    NOT NULL,
    ESTADO        NUMBER(16)    NOT NULL,
    SITUACION     NUMBER(16) NOT NULL,
    CREADOR       NUMBER(16)    NOT NULL,
    CREACION      TIMESTAMP(6)  NOT NULL,
    EDITOR        NUMBER(16),
    EDICION       TIMESTAMP(6),
    CONSTRAINT PK_CTL_CONSULTANTE PRIMARY KEY (ID),
    CONSTRAINT FK_CTL_CONSULTANTE_TIPO_DOI FOREIGN KEY (TIPO_DOI)
    REFERENCES RENIEC.CFG_VALOR (ID),
    CONSTRAINT FK_CTL_CONSULTANTE_ESTADO FOREIGN KEY (ESTADO)
    REFERENCES RENIEC.CFG_VALOR (ID),
    CONSTRAINT FK_CTL_CONSULTANTE_NACIO FOREIGN KEY (NACIONALIDAD)
    REFERENCES RENIEC.CFG_VALOR (ID),
    CONSTRAINT FK_CTL_CONSULTANTE_ORIGEN FOREIGN KEY (ORIGEN)
    REFERENCES RENIEC.CFG_VALOR (ID),
    CONSTRAINT FK_CTL_CONSULTANTE_SITUACION FOREIGN KEY (SITUACION)
    REFERENCES RENIEC.CFG_VALOR (ID)
);

alter table RENIEC.CTL_CONSULTANTE
   add constraint FK_CTL_CONSULTANTE_CREADOR foreign key (CREADOR)
      references RENIEC.SEG_USUARIO (ID);

alter table RENIEC.CTL_CONSULTANTE
   add constraint FK_CTL_CONSULTANTE_EDITOR foreign key (EDITOR)
      references RENIEC.SEG_USUARIO (ID);
      
      
/*==============================================================*/
/* Table: RENIEC.CTL_CARGA                                      */
/*==============================================================*/
      
CREATE TABLE RENIEC.CTL_CARGA (
  ID 			NUMBER(16),
  TIPO			NUMBER(16) 			NOT NULL,
  ORIGEN 		NUMBER(16) 			NOT NULL,
  FECHA 		TIMESTAMP(6) 		NOT NULL,
  FICHERO		NVARCHAR2(250),
  INICIO 		TIMESTAMP(6),
  FIN 			TIMESTAMP(6),
  ESTADO 		NUMBER(16) 			NOT NULL,
  MENSAJE 		NVARCHAR2(250),
  CREADOR 		NUMBER(16) 			NOT NULL,
  CREACION 		TIMESTAMP(6) 		NOT NULL,
  EDITOR 		NUMBER(16),
  EDICION 		TIMESTAMP(6),
  CONSTRAINT PK_CTL_CARGA PRIMARY KEY (ID),
  CONSTRAINT FK_CTL_CARGA_CREADOR FOREIGN KEY (CREADOR)
    		 REFERENCES RENIEC.SEG_USUARIO(ID),
  CONSTRAINT FK_CTL_CARGA_EDITOR FOREIGN KEY (EDITOR)
    		 REFERENCES RENIEC.SEG_USUARIO(ID),
  CONSTRAINT FK_CTL_CARGA_ESTADO FOREIGN KEY (ESTADO)
    		 REFERENCES RENIEC.CFG_VALOR(ID),
  CONSTRAINT FK_CTL_CARGA_ORIGEN FOREIGN KEY (ORIGEN)
    		 REFERENCES RENIEC.CFG_VALOR(ID),
  CONSTRAINT FK_CTL_CARGA_TIPO FOREIGN KEY (TIPO)
    		 REFERENCES RENIEC.CFG_VALOR(ID)
);

/*==============================================================*/
/* Table: RENIEC.CTL_DETALLE                                    */
/*==============================================================*/

CREATE TABLE RENIEC.CTL_DETALLE (
  ID 				NUMBER(16),
  CARGA 			NUMBER(16) 			NOT NULL,
  CONSULTANTE 		NUMBER(16) 			NOT NULL,
  IDENTIFICADOR 	NVARCHAR2(20),
  NACIONALIDAD 		NVARCHAR2(1),
  NOMBRES 			NVARCHAR2(60),
  PATERNO 			NVARCHAR2(40),
  MATERNO 			NVARCHAR2(40),
  ORIGEN 			NVARCHAR2(15),
  CODIGO_RENIEC 	NVARCHAR2(20),
  NACIMIENTO 		NVARCHAR2(10),
  TIPO_DOI 			NVARCHAR2(2),
  NUMERO_DOI 		NVARCHAR2(10),
  ACCION 			NVARCHAR2(2),
  CENTRO 			NVARCHAR2(4),
  MENSAJE 			NVARCHAR2(250),  
  NRO_FILA       	NUMBER(16),
  CREADOR 			NUMBER(16) 			NOT NULL,
  CREACION 			TIMESTAMP(6) 		NOT NULL,
  EDITOR 			NUMBER(16),
  EDICION 			TIMESTAMP(6),
  CONSTRAINT PK_CTL_DETALLE PRIMARY KEY (ID),
  CONSTRAINT FK_CTL_DETALLE_CARGA FOREIGN KEY (CARGA)
    		 REFERENCES RENIEC.CTL_CARGA(ID),
  CONSTRAINT FK_CTL_DETALLE_CONSULTANTE FOREIGN KEY (CONSULTANTE)
    		 REFERENCES RENIEC.CTL_CONSULTANTE(ID),
  CONSTRAINT FK_CTL_DETALLE_CREADOR FOREIGN KEY (CREADOR)
    		 REFERENCES RENIEC.SEG_USUARIO(ID),
  CONSTRAINT FK_CTL_DETALLE_EDITOR FOREIGN KEY (EDITOR)
    		 REFERENCES RENIEC.SEG_USUARIO(ID)
);

CREATE TABLE RENIEC.qrtz_job_details
  (
    JOB_NAME  VARCHAR2(200) NOT NULL,
    JOB_GROUP VARCHAR2(200) NOT NULL,
    DESCRIPTION VARCHAR2(250) NULL,
    JOB_CLASS_NAME   VARCHAR2(250) NOT NULL, 
    IS_DURABLE VARCHAR2(1) NOT NULL,
    IS_VOLATILE VARCHAR2(1) NOT NULL,
    IS_STATEFUL VARCHAR2(1) NOT NULL,
    REQUESTS_RECOVERY VARCHAR2(1) NOT NULL,
    JOB_DATA BLOB NULL,
    PRIMARY KEY (JOB_NAME,JOB_GROUP)
);

CREATE TABLE RENIEC.qrtz_job_listeners
  (
    JOB_NAME  VARCHAR2(200) NOT NULL, 
    JOB_GROUP VARCHAR2(200) NOT NULL,
    JOB_LISTENER VARCHAR2(200) NOT NULL,
    PRIMARY KEY (JOB_NAME,JOB_GROUP,JOB_LISTENER),
    FOREIGN KEY (JOB_NAME,JOB_GROUP) 
	REFERENCES RENIEC.QRTZ_JOB_DETAILS(JOB_NAME,JOB_GROUP)
);

CREATE TABLE RENIEC.qrtz_triggers
  (
    TRIGGER_NAME VARCHAR2(200) NOT NULL,
    TRIGGER_GROUP VARCHAR2(200) NOT NULL,
    JOB_NAME  VARCHAR2(200) NOT NULL, 
    JOB_GROUP VARCHAR2(200) NOT NULL,
    IS_VOLATILE VARCHAR2(1) NOT NULL,
    DESCRIPTION VARCHAR2(250) NULL,
    NEXT_FIRE_TIME NUMBER(13) NULL,
    PREV_FIRE_TIME NUMBER(13) NULL,
    PRIORITY NUMBER(13) NULL,
    TRIGGER_STATE VARCHAR2(16) NOT NULL,
    TRIGGER_TYPE VARCHAR2(8) NOT NULL,
    START_TIME NUMBER(13) NOT NULL,
    END_TIME NUMBER(13) NULL,
    CALENDAR_NAME VARCHAR2(200) NULL,
    MISFIRE_INSTR NUMBER(2) NULL,
    JOB_DATA BLOB NULL,
    PRIMARY KEY (TRIGGER_NAME,TRIGGER_GROUP),
    FOREIGN KEY (JOB_NAME,JOB_GROUP) 
	REFERENCES RENIEC.QRTZ_JOB_DETAILS(JOB_NAME,JOB_GROUP) 
);

CREATE TABLE RENIEC.qrtz_simple_triggers
  (
    TRIGGER_NAME VARCHAR2(200) NOT NULL,
    TRIGGER_GROUP VARCHAR2(200) NOT NULL,
    REPEAT_COUNT NUMBER(7) NOT NULL,
    REPEAT_INTERVAL NUMBER(12) NOT NULL,
    TIMES_TRIGGERED NUMBER(10) NOT NULL,
    PRIMARY KEY (TRIGGER_NAME,TRIGGER_GROUP),
    FOREIGN KEY (TRIGGER_NAME,TRIGGER_GROUP) 
	REFERENCES RENIEC.QRTZ_TRIGGERS(TRIGGER_NAME,TRIGGER_GROUP)
);

CREATE TABLE RENIEC.qrtz_cron_triggers
  (
    TRIGGER_NAME VARCHAR2(200) NOT NULL,
    TRIGGER_GROUP VARCHAR2(200) NOT NULL,
    CRON_EXPRESSION VARCHAR2(120) NOT NULL,
    TIME_ZONE_ID VARCHAR2(80),
    PRIMARY KEY (TRIGGER_NAME,TRIGGER_GROUP),
    FOREIGN KEY (TRIGGER_NAME,TRIGGER_GROUP) 
	REFERENCES RENIEC.QRTZ_TRIGGERS(TRIGGER_NAME,TRIGGER_GROUP)
);

CREATE TABLE RENIEC.qrtz_blob_triggers
  (
    TRIGGER_NAME VARCHAR2(200) NOT NULL,
    TRIGGER_GROUP VARCHAR2(200) NOT NULL,
    BLOB_DATA BLOB NULL,
    PRIMARY KEY (TRIGGER_NAME,TRIGGER_GROUP),
    FOREIGN KEY (TRIGGER_NAME,TRIGGER_GROUP) 
        REFERENCES RENIEC.QRTZ_TRIGGERS(TRIGGER_NAME,TRIGGER_GROUP)
);

CREATE TABLE RENIEC.qrtz_trigger_listeners
  (
    TRIGGER_NAME  VARCHAR2(200) NOT NULL, 
    TRIGGER_GROUP VARCHAR2(200) NOT NULL,
    TRIGGER_LISTENER VARCHAR2(200) NOT NULL,
    PRIMARY KEY (TRIGGER_NAME,TRIGGER_GROUP,TRIGGER_LISTENER),
    FOREIGN KEY (TRIGGER_NAME,TRIGGER_GROUP) 
	REFERENCES RENIEC.QRTZ_TRIGGERS(TRIGGER_NAME,TRIGGER_GROUP)
);

CREATE TABLE RENIEC.qrtz_calendars
  (
    CALENDAR_NAME  VARCHAR2(200) NOT NULL, 
    CALENDAR BLOB NOT NULL,
    PRIMARY KEY (CALENDAR_NAME)
);

CREATE TABLE RENIEC.qrtz_paused_trigger_grps
  (
    TRIGGER_GROUP  VARCHAR2(200) NOT NULL, 
    PRIMARY KEY (TRIGGER_GROUP)
);

CREATE TABLE RENIEC.qrtz_fired_triggers 
  (
    ENTRY_ID VARCHAR2(95) NOT NULL,
    TRIGGER_NAME VARCHAR2(200) NOT NULL,
    TRIGGER_GROUP VARCHAR2(200) NOT NULL,
    IS_VOLATILE VARCHAR2(1) NOT NULL,
    INSTANCE_NAME VARCHAR2(200) NOT NULL,
    FIRED_TIME NUMBER(13) NOT NULL,
    PRIORITY NUMBER(13) NOT NULL,
    STATE VARCHAR2(16) NOT NULL,
    JOB_NAME VARCHAR2(200) NULL,
    JOB_GROUP VARCHAR2(200) NULL,
    IS_STATEFUL VARCHAR2(1) NULL,
    REQUESTS_RECOVERY VARCHAR2(1) NULL,
    PRIMARY KEY (ENTRY_ID)
);

CREATE TABLE RENIEC.qrtz_scheduler_state 
  (
    INSTANCE_NAME VARCHAR2(200) NOT NULL,
    LAST_CHECKIN_TIME NUMBER(13) NOT NULL,
    CHECKIN_INTERVAL NUMBER(13) NOT NULL,
    PRIMARY KEY (INSTANCE_NAME)
);

CREATE TABLE RENIEC.qrtz_locks
  (
    LOCK_NAME  VARCHAR2(40) NOT NULL, 
    PRIMARY KEY (LOCK_NAME)
);

create index RENIEC.idx_qrtz_j_req_recovery on RENIEC.qrtz_job_details(REQUESTS_RECOVERY);
create index RENIEC.idx_qrtz_t_next_fire_time on RENIEC.qrtz_triggers(NEXT_FIRE_TIME);
create index RENIEC.idx_qrtz_t_state on RENIEC.qrtz_triggers(TRIGGER_STATE);
create index RENIEC.idx_qrtz_t_nft_st on RENIEC.qrtz_triggers(NEXT_FIRE_TIME,TRIGGER_STATE);
create index RENIEC.idx_qrtz_t_volatile on RENIEC.qrtz_triggers(IS_VOLATILE);
create index RENIEC.idx_qrtz_ft_trig_name on RENIEC.qrtz_fired_triggers(TRIGGER_NAME);
create index RENIEC.idx_qrtz_ft_trig_group on RENIEC.qrtz_fired_triggers(TRIGGER_GROUP);
create index RENIEC.idx_qrtz_ft_trig_nm_gp on RENIEC.qrtz_fired_triggers(TRIGGER_NAME,TRIGGER_GROUP);
create index RENIEC.idx_qrtz_ft_trig_volatile on RENIEC.qrtz_fired_triggers(IS_VOLATILE);
create index RENIEC.idx_qrtz_ft_trig_inst_name on RENIEC.qrtz_fired_triggers(INSTANCE_NAME);
create index RENIEC.idx_qrtz_ft_job_name on RENIEC.qrtz_fired_triggers(JOB_NAME);
create index RENIEC.idx_qrtz_ft_job_group on RENIEC.qrtz_fired_triggers(JOB_GROUP);
create index RENIEC.idx_qrtz_ft_job_stateful on RENIEC.qrtz_fired_triggers(IS_STATEFUL);
create index RENIEC.idx_qrtz_ft_job_req_recovery on RENIEC.qrtz_fired_triggers(REQUESTS_RECOVERY);

spool off