package model_SINGLE_TABLE;

import javax.persistence.Entity;

@Entity
public class Automobile extends Veicolo {

	private Integer nporte;
	private String alimentazione;

	public Automobile() {
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
