package esercizio2;

public class Operatore {
	int numero;
	double creditoResiduo;
	int[][] ultimeChiamate; //new ArrayList<Integer>(Arrays.asList(arr)); 
	int numeroChiamate;
	
	
	public Operatore(int num) {
		this.numero = num;
		this.creditoResiduo = 0;
		this.ultimeChiamate = new int[5][5];
		this.numeroChiamate = 0;
	}
	
	public void ricarica(int x) {
		this.creditoResiduo= this.creditoResiduo + x;
		System.out.println("Ricarica di "+x+"€ effettuata.");
	}
	
	public void chiama(int num, int min) {
		double costoMin = 0.4;
		double costo = costoMin*min;
		this.creditoResiduo=this.creditoResiduo-costo;
		this.numeroChiamate = this.numeroChiamate + 1;
		
		System.out.println("Numero chiamato: "+num+", la chiamata e' durata "+min+" minuti.");
		System.out.println("Spesa: "+costo+". Nuovo credito residuo: "+this.creditoResiduo+".");		
	}
	
	public void call404() {
		System.out.println("Credito residuo: "+this.creditoResiduo);
	}
	
	public void info() {
		System.out.println("Salve, il suo numero e': "+this.numero+", da cui ha effettuato "+ 
				this.numeroChiamate+" chiamate. Il suo credito residuo e' di "+this.creditoResiduo+
				" euro. Buona giornata :)");
		
	}
	
}
