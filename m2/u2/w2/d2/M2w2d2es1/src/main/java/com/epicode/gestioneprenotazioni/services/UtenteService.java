package com.epicode.gestioneprenotazioni.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epicode.gestioneprenotazioni.models.Utente;
import com.epicode.gestioneprenotazioni.repositories.UtenteRepository;

@Service
public class UtenteService {
	
	@Autowired
	private UtenteRepository utRepo;
	
	public void inserisciUte(Utente u) {
		utRepo.save(u);	
	}
	
}
