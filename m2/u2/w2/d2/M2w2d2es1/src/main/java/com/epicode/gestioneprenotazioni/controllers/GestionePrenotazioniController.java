package com.epicode.gestioneprenotazioni.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.epicode.gestioneprenotazioni.models.Edificio;
import com.epicode.gestioneprenotazioni.services.EdificioService;


@RestController
@RequestMapping("/api")
public class GestionePrenotazioniController {
	
	@GetMapping("/saluto")
	@ResponseStatus(HttpStatus.OK)
	private String getSalutiPage() {
		return "¡¡HOLA!!";
	}
	
	@GetMapping("/lingua")
	@ResponseStatus(HttpStatus.OK)
	private String getLanguage(@RequestParam(name = "lang") String lingua) {
		if(lingua.equals("IT")) {
			String risposta= String.format("%s >Puoi prenotarti solo una volta"
					+ " al giorno, le prenotazioni valgono soltanto per quel giorno", lingua);
			return risposta;
		}
		else if(lingua.equals("EN")){
			String risposta= String.format("%s >You can book once per day,"
					+ " reservations are valid only for that date", lingua);
			return risposta;
		}
		else if(lingua.equals("ES")){
			String risposta= String.format("%s >Puede reservar solo una vez al día,"
					+ " las reservas son válidas para un día.", lingua);
			return risposta;
		}
		else {
			return "Lingua non disponibile! / Language not avaiable! / ¡Idioma no disponible!";
		}
	}
	
	@GetMapping("/lingua/{lang}")
	@ResponseStatus(HttpStatus.OK)
	private String getLanguageSecond(@PathVariable String lang) {
		if(lang.equals("IT")) {
			String risposta= String.format("%s >Puoi prenotarti solo una volta"
					+ " al giorno, le prenotazioni valgono soltanto per quel giorno", lang);
			return risposta;
		}
		else if(lang.equals("EN")){
			String risposta= String.format("%s >You can book once per day,"
					+ " reservations are valid only for that date", lang);
			return risposta;
		}
		else if(lang.equals("ES")){
			String risposta= String.format("%s >Puede reservar solo una vez al día,"
					+ " las reservas son válidas para un día.", lang);
			return risposta;
		}
		else {
			return "Lingua non disponibile! / Language not avaiable! / ¡Idioma no disponible!";
		}
	}
	
	//EDIFICI
	
		@Autowired
		private EdificioService edoSe;
		
		@GetMapping("edifici")
		public ResponseEntity<List<Edificio>> getAll() {
			List<Edificio> edificio = edoSe.ottieniTutti();
			
			if( edificio.isEmpty() ) {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
			
			return new ResponseEntity<>(edificio, HttpStatus.OK);
		}
		
		@GetMapping("edifici/{id}")
		public ResponseEntity<Object> ottieniDaId(@PathVariable Integer id) {
			Optional<Edificio> edificioObj = edoSe.ottieniDaId(id);
			ResponseEntity<Object> check = checkExists(edificioObj);
			if( check != null ) return check;
			
			return new ResponseEntity<>(edificioObj.get(), HttpStatus.OK);
		}
		
		@GetMapping("edificidanome/{nome}")
		public ResponseEntity<List<Edificio>> ottieniDaNome(@PathVariable String nome) {
			List<Edificio> edifici = edoSe.ottieniDaNome(nome);
			
			if( edifici.isEmpty() ) {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
			
			return new ResponseEntity<>(edifici, HttpStatus.OK);
		}
		
		@GetMapping("edifici/pag")
		public ResponseEntity<Object> ottieniTuttePag(Pageable pageable) {
			Page<Edificio> edifici = edoSe.ottieniTuttePag(pageable);
			
			if( edifici.isEmpty() ) {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
			
			return new ResponseEntity<>(edifici, HttpStatus.OK);
		}
		
		@PostMapping("edifici")
		public ResponseEntity<Object> create(@RequestBody Edificio e) {
			Edificio edificio = edoSe.inserisci(e);
			
			return new ResponseEntity<>(edificio, HttpStatus.CREATED);
		}
		
		@PutMapping("edifici/{id}")
		public ResponseEntity<Object> update(
				@PathVariable Integer id,
				@RequestBody Edificio _edificio) {
			
			Optional<Edificio> edificioObj = edoSe.ottieniDaId(id);
			
			ResponseEntity<Object> check = checkExists(edificioObj);
			if( check != null ) return check;
			
			Edificio edificio = edificioObj.get();
			edificio.setNome( _edificio.getNome() );
			edificio.setIndirizzo(_edificio.getIndirizzo());
			edificio.setCitta(_edificio.getCitta());
			edoSe.inserisci(edificio);
			
			return new ResponseEntity<>(edificio, HttpStatus.CREATED);
		}
		
		private ResponseEntity<Object> checkExists(Optional<Edificio> obj) {
			if( !obj.isPresent() ) {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
			
			return null;
		}
		
		@DeleteMapping("edifici/{id}")
		public ResponseEntity<Object> delete(@PathVariable Integer id) {
			Optional<Edificio> edificioObj = edoSe.ottieniDaId(id);
			ResponseEntity<Object> check = checkExists(edificioObj);
			if( check != null ) return check;
			
			edoSe.cancella(edificioObj.get());
			return new ResponseEntity<>(
					String.format("Edificio con id %d cancellato!", id), HttpStatus.OK);
		}
	
	
}
