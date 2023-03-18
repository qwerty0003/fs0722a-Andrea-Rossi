package com.example.ControlloIncendi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ControlloIncendi.models.Incendio;
import com.example.ControlloIncendi.repos.IncendioRepo;

@Service
public class IncendioService {

	@Autowired
	private IncendioRepo inRepo;
	
	public Incendio inserisci(Incendio i) {
		return inRepo.save(i);
	}
	
	public Optional<Incendio> ottieniDaId(Long id){
		return inRepo.findById(id);
	}
	
	public List<Incendio> ottieniTutti(){
		return inRepo.findAll();
	}
	
	public List<Incendio> ottieniDaSondaId(Long id){
		return inRepo.findBySondaId(id);
	}
	
	public List<Incendio> ottieniDaFumo(Integer fumo){
		return inRepo.findByFumo(fumo);
	}
}
