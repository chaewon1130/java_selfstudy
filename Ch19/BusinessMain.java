package Ch19;

public class BusinessMain implements Cloneable{

	public static void main(String[] args) {
		PersonalInfo p1 = new PersonalInfo("�赿ȣ", 29, "īī��", "������");
		PersonalInfo cpy;
		try {
			cpy = p1.clone();
			cpy.showPersonalInfo();
			p1.showPersonalInfo();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}