package lez1;

import java.util.Scanner;

public class ProjectMain {

	static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		System.out.println("Calcolatrice");
		operazione();

	}
	
	public static void operazione() {
		System.out.println("Che tipo di operazione vuoi fare?");
		System.out.println("1 - Somma");
		System.out.println("2 - Sottrazione");
		System.out.println("3 - Divisione");
		System.out.println("4 - Moltiplicazione");
		System.out.println("Fai una scelta:");
		int scelta = Integer.parseInt(sc.nextLine());
		switch (scelta) {
			case 1:
				somma();
				break;
			case 2:
				sottrazione();
				break;
			case 3:
				divisione();
				break;
			case 4:
				moltiplicazione();
				break;
		}
		
	}
	
	public static int chiediNumero() {
		System.out.println("Inserisci un numero:");
		try{
			return Integer.parseInt(sc.nextLine());
		}catch(NumberFormatException ex) {
			System.out.println("Inserisci un numero");
			return 0;
		}
	}
	
	public static void somma() {
		int num1=chiediNumero();
		int num2=chiediNumero();
		System.out.println("Somma tra: "+ num1+" e "+num2+"= "+(num1+num2));
	}
	public static void sottrazione() {
		int num1=chiediNumero();
		int num2=chiediNumero();
		System.out.println("Sottrazione tra: "+ num1+" e "+num2+"= "+(num1-num2));
	}
	public static void divisione() {
		int num1=chiediNumero();
		int num2=chiediNumero();
		try{
			System.out.println("Divisione tra: "+ num1+" e "+num2+"= "+(num1/num2));
		}catch(ArithmeticException ex) {
			System.out.println("Errore! Impossibile dividere per 0");
		}
	}
	public static void moltiplicazione() {
		int num1=chiediNumero();
		int num2=chiediNumero();
		System.out.println("Moltiplicazione tra: "+ num1+" e "+num2+"= "+(num1*num2));
	}
	
	

}
