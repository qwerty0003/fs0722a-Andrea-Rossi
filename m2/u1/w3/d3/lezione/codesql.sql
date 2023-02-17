CREATE TABLE IF NOT EXISTS Utente
(
    id_utente serial NOT NULL PRIMARY KEY,
    nome_utente character varying NOT NULL,
    cognome_utente character varying NOT NULL,
    citta_utente character varying
);

CREATE TABLE IF NOT EXISTS Credenziali (
    id_credenziali serial NOT NULL PRIMARY KEY,
    email character varying NOT NULL UNIQUE,
    password character varying NOT NULL,
    CONSTRAINT credenziali_utente_FK 
    FOREIGN KEY (id_credenziali) REFERENCES Utente(id_utente)
);

CREATE TABLE IF NOT EXISTS Post
(
    id_post serial NOT NULL PRIMARY KEY,
    testo_post character varying NOT NULL,
    data_post timestamp with time zone NOT NULL DEFAULT 'NOW()',
    id_utente integer NOT NULL,
    CONSTRAINT post_utenti_FK FOREIGN KEY (id_utente)
        REFERENCES Utente (id_utente)
);

CREATE TABLE IF NOT EXISTS Gruppo
(
    id_gruppo serial NOT NULL PRIMARY KEY,
    nome_gruppo character varying NOT NULL UNIQUE
);

CREATE TYPE permessi AS ENUM ('admin','user','editor');

CREATE TABLE IF NOT EXISTS Appartiene
(
    id_utente integer NOT NULL,
    id_gruppo integer NOT NULL,
    CONSTRAINT appartiene_utente_FK FOREIGN KEY (id_utente)
        REFERENCES Utente (id_utente),
    CONSTRAINT appartiene_gruppo_FK FOREIGN KEY (id_gruppo)
        REFERENCES Gruppo (id_gruppo)
);