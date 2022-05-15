package GOJ_Ch05;

public class SalaryManager {
	public static void main(String[] args) {
		SalaryManager people = new SalaryManager();
		people.getMonthlySalary(20000000);
	}
	public double getMonthlySalary(int yearlySalary) {
		double monthsal = yearlySalary / 12.0;
		double tax = calculateTax(monthsal);
		double nptax = calculateNationalPension(monthsal);
		double hitax = calculateHealthInsurance(monthsal);
		double sumTax = tax + nptax + hitax;
		monthsal -= sumTax;
		System.out.println(monthsal);
		return monthsal;
	}
	public double calculateTax(double monthSalary) {
		double tax = monthSalary * 0.125;
		System.out.println("근로소득세 : " + tax);
		return tax;
	}
	public double calculateNationalPension(double monthSalary) {
		double tax = monthSalary * 0.081;
		System.out.println("국민연금 : " + tax);
		return tax;
	}
	public double calculateHealthInsurance(double monthSalary) {
		double tax = monthSalary * 0.135;
		System.out.println("건강보험료 : " + tax);
		return tax;
	}
}
