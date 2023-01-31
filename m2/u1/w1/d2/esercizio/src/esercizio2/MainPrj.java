package esercizio2;

public class MainPrj {

	public static void main(String[] args) {
		
		Rettangolo r1 = new Rettangolo(5,2);
		Rettangolo r2 = new Rettangolo(7.2,2.5);
		Rettangolo.stampaRettangolo(r1);
		Rettangolo.stampaRettangolo(r2);
		
		System.out.println(" ");
		
		Rettangolo.stampaDueRettangoli(r1,r2);
		
		System.out.println(" ");System.out.println(" ");
		
		System.out.println(" OPERATORE TELEFONICO ");
		
		Operatore me = new Operatore(346666666);
		me.ricarica(25);
		me.chiama(389000000, 5);
		me.chiama(389000002, 10);
		me.chiama(389000300, 15);
		me.chiama(389060000, 2);
		me.call404();
		System.out.println(" ");
		me.info();
		
		System.out.println(" ");		
	}

}
