package GOJ_Ch02;

public class Profile {
	String name;
	int age;
	public static void main(String[] args) {
		System.out.println("My name is 김동호");
		System.out.println("My age is 29");
		Profile profile = new Profile();
		profile.setName("Min");
		profile.setAge(20);
		System.out.print("My name is ");
		profile.printName();
		System.out.print("My age is ");
		profile.printAge();
	}
	public void setName(String str) {
		name = str;
	}
	public void setAge(int val) {
		age = val;
	}
	public void printName() {
		System.out.println(name);
	}
	public void printAge() {
		System.out.println(age);
	}
}
