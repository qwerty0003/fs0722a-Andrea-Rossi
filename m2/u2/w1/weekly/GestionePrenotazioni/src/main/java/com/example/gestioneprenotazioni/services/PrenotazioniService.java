package com.example.gestioneprenotazioni.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gestioneprenotazioni.models.Prenotazioni;
import com.example.gestioneprenotazioni.repositories.PrenotazioniRepository;

@Service
public class PrenotazioniService {

	@Autowired
	private PrenotazioniRepository preRepo;
	
	public void inserisciPre(Prenotazioni pr) {
		preRepo.save(pr);
	}
	
}
