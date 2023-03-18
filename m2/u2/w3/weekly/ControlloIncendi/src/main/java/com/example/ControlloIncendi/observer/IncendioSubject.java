package com.example.ControlloIncendi.observer;

import java.util.ArrayList;
import java.util.List;

import com.example.ControlloIncendi.models.Incendio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class IncendioSubject {

	private Incendio incendio;
	List<IncendioObserver> osservatori = new ArrayList<>();
	
	public void aggiungiOsservatore(IncendioObserver io) {
		osservatori.add(io);
	}
	
	public void rimuoviOsservatore(IncendioObserver io) {
		osservatori.remove(io);
	}
	
	public void segnalaIncendi(Incendio incendio) {
		if(incendio.getQuantitaFumo()>5) {
			System.out.println("INCENDIO CON LVL FUMO MAGGIORE DI 5: ");
		}
		osservatori.forEach(osservatore -> osservatore.segnala(incendio));
	}
}
