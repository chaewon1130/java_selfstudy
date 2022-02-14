package Ch06;

public class Method04 {

	public static void main(String[] args) {
		System.out.println(primeNumber(23));
	}
	
	static boolean primeNumber(int num) {
		boolean temp = false;
		for(int i=2; i<num; i++) {
			if(num%i == 0) {
				break;
			}if(num -1 == i) {
				System.out.println(num);
				temp = true;
				break;
			}
		}
		return temp;
	}
}