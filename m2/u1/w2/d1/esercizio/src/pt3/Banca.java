package pt3;

public class Banca {
	public static void main(String args[]) throws BancaException {
		ContoCorrente conto1 = new ContoCorrente("Grossi Mario", 20000.0);

		System.out.println("Saldo conto: " + conto1.restituisciSaldo());

		conto1.preleva(1750.5);

		System.out.println("Saldo conto: " + conto1.restituisciSaldo());

		ContoOnLine conto2 = new ContoOnLine("Rossi Luigi", 50350.0, 1500);

		conto2.stampaSaldo();

		conto2.preleva(2000);
		conto2.stampaSaldo();
		conto2.preleva(1500);
		conto2.stampaSaldo();
		conto1.preleva(18250.5);
		

	}
}
