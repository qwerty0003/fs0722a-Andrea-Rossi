package com.example.gestioneprenotazioni.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gestioneprenotazioni.models.Postazione;
import com.example.gestioneprenotazioni.repositories.PostazioneRepository;

@Service
public class PostazioneService {

	@Autowired
	private PostazioneRepository posRepo;
	
	public void inserisciPos(Postazione p) {
		posRepo.save(p);
	}
	
}
