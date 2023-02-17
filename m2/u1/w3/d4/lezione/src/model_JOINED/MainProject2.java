package model_JOINED;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MainProject2 {

	static Logger log = LoggerFactory.getLogger(MainProject2.class);
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Lezione16_02");

	public static void main(String[] args) {

		Automobilel a1 = new Automobilel();
		a1.setMarca("Fiat");
		a1.setModello("500");
		a1.setNporte(5);
		a1.setAlimentazione("elettrico");

		saveAuto(a1);

		Motolol m1 = new Motolol();
		m1.setMarca("Honda");
		m1.setModello("Hornet");
		m1.setCilindrata(9000);
		m1.setNposti(1);

		saveMoto(m1);

	}

	public static void saveAuto(Automobilel a) {

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

	public static void saveMoto(Motolol m) {

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

}
