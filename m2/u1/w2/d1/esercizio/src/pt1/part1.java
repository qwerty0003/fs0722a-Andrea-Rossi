package pt1;

import java.util.Random;
import java.util.Scanner;

public class part1 {
	//variabili che potrei dovre usare più di una volta
	static Random rand = new Random();
	static Scanner sc = new Scanner(System.in);
	static int[] arr = new int[5];
	
	public static void main(String[] args) {

		parte1();

	}

	public static void parte1() {
		System.out.println("Generando 5 numeri random..");

		
		int num;
		//riempio l'array con 5 numeri casuali
		for (int i = 0; i < arr.length; i++) {
			int randomNum = rand.nextInt(11);
			arr[i] = randomNum;
			System.out.println(arr[i] + " elemento n" + (i + 1));
		}
		//faccio scegliere due numeri, un valore e un altro che corrisponde alla posizione nell'array
		//quindi gestisco gli errori, un numero fuori dall'array, eventuali valori diversi dal numero intero
		//stampo gli elementi in console ogni volta che cambio numero
		//si esce dal ciclo quando inserisco lo 0 come posizione nell'array
		//se si sbaglia si può decidere di ricominciare da capo :D
		try {
			do {
				System.out.println("Scegli un numero da inserire nell'array");
				int x = Integer.parseInt(sc.nextLine());
				System.out.println("Scegli un numero tra 1 e 5 (0 per uscire)");
				int y = (Integer.parseInt(sc.nextLine())) - 1;
				System.out.println(" ");
				int z = y + 1;
				if (z >= 1 && z <= 5) {
					arr[y] = x;

					for (int i = 0; i < arr.length; i++) {
						System.out.println(arr[i] + " elemento n" + (i + 1));
					}
				} else if (z == 0) {
					System.out.println("Ciaooo :D");
				} else {
					throw new ArrayIndexOutOfBoundsException();
				}
				num = z;
			} while (num != 0);
		} catch (NumberFormatException ex) {
			num = 0;
			System.out
					.println("Riproviamo? Inserisci il valore corretto per favore, per ricominciare inserisci uno 0.");
			int ask = Integer.parseInt(sc.nextLine());
			if (ask == 0) {
				parte1();
			} else {
				System.out.println("Ciaooo :D");
			}
		} catch (ArrayIndexOutOfBoundsException ex) {
			num = 0;
			System.out.println(
					"Riproviamo? Inserisci il numero corretto tra 1 e 5 oppure lo 0, per ricominciare inserisci uno 0.");
			int ask = Integer.parseInt(sc.nextLine());
			if (ask == 0) {
				parte1();
			} else {
				System.out.println("Ciaooo :D");
			}
		}
	}

}
