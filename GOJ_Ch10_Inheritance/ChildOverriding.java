package GOJ_Ch10_Inheritance;

public class ChildOverriding extends ParentOverriding{
	public ChildOverriding() {
		super();
		System.out.println("ChildOverriding 생성자");
	}
	
	public void printName() {
		System.out.println("ChildOverriding printName");
	}
}
