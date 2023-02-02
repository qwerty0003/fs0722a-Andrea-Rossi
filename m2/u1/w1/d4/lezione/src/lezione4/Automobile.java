package lezione4;

public class Automobile extends Veicolo {

	private int nPorte;

	public Automobile(String mod, String mar, int x) {
		super(mod, mar);
		this.nPorte = x;
	}

	public int getnPorte() {
		return nPorte;
	}

	@Override
	public String acc() {
		return super.acc() + " L'auto accellera.";
	}

	@Override
	public void frena() {
		System.out.println("Il freno viene premuto e l'auto diminuisce la sua velocita'");
	}

}
