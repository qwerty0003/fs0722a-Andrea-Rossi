--DROP TABLE utente; ELIMINA

/*CREATE TABLE utente(
	id INT8 NOT NULL,
	nome VARCHAR NOT NULL,
	cognome VARCHAR NOT NULL,
	citta INT4 NOT NULL,
	CONSTRAINT userpk PRIMARY KEY (id)
);
CREO LA TABELLA CON I VARI PARAMETRI
*/
--ALTER TABLE utente ADD cf VARCHAR NOT NULL UNIQUE;
-- AGGIUNGO COLONNA A TABELLA

--ALTER TABLE utente DROP COLUMN cf;
--ELIMINO COLONNA DA TABELLA

--ALTER TABLE utente RENAME COLUMN citta TO city;
-- RINOMINO COLONNA TI TABELLA

--TRUNCATE utente; SVUOTO LA TABELLA

CREATE TABLE IF NOT EXISTS utente(
	id SERIAL,
	nome VARCHAR NOT NULL,
	cognome VARCHAR NOT NULL,
	citta INT4 NOT NULL,
	CONSTRAINT user_pk PRIMARY KEY (id),
	CONSTRAINT citta_fk FOREIGN KEY (citta) REFERENCES citta(id)
);

CREATE TABLE IF NOT EXISTS citta(
	id INT8 NOT NULL PRIMARY KEY,
	nome VARCHAR NOT NULL,
	provincia VARCHAR NOT NULL,
	regione VARCHAR NOT NULL
);

/* DML */

TRUNCATE utente;
TRUNCATE citta;
INSERT INTO utente (id,nome, cognome, citta) 
VALUES (1,'Mario','Rossi',1);
INSERT INTO utente (id,nome, cognome, citta) 
VALUES (2,'Peppe','Verdi',2);
INSERT INTO utente (id,nome, cognome, citta) 
VALUES (3,'Nino','Neri',1);
INSERT INTO citta (id,nome, provincia, regione) 
VALUES (1,'Roma','RO','Lazio');
INSERT INTO citta (id,nome, provincia, regione) 
VALUES (2,'Milano','MI','Lombardia');
INSERT INTO citta (id,nome, provincia, regione) 
VALUES (3,'Napoli','NA','Campania');
-- INSERISCO DATI

SELECT * FROM utente;
SELECT * FROM citta;
SELECT * FROM citta ORDER BY nome DESC;
SELECT provincia FROM citta;




