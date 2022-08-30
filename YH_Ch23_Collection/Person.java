package YH_Ch23_Collection;

import java.util.Objects;

public class Person {
	private String name;
	private int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return name + "(" + age + "세)";
	}
//	@Override
//	public int hashCode() {
//		return (name.hashCode() + age)/2;
//	}
	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}
	@Override
	public boolean equals(Object obj) {
		String objName = ((Person)obj).name;
		int objAge = ((Person)obj).age;
		
		if(name.equals(objName) && age == objAge) {
			return true;
		}else {
			return false;
		}
	}
}
