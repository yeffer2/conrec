
/*==============================================================*/
/* Table: CFG_LISTA                                             */
/*==============================================================*/
create table CONREC.CFG_LISTA 
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

alter table CONREC.CFG_LISTA
   add constraint PK_CFG_LISTA primary key (ID);

/*==============================================================*/
/* Index: UNQ_CODIGO_LISTA                                      */
/*==============================================================*/
create unique index CONREC.UNQ_CODIGO_LISTA on CONREC.CFG_LISTA (
   CODIGO ASC
);

grant INSERT,SELECT,UPDATE,DELETE on CONREC.CFG_LISTA to APP_RENIEC;

/*==============================================================*/
/* Table: CFG_PARAMETRO                                         */
/*==============================================================*/
create table CONREC.CFG_PARAMETRO 
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

alter table CONREC.CFG_PARAMETRO
   add constraint PK_CFG_PARAMETRO primary key (CODIGO);

grant DELETE,INSERT,SELECT,UPDATE on CONREC.CFG_PARAMETRO to APP_RENIEC;

/*==============================================================*/
/* Table: CFG_VALOR                                             */
/*==============================================================*/
create table CONREC.CFG_VALOR 
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

alter table CONREC.CFG_VALOR
   add constraint PK_CFG_VALOR primary key (ID);

/*==============================================================*/
/* Index: UNQ_CODIGO_VALOR                                      */
/*==============================================================*/
create unique index CONREC.UNQ_CODIGO_VALOR on CONREC.CFG_VALOR (
   CODIGO ASC,
   LISTA ASC
);

grant DELETE,INSERT,SELECT,UPDATE on CONREC.CFG_VALOR to APP_RENIEC;

/*==============================================================*/
/* Table: SEG_MEMBRESIA                                         */
/*==============================================================*/
create table CONREC.SEG_MEMBRESIA 
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

alter table CONREC.SEG_MEMBRESIA
   add constraint PK_SEG_MEMBRESIA primary key (ID);

alter table CONREC.SEG_MEMBRESIA
   add constraint AK_UNQ_MEMBRESIA_REGI_SEG_MEMB unique (TIPO, VALOR);

grant DELETE,INSERT,SELECT,UPDATE on CONREC.SEG_MEMBRESIA to APP_RENIEC;

/*==============================================================*/
/* Table: SEG_OPCION                                            */
/*==============================================================*/
create table CONREC.SEG_OPCION 
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

alter table CONREC.SEG_OPCION
   add constraint PK_SEG_OPCION primary key (ID);

/*==============================================================*/
/* Index: UNQ_CODIGO_OPCION                                     */
/*==============================================================*/
create unique index CONREC.UNQ_CODIGO_OPCION on CONREC.SEG_OPCION (
   CODIGO ASC
);

grant DELETE,INSERT,SELECT,UPDATE on CONREC.SEG_OPCION to APP_RENIEC;

/*==============================================================*/
/* Table: SEG_PERMISO                                           */
/*==============================================================*/
create table CONREC.SEG_PERMISO 
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

alter table CONREC.SEG_PERMISO
   add constraint PK_SEG_PERMISO primary key (ID);

grant DELETE,INSERT,SELECT,UPDATE on CONREC.SEG_PERMISO to APP_RENIEC;

/*==============================================================*/
/* Table: SEG_ROL                                               */
/*==============================================================*/
create table CONREC.SEG_ROL 
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

alter table CONREC.SEG_ROL
   add constraint PK_SEG_ROL primary key (ID);

/*==============================================================*/
/* Index: UNQ_CODIGO_ROL                                        */
/*==============================================================*/
create index CONREC.UNQ_CODIGO_ROL on CONREC.SEG_ROL (
   CODIGO ASC
);

grant DELETE,INSERT,SELECT,UPDATE on CONREC.SEG_ROL to APP_RENIEC;
	
/*==============================================================*/
/* Table: SEG_USUARIO                                           */
/*==============================================================*/
create table CONREC.SEG_USUARIO 
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

alter table CONREC.SEG_USUARIO
   add constraint PK_SEG_USUARIO primary key (ID);

/*==============================================================*/
/* Index: UNQ_USUARIO                                           */
/*==============================================================*/
create unique index CONREC.UNQ_USUARIO on CONREC.SEG_USUARIO (
   REGISTRO ASC
);

grant DELETE,INSERT,SELECT,UPDATE on CONREC.SEG_USUARIO to APP_RENIEC;

/*==============================================================*/
/* Table: SEQ_ENTIDAD                                           */
/*==============================================================*/
create table CONREC.SEQ_ENTIDAD 
(
   ENTIDAD              NVARCHAR2(250)       not null,
   ULTIMO_ID            NUMBER(16)           not null
);

alter table CONREC.SEQ_ENTIDAD
   add constraint PK_SEQ_ENTIDAD primary key (ENTIDAD);

grant DELETE,INSERT,SELECT,UPDATE on CONREC.SEQ_ENTIDAD to APP_RENIEC;


alter table CONREC.CFG_LISTA
   add constraint FK_CGF_LISTA_CREADOR foreign key (CREADOR)
      references CONREC.SEG_USUARIO (ID);

alter table CONREC.CFG_LISTA
   add constraint FK_CGF_LISTA_EDITOR foreign key (EDITOR)
      references CONREC.SEG_USUARIO (ID);

alter table CONREC.CFG_PARAMETRO
   add constraint FK_CFG_PARAMETRO_CREADOR foreign key (CREADOR)
      references CONREC.SEG_USUARIO (ID);

alter table CONREC.CFG_PARAMETRO
   add constraint FK_CFG_PARAMETRO_EDITOR foreign key (EDITOR)
      references CONREC.SEG_USUARIO (ID);

alter table CONREC.CFG_PARAMETRO
   add constraint FK_CFG_PARAMETRO_ESTADO foreign key (ESTADO)
      references CONREC.CFG_VALOR (ID);
      
alter table CONREC.CFG_VALOR
   add constraint FK_CGF_VALOR_CGF_LISTA foreign key (LISTA)
      references CONREC.CFG_LISTA (ID);
      
 alter table CONREC.CFG_VALOR
   add constraint FK_CGF_VALOR_CREADOR foreign key (CREADOR)
      references CONREC.SEG_USUARIO (ID);

alter table CONREC.CFG_VALOR
   add constraint FK_CGF_VALOR_EDITOR foreign key (EDITOR)
      references CONREC.SEG_USUARIO (ID);

alter table CONREC.SEG_MEMBRESIA
   add constraint FK_SEG_MEMBRESIA_CREADOR foreign key (CREADOR)
      references CONREC.SEG_USUARIO (ID);

alter table CONREC.SEG_MEMBRESIA
   add constraint FK_SEG_MEMBRESIA_EDITOR foreign key (EDITOR)
      references CONREC.SEG_USUARIO (ID);

alter table CONREC.SEG_MEMBRESIA
   add constraint FK_SEG_MEMBRESIA_ESTADO foreign key (ESTADO)
      references CONREC.CFG_VALOR (ID);

alter table CONREC.SEG_MEMBRESIA
   add constraint FK_SEG_MEMBRESIA_SEG_ROL foreign key (ROL)
      references CONREC.SEG_ROL (ID);

alter table CONREC.SEG_MEMBRESIA
   add constraint FK_SEG_MEMBRESIA_TIPO foreign key (TIPO)
      references CONREC.CFG_VALOR (ID);

alter table CONREC.SEG_OPCION
   add constraint FK_OPCION_ESTADO foreign key (ESTADO)
      references CONREC.CFG_VALOR (ID);

alter table CONREC.SEG_OPCION
   add constraint FK_SEG_OPCION_CREADOR foreign key (CREADOR)
      references CONREC.SEG_USUARIO (ID);

alter table CONREC.SEG_OPCION
   add constraint FK_SEG_OPCION_EDITOR foreign key (EDITOR)
      references CONREC.SEG_USUARIO (ID);

alter table CONREC.SEG_OPCION
   add constraint FK_SEG_OPCION_PADRE foreign key (PADRE)
      references CONREC.SEG_OPCION (ID);

alter table CONREC.SEG_OPCION
   add constraint FK_SEG_OPCION_TIPO foreign key (TIPO)
      references CONREC.CFG_VALOR (ID);

alter table CONREC.SEG_PERMISO
   add constraint FK_SEG_PERMISO_CREADOR foreign key (CREADOR)
      references CONREC.SEG_USUARIO (ID);

alter table CONREC.SEG_PERMISO
   add constraint FK_SEG_PERMISO_EDITOR foreign key (EDITOR)
      references CONREC.SEG_USUARIO (ID);

alter table CONREC.SEG_PERMISO
   add constraint FK_SEG_PERM_FK_SEG_PE_CFG_VALO foreign key (ESTADO)
      references CONREC.CFG_VALOR (ID);

alter table CONREC.SEG_PERMISO
   add constraint FK_SEG_PERMISO_SEG_OPCION foreign key (OPCION)
      references CONREC.SEG_OPCION (ID);

alter table CONREC.SEG_PERMISO
   add constraint FK_SEG_PERMISO_SEG_ROL foreign key (ROL)
      references CONREC.SEG_ROL (ID);

alter table CONREC.SEG_ROL
   add constraint FK_SEG_ROL_CREADOR foreign key (CREADOR)
      references CONREC.SEG_USUARIO (ID);

alter table CONREC.SEG_ROL
   add constraint FK_SEG_ROL_EDITOR foreign key (EDITOR)
      references CONREC.SEG_USUARIO (ID);

alter table CONREC.SEG_ROL
   add constraint FK_SEG_ROL_ESTADO foreign key (ESTADO)
      references CONREC.CFG_VALOR (ID);

alter table CONREC.SEG_ROL
   add constraint FK_SEG_ROL_PADRE foreign key (PADRE)
      references CONREC.SEG_ROL (ID);

alter table CONREC.SEG_USUARIO
   add constraint FK_USUARIO_CREADOR foreign key (CREADOR)
      references CONREC.SEG_USUARIO (ID);

alter table CONREC.SEG_USUARIO
   add constraint FK_USUARIO_EDITOR foreign key (EDITOR)
      references CONREC.SEG_USUARIO (ID);
	  
	  
/*==============================================================*/
/* Table: CONREC.CTL_CONSULTANTE                                */
/*==============================================================*/

CREATE TABLE CONREC.CTL_CONSULTANTE (
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
  CONSTRAINT PK_CTL_CONSULTANTE PRIMARY KEY (ID), -- Primary Key
  CONSTRAINT FK_CTL_CONSULTANTE_TIPO_DOI FOREIGN KEY (TIPO_DOI)
  REFERENCES CONREC.CFG_VALOR (ID),
  CONSTRAINT FK_CTL_CONSULTANTE_ESTADO FOREIGN KEY (ESTADO)
  REFERENCES CONREC.CFG_VALOR (ID),
  CONSTRAINT FK_CTL_CONSULTANTE_NACIO FOREIGN KEY (NACIONALIDAD)
  REFERENCES CONREC.CFG_VALOR (ID),
  CONSTRAINT FK_CTL_CONSULTANTE_ORIGEN FOREIGN KEY (ORIGEN)
  REFERENCES CONREC.CFG_VALOR (ID),
  CONSTRAINT FK_CTL_CONSULTANTE_SITUACION FOREIGN KEY (SITUACION)
  REFERENCES CONREC.CFG_VALOR (ID)
  
);

grant DELETE,INSERT,SELECT,UPDATE on CONREC.CTL_CONSULTANTE to APP_RENIEC;

alter table CONREC.CTL_CONSULTANTE
   add constraint FK_CTL_CONSULTANTE_CREADOR foreign key (CREADOR)
      references CONREC.SEG_USUARIO (ID);

alter table CONREC.CTL_CONSULTANTE
   add constraint FK_CTL_CONSULTANTE_EDITOR foreign key (EDITOR)
      references CONREC.SEG_USUARIO (ID);

