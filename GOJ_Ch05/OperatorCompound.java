package GOJ_Ch05;

public class OperatorCompound {
	public static void compound() {
		int intValue = 10;
		intValue += 5;
		System.out.println(intValue);
		intValue -= 5;
		System.out.println(intValue);
		intValue *= 5;
		System.out.println(intValue);
		intValue /= 5;
		System.out.println(intValue);
		intValue %= 5;
		System.out.println(intValue);
	}
	public static void main(String[] args) {
		compound();
	}
}
