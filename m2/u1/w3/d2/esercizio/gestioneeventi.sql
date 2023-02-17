CREATE TYPE tipologia AS ENUM ('pubblico','privato');

CREATE TABLE IF NOT EXISTS Eventi
(
    id_evento serial NOT NULL PRIMARY KEY,
    titolo_evento character varying NOT NULL,
    data_evento character varying NOT NULL,
    descrizione_evento character varying NOT NULL,
    tipo_evento tipologia NOT NULL,
    max_partecipanti_evento integer NOT NULL,
	id_location integer NOT NULL,
	 FOREIGN KEY (id_location)
        REFERENCES Location (id_location)
);

CREATE TYPE sesso AS ENUM ('uomo','donna','n/a')

CREATE TABLE IF NOT EXISTS Persona
(
    id_pers serial NOT NULL PRIMARY KEY,
    nome_pers character varying NOT NULL,
    cognome_pers character varying NOT NULL,
    email_pers character varying NOT NULL,
    data_nascita_pers date NOT NULL,
    sesso_pers sesso DEFAULT 'n/a',
    listapartecipazioni_pers integer[] NOT NULL
);

CREATE TABLE IF NOT EXISTS Location
(
    id_location serial NOT NULL PRIMARY KEY,
    nome_location character varying NOT NULL,
    citta_location character varying NOT NULL
);

CREATE TYPE stato AS ENUM ('confermata','da confermare');

CREATE TABLE IF NOT EXISTS Partecipazione
(
    id_part serial NOT NULL PRIMARY KEY,
    id_persona integer NOT NULL,
    id_evento integer NOT NULL,
    stato_part stato DEFAULT 'da confermare',
	FOREIGN KEY (id_persona)
        REFERENCES Persona (id_pers),
	FOREIGN KEY (id_evento)
        REFERENCES EventI (id_evento)
);
