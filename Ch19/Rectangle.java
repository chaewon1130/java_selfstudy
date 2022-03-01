package Ch19;

public class Rectangle {
	private Point upperLeft;
	private Point lowerRight;
	public Rectangle(int x1, int y1, int x2, int y2) {
		upperLeft = new Point(x1, y1);
		lowerRight = new Point(x2, y2);
	}
	
	@Override
	public boolean equals(Object obj) {
		Rectangle r = (Rectangle)obj;
		if((upperLeft.equals(r.upperLeft)) && (lowerRight.equals(r.lowerRight))) {
			return true;
		}else {
			return false;
		}
		
	}
}
