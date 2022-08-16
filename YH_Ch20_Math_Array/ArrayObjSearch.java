package YH_Ch20_Math_Array;

import java.util.Arrays;

public class ArrayObjSearch {
	public static void main(String[] args) {
		Person[] ar = new Person[3];
		ar[0] = new Person("Lee12", 29);
		ar[1] = new Person("Goo1", 15);
		ar[2] = new Person("Soo", 37);
		
		Arrays.sort(ar);
//		for(Person p : ar) {
//			System.out.println(p);
//		}
		int idx = Arrays.binarySearch(ar, new Person("Goo1", 37));
		System.out.println(idx);
	}
}
