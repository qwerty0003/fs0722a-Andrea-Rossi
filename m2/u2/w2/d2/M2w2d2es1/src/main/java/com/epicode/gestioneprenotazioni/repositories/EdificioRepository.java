package com.epicode.gestioneprenotazioni.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.epicode.gestioneprenotazioni.models.Edificio;

@Repository
public interface EdificioRepository extends JpaRepository<Edificio, Integer>{

	@Query(
			nativeQuery = true,
			value = "SELECT * FROM edificio WHERE nome = :valore"
		)
		List<Edificio> findByNome(@Param("valore") String valore);
	
}
