package org.arrayListExercises;

import java.util.ArrayList;
import java.util.List;

public class Exercise6_Remove {
	
	// Write a Java program to remove the third element from a array list.

	public static void main(String[] args) {
		
	
	
	List<String> colors = new ArrayList<>();
	
	
	colors.add("Red");
	colors.add("Blue");
	colors.add("Orange");
	colors.add("White");
	colors.add("Black");
	colors.add( "Pink");
	colors.add( "Yellow");
	
	//Remove == remove
	
	colors.remove(2);
	System.out.println(colors);


	}
}
