package lezz4;

public class Main {

	public static void main(String[] args) {
		stampaMessaggio(new IMessage() {
			
			@Override
			public String getMessage() {
				return "ClasseAnonima message!";
			}
		});
		//MioThread mt = new MioThread();
		//Thread t1 = new Thread(mt);
		
		//Thread t2 = new Thread();
		
		

	}

	
	public static void stampaMessaggio(IMessage m) {
		System.out.println(m.getMessage());
	}
}
