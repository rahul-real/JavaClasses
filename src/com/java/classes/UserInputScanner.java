/**
 * 
 */
package com.java.classes;

import java.util.Scanner;

/**
 * @author rahul
   @since  20-Feb-2024 2024 11:32:49 pm
 */
public class UserInputScanner {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String nameString = scanner.nextLine();
		System.out.println("How old are you?");
		int age = scanner.nextInt();
		scanner.nextLine();
		System.out.println("What is your Fav food?");
		String foodString = scanner.nextLine();
		System.out.println("Your name is "+nameString);
		System.out.println("Your age is "+ age);
		System.out.println("You like this Food " +foodString);
		
	}

}
