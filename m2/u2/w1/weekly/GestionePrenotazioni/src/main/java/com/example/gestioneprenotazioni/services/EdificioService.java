package com.example.gestioneprenotazioni.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gestioneprenotazioni.models.Edificio;
import com.example.gestioneprenotazioni.repositories.EdificioRepository;

@Service
public class EdificioService {

	@Autowired
	private EdificioRepository ediRepo;

	public void inserisci(Edificio e) {
		ediRepo.save(e);

	}

}
