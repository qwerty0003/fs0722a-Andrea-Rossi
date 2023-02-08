package pt2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pt1.Ex1Main;

public class Ex2Main extends Thread{

	static Logger log = LoggerFactory.getLogger(Ex1Main.class);
	static int n0;
	static int n1;
	static int n2;

	public static void main(String[] args) throws InterruptedException {

		submit();

	}

	public static void submit() throws InterruptedException {
		
		
		Thr0 a = new Thr0(1000);
		Thr1 b = new Thr1(1000);
		Thr2 c = new Thr2(1000);
		a.start();
		a.join();

		b.start();
		b.join();

		c.start();
		c.join();

		log.info(n0+"+"+n1+"+"+n2+" = " + (n0 + n1 + n2));
		
	}
}