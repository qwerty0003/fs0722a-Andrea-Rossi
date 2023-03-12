package com.epicode.gestioneprenotazioni.controllers;

import java.util.List;

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
import org.springframework.web.bind.annotation.RestController;

import com.epicode.gestioneprenotazioni.models.Postazione;
import com.epicode.gestioneprenotazioni.services.PostazioneService;



@RestController
@RequestMapping("/pos")
public class PosController {
	
	@Autowired PostazioneService posSrv;
	
	
	@GetMapping
	public ResponseEntity<List<Postazione>> getAllPos(){
		return new ResponseEntity<List<Postazione>>(posSrv.getAllPos(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Postazione> getPosById(@PathVariable int id){
		return new ResponseEntity<Postazione>(posSrv.getPosById(id), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Postazione> createPos(@RequestBody Postazione u) {
		Postazione usr = posSrv.inserisciPos(u);
		return new ResponseEntity<Postazione>(usr, HttpStatus.OK);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Postazione> updatePos(@RequestBody Postazione u) {
		Postazione usr = posSrv.updatePos(u);
		return new ResponseEntity<Postazione>(usr, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> removePos(@PathVariable int id) {
		posSrv.removePos(id);
		return new ResponseEntity<String>("POSTATION DELETED :'D", HttpStatus.OK);
	}
	
	
	

}
