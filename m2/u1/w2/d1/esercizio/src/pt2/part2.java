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
			System.out.println("Percorri " + kmPLt + "km al litro.");
			if(kmPLt > 50) 
				System.out.println(" ");System.out.println("Complimenti!");
			

		} catch (NumberFormatException ex) {
			System.out.println("Inserisci il valore corretto per favore!");
			System.out.println("Riproviamo :')");
			kmPerLt();
		} catch (ArithmeticException ex) {
			System.out.println("Beh la tua macchina consuma davvero poco allora");
			System.out.println("Riproviamo :')");
			kmPerLt();
		}

	}

}
