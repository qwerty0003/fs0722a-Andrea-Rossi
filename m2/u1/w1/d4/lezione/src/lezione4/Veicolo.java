package lezione4;

public class Veicolo {
//	private, public, protected
	private String modello;
	private String marca;

	public Veicolo(String mod, String mar) {
		this.modello = mod;
		this.marca = mar;
	}

	public String getModello() {
		return modello;
	}

	public String getMarca() {
		return marca;
	}

	public String acc() {
		return "La velocita' aumenta!";
	}

	public void frena() {
		System.out.println("La velocita' diminuisce :(");
	}

	@Override
	public String toString() {
		return "Marca: " + marca + " - Modello: " + modello;
	}
}
