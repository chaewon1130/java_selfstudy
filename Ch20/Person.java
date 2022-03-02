package Ch20;

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
//		if(this.age > p.age) {
//			return 1;
//		}else if(this.age < p.age) {
//			return -1;
//		}else {
//			return 0;
//		}
//		if(this.name.length() > p.name.length()) {
//			return 1;
//		}else if(this.name.length() < p.name.length()) {
//			return -1;
//		}else {
//			return 0;
//		}
		if(this.name.equals(p.name)) {
			return 0;
		}else {
			return 1;
		}
	}
	
	@Override
	public String toString() {
		return name + ": " + age;
	}
}
