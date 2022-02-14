package Ch05;

public class IF02 {

	public static void main(String[] args) {
		int num1 = 50;
		int num2 = 100;
		int big;
		int diff;
		if(num1 > num2) {
			big = num1;
		}else {
			big = num2;
		}
		System.out.println("Å« ¼ö : " + big);
		if(num1 > num2) {
			diff = num1 - num2;
		}else {
			diff = num2 - num1;
		}
		System.out.println("Àý´ñ°ª : " + diff);
	}
}