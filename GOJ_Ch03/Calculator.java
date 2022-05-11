package GOJ_Ch03;

public class Calculator {
	int add(int num1, int num2) {
		return num1 + num2;
	}
	int subtract(int num1, int num2) {
		return num1 - num2;
	}
	int multiply(int num1, int num2) {
		return num1 * num2;
	}
	int divide(int num1, int num2){
		return num1 / num2;
	}
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		int a = 10;
		int b = 5;
		calc.add(a, b);
		calc.subtract(a, b);
		calc.multiply(a, b);
		calc.divide(a, b);
	}
}