package org.arrayListExercises;

import java.util.ArrayList;
import java.util.List;

public class Exercise12_extract_sublist {
	
	// Write a Java program to extract a portion of a array list.

	
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
					
					
					
				List<String> sub_list = colors.subList(0, 5);
					
					System.out.println(sub_list);
	}

}
