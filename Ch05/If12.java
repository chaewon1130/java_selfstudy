package Ch05;

public class If12 {
	public static void main(String[] args) {
		for(int i=1; i<9; i++) {
			if(i%2==0) {
				for(int j=1; j<=9; j++) {
					if(i==j) {
						System.out.println(i + " * " + j + " = " + i*j);
						break;
					}
					System.out.println(i + " * " + j + " = " + i*j);
				}
			}
		}
	}
}
