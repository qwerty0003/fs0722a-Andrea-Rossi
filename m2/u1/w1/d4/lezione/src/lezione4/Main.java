package lezione4;

public class Main {

	public static void main(String[] args) {

		Veicolo a = new Automobile("600", "Fiat", 3);
		Veicolo b = new Moto("R1", "Yamaha", 1, 5000);
		Veicolo c = new Automobile("Fiesta", "Ford", 5);
		Veicolo d = new Moto("Hornet", "Honda", 2, 3000);
		Veicolo e = new Automobile("Golf 8", "Volkswagen", 3);

		Veicolo[] autostrada = new Veicolo[10];
		autostrada[0] = a;
		autostrada[1] = b;
		autostrada[2] = c;
		autostrada[3] = d;
		autostrada[4] = e;

		// ciclo for per stampare dati

		for (int i = 0; i < autostrada.length; i++) {
			if (autostrada[i] != null) {
				if (autostrada[i] instanceof Moto) {
					System.out.println("Moto -> " + autostrada[i]);
				} else {
					System.out.println("Automobile -> " + autostrada[i]);
				}
				System.out.println(autostrada[i].acc());
			}
		}
		// fine ciclo for

	}

}
