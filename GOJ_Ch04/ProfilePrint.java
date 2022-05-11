package GOJ_Ch04;

public class ProfilePrint {
	byte age;
	String name;
	boolean isMarried;
	public void setAge(byte age) {
		this.age = age;
	}
	public byte getAge() {
		return this.age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setMarried(boolean flag) {
		isMarried = flag;
	}
	public boolean isMarried() {
		return this.isMarried;
	}
	public static void main(String[] args) {
		ProfilePrint profile = new ProfilePrint();
		profile.setAge((byte) 20);
		profile.setName("김동호");
		profile.setMarried(false);
		System.out.println(profile.getAge());
		System.out.println(profile.getName());
		System.out.println(profile.isMarried());
	}
}