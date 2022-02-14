package Ch06;

public class Method01 {

	public static void main(String[] args) {
		int a=4;
		int b=3;
		plus(a,b);
		minus(a,b);
		multiply(a,b);
		divide(a,b);
	}
	static void plus(int a, int b) {
		System.out.println(a+b);
	}
	static void minus(int a, int b) {
		System.out.println(a-b);
	}
	static void multiply(int a, int b) {
		System.out.println(a*b);
	}
	static void divide(int a, int b) {
		System.out.println(a/b + " " + a%b);
	}
}