package model_MappedSuperClass;

import javax.persistence.Entity;

@Entity
public class Moto4 extends Veicolo4 {

	private Integer nposti;
	private Integer cilindrata;

	public Moto4() {
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
