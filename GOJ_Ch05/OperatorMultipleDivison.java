package GOJ_Ch05;

public class OperatorMultipleDivison {
	public static void main(String[] args) {
		OperatorMultipleDivison sample = new OperatorMultipleDivison();
		sample.multipleDivision();
		sample.divideInt();
	}
	public void multipleDivision() {
		int intValue1 = 5;
		int intValue2 = 10;
		int result = intValue1 * intValue2;
		System.out.println(result);
		result = intValue2 / intValue1;
		System.out.println(result);
	}
	public void divideInt() {
		int intValue1 = 5;
		int intValue2 = 10;
		int result = intValue1 / intValue2;
		System.out.println(result);
	}
}
