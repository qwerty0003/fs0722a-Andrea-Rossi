package model_MappedSuperClass;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name="Automobile.findAll", query="SELECT a"
		+ " FROM Automobile4 a")
public class Automobile4 extends Veicolo4 {

	private Integer nporte;
	private String alimentazione;

	public Automobile4() {
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
