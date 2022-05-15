package GOJ_Ch06;

public class InterestManager {
	public static void main(String[] args) {
		InterestManager im = new InterestManager();
		long money = 1000000;
		for(int i=1; i<=365; i++) {
//			System.out.println(i + " : " + im.getInterestRate(i));
			
			money += im.calculateAmount(i, money);
			if(i % 10 != 0) {
				continue;
			}
			System.out.println(i);
			System.out.println("합계" + money);
			System.out.println("==========================");
		}
	}
	public double getInterestRate(int day) {
		double profit = 0.0;
		if(day <= 90) {
			profit = 0.005;
		}else if(day <= 180) {
			profit = 0.01;
		}else if(day <= 364) {
			profit = 0.02;
		}else {
			profit = 0.056;
		}
		return profit;
	}
	public double calculateAmount(int day, long amount) {
		double profit = getInterestRate(day);
		double price = amount * profit;
		return price;
	}
}
