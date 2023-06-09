package org.arrayListExercises;

import java.util.ArrayList;
import java.util.List;

public class Exercise7_search_an_element_contains {
	
	// Write a Java program to search an element in a array list.


	public static void main(String[] args) {
		
		List<String> colors = new ArrayList<>();
		
		
		colors.add("Red");
		colors.add("Blue");
		colors.add("Orange");
		colors.add("White");
		colors.add("Black");
		colors.add( "Pink");
		colors.add( "Yellow");

		
		// SEARCH == contains 
		
		if (colors.contains("Orange")) {
			
			System.out.println("1");
		}
	
		else System.out.println("0");
	
	}
	

}
