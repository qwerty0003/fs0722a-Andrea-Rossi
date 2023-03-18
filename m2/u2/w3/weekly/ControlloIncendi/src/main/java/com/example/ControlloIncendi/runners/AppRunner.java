package com.example.ControlloIncendi.runners;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.example.ControlloIncendi.models.Incendio;
import com.example.ControlloIncendi.models.Sonda;
import com.example.ControlloIncendi.observer.CentroDiControllo;
import com.example.ControlloIncendi.observer.IncendioSubject;
import com.example.ControlloIncendi.services.IncendioService;
import com.example.ControlloIncendi.services.SondaService;

@Component
public class AppRunner implements ApplicationRunner {

	@Autowired
	SondaService soSe;
	
	@Autowired
	IncendioService inSe;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("/-/-/-/");
		System.out.println("APP RUNNER RUNNING");

		//Metodi per l'inserimento nel database
		
//				inserisciElementi();
				
		//Metodo per la visualizzazione su console
				
				gestioneIncendi();
		
		System.out.println("APP RUNNER STOPPED");
		System.out.println("/-/-/-/");
	}
	
	public void inserisciElementi() {
		
		//SONDE
		
		Sonda so1=Sonda.builder().latitudine(100).longitudine(100).build();
		soSe.inserisci(so1);
		
		Sonda so2=Sonda.builder().latitudine(200).longitudine(200).build();
		soSe.inserisci(so2);
		
		Sonda so3=Sonda.builder().latitudine(300).longitudine(300).build();
		soSe.inserisci(so3);
		
		Sonda so4=Sonda.builder().latitudine(400).longitudine(400).build();
		soSe.inserisci(so4);
		
		Sonda so5=Sonda.builder().latitudine(500).longitudine(500).build();
		soSe.inserisci(so5);
	
		//INCENDI
		
		Incendio in1=Incendio.builder().sonda(so1).quantitaFumo(6).build();
		inSe.inserisci(in1);
		
		Incendio in2=Incendio.builder().sonda(so2).quantitaFumo(4).build();
		inSe.inserisci(in2);
		
		Incendio in3=Incendio.builder().sonda(so3).quantitaFumo(9).build();
		inSe.inserisci(in3);
		
		Incendio in4=Incendio.builder().sonda(so4).quantitaFumo(2).build();
		inSe.inserisci(in4);
		
		Incendio in5=Incendio.builder().sonda(so5).quantitaFumo(7).build();
		inSe.inserisci(in5);
		
		Incendio in6=Incendio.builder().sonda(so1).quantitaFumo(6).build();
		inSe.inserisci(in6);
		
	}
	
	public void gestioneIncendi() {
		CentroDiControllo cdc= new CentroDiControllo();
		
		Incendio in1= inSe.ottieniDaId((long) 1).get();
		IncendioSubject inSu1= new IncendioSubject(in1, new ArrayList<>(Arrays.asList(cdc)));
		
		Incendio in2= inSe.ottieniDaId((long) 2).get();
		IncendioSubject inSu2= new IncendioSubject(in2, new ArrayList<>(Arrays.asList(cdc)));
		
		Incendio in3= inSe.ottieniDaId((long) 3).get();
		IncendioSubject inSu3= new IncendioSubject(in3, new ArrayList<>(Arrays.asList(cdc)));
		
		Incendio in4= inSe.ottieniDaId((long) 4).get();
		IncendioSubject inSu4= new IncendioSubject(in4, new ArrayList<>(Arrays.asList(cdc)));
		
		Incendio in5= inSe.ottieniDaId((long) 5).get();
		IncendioSubject inSu5= new IncendioSubject(in5, new ArrayList<>(Arrays.asList(cdc)));
		
		Incendio in6= inSe.ottieniDaId((long) 6).get();
		IncendioSubject inSu6= new IncendioSubject(in6, new ArrayList<>(Arrays.asList(cdc)));
		
		System.out.println("");
		inSu1.segnalaIncendi(in1);
		System.out.println("");
		inSu2.segnalaIncendi(in2);
		System.out.println("");
		inSu3.segnalaIncendi(in3);
		System.out.println("");
		inSu4.segnalaIncendi(in4);
		System.out.println("");
		inSu5.segnalaIncendi(in5);
		System.out.println("");
		inSu6.segnalaIncendi(in6);
		System.out.println("");
	}
	
	

}
