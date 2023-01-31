package esercizio2;

public class Rettangolo {
	double base;
	double altezza;

	public Rettangolo(double d, double e) {
		// TODO Auto-generated constructor stub
		this.base = d;
		this.altezza = e;
	}

	
	public double perimetro() {
		double perim = this.base*2+this.altezza*2;
		
		return perim;
	}
	
	public double area() {
		double area = this.base*this.altezza;
		
		return area;
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
