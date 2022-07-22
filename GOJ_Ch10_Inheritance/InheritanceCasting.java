package GOJ_Ch10_Inheritance;

public class InheritanceCasting {
	public static void main(String[] args) {
		InheritanceCasting inheritance = new InheritanceCasting();
		inheritance.objectCast();
	}
	public void objectCast() {
		ParentCasting parent = new ParentCasting();
		ChildCasting child = new ChildCasting();
		
		ParentCasting parent2 = child;
		ChildCasting child2 = (ChildCasting)parent;
	}
	public void objectCast2() {
		ChildCasting child = new ChildCasting();
		ParentCasting parent2 = child;
		ChildCasting child2 = (ChildCasting)parent2;
	}
	
}
