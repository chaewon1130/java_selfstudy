package Ch06;

public class Method03 {

	public static void main(String[] args) {
		System.out.println(area(2.3));
		System.out.println(round(3.2));
	}
	static double area(double r) {
		return 3.14*r*r;
	}
	static double round(double r) {
		return 2*3.14*r;
	}
}