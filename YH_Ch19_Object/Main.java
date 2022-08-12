package YH_Ch19_Object;

public class Main {
	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle(1, 1, 2, 2);
		Rectangle rec2 = new Rectangle(1, 1, 2, 2);
		Point p1 = new Point(3,4);
		Point p2 = new Point(3,4);
		if(rec1 == rec2) {
			System.out.println("참조 객체가 같습니다.");
		}else {
			System.out.println("참조 객체가 다릅니다.");
		}
		if(rec1.equals(rec2)) {
			System.out.println("값이 같습니다");
		}else {
			System.out.println("값이 다릅니다");
		}
		if(p1 == p2) {
			System.out.println("참조 객체가 같습니다.");
		}else {
			System.out.println("참조 객체가 다릅니다.");
		}
		if(p1.equals(p2)) {
			System.out.println("값이 같습니다");
		}else {
			System.out.println("값이 다릅니다");
		}
	}
}
