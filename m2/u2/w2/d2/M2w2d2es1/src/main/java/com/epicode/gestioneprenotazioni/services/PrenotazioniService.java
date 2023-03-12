package com.epicode.gestioneprenotazioni.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epicode.gestioneprenotazioni.models.Prenotazioni;
import com.epicode.gestioneprenotazioni.repositories.PrenotazioniRepository;

@Service
public class PrenotazioniService {
	
	@Autowired
	private PrenotazioniRepository preRepo;
	
	public void inserisciPre(Prenotazioni pr) {
		preRepo.save(pr);
	}
	
}
