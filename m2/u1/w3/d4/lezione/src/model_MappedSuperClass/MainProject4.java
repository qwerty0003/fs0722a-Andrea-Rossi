package model_MappedSuperClass;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MainProject4 {

	static Logger log = LoggerFactory.getLogger(MainProject4.class);
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Lezione16_02");

	public static void main(String[] args) {

		Automobile4 a1 = new Automobile4();
		a1.setMarca("Ford");
		a1.setModello("Fiesta");
		a1.setNporte(5);
		a1.setAlimentazione("Metano");

		saveAuto(a1);
		//List<Automobile4> list = leggiAllAuto();
		//log.info(list.toString());
		List<Automobile4> lista = criteria();
		log.info(lista.toString());

		/*Moto4 m1 = new Moto4();
		m1.setMarca("Honda");
		m1.setModello("Hornet");
		m1.setCilindrata(9000);
		m1.setNposti(1);

		saveMoto(m1);*/

	}

	public static void saveAuto(Automobile4 a) {

		EntityManager em = emf.createEntityManager();

		try {
			em.getTransaction().begin();
			em.persist(a);
			em.getTransaction().commit();
			log.info(a.toString() + " salvata nel DB!");
		} catch (Exception ec) {
			em.getTransaction().rollback();
			log.error(ec.getMessage());
		} finally {
			em.close();
		}
	}

	public static void saveMoto(Moto4 m) {

		EntityManager em = emf.createEntityManager();

		try {
			em.getTransaction().begin();
			em.persist(m);
			em.getTransaction().commit();
			log.info(m.toString() + " salvata nel DB!");
		} catch (Exception ec) {
			em.getTransaction().rollback();
			log.error(ec.getMessage());
		} finally {
			em.close();
		}
	}
	
	public static List<Automobile4> leggiAllAuto() {
		EntityManager em = emf.createEntityManager();
		Query q = em.createNamedQuery("Automobile.findAll");
		return q.getResultList();
	}
	//leggi tutte le auto con criteria api
	public static List<Automobile4> criteria(){
		EntityManager em = emf.createEntityManager();
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Automobile4> qu = cb.createQuery(Automobile4.class);
		Root<Automobile4> c = qu.from(Automobile4.class);
		qu.select(c);
		Query q = em.createQuery(qu);
		return q.getResultList();
	}

}
