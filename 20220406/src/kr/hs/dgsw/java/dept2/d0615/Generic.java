package kr.hs.dgsw.java.dept2.d0615;

public class Generic<T, MyType > {
	
	private T value;
	
	private MyType type;
	
	public T getValue() {
		return value;
	}
	public MyType getType() {
		return type;
	}
	
	public void setValue(T value) {
		this.value = value;
	}
	public void setType(MyType type) {
		this.type = type;
	}
	
	public static void main(String[] args) {
		Generic<String, Integer> generic = new Generic<String, Integer>();
		generic.setValue("Hello");
		
		String name = generic.getValue();
		
		Generic<Integer, Integer> generic1 = new Generic<Integer, Integer>();
		generic1.setValue(4);
		int value = generic1.getValue();
		
	}

}
