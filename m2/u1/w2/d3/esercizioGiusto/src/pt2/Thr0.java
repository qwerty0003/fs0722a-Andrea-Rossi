package pt2;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pt1.Ex1Main;

public class Thr0 extends Thread {
	int[] arr;
	int sum = 0;
	static Random rand = new Random();
	static Logger log = LoggerFactory.getLogger(Ex1Main.class);
	
	public Thr0(int x) {
		this.arr=new int[x];
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		insert();
		sum();
		Ex2Main.n0=sum;
	}
	
	public int sum() {
		for(int i = 0;i<=this.arr.length-1;i++) {
			sum+=this.arr[i];
		}
		log.info("Somma Thread 0: "+sum);
		return sum;
	}
	
	public void insert() {
		for(int i =0;i<=this.arr.length-1;i++) {
			int rndm = rand.nextInt(51);
			this.arr[i]=rndm;
		}
	}
}
