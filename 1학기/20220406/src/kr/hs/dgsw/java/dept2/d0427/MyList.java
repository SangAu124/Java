package kr.hs.dgsw.java.dept2.d0427;

import java.util.ArrayList;
import java.util.List;

public class MyList extends ArrayList<String> {
	
	public static void main(String[] args) {
		List<String> list = new MyList();
		
		list.add("Red");
		list.add("Blue");
		list.add("Black");
		list.add("Pink");
		list.add("Yellow");
		list.add("Green");
		list.add("Gray");
		
		for(String color: list) {
			System.out.println(color);
		}
		
	}
	
}
