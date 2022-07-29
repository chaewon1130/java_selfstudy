package GOJ_CH13_Interface;

public abstract class AbstractList implements List{
	public void add() {
		int a = 10 + 3;
	};
	
	public void update(int index, Object value) {
		
	};
	
	public void remove(int index) {
		
	};
	
	public int indexOf(Object value) {
		return 0;
	};
	
	public abstract void clear();
}
