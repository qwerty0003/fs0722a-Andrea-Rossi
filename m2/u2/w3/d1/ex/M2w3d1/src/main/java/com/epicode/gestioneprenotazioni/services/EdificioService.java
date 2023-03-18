package com.epicode.gestioneprenotazioni.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epicode.gestioneprenotazioni.entities.Edificio;
import com.epicode.gestioneprenotazioni.repositories.EdificioRepository;

@Service
public class EdificioService {

	@Autowired
	private EdificioRepository ediRepo;
	
	public Edificio inserisci(Edificio e) {
		return ediRepo.save(e);

	}
	
	public Optional<Edificio> ottieniDaId(int id) {
		return ediRepo.findById(id);
	}
	
}
