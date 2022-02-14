package Ch07;

public class Triangle {
	double height;
	double base;
	Triangle(double height, double base){
		this.height = height;
		this.base = base;
	}
	public void getHeight(double height) {
		this.height = height;
	}
	public void getBase(double base) {
		this.base = base;
	}
	
	public double area() {
		return height*base/2;
	}
}
