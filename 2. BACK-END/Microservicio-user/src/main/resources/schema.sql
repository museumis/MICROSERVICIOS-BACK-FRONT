CREATE TABLE USUARIO
	(
		IDUSER	VARCHAR(32) AS IDUSER PRIMARY KEY NOT NULL,
		NOMBRE	VARCHAR(11) AS NOMBRE NOT NULL UNIQUE,
		NUMUSER INT AS NUMUSER NOT NULL AUTO_INCREMENT,
		FECHAREGISTRO DATE AS FECHAREGISTRO
		
		  	
	);	
	

