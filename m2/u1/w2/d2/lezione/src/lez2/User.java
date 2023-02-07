package lez2;

public class User {
	
	private String nome;
	private String cognome;
	private String citta;
	private int eta;
	
	public User(String name, String surn, String citta,int x) {
		this.nome=name;
		this.cognome=surn;
		this.setCitta(citta);
		this.eta=x;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	public int getEta() {
		return eta;
	}
}
