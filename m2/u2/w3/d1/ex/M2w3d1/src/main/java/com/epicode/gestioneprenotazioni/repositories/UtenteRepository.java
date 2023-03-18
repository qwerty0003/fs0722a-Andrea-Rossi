package com.epicode.gestioneprenotazioni.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.epicode.gestioneprenotazioni.entities.Utente;

@Repository
public interface UtenteRepository extends JpaRepository<Utente, Integer>{

	Optional<Utente> findByUsername(String username);
	
}
