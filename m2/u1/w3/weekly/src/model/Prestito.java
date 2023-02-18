package model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Table(name="prestito")
@Entity
@NamedQuery(name = "ottieniPrestitoDaTessera", query = "SELECT p FROM Prestito p WHERE p.utente.numeroTessera = :valore")
@NamedQuery(name = "ottieniPrestitiScadutiNonRestituiti", query = "SELECT p FROM Prestito p WHERE "
		+ "p.dataRestituzionePrevista < CURRENT_DATE AND p.dataRestituzioneEffettiva IS NULL")
public class Prestito {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	private Utente utente;
	@ManyToOne
	private ArticoloPubblicato elementoPrestato;
	@Column(name="data_inizio_prestito")
	private LocalDate dataInizioPrestito;
	@Column(name="data_restituzione_prevista")
	private LocalDate dataRestituzionePrevista;
	@Column(name="data_restituzione_effettiva")
	private LocalDate dataRestituzioneEffettiva;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Utente getUtente() {
		return utente;
	}
	public void setUtente(Utente utente) {
		this.utente = utente;
	}
	public ArticoloPubblicato getElementoPrestato() {
		return elementoPrestato;
	}
	public void setElementoPrestato(ArticoloPubblicato elementoPrestato) {
		this.elementoPrestato = elementoPrestato;
	}
	public LocalDate getDataInizioPrestito() {
		return dataInizioPrestito;
	}
	public void setDataInizioPrestito(LocalDate dataInizioPrestito) {
		this.dataInizioPrestito = dataInizioPrestito;
	}
	public LocalDate getDataRestituzionePrevista() {
		return dataRestituzionePrevista;
	}
	public void setDataRestituzionePrevista(LocalDate dataRestituzionePrevista) {
		this.dataRestituzionePrevista = dataRestituzionePrevista;
	}
	public LocalDate getDataRestituzioneEffettiva() {
		return dataRestituzioneEffettiva;
	}
	public void setDataRestituzioneEffettiva(LocalDate dataRestituzioneEffettiva) {
		this.dataRestituzioneEffettiva = dataRestituzioneEffettiva;
	}
	public Prestito() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Prestito [id=" + id + ", utente=" + utente + ", elementoPrestato=" + elementoPrestato
				+ ", dataInizioPrestito=" + dataInizioPrestito + ", dataRestituzionePrevista="
				+ dataRestituzionePrevista + ", dataRestituzioneEffettiva=" + dataRestituzioneEffettiva + "]";
	}
	
}
