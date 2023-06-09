package org.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Hmap {
	
	public static void main(String[] args) {
		
		Map<Integer, String> mp = new HashMap<>();
		
		mp.put(10,"java");
		mp.put(20,"sql");
		mp.put(30,"oops");
		mp.put(40,"Sql");
		mp.put(50,"oracle");
		mp.put(60,"DB");
		mp.put(10,"selenium");
		mp.put(50,"psql");
		mp.put(40,"Hadoop");
		
		System.out.println(mp);	}

}
