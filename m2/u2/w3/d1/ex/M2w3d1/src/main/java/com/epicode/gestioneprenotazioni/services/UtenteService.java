package com.epicode.gestioneprenotazioni.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epicode.gestioneprenotazioni.entities.Utente;
import com.epicode.gestioneprenotazioni.repositories.UtenteRepository;

@Service
public class UtenteService {

	@Autowired
	private UtenteRepository uteRepo;
	
	public void inserisci(Utente u) {
		uteRepo.save(u);	
	}
	
	public Optional<Utente> ottieniDaId(int id) {
		return uteRepo.findById(id);
	}
	
	public Optional<Utente> ottieniDaUsername(String username){
		return uteRepo.findByUsername(username);
	}
	
}
