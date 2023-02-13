/*DROP TABLE fatture;
DROP TABLE clienti;
DROP TABLE fornitori;
DROP TABLE prodotti;*/

/*CREATE TABLE clienti(
	numerocliente SERIAL PRIMARY KEY,
	nome VARCHAR NOT NULL,
	cognome VARCHAR NOT NULL,
	datanascita INT4 NOT NULL,
	regioneresidenza VARCHAR NOT NULL
);

CREATE TABLE fornitori(
	numerofornitore SERIAL PRIMARY KEY,
	denominazione VARCHAR NOT NULL,
	regioneresidenza VARCHAR NOT NULL
); 

CREATE TABLE prodotti(
	idprodotto SERIAL PRIMARY KEY,
	descrizione VARCHAR NOT NULL,
	inproduzione BOOLEAN NOT NULL,
	incommercio BOOLEAN NOT NULL,
	dataattivazione INT4 NOT NULL,
	datadisattivazione INT4 NULL
); 

CREATE TABLE fatture(
	numerofatture SERIAL PRIMARY KEY,
	tipologia VARCHAR NOT NULL,
	importo REAL NOT NULL,
	iva REAL NOT NULL,
	datafattura INT4 NOT NULL,
	idcliente INT8 NOT NULL,
	numerofornitore INT8 NOT NULL,
	CONSTRAINT clienti_fk FOREIGN KEY (idcliente) REFERENCES clienti(numerocliente),
	CONSTRAINT fornitori_fk FOREIGN KEY (numerofornitore) REFERENCES fornitori(numerofornitore)
); */


/*INSERT INTO clienti (nome,cognome,datanascita,regioneresidenza) VALUES ('Mario','Rossi',1982,'Lombardia');
INSERT INTO clienti (nome,cognome,datanascita,regioneresidenza) VALUES ('Beppe','Verdi',1980,'Lazio');
INSERT INTO clienti (nome,cognome,datanascita,regioneresidenza) VALUES ('Nino','Neri',1982,'Calabria');
INSERT INTO clienti (nome,cognome,datanascita,regioneresidenza) VALUES ('Mariolino','Bianchi',1990,'Lombardia');

INSERT INTO fornitori (denominazione,regioneresidenza) VALUES ('Carne a volontà','Lombardia');
INSERT INTO fornitori (denominazione,regioneresidenza) VALUES ('Pesce & Crostacei','Calabria');
INSERT INTO fornitori (denominazione,regioneresidenza) VALUES ('Tutto e di più','Lazio');

INSERT INTO prodotti (descrizione,inproduzione,incommercio,dataattivazione,datadisattivazione) VALUES ('T-shirt blu M',true,true,2017,2025);
INSERT INTO prodotti (descrizione,inproduzione,incommercio,dataattivazione,datadisattivazione) VALUES ('Berretto lana nero TU',false,true,2017,2021);
INSERT INTO prodotti (descrizione,inproduzione,incommercio,dataattivazione) VALUES ('T-shirt rossa XL',true,false,2019);
INSERT INTO prodotti (descrizione,inproduzione,incommercio,dataattivazione) VALUES ('Alexa',true,true,2015);
INSERT INTO prodotti (descrizione,inproduzione,incommercio,dataattivazione,datadisattivazione) VALUES ('Google Stadia',false,false,2016,2022);

INSERT INTO fatture (tipologia,importo,iva,datafattura,idcliente,numerofornitore) VALUES ('A',160.99,20,2021,1,1);
INSERT INTO fatture (tipologia,importo,iva,datafattura,idcliente,numerofornitore) VALUES ('A',350.56,20,2020,2,3);
INSERT INTO fatture (tipologia,importo,iva,datafattura,idcliente,numerofornitore) VALUES ('B',60.00,24,2018,3,2);
INSERT INTO fatture (tipologia,importo,iva,datafattura,idcliente,numerofornitore) VALUES ('A',124.75,20,2021,3,3);
INSERT INTO fatture (tipologia,importo,iva,datafattura,idcliente,numerofornitore) VALUES ('B',27.45,14,2023,4,1);
INSERT INTO fatture (tipologia,importo,iva,datafattura,idcliente,numerofornitore) VALUES ('A',77.45,20,2021,4,1);
*/

/*TRUNCATE fatture;
TRUNCATE clienti;
TRUNCATE prodotti;
TRUNCATE fornitori;*/

--ESERCIZIO
--nome e cognome nati nell 82
SELECT nome, cognome FROM clienti WHERE datanascita = 1982;

--numero fatture con iva al 20%
SELECT count(numerofatture)"Il numero delle fatture con IVA al 20%" 
FROM fatture WHERE iva = 20;

--num fatture e somma importi divise per anno
SELECT datafattura,count(*)"Numero fatture",sum(importo)"Somma importi" 
FROM fatture GROUP BY datafattura;

--prod attivati nel 2017 in produzione  o in commercio
SELECT *
FROM prodotti
WHERE dataattivazione = 2017 
AND (inproduzione = true OR incommercio = true);

--fatture con iva al 20%, num fatture annuo
SELECT datafattura, count(*) FROM fatture
WHERE iva = 20 GROUP BY datafattura;

--anni in cui ci sono più di due fatture di tipo A
SELECT datafattura AS anno, 
COUNT(*) "num fatture tipo A"
FROM fatture
WHERE tipologia = 'A'
GROUP BY anno
HAVING COUNT(*) > 2

--elenco fatture con nome fornitore
SELECT fa.numerofatture,fa.importo,
fa.iva,fa.datafattura,fo.denominazione 
FROM fatture AS fa FULL JOIN fornitori AS fo 
ON fa.numerofornitore = fo.numerofornitore;

--tot importi fatture divisi per residenza cliente
SELECT c.regioneresidenza, SUM(f.importo) 
FROM fatture AS f FULL JOIN clienti AS c
ON f.idcliente = c.numerocliente GROUP BY c.regioneresidenza;

--num di clienti nati nell 80 con almeno una fattura > 50€
SELECT c.nome, 
COUNT(c.numerocliente)"Fatture superiori a 50€ da clienti del 1980",
f.importo FROM fatture AS f FULL JOIN clienti 
AS c ON f.idcliente = c.numerocliente 
WHERE c.datanascita = 1980 AND f.importo > 50 
GROUP BY c.nome,f.importo;

--colonna Denominazione con nome+"-"+cognome per i soli residenti della Lombardia
SELECT concat(nome,'-',cognome) "Denominazione" 
FROM clienti 
WHERE regioneresidenza = 'Lombardia';