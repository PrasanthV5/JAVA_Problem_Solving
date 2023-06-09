package org.arrayListExercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise8_sort {
	
	// Write a Java program to sort a given array list.

public static void main(String[] args) {
	

	List<Integer> nums = new ArrayList<>();
	
		nums.add(15);
		nums.add(5);
		nums.add(10);
		nums.add(8);
		nums.add(2);
		
		// sort == Collections.sort(nums)
		
		System.out.println("Before sorting: "+nums);
		
		Collections.sort(nums);
		
		System.out.println("After sorting: "+nums);

		


}
}