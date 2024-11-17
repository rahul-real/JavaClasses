/**
 * 
 */
package com.java.classes;

import java.util.Scanner;

/**
 * @author rahul
   @since  05-Mar-2024 2024 5:24:30 pm
 */
public class MinimumDistance {
	
	public static void main(String[] args) {
		
		String[] inputStrings = {"geeks","for","geeks","contribute","practice"};
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first word: ");
		String word1 = scanner.nextLine();
		System.out.println("Enter the second word: ");
		String word2 = scanner.nextLine();
		int distance = 0;
		for(int i = 0;i<inputStrings.length;i++) {
			if(inputStrings[i].equals(word1)) {
				distance = i;
			} else if(inputStrings[i].equals(word2)) {
				distance = i - distance;
			}
		}
		System.out.println(distance);
	}

}
