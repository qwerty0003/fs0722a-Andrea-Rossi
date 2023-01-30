package it.epicode.be;

import java.util.Scanner;

public class Helloworld {

public static void main (String[] args)
		{
		// Stampa a console  la frase
		System.out.println("/////////////////////// PT1");
		System.out.println("This is my first Epicode Java Project!");
		
		System.out.println("/////////////////////// PT2");
		moltiplica(2,2);
		moltiplica(2,10);
		System.out.println("///////////////////////");
		
		concatena("Ciao mondo",54);
		concatena("Esercizio numero",1);
		System.out.println("///////////////////////");
		
		String[] stringArr = new String[5];
		stringArr[0] = "stringa 1 array";
		stringArr[1] = "stringa 2 array";
		stringArr[2] = "stringa 3 array";
		stringArr[3] = "stringa 4 array";
		stringArr[4] = "stringa 5 array";
		inserisciInArray(stringArr, "stringa aggiunta");
		
		System.out.println("/////////////////////// PT3");
		inserisci();
		
		System.out.println("/////////////////////// PT4");
		perimetroRettangolo();
		
		System.out.println("///////////////////");
		pariDispari();
		pariDispari();
		
		System.out.println("///////////////////");
		areaTriangolo();
		}


public static void moltiplica(int number1, int number2) {
	System.out.println(number1+"x"+number2+"= "+number1 * number2);
}

public static void concatena(String str, int numb) {
	System.out.println(str + " " + numb);
}

public static void inserisciInArray(String[] str5, String str) {
	String[] stringhe = new String[6];
	
	stringhe[0] = str5[0];
	stringhe[1] = str5[1];
	stringhe[2] = str;
	stringhe[3] = str5[2];
	stringhe[4] = str5[3];
	stringhe[5] = str5[4];
	
	System.out.println(stringhe[0]);
	System.out.println(stringhe[1]);
	System.out.println(stringhe[2]);
	System.out.println(stringhe[3]);
	System.out.println(stringhe[4]);
	System.out.println(stringhe[5]);
}

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

public static void areaTriangolo() {
	System.out.println("Dati tre numeri calcoleremo l'area di un triangolo tramite la formula di Erone");
	Scanner sc = new Scanner(System.in);
	System.out.println("Scrivi un numero: ");
	double a =  Double.parseDouble(sc.nextLine());
	System.out.println("Scrivi un altro numero: ");
	double b =  Double.parseDouble(sc.nextLine());
	System.out.println("Scrivi un ultimo numero: ");
	double c =  Double.parseDouble(sc.nextLine());
	double p = a+b+c;
	double pa = p-a;
	double pb = p-b;
	double pc = p-c;
	double pSqrt = Math.sqrt(p);
	double area =  pSqrt * pa * pb * pc;
	System.out.println("Area = "+area);
}

}



