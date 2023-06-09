package org.arrayListExercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise11_reverse {

	// Write a Java program to reverse elements in a array list.


	public static void main(String[] args) {
		
List<String> colors = new ArrayList<>();
		
		
		colors.add("Red");
		colors.add("Blue");
		colors.add("Orange");
		colors.add("White");
		colors.add("Black");
		colors.add( "Pink");
		colors.add( "Yellow");

		System.out.println(colors);
		
		
		//reverse == Collections.reverse(colors);
		
		Collections.reverse(colors);
		
		System.out.println(colors);
	}
}
