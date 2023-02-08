package pt1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Cancelletto extends Thread {
	String str = "#";
	static Logger log = LoggerFactory.getLogger(Ex1Main.class);

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			log.info(str);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
