package Ch06;

public class Method02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abValue(2,3);
	}
	static void abValue(int a, int b) {
		if(a>b) {
			System.out.println(a-b);
		}else {
			System.out.println(b-a);
		}
	}

}
