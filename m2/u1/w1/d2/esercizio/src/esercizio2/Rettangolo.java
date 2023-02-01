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
	
}
