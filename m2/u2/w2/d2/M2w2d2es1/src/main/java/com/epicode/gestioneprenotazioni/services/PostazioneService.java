package com.epicode.gestioneprenotazioni.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epicode.gestioneprenotazioni.models.Postazione;
import com.epicode.gestioneprenotazioni.repositories.PostazioneRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class PostazioneService {

	@Autowired
	private PostazioneRepository posRepo;
	
	public Postazione inserisciPos(Postazione p) {
		if(posRepo.existsById(p.getId())) {
            throw new EntityNotFoundException("POSTATION ALREADY EXIST!!!!");
       }
		posRepo.save(p);
		return p;
	}
	
	public List<Postazione> getAllPos(){
		return (List<Postazione>) posRepo.findAll();
	}

	public Postazione getPosById(int id) {
        if(!posRepo.existsById(id)) {
             throw new EntityNotFoundException("POSTATION DO NOT EXIST!!!!");
        }
        return posRepo.findById(id).get();
    }
	
	public void removePos(int id) {
		if(!posRepo.existsById(id)) {
			throw new EntityNotFoundException("POSTATION DO NOT EXIST!!!!");
		}
		posRepo.deleteById(id);
		System.out.println("POSTATION DELETED! :'D");
	}
	
	public Postazione updatePos(Postazione u) {
		if(!posRepo.existsById(u.getId())) {
            throw new EntityNotFoundException("POSTATION DO NOT EXIST!!!!");
       }
		posRepo.save(u);
		return u;
	}
	
}
