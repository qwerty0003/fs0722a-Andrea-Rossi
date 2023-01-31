package it.epicode.be;

import java.util.Scanner;

public class Helloworld {

public static void main (String[] args)
		{
		// Stampa a console  la frase
		System.out.println("// ESERCIZIO 1 //");
		System.out.println(" ");
		System.out.println("This is my first Epicode Java Project!");
		
		System.out.println("// ESERCIZIO 2 //");
		System.out.println(" ");
		moltiplica(2,2);
		moltiplica(2,10);
		System.out.println("///////////////////////");
		System.out.println(" ");
		
		concatena("Ciao mondo",54);
		concatena("Esercizio numero",1);
		System.out.println("///////////////////////");
		System.out.println(" ");
		
		String[] stringArr = new String[5];
		stringArr[0] = "stringa 1 array";
		stringArr[1] = "stringa 2 array";
		stringArr[2] = "stringa 3 array";
		stringArr[3] = "stringa 4 array";
		stringArr[4] = "stringa 5 array";
		inserisciInArray(stringArr, "stringa aggiunta");
		
		System.out.println(" //////");
		System.out.println("// ESERCIZIO 3 //");
		System.out.println(" ");
		inserisci();
		
		System.out.println("// ESERCIZIO 4 //");
		System.out.println(" ");
		perimetroRettangolo();
		
		System.out.println("///////////////////");
		System.out.println(" ");
		pariDispari();
		
		System.out.println("///////////////////");
		System.out.println(" ");
		areaTriangolo();
		}

//esercizio 2
//metodo moltiplicazione
public static void moltiplica(int number1, int number2) {
	System.out.println(number1+"x"+number2+"= "+number1 * number2);
}

//metodo concatenazione
public static void concatena(String str, int numb) {
	System.out.println(str + " " + numb);
}

//metodo inserimento in array
public static void inserisciInArray(String[] str5, String str) {
	String[] stringhe = new String[6];
	
	stringhe[0] = str5[0];
	stringhe[1] = str5[1];
	stringhe[2] = str;
	stringhe[3] = str5[2];
	stringhe[4] = str5[3];
	stringhe[5] = str5[4];
	for (int i = 0;i<stringhe.length;i++) {
		System.out.print(stringhe[i]+" - ");
	}
	
}

//esercizio 3
//metodo inserimento dinamico con inverso
public static void inserisci() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Scrivi una stringa: ");
	String str1 =  sc.nextLine();
	System.out.println("Scrivi un'altra stringa");
	String str2 =  sc.nextLine();
	System.out.println("Scrivi un'ultima stringa");
	String str3 =  sc.nextLine();
	System.out.println(str1 + " " + str2 + " " + str3);
	System.out.println(str3 + " " + str2 + " " + str1);
}

//esercizio 4
//metodo calcolo perimetro dando due numeri in console
public static void perimetroRettangolo() {
	System.out.println("Dati due numeri calcoleremo il perimetro di un rettangolo");
	Scanner sc = new Scanner(System.in);
	System.out.println("Scrivi un numero decimale: ");
	double num1 =  Double.parseDouble(sc.nextLine());
	System.out.println("Un altro: ");
	double num2 =  Double.parseDouble(sc.nextLine());
	double num3 = num1*2;
	double num4 = num2*2;
	System.out.println("Perimetro = " + (num3+num4));
}

//metodo controllo pari o dispari numero dato in console
public static void pariDispari() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Pari(0) o dispari(1)?");
	System.out.println("Scrivi un numero: ");
	int num = Integer.parseInt(sc.nextLine());
	if(num%2  == 0) {
		System.out.println(0);
	}else {
		System.out.println(1);
	}
}

//metodo per calcolo area triangolo con numeri dati in console
public static void areaTriangolo() {
	System.out.println("Dati tre numeri calcoleremo l'area di un triangolo tramite la formula di Erone");
	Scanner sc = new Scanner(System.in);
	System.out.println("Scrivi un numero: ");
	double a =  Double.parseDouble(sc.nextLine());
	System.out.println("Scrivi un altro numero: ");
	double b =  Double.parseDouble(sc.nextLine());
	System.out.println("Scrivi un ultimo numero: ");
	double c =  Double.parseDouble(sc.nextLine());
	double p = (a+b+c)/2;
	double pa = p-a;
	double pb = p-b;
	double pc = p-c;
	double areaRadice =  p * pa * pb * pc;
	double area = Math.sqrt(areaRadice);
	System.out.println("Area = "+area);
}

}



