package YH_Ch21_Generics;

public class DDBox<L,R> {
	private L left;
	private R right;
	
	public void set(L o, R r) {
		left = o;
		right = r;
	}
	
	public String toString() {
		return left + " &&& " + right;
	}
}
