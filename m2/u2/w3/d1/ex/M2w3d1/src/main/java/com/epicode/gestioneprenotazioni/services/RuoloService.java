package com.epicode.gestioneprenotazioni.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epicode.gestioneprenotazioni.entities.Ruolo;
import com.epicode.gestioneprenotazioni.repositories.RuoloRepository;

@Service
public class RuoloService {

	@Autowired
	private RuoloRepository ruoRepo;
	
	public void inserisci(Ruolo r) {
		ruoRepo.save(r);	
	}
	
}
