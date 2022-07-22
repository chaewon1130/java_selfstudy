package GOJ_Ch10_Inheritance;

public class ParentArg {
	public ParentArg(String name) {
		System.out.println("ParentArg Constructor" + name);
	}
	
	public ParentArg(InheritancePrint obj) {
		System.out.println("ParentArg" + obj);
	}
	
	public void printName() {
		System.out.println("Parent printName()");
	}
	
}
