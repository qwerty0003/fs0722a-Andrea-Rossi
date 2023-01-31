package esercizio2;


public class Ecommerce {
	
	public class Articolo{
		int codiceArticolo;
		String descrArticolo;
		double prezzo;
		int disponibili;
		
		public Articolo(int cod, String descr, double x) {
			this.codiceArticolo = cod;
			this.descrArticolo = descr;
			this.prezzo = x;
			this.disponibili = 10;
		}
	}
	
	public class Cliente{
		int codCliente;
		String nomeCognome;
		String email;
		int annoIscrizione;
		
		public Cliente(int cod,String str1,String str2) {
			this.codCliente = cod;
			this.nomeCognome = str1;
			this.email = str2;
			this.annoIscrizione = 2023;
		}
	}
	
	public class Carrello{
		int codCliente;
		String articoli[];
		double totale;
		
		public Carrello(int cod) {
			this.codCliente=cod;
			this.articoli = new String[10];
			this.totale=0;
		}
	}
	
}
