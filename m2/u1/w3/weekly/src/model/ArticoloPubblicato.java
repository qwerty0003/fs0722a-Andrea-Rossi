package model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Table(name="articolo_pubblicato")
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_articolo", discriminatorType = DiscriminatorType.STRING)
@NamedQuery(name = "ottieniElementoDaISBN", query = "SELECT a FROM ArticoloPubblicato a WHERE a.codiceISBN = :valore")
@NamedQuery(name = "ottieniElementoDaAnnoPubblicazione", query = "SELECT a FROM ArticoloPubblicato a WHERE a.annoPubblicazione = :valore")
@NamedQuery(name = "ottieniElementoDaTitolo", query = "SELECT a FROM ArticoloPubblicato a WHERE a.titolo = :valore")
public class ArticoloPubblicato {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="codice_isbn")
	private int codiceISBN;
	private String titolo;
	@Column(name="anno_pubblicazione")
	private int annoPubblicazione;
	@Column(name="numero_pagine")
	private int numeroPagine;
	
	public ArticoloPubblicato() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ArticoloPubblicato(int codiceISBN, String titolo, int annoPubblicazione, int numeroPagine) {
		
		this.codiceISBN=codiceISBN;
		this.titolo=titolo;
		this.annoPubblicazione=annoPubblicazione;
		this.numeroPagine=numeroPagine;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCodiceISBN() {
		return codiceISBN;
	}

	public void setCodiceISBN(int codiceISBN) {
		this.codiceISBN = codiceISBN;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public int getAnnoPubblicazione() {
		return annoPubblicazione;
	}

	public void setAnnoPubblicazione(int annoPubblicazione) {
		this.annoPubblicazione = annoPubblicazione;
	}

	public int getNumeroPagine() {
		return numeroPagine;
	}

	public void setNumeroPagine(int numeroPagine) {
		this.numeroPagine = numeroPagine;
	}

	@Override
	public String toString() {
		return "ArticoloPubblicato [id=" + id + ", codiceISBN=" + codiceISBN + ", titolo=" + titolo
				+ ", annoPubblicazione=" + annoPubblicazione + ", numeroPagine=" + numeroPagine + "]";
	}
}