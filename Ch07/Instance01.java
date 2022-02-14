package Ch07;

public class Instance01 {

	public static void main(String[] args) {
		Triangle t1 = new Triangle(2.2,3.3);
		System.out.println(t1.area());
		
		t1.getHeight(7.2);
		t1.getBase(3.8);
		System.out.println(t1.area());
	}
}