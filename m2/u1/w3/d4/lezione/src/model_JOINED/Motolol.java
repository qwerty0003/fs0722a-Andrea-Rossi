package model_JOINED;

import javax.persistence.Entity;

@Entity
public class Motolol extends Veicolol {

	private Integer nposti;
	private Integer cilindrata;

	public Motolol() {
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
