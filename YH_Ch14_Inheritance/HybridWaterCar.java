package YH_Ch14_Inheritance;

class HybridWaterCar extends HybridCar{
	int waterGauge;
	public void showCurrentGauge() {
		System.out.println("가솔린 : " + gasonlineGauge);
		System.out.println("전기량 : " + electricGauge);
		System.out.println("워터량 : " + waterGauge);
	}
	public HybridWaterCar(int waterGauge, int electricGauge, int gasonlineGauge) {
		super(electricGauge, gasonlineGauge);
		this.waterGauge = waterGauge;
	}
}
