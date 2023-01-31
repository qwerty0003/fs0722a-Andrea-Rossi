package lezione2;

public class Veicolo {
	
	String modello;
	String marca;
	String targa;
	String colore;
	int cilindrata;
	
	public Veicolo(String a, String b,String d,int e ) {
		this.modello = a;
		this.marca = b;
		this.targa = "AB666CD";
		this.colore = d;
		this.cilindrata = e;
	}
	
	public void start() {
		System.out.println("Veicolo acceso!");
	}
	
	public void stop() {
		System.out.println("Il veicolo si sta fermando!");
		System.out.println("Il veicolo è fermo!");
	}
	
	public void off() {
		System.out.println("Veicolo spento!");
	}
	public void move() {
		System.out.println("Il veicolo si sta muovendo!");
	}
	
	public String info() {
		return this.marca + " " + this.modello + " " + this.colore
				 + " " + this.targa + " " +this.cilindrata + "cc";
	}
	

}
