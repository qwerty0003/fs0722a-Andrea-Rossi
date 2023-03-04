package com.example.gestioneprenotazioni.configurations;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.gestioneprenotazioni.enums.TipoPostazione;
import com.example.gestioneprenotazioni.models.Edificio;
import com.example.gestioneprenotazioni.models.Postazione;
import com.example.gestioneprenotazioni.models.Prenotazioni;
import com.example.gestioneprenotazioni.models.Utente;

@Configuration
public class GestionePrenotazioniConfiguration {

	//EDIFICI
	
	@Bean
	public Edificio ed1() {
		Edificio e= Edificio.builder().nome("Palazzo di Giustizia").indirizzo("Via Roma 157").citta("Firenze").build();
		return e;
	}
	
	
	@Bean
	public Edificio ed2() {
		Edificio e= Edificio.builder().nome("Corte dei Conti").indirizzo("Via Milano 200").citta("Roma").build();
		return e;
	}
	
	@Bean
	public Edificio ed3() {
		Edificio e= Edificio.builder().nome("Empire State Building").indirizzo("Quinta Strada").citta("New York").build();
		return e;
	}
	
	@Bean
	public Edificio ed4() {
		Edificio e= Edificio.builder().nome("Palazzo Nuovo").indirizzo("Via Londra 86").citta("Milano").build();
		return e;
	}
	
	//POSTAZIONI
	
	@Bean
	public Postazione po1() {
		Postazione po=Postazione.builder().codice("0001").descrizione("Postazione 1")
				.tipo(TipoPostazione.PRIVATO).maxOccupanti(1).edificio(ed1()).build();
		return po;
	}
	
	@Bean
	public Postazione po2() {
		Postazione po=Postazione.builder().codice("0002").descrizione("Postazione 2")
				.tipo(TipoPostazione.OPEN_SPACE).maxOccupanti(20).edificio(ed1()).build();
		return po;
	}
	
	@Bean
	public Postazione po3() {
		Postazione po=Postazione.builder().codice("0003").descrizione("Postazione 3")
				.tipo(TipoPostazione.SALA_RIUNIONI).maxOccupanti(5).edificio(ed2()).build();
		return po;
	}
	
	@Bean
	public Postazione po4() {
		Postazione po=Postazione.builder().codice("0004").descrizione("Postazione 4")
				.tipo(TipoPostazione.PRIVATO).maxOccupanti(1).edificio(ed3()).build();
		return po;
	}
	
	@Bean
	public Postazione po5() {
		Postazione po=Postazione.builder().codice("0005").descrizione("Postazione 5")
				.tipo(TipoPostazione.SALA_RIUNIONI).maxOccupanti(5).edificio(ed4()).build();
		return po;
	}
	
	//UTENTI
	
	@Bean
	public Utente ut1() {
		Utente u=Utente.builder().username("markk").nomeCompleto("Marco Rossi")
				.email("marco@rossi.it").build();
		return u;
	}
	
	@Bean
	public Utente ut2() {
		Utente u=Utente.builder().username("gigi").nomeCompleto("Luigi Verdi")
				.email("luigi@verdi.it").build();
		return u;
	}
	
	@Bean
	public Utente ut3() {
		Utente u=Utente.builder().username("ciccio").nomeCompleto("Francesco Neri")
				.email("francesco@neri.it").build();
		return u;
	}
	
	@Bean
	public Utente ut4() {
		Utente u=Utente.builder().username("beppe").nomeCompleto("Giuseppe Bianchi")
				.email("giuseppe@bianchi.it").build();
		return u;
	}
	
	
	//PRENOTAZIONI
	
	@Bean
	public Prenotazioni pr1() {
		Prenotazioni pr=Prenotazioni.builder().dataPrenotazione(LocalDate.of(2023, 5, 5))
				.utentePrenotato(ut1()).postazionePrenotata(po1()).build();
		return pr;

	}
	
	@Bean
	public Prenotazioni pr2() {
		Prenotazioni pr=Prenotazioni.builder().dataPrenotazione(LocalDate.of(2023, 8, 12))
				.utentePrenotato(ut2()).postazionePrenotata(po2()).build();
		return pr;

	}
	
	@Bean
	public Prenotazioni pr3() {
		Prenotazioni pr=Prenotazioni.builder().dataPrenotazione(LocalDate.of(2023, 7, 11))
				.utentePrenotato(ut3()).postazionePrenotata(po3()).build();
		return pr;

	}
	
}
