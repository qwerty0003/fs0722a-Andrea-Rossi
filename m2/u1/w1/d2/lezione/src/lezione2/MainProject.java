package lezione2;

public class MainProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Main");
		
		/*Veicolo v = new Veicolo();
		v.marca = "Fiat";
		v.colore = "Nero";
		v.modello = "500L";
		v.targa = "FG666DD";
		v.cilindrata = 350;*/
		Veicolo v = new Veicolo("500XL","Fiat","Nero",2200);
		
		System.out.println(v.info());
		
		Automobile a1 = new Automobile("500", "Abarth","AB 666 FF");
		Automobile a2 = new Automobile("500", "Abarth","AB 666 FF");
		Automobile a3 = a2;
		System.out.println(a1.info());
		System.out.println(a2.info());
		System.out.println(a1 == a2);
		System.out.println(a1.equals(a2));
		System.out.println(a3 == a2);
		System.out.println(a3.equals(a2));
	}

}
