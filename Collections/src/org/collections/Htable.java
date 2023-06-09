package org.collections;

import java.util.Hashtable;
import java.util.Map;

public class Htable {
	
	public static void main(String[] args) {
		
		Map<String, String> mp = new Hashtable<>();
		
		mp.put("Sam", "Selenium");
		mp.put("Karthik", "framework");
		mp.put("Gowtham", "oracle");
		mp.put("Gokul", "corejava");
		mp.put("Neethu", "Neethu");

		System.out.println(mp);
	}

}
