package com.example.ControlloIncendi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ControlloIncendi.models.Sonda;
import com.example.ControlloIncendi.repos.SondaRepo;

@Service
public class SondaService {

	@Autowired
	private SondaRepo sonRepo;
	
	public Sonda inserisci(Sonda s) {
		return sonRepo.save(s);
	}
	
	public Optional<Sonda> ottieniDaId(Long id){
		return sonRepo.findById(id);
	}
	
	public List<Sonda> ottieniTutti(){
		return sonRepo.findAll();
	}
	
}
