package controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Utente;

public class GestioneUtenteJPA {

	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("lezione14_02n2");

	static EntityManager em = emf.createEntityManager();

	public static void main(String[] args) {
 
		Utente guy = new Utente ();
		guy.setNome("Pino");
		guy.setCognome("Nopino");
		guy.setEmail("chebuffo@nome.com");
		Utente guy1 = new Utente ();
		guy1.setNome("Mario");
		guy1.setCognome("Lilla");
		guy1.setEmail("checolore@dafiore.com");
		
		aggiungiUtente(guy);		
		aggiungiUtente(guy1);
		modificaUtente(guy1);
		
		Utente mioutente = leggiUtente(2);
		System.out.println(mioutente);
		
		guy1.setEmail("nomore@jokes.com");
		
		eliminaUtente(guy1);
		eliminaUtente(guy);
		eliminaUtente(mioutente);
		
	}
	
	
	private static void aggiungiUtente(Utente u) {
		em.getTransaction().begin();
		em.persist(u);
		em.getTransaction().commit();
		System.out.println("Utente aggiunto correttamente nel DB!");
	}
	
	private static Utente leggiUtente(int id) {
		em.getTransaction().begin();
		Utente u = em.find(Utente.class, id);
		em.getTransaction().commit();
		System.out.println("Utente trovato correttamente nel DB!");
		return u;
	}
	
	
	private static void modificaUtente(Utente u) {
		em.getTransaction().begin();
		em.merge(u);
		em.getTransaction().commit();
		System.out.println("Utente modificato correttamente nel DB!");
		System.out.println(u);
	}
	
	private static void eliminaUtente(Utente u) {
		em.getTransaction().begin();
		em.remove(u);
		em.getTransaction().commit();
		System.out.println("Utente eliminato definitivamente dal DB!");
	}

}
