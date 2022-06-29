package kr.hs.dgsw.java.dept2.d0615;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class CollectionStudy {

	public void studyMap() {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("대한민국독립", 1945);
		map.put("임진왜란", 1592);
		map.put("조선건국", 1392);
		map.put("프랑스대혁명", 1789);
		map.put("대한민국독립", 2025);
		
		Integer year = map.get("임진왜란");
		System.out.println(year);
		
		year = map.get("대한민국독립");
		System.out.println(year);
	}
	
	public void studyQueue() {
		Queue<String> queue = new LinkedList<String>();
		
		queue.add("Koread");
		queue.add("Japan");
		queue.add("France");
		
		String country = queue.poll();
	}
	
	public void studySet() {
		Set<String> set = new HashSet<String>();
		
		set.add("Korea");
		set.add("Japan");
		set.add("Korea");
		set.add("China");
		set.add("USA");
		set.add("Korea");
		
		System.out.println(set.size());
		
		for(String item: set) {
			System.out.println(item);
		}
	}
	
	public static void main(String[] args) {
		new CollectionStudy().studySet();
	}
	
}
