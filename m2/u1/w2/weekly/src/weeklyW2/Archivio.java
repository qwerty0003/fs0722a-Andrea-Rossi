package weeklyW2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import org.apache.commons.io.FileUtils;

public class Archivio {

	private static final String ENCODING = "utf-8";
	static String fileNameLibri = "libri.txt";
	static String fileNameRiviste = "riviste.txt";
	static File fileLibri = new File(fileNameLibri);
	static File fileRiviste = new File(fileNameRiviste);
	static List<Rivista> listaRiviste = new ArrayList<>();
	static List<Libro> listaLibri = new ArrayList<>();

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// APP AUTOMATICA PER I VARI METODI

		System.out.println("Vuoi aggiungere un libro o una rivista all'archivio?");
		String crea = sc.next();
		if (crea.equals("libro")) {
			creaLibro();
		} else if (crea.equals("rivista")) {
			creaRivista();
		} else {
			return;
		}
		System.out.println("Vuoi aggiungere un libro o una rivista all'archivio?");
		String crea2 = sc.next();
		if (crea2.equals("libro")) {
			creaLibro();
		} else if (crea2.equals("rivista")) {
			creaRivista();
		} else {
			return;
		}

		System.out.println("Vuoi fare operazioni su libri o su riviste?");
		String string = sc.next();
		if (string.equals("libri")) {
			System.out.println("-----------------------------");
			System.out.println("OPERAZIONI SU LIBRI");
			System.out.println(
					"Eliminare libri, cercarli da anno, autore o codice univoco ISBN, eseguire varie operazioni con i file txt");
			System.out.println("PER ELIMINARE SCRIVI elimina");
			System.out.println("PER ESEGUIRE UNA RICERCA SCRIVI ISBN, anno o autore");
			System.out.println("PER ESEGUIRE OPERAZIONI SU/DA FILE TXT SCRIVI stampa");
			System.out.println("PER USCIRE SCRIVI esci");
			String cosaFare = sc.next();
			switch (cosaFare) {
			case "elimina":
				eliminaLibro();
				break;
			case "ISBN":
				cercaIsbn();
				break;
			case "anno":
				cercaAnno();
				break;
			case "autore":
				cercaAutore();
				break;
			case "esci":
				break;
			}

		} else {
			System.out.println("-----------------------------");
			System.out.println("OPERAZIONI SU RIVISTE");
			System.out.println(
					"Eliminare riviste, cercarle da anno o codice univoco ISBN, eseguire varie operazioni con i file txt");
			System.out.println("PER ELIMINARE SCRIVI elimina");
			System.out.println("PER ESEGUIRE UNA RICERCA SCRIVI ISBN, anno");
			System.out.println("PER ESEGUIRE OPERAZIONI SU/DA FILE TXT SCRIVI stampa");
			System.out.println("PER USCIRE SCRIVI esci");
			String cosaFare = sc.next();
			switch (cosaFare) {
			case "elimina":
				eliminaRivista();
				break;
			case "ISBN":
				cercaIsbnRivista();
				break;
			case "anno":
				cercaAnnoRivista();
				break;
			case "esci":
				break;
			}
		}

		// leggere e scrivere da/su files
		for (int i = 0; i < 2; i++) {
			System.out.println("-----------------------------");
			System.out.println("scrivi sl per salvare su disco i libri, sr per salvare le riviste su disco");
			System.out.println("oppure ll  o lr per leggerli rispettivamente e stamparli in console");
			System.out.println("PER SALVARE I LIBRI SCRIVI salvali");
			System.out.println("PER LEGGERE I LIBRI SCRIVI leggili");
			System.out.println("PER SALVARE LE RIVISTE SCRIVI salvari");
			System.out.println("PER LEGGERE LE RIVISTE SCRIVI leggiri");
			String cosaFare = sc.next();
			switch (cosaFare) {
			case "salvali":
				try {
					scriviLibriSuFile(listaLibri, true);
					System.out.println("hai salvato su disco il libro");
				} catch (IOException e1) {

					e1.printStackTrace();
				}
				;
				break;
			case "salvari":
				try {
					scriviRivisteSuFile(listaRiviste, true);
					System.out.println("hai salvato su disco la rivista");
				} catch (IOException e1) {

					e1.printStackTrace();
				}
				;
				break;
			case "leggili":
				try {
					leggiSuFile(fileLibri);
				} catch (IOException e1) {

					e1.printStackTrace();
				}
				;
				break;
			case "leggiri":
				try {
					leggiSuFile(fileRiviste);
				} catch (IOException e1) {

					e1.printStackTrace();
				}
				;
				break;
			case "esci":
				break;
			}

		}

	}

	// metodi riviste

	private static void creaRivista() {

		Rivista r1 = new Rivista();

		System.out.println("Inserisci il titolo della rivista: ");
		try {
			String titoloRivista = sc.next();
			r1.setTitolo(titoloRivista);
		} catch (IllegalArgumentException e) {
			System.out.println("Il titolo della rivista non è valido: " + e.getMessage());
		}

		System.out.println("Inserisci l'anno di pubblicazione della rivista: ");
		try {
			int annRivista = Integer.parseInt(sc.next());
			r1.setAnnoPubblicazione(annRivista);
		} catch (IllegalArgumentException e) {
			System.out.println("L'anno di pubblicazione non è valido: " + e.getMessage());
		}

		System.out.println("Inserisci il numero di pagine della rivista: ");
		try {
			int pagineRivista = Integer.parseInt(sc.next());
			r1.setPagine(pagineRivista);
		} catch (IllegalArgumentException e) {
			System.out.println("Il numero di pagine non è valido: " + e.getMessage());
		}

		System.out.println("Inserisci il codice ISBN della rivista: ");
		try {
			int ISBNrivista = Integer.parseInt(sc.next());
			r1.setISBN(ISBNrivista);
		} catch (IllegalArgumentException e) {
			System.out.println("Il codice ISBN non è valido: " + e.getMessage());
		}

		System.out.println("Inserisci la periodicità della rivista (settimanale, mensile o semestrale)");
		String period = sc.next();

		switch (period) {
		case "settimanale":
			r1.setPeriodicita(Periodicita.SETTIMANALE);
			break;
		case "mensile":
			r1.setPeriodicita(Periodicita.MENSILE);
			break;
		case "semestrale":
			r1.setPeriodicita(Periodicita.SEMESTRALE);
			break;
		}

		listaRiviste.add(r1);
		System.out.println("La rivista è stata creata!");
	}

	// elimina tramite isbnb
	private static void eliminaRivista() {

		System.out.println("----------------------------------");
		System.out.println("Scrivi l'ISBN della rivista da eliminare: ");
		int ISBNrivistaEl = Integer.parseInt(sc.next());
		;

		List<Rivista> rivistaStream0 = listaRiviste.stream().filter(r -> r.getISBN() == ISBNrivistaEl)
				.collect(Collectors.toList());

		listaLibri.remove(rivistaStream0);
		System.out.println("La rivista con codice " + ISBNrivistaEl + " è stata eliminata!");
	}

	private static void cercaIsbnRivista() {

		System.out.println("----------------------------------");
		System.out.println("Scrivi l'ISBN della rivista che vuoi cercare: ");
		int ISBNrivistaCerca = Integer.parseInt(sc.next());

		List<Rivista> rivisteStream1 = listaRiviste.stream().filter(r -> r.getISBN() == ISBNrivistaCerca)
				.collect(Collectors.toList());

		rivisteStream1.forEach(r -> System.out.println(r));
		System.out.println(" ");

	}

	private static void cercaAnnoRivista() {

		System.out.println("----------------------------------");
		System.out.println("Scrivi l'anno di pubblicazione della rivista che vuoi cercare: ");
		int annoRicercaRivista = Integer.parseInt(sc.next());

		List<Rivista> rivisteStream2 = listaRiviste.stream().filter(r -> r.getAnnoPubblicazione() == annoRicercaRivista)
				.collect(Collectors.toList());

		rivisteStream2.forEach(r -> System.out.println(r));
		System.out.println(" ");
	}

	// metodi libri

	private static void creaLibro() {

		Libro l1 = new Libro();

		System.out.println("Inserisci il titolo del libro: ");
		try {
			String titoloLibro = sc.next();
			l1.setTitolo(titoloLibro);
		} catch (IllegalArgumentException e) {
			System.out.println("Il titolo non è valido: " + e.getMessage());
		}

		System.out.println("Inserisci l'autore del libro: ");
		try {
			String autoreLibro = sc.next();
			l1.setAutore(autoreLibro);
		} catch (IllegalArgumentException e) {
			System.out.println("L'autore del libro non è valido: " + e.getMessage());
		}

		System.out.println("Inserisci il genere del libro: ");
		try {
			String genereLibro = sc.next();
			l1.setGenere(genereLibro);
		} catch (IllegalArgumentException e) {
			System.out.println("Il genere non è valido: " + e.getMessage());
		}

		System.out.println("Inserisci l'anno di pubblicazione del libro: ");
		try {
			int annoLibro = Integer.parseInt(sc.next());
			l1.setAnnoPubblicazione(annoLibro);
		} catch (NumberFormatException e) {
			System.out.println("l'anno di pubblicazione non è valido: " + e.getMessage());
		}
		System.out.println("Inserisci il numero di pagine del libro: ");
		try {
			int pagineLibro = Integer.parseInt(sc.next());
			l1.setPagine(pagineLibro);
		} catch (NumberFormatException e) {
			System.out.println("Il numero di pagine non è valido: " + e.getMessage());
		}

		System.out.println("Inserisci il codice ISBN del libro: ");
		try {
			int ISBNlibro = Integer.parseInt(sc.next());
			l1.setISBN(ISBNlibro);
		} catch (NumberFormatException e) {
			System.out.println("Il codice ISBN non è valido: " + e.getMessage());
		}

		listaLibri.add(l1);
		System.out.println("Il libro è stato creato");
	}

	// eliminazione tramite isbn

	private static void eliminaLibro() {

		System.out.println("----------------------------------");
		System.out.println("Scrivi l'ISBN del libro da eliminare: ");
		int ISBNLibro = Integer.parseInt(sc.next());

		List<Libro> libroStream0 = listaLibri.stream().filter(l -> l.getISBN() == ISBNLibro)
				.collect(Collectors.toList());

		listaLibri.remove(libroStream0);
		System.out.println("Il libro con codice " + ISBNLibro + " è stato eliminato!");
	}

	private static void cercaIsbn() {

		System.out.println("----------------------------------");
		System.out.println("Scrivi l'ISBN del libro che vorresti cercare: ");
		int ISBNricerca = Integer.parseInt(sc.next());

		List<Libro> libroStream = listaLibri.stream().filter(l -> l.getISBN() == ISBNricerca)
				.collect(Collectors.toList());

		libroStream.forEach(l -> System.out.println(l));
		System.out.println(" ");
	}

	private static void cercaAnno() {

		System.out.println("----------------------------------");
		System.out.println("Srivi l'anno di pubblicazione del libro che vuoi cercare: ");
		int annoRicerca = Integer.parseInt(sc.next());

		List<Libro> libroStream2 = listaLibri.stream().filter(l -> l.getAnnoPubblicazione() == annoRicerca)
				.collect(Collectors.toList());

		libroStream2.forEach(l -> System.out.println(l));
		System.out.println(" ");
	}

	private static void cercaAutore() {

		//////////////////////////////////////////// RICERCA IN BASE ALL'AUTORE
		System.out.println("----------------------------------");
		System.out.println("Scrivi l'autore del libro che vuoi cercare: ");
		String autRicerca = sc.next();

		List<Libro> libroStream1 = listaLibri.stream().filter(l -> l.getAutore() == autRicerca)
				.collect(Collectors.toList());

		libroStream1.forEach(l -> System.out.println(l));
		System.out.println(" ");
	}

	// metodi scrittura divisi ed uno unico per lettura

	public static void scriviLibriSuFile(List<Libro> listaLibri, boolean append) throws IOException {
		StringBuilder scriviNelFile = new StringBuilder("");
		for (int i = 0; i < listaLibri.size(); i++) {
			scriviNelFile.append(listaLibri.get(i).toString() + System.lineSeparator());
		}
		String str = scriviNelFile.toString();
		FileUtils.writeStringToFile(fileLibri, str, ENCODING, true);
	}

	public static void scriviRivisteSuFile(List<Rivista> listaRiviste, boolean append) throws IOException {
		StringBuilder scriviNelFile = new StringBuilder("");
		for (int i = 0; i < listaRiviste.size(); i++) {
			scriviNelFile.append(listaRiviste.get(i).toString() + System.lineSeparator());
		}
		String str = scriviNelFile.toString();
		FileUtils.writeStringToFile(fileRiviste, str, ENCODING, true);
	}

	public static void leggiSuFile(File file) throws IOException {
		System.out.println(FileUtils.readFileToString(file, ENCODING));
	}

}
