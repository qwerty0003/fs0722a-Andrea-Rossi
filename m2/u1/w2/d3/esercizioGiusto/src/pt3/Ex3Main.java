package pt3;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;

public class Ex3Main {

	static Scanner sc = new Scanner(System.in);
	static File file = new File("dirFile/test.txt");
	static ArrayList<String> arr = new ArrayList<String>();
	static ArrayList<String> arrWrite = new ArrayList<String>();
	static String[] arrRecuperato = new String[100];
	static HashMap<String, String> map = new HashMap<String, String>();

	public static void main(String[] args) throws Exception {

		System.out.println("PULISCO LISTE E FILE");
		cancellaFile();
		pulisciList();

		System.out.println("CREO LISTA");
		createList();

		System.out.println("LOG ARRAY CREATO E ARRAY CREATO DA SCRIVERE NEL FILE");
		System.out.println(arr);
		System.out.println(arrWrite);

		System.out.println("SCRIVO LISTA NEL FILE");
		scriviFile();

		System.out.println("LEGGO FILE");
		String fileText = leggiFile();
		System.out.println(fileText);
		System.out.println("RECUPERO DA FILE");
		recuperaDaFile();
		System.out.println("LOG ELEMENTI RECUPERATI DA FILE");
		System.out.println(map);

	}

	public static void scriviFile() throws IOException {

		for (int i = 0; i < arrWrite.size(); i++) {
			String str = arrWrite.get(i);
			FileUtils.writeStringToFile(file, str, "utf-8", true);
		}

	}

	public static void recuperaDaFile() throws IOException {
		String text = FileUtils.readFileToString(file, "UTF-8");
		String[] lilMap = new String[1];
		for (int i = 0; i < 100; i++) {
			if (text.contains("#"))
				arrRecuperato = text.split("#");
		}
		for (int i = 0; i <= arrRecuperato.length - 1; i++) {
			lilMap = arrRecuperato[i].split("@");
			if (!map.containsKey(lilMap[0]))
				map.put(lilMap[0], lilMap[1]);
		}
	}

	public static String leggiFile() throws IOException {
		String textFile = FileUtils.readFileToString(file, "UTF-8");
		return textFile;
	}

	public static void cancellaFile() throws IOException {
		FileUtils.delete(file);
		System.out.println("File cancellato correttamente!");
	}

	public static void createList() {
		try {
			System.out.println("Quanti dipendenti vuoi creare?");
			int n = Integer.parseInt(sc.nextLine());
			for (int i = 0; i < n; i++) {
				System.out.println("Nome: ");
				String nome = sc.nextLine();
				System.out.println("Cognome: ");
				String cognome = sc.nextLine();
				System.out.println("Presenza settimanali (da 0 a 7): ");
				int x = Integer.parseInt(sc.nextLine());
				if (x >= 0 && x <= 7) {
					arr.add(nome + " " + cognome + " " + x);
					arrWrite.add(nome + " " + cognome + "@" + x + "#");
				} else
					throw new Exception();
			}
		} catch (NumberFormatException ex) {
			System.out.println("Inserisci un NUMERO perfavore, riprova!");
			createList();
		} catch (Exception ex) {
			System.out.println("Un numero tra 0 e 7, riprova!");
		}
	}

	public static void pulisciList() {
		arr.clear();
		arrWrite.clear();
	}

}
