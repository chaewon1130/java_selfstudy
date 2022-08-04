package YH_Ch14_Inheritance;

class HybridCar extends Car{
	int electricGauge;
	
	public HybridCar(int electricGauge, int gasonlineGauge) {
		super(gasonlineGauge);
		this.electricGauge = electricGauge;
	}
}
