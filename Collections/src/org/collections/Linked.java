package org.collections;

import java.util.LinkedList;
import java.util.List;

public class Linked {

	public static void main(String[] args) {
		
		List<Integer> l = new LinkedList<>();
		
		
		for (int i = 1; i < 8; i++) {
			
			l.add(i*100);
			}
		System.out.println(l);
	}
}
