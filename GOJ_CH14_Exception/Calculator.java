package GOJ_CH14_Exception;

public class Calculator {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		try {
			calc.printDivide(1, 2);
			calc.printDivide(1, 0);
		}catch(ZeroException e) {
			e.getMessage();
		}
	}
	
	public void printDivide(double d1, double d2) throws ZeroException {
		if(d2 == 0) {
			throw new ZeroException();
		}
		double result = d1/d2;
		System.out.println(result);
	}

}

class ZeroException extends RuntimeException{
	public ZeroException() {
		System.out.println("Second Value can't be Zero");
	}
}