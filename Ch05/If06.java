package Ch05;

public class If06 {

	public static void main(String[] args) {
		int i = 1;
		while(i <= 100) {
			System.out.print(i + " ");
			i++;
		}
		do {
			i--;
			System.out.print(i + " ");
		}while(i > 1);
	}
}