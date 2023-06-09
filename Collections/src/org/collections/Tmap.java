package org.collections;


import java.util.Map;
import java.util.TreeMap;

public class Tmap {
	
	public static void main(String[] args) {
		

		Map<Character, Integer> mp = new TreeMap<>();
		
		
		mp.put('!',10);
		mp.put('@',20);
		mp.put('#',30);
		mp.put('$',40);
		mp.put('%',50);
		mp.put('&',60);
		mp.put('*',10);
		mp.put('(',50);
		mp.put(')',40);
	
		
		System.out.println(mp);
	}

}
