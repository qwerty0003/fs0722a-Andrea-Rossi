package lezione4;

public class Moto extends Veicolo {

	private int posti;
	private int cilindrata;

	public Moto(String mod, String mar, int x, int y) {
		super(mod, mar);
		this.posti = x;
		this.cilindrata = y;
	}

	public int getPosti() {
		return posti;
	}

	public int getCilindrata() {
		return cilindrata;
	}

	public void impenna() {
		System.out.println("Stai impennando con la tua moto!! D:");
	}

	@Override
	public String acc() {
		return super.acc() + " La moto accellera vertiginosamente!";
	}

	@Override
	public void frena() {
		System.out.println("La moto frena, la velocita' diminuisce:(");
	}

}
