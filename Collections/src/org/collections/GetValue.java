package org.collections;

import java.util.Set;
import java.util.TreeSet;

public class GetValue {
	
	public static void main(String[] args) {
		
		Set<Integer> s = new TreeSet<>();
		
for (int i = 1; i < 9; i++) {
			
			s.add(5+(i*100));
			}
			
		System.out.println(s);
				
	}

}
