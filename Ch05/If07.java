package Ch05;

public class If07 {
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		while(i <= 1000) {
			if((i%2 == 0) && (i%7 == 0)) {
				System.out.println(i);
				sum += i;
			}
			i++;
		}
		System.out.println(sum);
	}
}
