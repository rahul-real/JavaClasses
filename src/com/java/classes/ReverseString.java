/**
 * 
 */
package com.java.classes;

import java.util.Scanner;

/**
 * @author rahul
   @since  22-Feb-2024 2024 12:23:08 pm
 */
public class ReverseString {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String S = "Enter.A.String.For.Reversing";
		String reverseString = ""; 
		int j = S.length();
		int first = 0;
		int last = 0;
		for(int i=0;i<S.length();i++) {
			if (S.charAt(i) == '.') {
				last = i - 1;
				storeInLast(first,last,reverseString);
				System.out.println("last " +last);
				String a = String.valueOf(S.charAt(i));
				reverseString = reverseString.concat(a);
			}
		}
		System.out.println("first " +first);
	}

	/**
	 * @param first
	 * @param last
	 * @param reverseString
	 */
	private static void storeInLast(int first, int last, String reverseString) {
		
		
	}

}
