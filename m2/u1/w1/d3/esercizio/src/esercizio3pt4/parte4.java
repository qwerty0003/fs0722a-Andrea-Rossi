package esercizio3pt4;

import java.util.Scanner;

public class parte4 {

	public static void main(String[] args) {
		submit();
	}

	public static void submit() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserisci un numero: ");
		int n = Integer.parseInt(sc.nextLine());
		System.out.println("    COUNTDOWN:");
		for(int i = n;i>=0;i--) {
			System.out.println("    "+i);
		}
	} 
}
