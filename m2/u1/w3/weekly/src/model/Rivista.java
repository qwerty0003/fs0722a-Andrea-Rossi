package model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;


@Entity
@DiscriminatorValue("Riviste")
public class Rivista extends ArticoloPubblicato{

	@Enumerated(EnumType.STRING)
	private Periodicita periodicita;
	
	public Rivista(int codiceISBN, String titolo, int annoPubblicazione, int numeroPagine,
			Periodicita periodicita) {
		super(codiceISBN, titolo, annoPubblicazione, numeroPagine);
		this.periodicita=periodicita;
	}

	public Rivista() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rivista(int codiceISBN, String titolo, int annoPubblicazione, int numeroPagine) {
		super(codiceISBN, titolo, annoPubblicazione, numeroPagine);
		// TODO Auto-generated constructor stub
	}

	public Periodicita getPeriodicita() {
		return periodicita;
	}

	public void setPeriodicita(Periodicita periodicita) {
		this.periodicita = periodicita;
	}

	@Override
	public String toString() {
		return super.toString()+"Rivista [periodicita=" + periodicita + "]";
	}
	
}