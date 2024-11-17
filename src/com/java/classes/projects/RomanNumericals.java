/**
 * 
 */
package com.java.classes.projects;

import java.util.Scanner;

/**
 * @author rahul
 * @since 26-Feb-2024 2024 8:06:04 pm
 */
public class RomanNumericals {

	public static void main(String[] args)  throws Exception {
		boolean isGameAlive = true;
		Scanner scanner = new Scanner(System.in);
		while (isGameAlive) {
			System.out.println("Menu:\r\n" + "1. Decimal to Roman\r\n" + "2. Roman to Decimal\r\n" + "3. Exit");
			System.out.println("Enter your choice: ");
			try {
				int men = scanner.nextInt();
				switch (men) {
				case 1:
					System.out.println("Enter a decimal Number");
					int num = scanner.nextInt();
					StringBuilder roman = new StringBuilder();
					int[] decimalValues = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
			        String[] romanSymbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
			        int index = 0;
			        while(num>0) {
			        	while(num>=decimalValues[index]) {
			        		roman.append(romanSymbols[index]);
			        		num -= decimalValues[index];
			        	}
			        	index++;
			        }
			        System.out.println("Roman Numerical: " + roman.toString());
					break;
				case 2:
					System.out.println("Enter a Roman numeral:");
					String romanNumeral = scanner.next();
					int decimal = 0;
					for (int i = 0; i < romanNumeral.length(); i++) {
						int current = charToValue(romanNumeral.charAt(i));
						int next = (i + 1 < romanNumeral.length()) ? charToValue(romanNumeral.charAt(i + 1)) : 0;
			            if (current < next) {
			                decimal += next - current;
			                i++;
			            } else {
			                decimal += current;
			            }
					}
					System.out.println("Decimal number: " + decimal);
					break;
				case 3:
					isGameAlive = false;
					break;
				default:
					isGameAlive = false;
					break;
				}				
			} catch (Exception e) {
				e.getMessage();
			}


		}
	}

	/**
	 * @param romanNumeral
	 * @return
	 */
	private static int charToValue(char romanNumeral) {

		switch (romanNumeral) {
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
			return 0; // Invalid character
		}
	}

}
