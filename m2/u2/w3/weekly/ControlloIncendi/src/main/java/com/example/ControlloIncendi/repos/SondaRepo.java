package com.example.ControlloIncendi.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ControlloIncendi.models.Sonda;

@Repository
public interface SondaRepo extends JpaRepository<Sonda, Long>{

}
