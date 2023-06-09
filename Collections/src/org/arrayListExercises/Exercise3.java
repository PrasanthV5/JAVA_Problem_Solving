package org.arrayListExercises;

import java.util.ArrayList;
import java.util.List;

public class Exercise3 {

	public static void main(String[] args) {

		// Write a Java program to insert an element into the array list at the first position.
		
		List<String> colors = new ArrayList<>();
		
		colors.add("Red");
		colors.add("Blue");
		colors.add("Orange");
		colors.add("White");
		colors.add("Black");
		
		System.out.println(colors);
		
		System.out.println("------------");
		// insert == add
		
		colors.add(0, "Pink");
		colors.add(5, "Yellow");
		
		System.out.println(colors);

	}

}
