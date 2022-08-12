package YH_Ch19_Object;

public class Point {
	private int xPos;
	private int yPos;
	
	public Point(int x, int y) {
		xPos = x;
		yPos = y;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this.xPos == ((Point)obj).xPos && this.yPos == ((Point)obj).yPos) {
			return true;
		}else {
			return false;
		}
	}
}
