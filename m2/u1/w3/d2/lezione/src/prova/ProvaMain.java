package prova;

import java.sql.SQLException;
import java.util.ArrayList;


public class ProvaMain {
	
	static ArrayList<Utente> list = new ArrayList<Utente>();

	@SuppressWarnings("unused")
	public static void main(String[] args) throws SQLException {
		
		DbConnection db = new DbConnection();
		
		//QUESTI UTENTI SONO GIA' SALVATI
		// CREO TABELLA IN DB E CI SALVO DUE USER
		
		db.creaTabUtenti();
		
		
		Utente guy = new Utente("Gino","Paoli","1940-12-12",93,"gino.paoli@mongodb.com");
		Utente guyz = new Utente("Marko","Karta","1980-04-20",43,"markkolino@lmao.com");
		
		
		//db.salvaUtente(guyz); 
		//db.salvaUtente(guy); 
		
		
		
		
		
		//db.modificaUtente(utn);
	
		//db.modificaUtente(utn1);
		
		//db.eliminaUtente(utn1);
		
		//Utente gui = db.getById(2);
		//System.out.println(gui);
		//db.eliminaUtente(gui);
		
		Utente dummy = new Utente("Dummy","Bot","1999-12-31",24,"dummy@dontshoot.com");
		//db.salvaUtente(dummy);

		
		list = db.leggiUtenti();
		for(Utente ut : list) {
			System.out.println(ut);
		}
		
		
	}

}
