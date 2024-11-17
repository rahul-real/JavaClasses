/**
 * 
 */
package com.java.classes;

import java.util.Scanner;

/**
 * @author rahul
 * @since 25-Feb-2024 2024 5:32:47 pm
 */
public class InsertIntoAnotherString {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Original String");
		String originalString = scanner.nextLine();
		System.out.println("Original String " + originalString);
		System.out.println("String to be inserted");
		String stringToBeInserted = scanner.nextLine();
		System.out.println("At index?");
		int index = scanner.nextInt();
		String alteredString = originalString.substring(0, index + 1);
		alteredString = alteredString.concat(stringToBeInserted).concat(originalString.substring(index + 1));
		System.out.println(alteredString);
	}

}
