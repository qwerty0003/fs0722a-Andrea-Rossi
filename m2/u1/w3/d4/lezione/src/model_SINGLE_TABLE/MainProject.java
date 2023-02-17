package model_SINGLE_TABLE;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainProject {

	static Logger log = LoggerFactory.getLogger(MainProject.class);
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Lezione16_02");

	public static void main(String[] args) {

		Automobile a1 = new Automobile();
		a1.setMarca("Fiat");
		a1.setModello("500");
		a1.setNporte(5);
		a1.setAlimentazione("elettrico");

		//saveAuto(a1);

		Moto m1 = new Moto();
		m1.setMarca("Honda");
		m1.setModello("Hornet");
		m1.setCilindrata(9000);
		m1.setNposti(1);

		//saveMoto(m1);
		
		Automobile ad = getAutoById(1);
		Moto m3 = getMotoById(2);
		System.out.println(ad);
		System.out.println(m3);

	}

	public static void saveAuto(Automobile a) {

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

	public static void saveMoto(Moto m) {

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

	public static Automobile getAutoById(long id) {
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			return em.find(Automobile.class, id);
		} finally {
			em.close();
		}
	}

	public static Moto getMotoById(long id) {
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			return em.find(Moto.class, id);
		} finally {
			em.close();
		}
	}

}
