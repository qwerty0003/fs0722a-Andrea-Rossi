package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import model.Utente;

public class UtenteDAO {

	
	private static final String gestioneArchivio = "Weekly3";
	private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory(gestioneArchivio);
	private static final EntityManager em = emf.createEntityManager();
	private static final EntityTransaction t = em.getTransaction();
	
	public static void save(Utente object) {
		
		try {
			Utente u = object;
			
			t.begin();
			em.persist(u);
			t.commit();
			
			System.out.println("Utente inserito correttamente!");
		}
		catch(Exception e) {
			System.out.println("Errore nell'inserimento dell' utente");
		}

	}
}