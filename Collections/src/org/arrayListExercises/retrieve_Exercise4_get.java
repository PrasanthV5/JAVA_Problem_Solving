package org.arrayListExercises;

import java.util.ArrayList;
import java.util.List;

public class retrieve_Exercise4_get {

	// Write a Java program to retrieve an element (at a specified index) from a given array list.
	public static void main(String[] args) {
		
	
	List<String> colors =  new ArrayList<>();
	
	colors.add("Red");
	colors.add("Blue");
	colors.add("Orange");
	colors.add("White");
	colors.add("Black");
	colors.add( "Pink");
	colors.add( "Yellow");
	
	System.out.println(colors);
	
	//retrieve == get 
	
	System.out.println(colors.get(0));
	
	System.out.println(colors.get(5));
	

	System.out.println(colors);
	}

}
