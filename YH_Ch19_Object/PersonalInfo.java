package YH_Ch19_Object;

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
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		bz.showBusinessInfo();
	}
	
    public PersonalInfo clone() throws CloneNotSupportedException {
        PersonalInfo cpy = (PersonalInfo)super.clone();
        cpy.bz = bz.clone();
        return cpy;
    }
}
