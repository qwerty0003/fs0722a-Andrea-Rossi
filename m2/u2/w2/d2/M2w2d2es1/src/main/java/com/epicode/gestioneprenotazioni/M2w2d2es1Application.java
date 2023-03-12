package com.epicode.gestioneprenotazioni;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.epicode.gestioneprenotazioni.configurations.GestionePrenotazioniConfiguration;
import com.epicode.gestioneprenotazioni.models.Edificio;
import com.epicode.gestioneprenotazioni.models.Postazione;
import com.epicode.gestioneprenotazioni.models.Prenotazioni;
import com.epicode.gestioneprenotazioni.models.Utente;
import com.epicode.gestioneprenotazioni.repositories.EdificioRepository;
import com.epicode.gestioneprenotazioni.repositories.PostazioneRepository;
import com.epicode.gestioneprenotazioni.repositories.PrenotazioniRepository;
import com.epicode.gestioneprenotazioni.repositories.UtenteRepository;
import com.epicode.gestioneprenotazioni.services.EdificioService;
import com.epicode.gestioneprenotazioni.services.PostazioneService;
import com.epicode.gestioneprenotazioni.services.PrenotazioniService;
import com.epicode.gestioneprenotazioni.services.UtenteService;

@SpringBootApplication
public class M2w2d2es1Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(M2w2d2es1Application.class, args);
	}
	
	@Autowired
	EdificioService ediSe;
	
	@Autowired
	PostazioneService posSe;
	
	@Autowired
	PrenotazioniService preSe;
	
	@Autowired
	UtenteService uteSe;
	
	@Autowired
	EdificioRepository ediRepo;
	
	@Autowired
	PostazioneRepository posRepo;
	
	@Autowired
	UtenteRepository utRepo;
	
	@Autowired
	PrenotazioniRepository preRepo;
	
	ApplicationContext ctx = new AnnotationConfigApplicationContext(GestionePrenotazioniConfiguration.class);

	@Override
	public void run(String... args) throws Exception {
		
		//inserisciEdifici();
		//inserisciPostazioni();
		//inserisciUtenti();
		//inserisciPrenotazioni();
		
		((AnnotationConfigApplicationContext)ctx).close();
	}
	
	public void inserisciEdifici() {
		
		Edificio ed1=(Edificio)ctx.getBean("ed1");
		ediSe.inserisci(ed1);
		
		Edificio ed2=(Edificio)ctx.getBean("ed2");
		ediSe.inserisci(ed2);
		
		Edificio ed3=(Edificio)ctx.getBean("ed3");
		ediSe.inserisci(ed3);
		
		Edificio ed4=(Edificio)ctx.getBean("ed4");
		ediSe.inserisci(ed4);
	}
	
	public void inserisciPostazioni() {
		Postazione po1=(Postazione)ctx.getBean("po1");
		posSe.inserisciPos(po1);
		
		Postazione po2=(Postazione)ctx.getBean("po2");
		posSe.inserisciPos(po2);
		
		Postazione po3=(Postazione)ctx.getBean("po3");
		posSe.inserisciPos(po3);
		
		Postazione po4=(Postazione)ctx.getBean("po4");
		posSe.inserisciPos(po4);
		
		Postazione po5=(Postazione)ctx.getBean("po5");
		posSe.inserisciPos(po5);
	}
	
	public void inserisciUtenti() {
		Utente ut1=(Utente)ctx.getBean("ut1");
		uteSe.inserisciUte(ut1);
		
		Utente ut2=(Utente)ctx.getBean("ut2");
		uteSe.inserisciUte(ut2);
		
		Utente ut3=(Utente)ctx.getBean("ut3");
		uteSe.inserisciUte(ut3);
		
		Utente ut4=(Utente)ctx.getBean("ut4");
		uteSe.inserisciUte(ut4);
	}
	
	public void inserisciPrenotazioni() {
		Prenotazioni pr1=(Prenotazioni)ctx.getBean("pr1");
		preSe.inserisciPre(pr1);
		
		Prenotazioni pr2=(Prenotazioni)ctx.getBean("pr2");
		preSe.inserisciPre(pr2);
		
		Prenotazioni pr3=(Prenotazioni)ctx.getBean("pr3");
		preSe.inserisciPre(pr3);
	}

}
