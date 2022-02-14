package Ch05;

public class If13 {

	public static void main(String[] args) {
		for(int a=0; a<10; a++) {
			for(int b = 0; b<10; b++) {
				if(11*(a+b) == 99) {
					System.out.println("a : "+a);
					System.out.println("b : "+b);
				}
			}
		}
	}
}