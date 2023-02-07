package PartThree;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Scanner;

public class ParteTre {
	static HashMap<String, Integer> contatti = new HashMap<String, Integer>();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		insert("Andrea", 348);
		insert("Jesus", 540);
		insert("Ginetto", 666);
		insert("Geppetto", 766);
		insert("Ginuzzo", 866);
		insert("Mike", 696);
		stampa();
		delete("Jesus");
		insertConsole();
		insertConsole();
		stampa();
		searchByName("Andre");
		searchByName("Andrea");
		searchByName("Ginetto");
		searchByNum(contatti, 348);
		searchByNum(contatti, 866);
		searchByNum(contatti, 34);
		stampa();
	}

	public static void insert(String nome, int numero) {
		contatti.put(nome, numero);
	}

	public static void insertConsole() {
		System.out.println("Inserisci il nome del contatto: ");
		String nome = sc.nextLine();
		System.out.println("Inserisci il numero di telefono: ");
		Integer numero = Integer.parseInt(sc.nextLine());
		contatti.put(nome, numero);
	}

	public static void delete(String nome) {
		contatti.remove(nome);
	}

	public static <T, E> T searchByNum(HashMap<T, E> map, E value) {
		for (Entry<T, E> entry : map.entrySet()) {
			if (Objects.equals(value, entry.getValue())) {
				System.out.println("Il numero " + value + " corrisponde al contatto: " + entry.getKey());
				return entry.getKey();
			}
		}
		System.out.println("Il numero " + value + " non e' presente in rubrica");
		return null;
	}

	public static void searchByName(String name) {
		try {
			int x = contatti.get(name);
			System.out.println("Il contatto " + name + " corrisponde al numero " + x);
		} catch (NullPointerException ex) {
			System.out.println("il contatto non e' presente in rubrica");
		}
	}

	public static void stampa() {
		System.out.println(contatti);
	}
}
