package pt3;

public class ContoOnLine extends ContoCorrente {
	double maxPrelievo;

	ContoOnLine(String titolare, double saldo, double maxP) {
		super(titolare, saldo);
		this.maxPrelievo = maxP;
	}

	void stampaSaldo() {

		System.out.println("Titolare: " + titolare + " - Saldo: " + saldo + " - Num movimenti: " + nMovimenti
				+ " - Massimo movimenti: " + maxMovimenti + " - Massimo prelievo possibile: " + maxPrelievo);
	}

	void preleva(double x) {
		try{if (x <= maxPrelievo) {
			super.preleva(x);
		}else {
			throw new BancaException("");
		}
		} catch (BancaException e) {
			System.out.println("Il prelievo non e' disponibile!");
		}
	}
}