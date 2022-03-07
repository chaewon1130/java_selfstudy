package ch21;

public class DDBox<DBox1, DBox2> {
	private DBox1 box1;
	private DBox2 box2;
	
	public void set(DBox1 box1, DBox2 box2) {
		this.box1 = box1;
		this.box2 = box2;
	}
	
	public String toString() {
		return box1.toString() + "\n" + box2.toString();
	}
}
