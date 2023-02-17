package model_SINGLE_TABLE;

import javax.persistence.Entity;

@Entity
public class Moto extends Veicolo {

	private Integer nposti;
	private Integer cilindrata;

	public Moto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getNposti() {
		return nposti;
	}

	public void setNposti(Integer nposti) {
		this.nposti = nposti;
	}

	public Integer getCilindrata() {
		return cilindrata;
	}

	public void setCilindrata(Integer cilindrata) {
		this.cilindrata = cilindrata;
	}

	@Override
	public String toString() {
		return super.toString() + "Moto [nposti=" + nposti + ", cilindrata=" + cilindrata + "]";
	}

}
