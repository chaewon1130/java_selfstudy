package YH_Ch20_Math_Array;

public class Person implements Comparable{

	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Object o) {
		Person p = (Person)o;
//		return this.age - p.age;
//		return p.age - this.age;
//		return this.name.length() - p.name.length();
		return this.name.compareTo(p.name);
	}
	
	@Override
	public String toString() {
		return name + " : " + age;
	}
}
