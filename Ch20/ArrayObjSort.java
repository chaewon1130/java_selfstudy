package Ch20;

import java.util.Arrays;

public class ArrayObjSort {

	public static void main(String[] args) {
		Person[] ar = new Person[3];
		ar[0] = new Person("Leeds", 29);
		ar[1] = new Person("Goos", 15);
		ar[2] = new Person("Soo", 37);
		
		Arrays.sort(ar);
		for(Person p : ar) {
			System.out.println(p);
		}
	}
}