package model_TABLE_PER_CLASS;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MainProject3 {

	static Logger log = LoggerFactory.getLogger(MainProject3.class);
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Lezione16_02");

	public static void main(String[] args) {

		Automobile3 a1 = new Automobile3();
		a1.setMarca("Fiat");
		a1.setModello("500");
		a1.setNporte(5);
		a1.setAlimentazione("elettrico");

		saveAuto(a1);

		Moto3 m1 = new Moto3();
		m1.setMarca("Honda");
		m1.setModello("Hornet");
		m1.setCilindrata(9000);
		m1.setNposti(1);

		saveMoto(m1);

	}

	public static void saveAuto(Automobile3 a) {

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

	public static void saveMoto(Moto3 m) {

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
