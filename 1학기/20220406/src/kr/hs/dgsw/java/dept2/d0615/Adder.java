package kr.hs.dgsw.java.dept2.d0615;

import java.util.Date;

public class Adder<T extends Number> {
	
	private T value1;
	private T value2;
	
	public Adder(T value1, T value2) {
		this.value1 = value1;
		this.value2 = value2;
	}
	
	public T add() {
		return null;
//		return this.value1 + this.value2;
	}
	
	public static void main(String[] args) {
		Adder<Integer> adder = new Adder<Integer>(5, 8);
//		Adder<String> adder = new Adder<String>("red", "green ");
	}

}
