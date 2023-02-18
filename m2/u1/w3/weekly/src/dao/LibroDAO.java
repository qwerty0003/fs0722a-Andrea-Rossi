package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Libro;

public class LibroDAO {

	private static final String gestioneArchivio = "Weekly3";
	private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory(gestioneArchivio);
	private static final EntityManager em = emf.createEntityManager();
	private static final EntityTransaction t = em.getTransaction();
	
	
	public static void save(Libro object) {
		
		try {
			Libro l = object;
			
			t.begin();
			em.persist(l);
			t.commit();
			
			System.out.println("Libro inserito correttamente!");
		}
		catch(Exception e) {
			System.out.println("Errore nell'inserimento del Libro");
		}

	}
	
    public static void ottieniElementoDaAutore(String autore) {
    	
    	Query q = em.createNamedQuery("ottieniElementoDaAutore");
    	q.setParameter("valore", autore);
    	
    	List<Libro> res = q.getResultList();
    	
    	for(Libro l:res) {
    		System.out.println(l);
    	}
    	
    }
}
