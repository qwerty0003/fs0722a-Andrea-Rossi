package com.epicode.gestioneprenotazioni.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.epicode.gestioneprenotazioni.configuration.UserDetailsImpl;
import com.epicode.gestioneprenotazioni.entities.Utente;

@Service
public class UserDetailsImplService implements UserDetailsService {

	@Autowired
	private UtenteService uteSe;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		Optional<Utente> utente = uteSe.ottieniDaUsername(username);

		if (utente.isPresent()) {
			return UserDetailsImpl.build(utente.get());
		} else {
			throw new UsernameNotFoundException(username);
		}

		// return null;
	}

}
