package esercizio2;

public class MainPrj {

	public static void main(String[] args) {
		
		Rettangolo r1 = new Rettangolo(5,2);
		Rettangolo r2 = new Rettangolo(7.2,2.5);
		stampaRettangolo(r1);
		stampaRettangolo(r2);
		
		System.out.println(" ");
		
		stampaDueRettangoli(r1,r2);
		
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

	public static void stampaRettangolo(Rettangolo rettangolo) {
		double area = rettangolo.area();
		double perim = rettangolo.perimetro();
		System.out.println("Area: "+area);
		System.out.println("Perimetro: "+perim);
	}
	
	public static void stampaDueRettangoli(Rettangolo rettangolo, Rettangolo rettangolo2) {
		double area1=rettangolo.area();
		double perimetro1=rettangolo.perimetro();
		double area2=rettangolo2.area();
		double perimetro2=rettangolo2.perimetro();
		System.out.println("Area primo: "+area1);
		System.out.println("Perimetro primo: "+perimetro1);
		System.out.println("Area secondo: "+area2);
		System.out.println("Perimetro secondo: "+perimetro2);
		double area = area1+area2;
		System.out.println("Aree sommate: "+area);
		double perim = perimetro1+perimetro2;
		System.out.println("Perimetri sommati: "+perim);
	}

}
