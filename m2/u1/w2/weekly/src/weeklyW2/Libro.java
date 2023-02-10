package weeklyW2;

public class Libro extends Scritto {

	private String autore;
	private String genere;
	
	
	
	public Libro () {
		
	}
	
	public Libro(String tit, String auth, String genre, int x, int y, int z) {
		this.titolo=tit;
		this.autore=auth;
		this.genere=genre;
		this.annoPubblicazione=x;
		this.pagine=y;
		this.ISBN=z;
	}

	//GETTER
	public String getAutore() {
		return autore;
	}

	public String getGenere() {
		return genere;
	}
	
	

	//SETTER
	public void setAutore(String autore) {
		if(autore.length()<2) {
			throw new IllegalArgumentException("Il nome dell'autore deve avere almeno 2 caratteri!");
		}
			this.autore = autore;			
		
	}


	public void setGenere(String genere) {
		this.genere = genere;
	}


	  @Override
	    public String toString() {
	    	return "Titolo: " + titolo + ", autore: " + autore + ", anno di pubblicazione: " + annoPubblicazione + ", genere: " + genere;
	    }


	
}
