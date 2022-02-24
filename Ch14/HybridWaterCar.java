package Ch14;

public class HybridWaterCar extends HybridCar{
	int waterGauge;
	public void showCurrentGauge() {
		System.out.println("�ܿ� ���ָ� : " + gasonlineGauge);
		System.out.println("�ܿ� ���ⷮ : " + electricGauge);
		System.out.println("�ܿ� ���ͷ� : " + waterGauge);
	}
	public HybridWaterCar() {
		this(300,200,100);
	}
	
	public HybridWaterCar(int gasonlineGauge, int electricGauge, int waterGauge) {
		super(gasonlineGauge, electricGauge);
		this.waterGauge = waterGauge;
	}
}
