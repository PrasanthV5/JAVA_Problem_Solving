package org.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Convert {
	
	public static void main(String[] args) {
		
		Set<Integer> s = new LinkedHashSet<>();
		
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(90);
		s.add(10);
		s.add(10);
		s.add(40);
		s.add(50);
		
		System.out.println(s);
		
		Set<Integer> s1 = new HashSet<>();
		
		s1.addAll(s);
		System.out.println(s1);


	}

}
