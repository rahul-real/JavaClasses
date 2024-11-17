/**
 * 
 */
package com.java.classes;

import java.util.Scanner;

/**
 * @author rahul
 * @since 25-Feb-2024 2024 5:18:32 pm
 */
public class EvenLength {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter A String");
		String a = scanner.nextLine();
		System.out.println(a);
		for (String word : a.split(" ")) {
			if (word.length() % 2 == 0) {
				System.out.println(word);
			}
		}

	}
}
