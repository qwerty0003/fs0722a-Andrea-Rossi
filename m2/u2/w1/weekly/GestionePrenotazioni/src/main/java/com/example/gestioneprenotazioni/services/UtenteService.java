package com.example.gestioneprenotazioni.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gestioneprenotazioni.models.Utente;
import com.example.gestioneprenotazioni.repositories.UtenteRepository;

@Service
public class UtenteService {

	@Autowired
	private UtenteRepository utRepo;
	
	public void inserisciUte(Utente u) {
		utRepo.save(u);	
	}
	
}
