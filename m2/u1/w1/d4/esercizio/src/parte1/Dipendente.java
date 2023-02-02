package parte1;

public class Dipendente {
	
	//dichiarazione variabile	
	static public double stipendioBase = 1000;
	private String matricola;
	private double stipendio;
	private double importoOrarioStraordinario;
	private Livello livello;
	private Dipartimento dipartimento;

	//costruttori
	public Dipendente(String mat, Dipartimento dep) {
		this.matricola = mat;
		this.setDipartimento(dep);
		this.stipendio = Dipendente.stipendioBase;
		this.setImportoOrarioStraordinario(30);
		this.livello = Livello.OPERAIO;
	}

	public Dipendente(String mat, double x, double y, Livello a, Dipartimento b) {
		this.matricola = mat;
		this.livello = a;
		
		switch(this.livello) {
		case OPERAIO:
			if(x>1600) {
				x = 1600;
			}else if(x < 1000) {
				x = 1000;
			}
			break;
		case IMPIEGATO:
			if(x>1900) {
				x = 1900;
			}else if(x < 1200) {
				x = 1200;
			}
			break;
		case QUADRO:
			if(x>2500) {
				x = 2500;
			}else if(x < 1600) {
				x = 1600;
			}
			break;
		case DIRIGENTE:
			if(x<2000) {
				x = 2000;
			}
			break;
		default:
			System.out.println("ERR");
			break;
		}
		
		this.stipendio = x;
		this.setImportoOrarioStraordinario(y);
		this.setDipartimento(b);
	}

	//metodi get e set
	public String Getmatricola() {
		return matricola;
	}

	public double getStipendio() {
		return stipendio;
	}

	public Dipartimento getDipartimento() {
		return dipartimento;
	}

	public void setDipartimento(Dipartimento dipartimento) {
		this.dipartimento = dipartimento;
	}

	public double getImportoOrarioStraordinario() {
		return importoOrarioStraordinario;
	}

	public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
		this.importoOrarioStraordinario = importoOrarioStraordinario;
	}

	public Livello getLivello() {
		return livello;
	}

	//metodi
	public void stampaDatiDipendente() {
		System.out.println("Dipendente di livello " + this.livello + ", dipartimento " + this.dipartimento
				+ ". Matricola: " + this.matricola + ", stipendio mensile di " + this.stipendio
				+ " e straordinari pagati " + this.importoOrarioStraordinario + "euro all'ora.");
	}

	public Livello promuovi() {
		switch (this.livello) {
		case OPERAIO:
			this.livello = Livello.IMPIEGATO;
			this.stipendio = this.stipendio * (1.2);
			System.out.println("Dipendente " + this.matricola + " promosso. Nuovo stipendio: "+this.stipendio);
			return this.livello;
		case IMPIEGATO:
			this.livello = Livello.QUADRO;
			this.stipendio = this.stipendio * (1.5);
			System.out.println("Dipendente " + this.matricola + " promosso. Nuovo stipendio: "+this.stipendio);
			return this.livello;
		case QUADRO:
			this.livello = Livello.DIRIGENTE;
			this.stipendio = this.stipendio * (2);
			System.out.println("Dipendente " + this.matricola + " promosso. Nuovo stipendio: "+this.stipendio);
			return this.livello;
		case DIRIGENTE:
			System.out.println("ERRORE, NON ESISTE UN LIVELLO SUPERIORE A" + " DIRIGENTE");
			return this.livello;
		default:
			System.out.println("ERROR");
			return this.livello;
		}
	}

	//metodi statici
	public static double calcolaPaga(Dipendente guy) {
		System.out.println(
				"Stipendio mensile del dipendente " + guy.livello + " " + guy.matricola + ": " + guy.stipendio);
		return guy.getStipendio();
	}

	public static double calcolaPaga(Dipendente guy, int h) {
		double stipendio = guy.getImportoOrarioStraordinario() * h;
		double newStip = guy.getStipendio() + stipendio;
		System.out.println("Stipendio mensile con " + h + " ore di straordinario: " + newStip);
		return newStip;
	}

}
