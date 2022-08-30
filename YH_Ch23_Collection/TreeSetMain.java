package YH_Ch23_Collection;

import java.util.TreeSet;

public class TreeSetMain {

	public static void main(String[] args) {
//		TreeSet<Integer> tr = new TreeSet<>();
		TreeSet<Integer> tr = new TreeSet<>(new ComparatorInteger());
		tr.add(30);
		tr.add(10);
		tr.add(20);
		System.out.println(tr);
	}

}
