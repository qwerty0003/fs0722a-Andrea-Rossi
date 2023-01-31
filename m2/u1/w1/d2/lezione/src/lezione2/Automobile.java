package lezione2;

public class Automobile {
	String modello;
	String targa;
	String marca;
	
	public Automobile(String in1,String in2, String in3) {
		this.modello = in1;
		this.marca = in2;
		this.targa = in3;
	}
	
	public String info() {
		return this.marca + " "+ this.modello + " - "+ this.targa;
	}
}
	
