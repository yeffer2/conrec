CREATE USER APP_RENIEC IDENTIFIED BY reniec;
CREATE USER RENIEC IDENTIFIED BY reniec;
GRANT CREATE SESSION TO APP_RENIEC;
GRANT CREATE SESSION TO RENIEC;
GRANT UNLIMITED TABLESPACE TO RENIEC;