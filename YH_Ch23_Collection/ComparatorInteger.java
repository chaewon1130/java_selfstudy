package YH_Ch23_Collection;

import java.util.Comparator;

public class ComparatorInteger implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		return o2 - o1;
	}
	
}
