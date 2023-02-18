package model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.NamedQuery;



@Entity
@DiscriminatorValue("Libro")
@NamedQuery(name = "ottieniElementoDaAutore", query = "SELECT l FROM Libro l WHERE l.autore = :valore")
public class Libro extends ArticoloPubblicato{

	private String autore;
	@Enumerated(EnumType.STRING)
	private Genere genere;
	
	public Libro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Libro(int codiceISBN, String titolo, int annoPubblicazione, int numeroPagine) {
		super(codiceISBN, titolo, annoPubblicazione, numeroPagine);
		// TODO Auto-generated constructor stub
	}

	public Libro(int codiceISBN, String titolo, int annoPubblicazione, int numeroPagine, String autore,
			Genere genere) {
		super(codiceISBN, titolo, annoPubblicazione, numeroPagine);
		this.autore=autore;
		this.genere=genere;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public Genere getGenere() {
		return genere;
	}

	public void setGenere(Genere genere) {
		this.genere = genere;
	}

	@Override
	public String toString() {
		return super.toString()+"Libro [autore=" + autore + ", genere=" + genere + "]";
	}
}
