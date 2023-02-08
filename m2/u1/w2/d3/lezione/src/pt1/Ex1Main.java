package pt1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Ex1Main {

	static Logger log = LoggerFactory.getLogger(Ex1Main.class);
	
	
	public static synchronized void main(String[] args) {
		
		Asterisco a = new Asterisco();
		Cancelletto b = new Cancelletto();
		a.start();
		b.start();
	}

}
