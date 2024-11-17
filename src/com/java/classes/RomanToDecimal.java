/**
 * 
 */
package com.java.classes;

import java.lang.reflect.Field;
import java.util.Scanner;

/**
 * @author rahul
 * @since 04-Mar-2024 2024 7:11:53 pm
 */
public class RomanToDecimal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Roman Numerical: ");
		String romanString = scanner.next();
		int value = getDecimalValue(romanString);
		System.out.println(romanString + " is a Roman symbol which represents " + value);
	}

	public static int getDecimalValue(String romanString) {

//		String[] symbolStrings = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
//		int[] decimalValues = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		int value = 0;
		for (int i = 0; i < romanString.length(); i++) {
			int firstValue = getDecimal(romanString.toUpperCase().charAt(i));
			int secondValue = getDecimal(i + 1 < romanString.length() ? romanString.toUpperCase().charAt(i + 1) : 0);
			if (firstValue < secondValue) {
				value += secondValue - firstValue;
				i++;
			} else {
				value += firstValue;
			}
		}

		return value;
	}

	/**
	 * @param c
	 * @return
	 */
	private static int getDecimal(char c) {

		switch (c) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		default:
			return 0;
		}
	}

}
