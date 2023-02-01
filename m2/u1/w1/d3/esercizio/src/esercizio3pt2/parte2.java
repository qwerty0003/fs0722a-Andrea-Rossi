package esercizio3pt2;

import java.util.Scanner;

public class parte2 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int i = 0;
		do {
		submit();
		i++;
		}while(i<5);
	}
	
	public static void submit() {
		System.out.println("Inserisci un numero, meglio se compreso tra 0 e 3 :')");
		int n = Integer.parseInt(sc.nextLine());
		switch(n) {
		case 0:
			System.out.println("ZERO");
			break;
			case 1:
			System.out.println("UNO");
			break;
		case 2:
			System.out.println("DUE");
			break;
		case 3:
			System.out.println("TRE");
			break;
		default:
			System.out.println("ERR: INSERISCI UN NUMERO COMPRESO TRA 3 E 0");
		}
	}

}
