package pt2;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pt1.Ex1Main;

public class Thr2 extends Thread{
	int[] arr;
	int sum = 0;
	static Random rand = new Random();
	static Logger log = LoggerFactory.getLogger(Ex1Main.class);
	
	public Thr2(int x) {
		this.arr=new int[x];
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(750);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		insert();
		sum();
		Ex2Main.n2=sum;
		try {
			Thread.sleep(1200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public int sum() {
		for(int i = 0;i<=this.arr.length-1;i++) {
			sum+=this.arr[i];
		}
		log.info("Somma Thread 2: "+sum);
		return sum;
	}
	
	public void insert() {
		for(int i =0;i<=this.arr.length-1;i++) {
			int rndm = rand.nextInt(51);
			this.arr[i]=rndm;
		}
	}
}
