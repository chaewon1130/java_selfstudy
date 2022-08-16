package YH_Ch20_Math_Array;

import java.util.Arrays;

public class ArrayObjSort {
	public static void main(String[] args) {
		Person[] ar = new Person[3];
		ar[0] = new Person("Lee12", 29);
		ar[1] = new Person("Goo1", 15);
		ar[2] = new Person("Soo", 37);
		
		Arrays.sort(ar);
		for(Person p : ar) {
			System.out.println(p);
		}
	}
}
