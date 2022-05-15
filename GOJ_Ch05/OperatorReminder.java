package GOJ_Ch05;

public class OperatorReminder {
	public static void main(String[] args) {
		OperatorReminder sample = new OperatorReminder();
		sample.remainder();
	}
	public void remainder() {
		int intValue1 = 53;
		int intValue2 = 10;
		int result = intValue1 % intValue2;
		System.out.println(result);
	}
}
