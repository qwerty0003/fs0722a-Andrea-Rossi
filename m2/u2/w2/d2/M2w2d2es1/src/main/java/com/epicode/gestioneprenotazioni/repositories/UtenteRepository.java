package com.epicode.gestioneprenotazioni.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.epicode.gestioneprenotazioni.models.Utente;

@Repository
public interface UtenteRepository extends JpaRepository<Utente, Integer> {

	@Query(
			nativeQuery = true,
			value = "SELECT * FROM utente WHERE username = :valore"
		)
		List<Utente> findByUsername(@Param("valore") String valore);
	
}
