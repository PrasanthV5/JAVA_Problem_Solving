package org.arrayListExercises;

import java.util.ArrayList;
import java.util.List;

public class iterate_All_Elements {

	// Write a Java program to iterate through all elements in a array list.


	public static void main(String[] args) {
		int sum=0;
		List<Integer> num = new ArrayList<>();
		
		num.add(5);
		num.add(25);
		num.add(53);
		num.add(20);
		num.add(55);
		
		for (Integer i : num) {
			
			sum+=i;
			
			System.out.println(sum);
			
		}
		System.out.println(sum);
		
	}

}
