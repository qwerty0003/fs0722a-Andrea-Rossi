package oop.java;

public class Veicolo {
//	private, public, protected
	private String modello;
	private String marca;
	private String targa;
	private String colore;

	public Veicolo(String mod, String mar, String targa, String col) {
		this.modello = mod;
		this.marca = mar;
		this.setTarga(targa);
		this.setColore(col);
	}
	
	public String getModello() {
		return modello;
	}

	public String getMarca() {
		return marca;
	}

	public String getTarga() {
		return targa;
	}

	public void setTarga(String targa) {
		// if(sei dipendente del PRA)
		this.targa = targa;
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}
		 
	@Override
	public String toString() {
		return "Marca: "+marca+" - Modello: "+modello+
				" - Colore: "+colore+" - Targa: "+targa;
	}
}
