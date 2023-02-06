package pt3;

public class ContoCorrente {
	String titolare;
	int nMovimenti;
	final int maxMovimenti = 50;
	double saldo;

	ContoCorrente(String titolare, double saldo) {
		this.titolare = titolare;
		this.saldo = saldo;
		nMovimenti = 0;
	}

	void preleva(double x) {
		if (nMovimenti < maxMovimenti)
			saldo = saldo - x;
		else
			saldo = saldo - x - 0.50;
		nMovimenti++;
		
		try {
			if(saldo < 0) {
				throw new BancaException("");
			}
		} catch (BancaException e) {
			nMovimenti++;
			System.out.println("Il conto e' in rosso!");
		}
	}

	double restituisciSaldo() {
		return saldo;
	}
}
