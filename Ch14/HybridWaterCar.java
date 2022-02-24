package Ch14;

public class HybridWaterCar extends HybridCar{
	int waterGauge;
	public void showCurrentGauge() {
		System.out.println("잔여 가솔린 : " + gasonlineGauge);
		System.out.println("잔여 전기량 : " + electricGauge);
		System.out.println("잔여 워터량 : " + waterGauge);
	}
	public HybridWaterCar() {
		this(300,200,100);
	}
	
	public HybridWaterCar(int gasonlineGauge, int electricGauge, int waterGauge) {
		super(gasonlineGauge, electricGauge);
		this.waterGauge = waterGauge;
	}
}
