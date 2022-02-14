package Ch09;

public class Circle {
	int rad;
	Point center;
	
	public Circle(int x, int y, int r) {
		center = new Point(x, y);
		rad = r;
	}
	
	public void showCircleInfo() {
		System.out.println("radius : " + rad);
		center.showPointInfo();
	}
	
}
