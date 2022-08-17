package YH_Ch21_Generics;

public class DBox<L, R> {
	private L left;
	private R right;
	
	public void set(L o, R r) {
		left = o;
		right = r;
	}
	public String toString() {
		return left + " & " + right;
	}
}
