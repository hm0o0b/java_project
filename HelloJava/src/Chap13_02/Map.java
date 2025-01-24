package Chap13_02;

import java.util.HashMap;

public class Map { //241007

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap map = new HashMap();
		
		map.put("A", "Apple");
		map.put("B", "Bed");
		map.put("1", "TEST");
		
		System.out.println(map);
		System.out.println(map.get("A"));
	
	}
}
