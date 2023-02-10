package weeklyW2;


public class Rivista extends Scritto {

	
	private Periodicita periodicita;
	
	
	public Rivista() {	
	}
	
	public Rivista(String tit, Periodicita per, int x, int y, int z) {
		this.titolo=tit;
		this.periodicita=per;
		this.annoPubblicazione=x;
		this.pagine=y;
		this.ISBN=z;
	}

	
	//GETTER
	

	public Periodicita getPeriodicita() {
		return periodicita;
	}

	
	
	//SETTER
	
	public void setPeriodicita(Periodicita periodicita) {
		this.periodicita = periodicita;
	}
	

	  @Override
	    public String toString() {
	    	return "Titolo: " + titolo + ", periodicita: " + periodicita + ", anno di pubblicazione: " + annoPubblicazione + ", ISBN: " + ISBN;
	    }


}
