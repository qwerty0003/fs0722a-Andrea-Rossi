package com.epicode.gestioneprenotazioni.repositories;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.epicode.gestioneprenotazioni.models.Postazione;


public interface PosrepoPage extends PagingAndSortingRepository<Postazione, Integer> {

}
