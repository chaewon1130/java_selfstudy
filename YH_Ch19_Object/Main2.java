package YH_Ch19_Object;

public class Main2 {
	public static void main(String[] args) {
		PersonalInfo p1 = new PersonalInfo("김동호", 29, "카카오", "개발자");
		PersonalInfo p2 = null;
		try {
			p2 = (PersonalInfo)p1.clone();
			p1.showPersonalInfo();
			System.out.println("===================");
			p2.showPersonalInfo();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
