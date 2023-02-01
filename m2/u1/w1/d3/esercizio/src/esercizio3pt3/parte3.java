package esercizio3pt3;

import java.util.Scanner;

public class parte3 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		submit();
	}
		
	public static void submit() {
		String str="";
		do {
		System.out.println("Inserisci una stringa: ");
		String str1 = sc.nextLine();
		str=str1;
		str1 = String.join(",", str1.split(""));
		System.out.println(str1);
		
		}while(!str.equals(":q"));
	}
}
