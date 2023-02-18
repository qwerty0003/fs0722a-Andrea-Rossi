package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import model.Rivista;

public class RivistaDAO{
	
	private static final String gestioneArchivio = "Weekly3";
	private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory(gestioneArchivio);
	private static final EntityManager em = emf.createEntityManager();
	private static final EntityTransaction t = em.getTransaction();
	
	public static void save(Rivista object) {
		
		try {
			Rivista r = object;
			
			t.begin();
			em.persist(r);
			t.commit();
			
			System.out.println("Rivista inserito correttamente!");
		}
		catch(Exception e) {
			System.out.println("Errore nell'inserimento della rivista");
		}

	}


}
