package org.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class Lmap {
	
	public static void main(String[] args) {
		
		Map<Integer, String> mp = new LinkedHashMap<>();
		
		
		mp.put(10,"10");
		mp.put(20,"20");
		mp.put(30,"30");
		mp.put(40,"40");
		mp.put(50,"50");
		mp.put(60,"60");
		mp.put(10,"10");
		mp.put(50,"50");
		mp.put(40,"40");
		
		System.out.println(mp);
	}

}
