package org.arrayListExercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise10_shuffle {

	//Write a Java program to shuffle elements in a array list.


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
		
		Collections.shuffle(colors);
		
		System.out.println(colors);
	}
}
