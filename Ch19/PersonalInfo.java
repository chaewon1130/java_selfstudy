package Ch19;

public class PersonalInfo implements Cloneable{
	private String name;
	private int age;
	private Business bz;
	public PersonalInfo(String name, int age, String company, String work) {
		this.name = name;
		this.age = age;
		bz = new Business(company, work);
	}
	
	public void showPersonalInfo() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		bz.showBusinessInfo();
	}
	
	public PersonalInfo clone() throws CloneNotSupportedException{
		PersonalInfo cpy;
		cpy = (PersonalInfo) super.clone();
		cpy.bz = bz.clone();
		return cpy;
	}
}
