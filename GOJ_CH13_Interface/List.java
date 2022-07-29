package GOJ_CH13_Interface;

public interface List {
	public void add();
	
	public void update(int index, Object value);
	
	public void remove(int index);
	
	public int indexOf(Object value);
}
