package org.arrayListExercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Exercise9_copy {

	// Write a Java program to copy one array list into another.

	public static void main(String[] args) {

		List<String> colors = new ArrayList<>();

		colors.add("Red");
		colors.add("Blue");
		colors.add("Orange");
		colors.add("White");
		colors.add("Black");

		System.out.println("List 1: " + colors);

		List<String> alpha = new ArrayList<>();

		alpha.add("A");
		alpha.add("B");
		alpha.add("C");
		alpha.add("D");
		alpha.add("E");

		System.out.println("List 2: " + alpha);

		Collections.copy(colors, alpha);
		
		System.out.println("List 1: " + colors);
		System.out.println("List 2: " + alpha);

	}

}
