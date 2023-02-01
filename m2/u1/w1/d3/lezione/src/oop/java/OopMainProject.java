package oop.java;

public class OopMainProject {

	public static void main(String[] args) {

		Veicolo v = new Veicolo("500 Abarth","Fiat","DI 066 CA","Nero");
		System.out.println(v);
		
		Giorno g;
//		g = 2; NON VA BENE
//		g = "ciao"; NON VA BENE
		g = Giorno.MERCOLEDI; //VA BENE
		System.out.println(g);
	}
}
