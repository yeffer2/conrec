spool 00_REVERSION.log

drop table RENIEC.CFG_LISTA cascade constraints;
drop table RENIEC.CFG_PARAMETRO cascade constraints;
drop table RENIEC.CFG_VALOR cascade constraints;
drop table RENIEC.SEG_MEMBRESIA cascade constraints;
drop table RENIEC.SEG_OPCION cascade constraints;
drop table RENIEC.SEG_PERMISO cascade constraints;
drop table RENIEC.SEG_ROL cascade constraints;
drop table RENIEC.SEG_USUARIO cascade constraints;
drop table RENIEC.SEQ_ENTIDAD cascade constraints;
drop table RENIEC.CTL_CONSULTANTE cascade constraints;
drop table RENIEC.CTL_CARGA cascade constraints;
drop table RENIEC.CTL_DETALLE cascade constraints;
drop table RENIEC.qrtz_job_details cascade constraints;
drop table RENIEC.qrtz_job_listeners cascade constraints;
drop table RENIEC.qrtz_triggers cascade constraints;
drop table RENIEC.qrtz_simple_triggers cascade constraints;
drop table RENIEC.qrtz_cron_triggers cascade constraints;
drop table RENIEC.qrtz_blob_triggers cascade constraints;
drop table RENIEC.qrtz_trigger_listeners cascade constraints;
drop table RENIEC.qrtz_calendars cascade constraints;
drop table RENIEC.qrtz_paused_trigger_grps cascade constraints;
drop table RENIEC.qrtz_fired_triggers cascade constraints;
drop table RENIEC.qrtz_scheduler_state cascade constraints;
drop table RENIEC.qrtz_locks cascade constraints;

spool off