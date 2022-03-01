package Ch19;

public class Point {
	private int xPos;
	private int yPos;
	public Point(int x, int y) {
		xPos = x;
		yPos = y;
	}
	public boolean equals(Object obj) {
		Point p = (Point)obj;
		if((xPos == p.xPos) && (yPos == p.yPos)) {
			return true;
		}else {
			return false;
		}
	}
}
