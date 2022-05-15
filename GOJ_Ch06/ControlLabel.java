package GOJ_Ch06;

public class ControlLabel {
	public static void main(String[] args) {
		ControlLabel control = new ControlLabel();
		control.printTimesTable();
	}
	public void printTimesTable() {
		startLabel:
		for(int i=1; i<=9; i++) {
			if(i == 4) {
				continue;
			}
			for(int j=1; j<=9; j++) {
				if(j == 4) {
					continue startLabel;
				}
				System.out.println(i + " * " + j + " = " + i*j);
			}
			System.out.println();
		}
	}
}
