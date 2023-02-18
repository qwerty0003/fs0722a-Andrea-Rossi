package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.ArticoloPubblicato;

public class ArticoloPubblicatoDAO {
	
	private static final String gestioneArchivio = "Weekly3";
	private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory(gestioneArchivio);
	private static final EntityManager em = emf.createEntityManager();
	private static final EntityTransaction t = em.getTransaction();

	public static void save(ArticoloPubblicato object) {
		
		try {
			ArticoloPubblicato ap = object;
			
			t.begin();
			em.persist(ap);
			t.commit();
			
			System.out.println("Articolo inserito correttamente!");
		}
		catch(Exception e) {
			System.out.println("Errore nell'inserimento dell' articolo");
		}

	}
	
    public static void ottieniElementoDaISBN(int codiceISBN) {
    	
    	Query q = em.createNamedQuery("ottieniElementoDaISBN");
    	q.setParameter("valore", codiceISBN);
    	
    	List<ArticoloPubblicato> res = q.getResultList();
    	
    	for(ArticoloPubblicato ap:res) {
    		System.out.println(ap);
    	}
    	
    }
    
    public static void ottieniElementoDaAnnoPubblicazione(int annoPubblicazione) {
    	
    	Query q = em.createNamedQuery("ottieniElementoDaAnnoPubblicazione");
    	q.setParameter("valore", annoPubblicazione);
    	
    	List<ArticoloPubblicato> res = q.getResultList();
    	
    	for(ArticoloPubblicato ap:res) {
    		System.out.println(ap);
    	}
    	
    }
    
	public static void eliminaArticolo(int codiceISBN) {
		Query q = em.createNamedQuery("ottieniElementoDaISBN");
		q.setParameter("valore", codiceISBN);
		ArticoloPubblicato ev = (ArticoloPubblicato) q.getSingleResult();
		
		if( ev == null ) {
			System.out.println( "L'articolo con il codice ISBN " + codiceISBN + " non è stato trovato!" );
			return;
		}
		
		t.begin();
		em.remove(ev);
		t.commit();
		System.out.println( "L'articolo con il codice ISBN " + codiceISBN + "("+ ev.getTitolo()+") è stato eliminato!" );
		
	}
	
	
	
    public static void ottieniElementoDaTitolo(String titolo) {
    	
    	Query q = em.createNamedQuery("ottieniElementoDaTitolo");
    	q.setParameter("valore", titolo);
    	
    	List<ArticoloPubblicato> res = q.getResultList();
    	
    	for(ArticoloPubblicato ap:res) {
    		System.out.println(ap);
    	}
    	
    }
	
}
