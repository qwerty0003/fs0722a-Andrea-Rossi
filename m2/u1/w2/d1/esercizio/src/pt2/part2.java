package pt2;

import java.util.Scanner;

public class part2 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		kmPerLt();

	}

	public static void kmPerLt() {
		try {
			System.out.println("Inserisci i kilometri percorsi:");
			int km = Integer.parseInt(sc.nextLine());
			System.out.println("Inserisci i litri di benzina consumati:");
			int lt = Integer.parseInt(sc.nextLine());
			double kmPLt;
			kmPLt = km / lt;
			System.out.println("Hai consumeto un litro ogni " + kmPLt + "km.");

		} catch (NumberFormatException ex) {
			System.out.println("Inserisci il valore corretto per favore!");
			System.out.println("Riproviamo :')");
			kmPerLt();
		} catch (ArithmeticException ex) {
			System.out.println("0 litri consumati? Che macchina hai?");
			System.out.println("Riproviamo :')");
			kmPerLt();
		}

	}

}
