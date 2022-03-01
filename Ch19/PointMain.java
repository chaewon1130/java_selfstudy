package Ch19;

public class PointMain {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(1,2,3,4);
		Rectangle r2 = new Rectangle(1,2,3,4);
		Point p1 = new Point(1,2);
		Point p2 = new Point(1,2);
		
		System.out.println(p1.equals(p2));
		System.out.println(r1.equals(r2));
	}
}