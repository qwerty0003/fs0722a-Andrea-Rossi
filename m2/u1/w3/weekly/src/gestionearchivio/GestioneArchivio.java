package gestionearchivio;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import model.ArticoloPubblicato;
import model.Genere;
import model.Libro;
import model.Periodicita;
import model.Prestito;
import model.Rivista;
import model.Utente;
import dao.ArticoloPubblicatoDAO;
import dao.LibroDAO;
import dao.PrestitoDAO;
import dao.RivistaDAO;
import dao.UtenteDAO;

public class GestioneArchivio {
	
	private static final String gestioneArchivio = "Weekly3";
	private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory(gestioneArchivio);
	private static final EntityManager em = emf.createEntityManager();


	public static void main(String[] args) {
		
		//GENERO DATI NEL DB, CON METODI AGGIUNTA
		/*
		Libro l1=new Libro(1111, "1984", 1949, 1984, "George Orwell", Genere.DISTROPICO);
		Libro l2=new Libro(1112, "Il cacciatore di aquiloni", 2003, 896, "Khaled Hosseini", Genere.ROMANZO);
		Libro l3=new Libro(1113, "Guerra e Pace", 1891, 1253, "Lev Tolstoj", Genere.STORIA);
		Libro l4=new Libro(1117, "Assassinio sull'Orient Express", 1934, 100, "Agatha Christie", Genere.GIALLO);
		Libro l5=new Libro(1118, "Il Signore degli Anelli", 1955, 1364, "J. R. R. Tolkien", Genere.FANTASY);
		LibroDAO.save(l1);
		LibroDAO.save(l2);
		LibroDAO.save(l3);
		LibroDAO.save(l4);
		LibroDAO.save(l5);
		
		Rivista r1=new Rivista(1114, "Oggi", 2003, 100, Periodicita.MENSILE);
		Rivista r2=new Rivista(1115, "Focus", 2023, 180, Periodicita.SEMESTRALE);
		Rivista r3=new Rivista(1116, "La Settimana Enigminstica", 2017, 30, Periodicita.SETTIMANALE);
		RivistaDAO.save(r1); 
		RivistaDAO.save(r2);
		RivistaDAO.save(r3);
		
		Utente u1=new Utente();
		u1.setNome("Mario");
		u1.setCognome("Rossi");
		u1.setDataNascita(LocalDate.of(1983, 5, 15));
		u1.setNumeroTessera(101);
		UtenteDAO.save(u1);
		
		Utente u2=new Utente();
		u2.setNome("Gigi");
		u2.setCognome("Verdi");
		u2.setDataNascita(LocalDate.of(1997, 6, 16));
		u2.setNumeroTessera(666);
		UtenteDAO.save(u2);
		
		Utente u3=new Utente();
		u3.setNome("Pino");
		u3.setCognome("Neri");
		u3.setDataNascita(LocalDate.of(1967, 2, 26));
		u3.setNumeroTessera(90);
		UtenteDAO.save(u3);
		
		Prestito p1=new Prestito();
		p1.setUtente(u1);
		ArticoloPubblicato ap= em.find(ArticoloPubblicato.class, 13);
		p1.setElementoPrestato(ap);
		p1.setDataInizioPrestito(LocalDate.of(2022, 5, 5));
		p1.setDataRestituzionePrevista(p1.getDataInizioPrestito().plusDays(30));
		p1.setDataRestituzioneEffettiva(LocalDate.of(2022, 5, 20));
		PrestitoDAO.save(p1);
		
		Prestito p2=new Prestito();
		p2.setUtente(u2);
		ArticoloPubblicato ap2= em.find(ArticoloPubblicato.class, 14);
		p2.setElementoPrestato(ap2);
		p2.setDataInizioPrestito(LocalDate.of(2023, 1, 7));
		p2.setDataRestituzionePrevista(p2.getDataInizioPrestito().plusDays(30));
		p2.setDataRestituzioneEffettiva(LocalDate.of(2023, 1, 25));
		PrestitoDAO.save(p2);
		Prestito p3=new Prestito();
		p3.setUtente(u3);
		ArticoloPubblicato ap3= em.find(ArticoloPubblicato.class, 11);
		p3.setElementoPrestato(ap3);
		p3.setDataInizioPrestito(LocalDate.of(2022, 1, 7));
		p3.setDataRestituzionePrevista(p3.getDataInizioPrestito().plusDays(30));
		p3.setDataRestituzioneEffettiva(null);
		PrestitoDAO.save(p3);
		Prestito p4=new Prestito();
		p4.setUtente(u3);
		ArticoloPubblicato ap4= em.find(ArticoloPubblicato.class, 15);
		p4.setElementoPrestato(ap4);
		p4.setDataInizioPrestito(LocalDate.of(2023, 2, 16));
		p4.setDataRestituzionePrevista(p4.getDataInizioPrestito().plusDays(30));
		p4.setDataRestituzioneEffettiva(null);
		PrestitoDAO.save(p4);*/
		
		//METODI
		
		//ArticoloPubblicatoDAO.ottieniElementoDaISBN(1111); //esce 1984
		//ArticoloPubblicatoDAO.ottieniElementoDaAnnoPubblicazione(2003); //escono oggi ed il cacciatore di aquiloni
		//LibroDAO.ottieniElementoDaAutore("Agatha Christie"); //esce assassinio sull orient express
		//ArticoloPubblicatoDAO.ottieniElementoDaISBN(1118); //esce il signore degli anelli
		//ArticoloPubblicatoDAO.ottieniElementoDaTitolo("Focus"); //esce focus
		//PrestitoDAO.ottieniPrestitoDaTessera(90);
		//PrestitoDAO.ottieniPrestitScadutiNonRestituiti(); // id del prestito esatto
		//ArticoloPubblicatoDAO.eliminaArticolo(1113); //Guerra e Pace eliminato
		
		
	}

}
