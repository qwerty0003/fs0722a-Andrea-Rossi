package model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Table(name = "gara_di_atletica")
@Entity
@NamedQuery(name = "getGareDiAtleticaPerVincitore", query = "SELECT a FROM GaraDiAtletica a "
		+ "WHERE a.vincitore = :valore")
@NamedQuery(name = "getGareDiAtleticaPerPartecipante", query = "SELECT a FROM GaraDiAtletica a "
		+ "WHERE :valore MEMBER OF a.setAtleti")
public class GaraDiAtletica extends Evento {

	@ManyToMany
	private Set<Persona> setAtleti;
	@ManyToOne
	private Persona vincitore;

	public GaraDiAtletica() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Set<Persona> getSetAtleti() {
		return setAtleti;
	}

	public void setSetAtleti(Set<Persona> setAtleti) {
		this.setAtleti = setAtleti;
	}

	public Persona getVincitore() {
		return vincitore;
	}

	public void setVincitore(Persona vincitore) {
		this.vincitore = vincitore;
	}

}
