package Ch14;

public class HybridCar extends Car{
	int electricGauge;
	
	public HybridCar(int gasonlineGauge, int electricGauge){
		super(gasonlineGauge);
		this.electricGauge = electricGauge;
	}
}
