package GOJ_Ch01;

public class Calculator {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println(calc.subtract(4, 2));
		System.out.println(calc.multiply(4, 2));
		System.out.println(calc.divide(4, 2));
	}
	public int subtract(int num1, int num2) {
		return num1-num2;
	}
	public int multiply(int num1, int num2) {
		return num1 * num2;
	}
	public int divide(int num1, int num2) {
		return num1 / num2;
	}
}