package com.example.ControlloIncendi.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.ControlloIncendi.models.Incendio;

@Repository
public interface IncendioRepo extends JpaRepository<Incendio, Long>{

	@Query(
			nativeQuery = true,
			value = "SELECT * FROM segnalazioni WHERE sonda_id = :valore"
		)
		List<Incendio> findBySondaId(@Param("valore") Long valore);
	
	@Query(
			nativeQuery = true,
			value = "SELECT * FROM segnalazioni WHERE quantita_fumo = :valore"
		)
		List<Incendio> findByFumo(@Param("valore") Integer valore);
	
}
