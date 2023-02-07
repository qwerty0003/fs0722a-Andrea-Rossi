package partOne;

import java.util.HashSet;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParteUno {

	static Scanner sc = new Scanner(System.in);
	static Logger log = LoggerFactory.getLogger(ParteUno.class);

	public static void main(String[] args) {
		insert();

	}

	public static void insert() {
		HashSet<String> lista = new HashSet<String>();
		HashSet<String> duplicati = new HashSet<String>();
		try {
			log.info("Inserisci un numero che sara' la dimensione della lista");

			int n = Integer.parseInt(sc.nextLine());
			for (int i = 0; i < n; i++) {
				log.info("Inserisci una parola");
				String parola = sc.nextLine();
				if (lista.contains(parola)) {
					log.warn("Parola " + parola + " gia' inserita. Riprova");
					duplicati.add(parola);
					i--;
				} else
					lista.add(parola);
			}
		} catch (NumberFormatException ex) {
			log.error("INERISCI UN NUMERO PERFAVORE!");
			log.info(" ");
			insert();

		}
		log.info("Dimensioni lista: " + lista.size());
		log.info("Elementi lista: ");
		for (String i : lista) {
			System.out.println(i);
		}
		log.info("  ");
		log.info("Elementi duplicati lista: ");
		for (String i : duplicati) {
			System.out.println(i);
		}
	}

}
