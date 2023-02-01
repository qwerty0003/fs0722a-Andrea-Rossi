package lezione3;

import java.util.Scanner;

public class MainProject {
	static Scanner sc = new Scanner(System.in);
	static Persona[] spettatori = new Persona[50];
	
	public static void main(String[] args) {
		int i = 1;
		while(i<spettatori.length) {
			System.out.println("Vuoi vendere altri biglietti? (si/no)");
			String r = sc.nextLine();
			if(r.equals("si")) {
				registrazione();
			}else {
				break;
			}
		}
		stampaBiglietto();
		System.out.println("FINE");
	}
	
	public static void registrazione() {
		System.out.println("Inserisci il nome: ");
		String nome = sc.nextLine();
		System.out.println("Inserisci il cognome: ");
		String cognome = sc.nextLine();
		System.out.println("Inserisci la tua età: ");
		int eta = Integer.parseInt(sc.nextLine());
		
		if(eta>=18) {
			System.out.println("Benvenuto, "+nome+" "+cognome);
			emettiBiglietto(new Persona(nome,cognome,eta));
		}else {
			System.out.println("Arrivederci, "+nome+" "+cognome+":(");
		}
		
	}
	
	public static void emettiBiglietto(Persona p) {
		for(int i = 0;i<spettatori.length;i++) {
			if(spettatori[i]==null) {
				spettatori[i]=p;
				break;
			}
		}
	}
	
	public static void stampaBiglietto() {
		System.out.println("Elenco biglietti: ");
		for(int i = 0; i < spettatori.length;i++) {
			if(spettatori[i]!=null)
			System.out.println(spettatori[i]);
			else {
				break;
			}
		}
	}

}
