package Ch05;

public class If11 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		while(sum < 1000) {
			sum += i;
			i = i+2;
		}
		System.out.println(sum);
		System.out.println(i);
	}
}