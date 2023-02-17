package model_JOINED;

import javax.persistence.Entity;

@Entity
public class Automobilel extends Veicolol {

	private Integer nporte;
	private String alimentazione;

	public Automobilel() {
		super();

	}

	public int getNporte() {
		return nporte;
	}

	public void setNporte(int nporte) {
		this.nporte = nporte;
	}

	public String getAlimentazione() {
		return alimentazione;
	}

	public void setAlimentazione(String alimentazione) {
		this.alimentazione = alimentazione;
	}

	@Override
	public String toString() {
		return super.toString() + "Automobile [nporte=" + nporte + ", alimentazione=" + alimentazione + "]";
	}

}
