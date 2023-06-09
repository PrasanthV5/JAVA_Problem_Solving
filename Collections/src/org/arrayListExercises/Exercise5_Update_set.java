package org.arrayListExercises;

import java.util.ArrayList;
import java.util.List;

public class Exercise5_Update_set {

	// Write a Java program to update specific array element by given element.


	public static void main(String[] args) {
		
		List<Integer> num = new ArrayList<>();
		
		num.add(2);
		num.add(2);
		num.add(3);
		num.add(4);
		
		System.out.println(num);
		
		// Update == Set
		
		num.set(0, 1);
		num.add(5);
		
		System.out.println(num);
	}
}
