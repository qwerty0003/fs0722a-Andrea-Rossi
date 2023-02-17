package model;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Table(name = "partita_di_calcio")
@Entity
@NamedQuery(name = "getPartiteVinteInCasa", query = "SELECT p FROM PartitaDiCalcio p WHERE "
		+ "p.squadraVincente = p.squadraDiCasa")
@NamedQuery(name = "getPartiteVinteOspite", query = "SELECT p FROM PartitaDiCalcio p WHERE "
		+ "p.squadraVincente = p.squadraOspite")
@NamedQuery(name = "getPartiteVinteNessuna", query = "SELECT p FROM PartitaDiCalcio p WHERE "
		+ "p.squadraVincente IS NULL")
public class PartitaDiCalcio extends Evento {

	private String squadraDiCasa;
	private String squadraOspite;
	private String squadraVincente;
	private int numeroGolSquadraDiCasa;
	private int numeroGolSquadraOspite;

	public PartitaDiCalcio() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getSquadraDiCasa() {
		return squadraDiCasa;
	}

	public void setSquadraDiCasa(String squadraDiCasa) {
		this.squadraDiCasa = squadraDiCasa;
	}

	public String getSquadraOspite() {
		return squadraOspite;
	}

	public void setSquadraOspite(String squadraOspite) {
		this.squadraOspite = squadraOspite;
	}

	public String getSquadraVincente() {
		return squadraVincente;
	}

	public void setSquadraVincente(String squadraVincente) {
		this.squadraVincente = squadraVincente;
	}

	public int getNumeroGolSquadraDiCasa() {
		return numeroGolSquadraDiCasa;
	}

	public void setNumeroGolSquadraDiCasa(int numeroGolSquadraDiCasa) {
		this.numeroGolSquadraDiCasa = numeroGolSquadraDiCasa;
	}

	public int getNumeroGolSquadraOspite() {
		return numeroGolSquadraOspite;
	}

	public void setNumeroGolSquadraOspite(int numeroGolSquadraOspite) {
		this.numeroGolSquadraOspite = numeroGolSquadraOspite;
	}

}
