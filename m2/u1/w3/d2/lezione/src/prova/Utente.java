package prova;

public class Utente {

	int id_utente;
	String nome;
	String cognome;
	String data_nascita;
	int anni;
	String email;
	
	public Utente(String nome, String cognome, String data_nascita, int anni, String email) {
		this.nome = nome;
		this.cognome = cognome;
		this.data_nascita = data_nascita;
		this.anni = anni;
		this.email = email;
	}
	public Utente(int id ,String nome, String cognome, String data_nascita, int anni, String email) {
		this.id_utente=id;
		this.nome = nome;
		this.cognome = cognome;
		this.data_nascita = data_nascita;
		this.anni = anni;
		this.email = email;
	}

	
	@Override
	public String toString() {
		return "Utente [id_utente=" + id_utente + ", " + (nome != null ? "nome=" + nome + ", " : "")
				+ (cognome != null ? "cognome=" + cognome + ", " : "")
				+ (data_nascita != null ? "data_nascita=" + data_nascita + ", " : "") + "anni=" + anni + ", "
				+ (email != null ? "email=" + email + "]" : "]");
	}

	
	
	
	
}
