package esercizio3;

import java.util.Scanner;

public class parte1 {
	
	static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" STRINGA PARI O DISPARI ");
		System.out.println(" ");
		stringaPariDispari();

		System.out.println(" ANNO BISESTILE METODO /4 ");
		System.out.println(" ");
		annoBisestile();	
	}
	
	public static boolean stringaPariDispari() {
		System.out.println("Inserisci una stringa: ");
		String str = sc.nextLine();
		if(str.length()%2==0) {
			System.out.println("La stringa '"+str+"' ha un numero pari di caratteri -"+str.length());
			return true;
		}else {
			System.out.println("La stringa '"+str+"' ha un numero dispari di caratteri -"+str.length());
			return false;
		}	
	}
	
	public static boolean annoBisestile() {
		System.out.println("Inserisci un anno: ");
		int anno = Integer.parseInt(sc.nextLine());
		if(anno%400==0 || (anno%4==00 && !(anno%100==0))) {
			System.out.println("L'anno "+anno+" e' un anno bisestile, ha 366 giorni!");
			return true;
		}else {
			System.out.println("L'anno "+anno+" non e' un anno bisestile, ha 365 giorni D:");
			return false;
		}
	}
	
}
