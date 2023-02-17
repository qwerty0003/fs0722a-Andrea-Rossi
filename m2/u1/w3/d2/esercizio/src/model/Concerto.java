package model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import enums.Genere;

@Table(name = "concerto")
@Entity
@NamedQuery(name = "getConcertiInStreaming", query = "SELECT c FROM Concerto c" + " WHERE c.inStreaming = :cs")
@NamedQuery(name = "getConcertiPerGenere", query = "SELECT c FROM Concerto c" + " WHERE c.genere in :listagenere")
public class Concerto extends Evento {

	@Enumerated(EnumType.STRING)
	private Genere genere;
	private boolean inStreaming;

	public Concerto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Genere getGenere() {
		return genere;
	}

	public void setGenere(Genere genere) {
		this.genere = genere;
	}

	public boolean isInStreaming() {
		return inStreaming;
	}

	public void setInStreaming(boolean inStreaming) {
		this.inStreaming = inStreaming;
	}

}
