package lezione3;

public class Persona {
	String nome;
	String cognome;
	int eta;
	
	public Persona(String nome,String cognome,int eta) {
		this.nome=nome;
		this.cognome=cognome;
		this.eta=eta;
	}
	
	@Override
	public String toString() {
		return "nome: "+nome+" - cognome: "+cognome+" - eta: "+eta;
	}
}
