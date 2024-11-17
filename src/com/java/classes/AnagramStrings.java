/**
 * 
 */
package com.java.classes;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

/**
 * @author rahul
   @since  25-Feb-2024 2024 6:07:42 pm
 */
public class AnagramStrings {
	
	public static void main(String[] args) {
		String a = "";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter A String");
		String string = scanner.nextLine();
		System.out.println("Enter A String");
		String string2 = scanner.nextLine();
		char[] str1 = string.toLowerCase().toCharArray();
		char[] str2 = string2.toLowerCase().toCharArray();
		Arrays.sort(str1);
		Arrays.sort(str2);
		System.out.println(str1);
		System.out.println(str2);
		if(Arrays.equals(str1, str2)) {
			System.out.println("Given Strings are Anagrams");
		}else {
			System.out.println("Given Strings are not Anagrams");
		}
	}

}
