package Ch20;

import java.util.Arrays;

public class ArrayObjSearch {

	public static void main(String[] args) {
		Person[] ar = new Person[3];
		ar[0] = new Person("Lee", 29);
		ar[1] = new Person("Goo", 15);
		ar[2] = new Person("Soo", 37);
		Arrays.sort(ar);
		int idx = Arrays.binarySearch(ar, new Person("Lee", 37));
		System.out.println(ar[idx]);
	}
}