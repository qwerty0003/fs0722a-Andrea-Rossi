package prova;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class DbConnection {

	String url = "jdbc:postgresql://localhost:5432/";
	String dbName = "javadb";
	String user = "postgres";
	String pass = "root";
	Connection conn;
	Statement st;
	
	public DbConnection() throws SQLException {
		this.conn = DriverManager.getConnection(url+dbName,user,pass);
		
		this.st = conn.createStatement();
	}
	
	public void creaTabUtenti() throws SQLException {
		String sql = "CREATE TABLE IF NOT EXISTS Utenti("
				+ "	id_utente SERIAL PRIMARY KEY,"
				+ "	nome VARCHAR NOT NULL,"
				+ "	cognome VARCHAR NOT NULL,"
				+ "	data_nascita DATE NOT NULL,"
				+ "	anni INT4 NOT NULL,"
				+ "	email VARCHAR NOT NULL UNIQUE"
				+ ");";
		
		st.executeUpdate(sql);
		
		System.out.println("Tabella Utenti creata");

	}
	
	public void salvaUtente(Utente u) throws SQLException {
		String sql = "INSERT INTO Utenti "
				+ "(nome, cognome, data_nascita, anni, email)"
				+ " VALUES ('"+u.nome+"','"+u.cognome+"','"+u.data_nascita+"',"
				+u.anni+",'"+u.email+"');";
		st.executeUpdate(sql);
		System.out.println(u+" salvato correttamente!");
	}
	
	public void modificaUtente(Utente u) throws SQLException {
		String sql = "UPDATE Utenti SET nome = '"+u.nome+"',"
				+ " cognome = '"+u.cognome+"', data_nascita = '"+u.data_nascita+"'"
				+ ", anni = "+u.anni+", email = '"+u.email+"' "
						+ "WHERE id_utente = "+u.id_utente+";";
		st.executeUpdate(sql);
	}
	
	public ArrayList<Utente> leggiUtenti() throws SQLException {
		ArrayList<Utente> list = new ArrayList<Utente>();
		String sql ="SELECT * FROM Utenti;";
		ResultSet rs = this.st.executeQuery(sql);
		while(rs.next()) {
			int id = rs.getInt("id_utente");
			String nome = rs.getString("nome");
			String cognome = rs.getString("cognome");
			String data = rs.getString("data_nascita");
			int anni = rs.getInt("anni");
			String email = rs.getString("email");
			
			Utente u = new Utente(id, nome, cognome,data, anni, email);
			
			list.add(u);
		}
		System.out.println("utente letto nel db! " + list.size() + "!!");
		return list;
	}
	
	public void eliminaUtente(Utente u ) throws SQLException {
		String sql = "DELETE FROM Utenti WHERE id_utente = " +u.id_utente;
		st.executeUpdate(sql);
		System.out.println(u+" eliminato correttamente!");
	}
	
	public Utente getById(int idUtn) throws SQLException {
		String sql = "SELECT * FROM Utenti WHERE id_utente = "+idUtn;
		ResultSet rs = st.executeQuery(sql);
		if(rs.next()) {
			int id = rs.getInt("id_utente");
			String nome = rs.getString("nome");
			String cognome = rs.getString("cognome");
			String data = rs.getString("data_nascita");
			int anni = rs.getInt("anni");
			String email = rs.getString("email");
			return new Utente(id, nome, cognome,data, anni, email);
		}
		return null;
	}
	
}
