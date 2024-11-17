/**
 * 
 */
package com.java.classes;

import java.util.Scanner;

/**
 * @author rahul
   @since  25-Feb-2024 2024 5:48:44 pm
 */
public class PalindromeString {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter A String");
		String string = scanner.nextLine();
		String bString  = "";
		for(int i = string.length()- 1;i>=0;i--) {
			bString += string.charAt(i);
		}
		System.out.println(string + " " + bString);
		if(string.equals(bString)) {
			System.out.println("Given String is a Palindrome "+ string);
		}else {
			System.out.println("Not A Palindrome");
		}
	}

}
