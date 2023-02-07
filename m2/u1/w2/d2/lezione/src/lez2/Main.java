package lez2;

import java.util.ArrayList;
import java.util.Collection;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

	public static void main(String[] args) {
		
		Logger log = LoggerFactory.getLogger(Main.class);
		
		Collection<String> e = new ArrayList<String>();
		Collection<Integer> d = new ArrayList<Integer>();
		//non memorizza l'ordine
		//non definisce se ci sono valori duplicati
		//non può contenere valori primitivi (int,boolean)
		
		
		User a = new User("Andrea","Rossi","Amantea",27);
		User b = new User("Ginetto","Ginettis","Praja",50);
		User c = new User("Jesus","from Nazaret","Betlemme",2023);
		
		GestioneUser list = new GestioneUser();
		list.addToList(a);
		list.addToList(b);
		list.print();
		list.addToList(c);
		list.removeFromList(a);
		list.print();
		log.info("ciaoooooooooooooooooooooo");

	}

}
