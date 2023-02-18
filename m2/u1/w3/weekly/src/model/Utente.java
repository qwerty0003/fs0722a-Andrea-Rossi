package model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Table(name="utente")
@Entity
public class Utente {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String nome;
	private String cognome;
	@Column(name="data_nascita")
	private LocalDate dataNascita;
	@Column(name="numero_tessere")
	private int numeroTessera;
	@OneToMany(mappedBy="utente", fetch =FetchType.LAZY)
	private List<Prestito> prestiti;
	public Utente() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public LocalDate getDataNascita() {
		return dataNascita;
	}
	public void setDataNascita(LocalDate dataNascita) {
		this.dataNascita = dataNascita;
	}
	public int getNumeroTessera() {
		return numeroTessera;
	}
	public void setNumeroTessera(int numeroTessera) {
		this.numeroTessera = numeroTessera;
	}
	public List<Prestito> getPrestiti() {
		return prestiti;
	}
	public void setPrestiti(List<Prestito> prestiti) {
		this.prestiti = prestiti;
	}
	@Override
	public String toString() {
		final int maxLen = 5;
		return "Utente [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", dataNascita=" + dataNascita
				+ ", numeroTessera=" + numeroTessera + ", prestiti="
				+ (prestiti != null ? prestiti.subList(0, Math.min(prestiti.size(), maxLen)) : null) + "]";
	}
	
}
