package partTwo;

import java.util.ArrayList;
import java.util.Random;

public class ParteDue {

	static Random rand = new Random();

	public static void main(String[] args) {

		ordinaList(creaList(10));
		System.out.println(" ");
		booleanList(creaList(10), true);
		System.out.println(" ");
		booleanList(creaList(10), false);
	}

	public static ArrayList<Integer> creaList(int n) {
		ArrayList<Integer> arr = new ArrayList<Integer>(n);
		for (int i = 0; i < n; i++) {
			int randomNum = rand.nextInt(101);
			arr.add(randomNum);
		}
		System.out.println("Array base: ");
		System.out.println(arr);
		return arr;
	}

	public static ArrayList<Integer> ordinaList(ArrayList<Integer> arr) {
		ArrayList<Integer> arrDue = new ArrayList<Integer>((arr.size() * 2));
		for (int i = 0; i < arr.size(); i++) {
			arrDue.add(arr.get(i));
		}
		for (int i = arr.size() - 1; i >= 0; i--) {
			arrDue.add(arr.get(i));
		}
		System.out.println("Array giusto+inverso: ");
		System.out.println(arrDue);
		return arrDue;
	}

	public static ArrayList<Integer> booleanList(ArrayList<Integer> arr, boolean bool) {
		ArrayList<Integer> arrPari = new ArrayList<Integer>((arr.size() / 2));
		ArrayList<Integer> arrDispari = new ArrayList<Integer>((arr.size() / 2));
		for (int i = 0; i < arr.size(); i++) {
			int c = i + 1;
			if (c % 2 == 0) {
				arrPari.add(arr.get(i));
			} else {
				arrDispari.add(arr.get(i));
			}
		}
		if (bool == true) {
			System.out.println("Array posizioni pari: ");
			System.out.println(arrPari);
			return arrPari;
		} else {
			System.out.println("Array posizioni dispari: ");
			System.out.println(arrDispari);
			return arrDispari;
		}
	}

}
