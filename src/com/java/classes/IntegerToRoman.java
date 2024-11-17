/**
 * 
 */
package com.java.classes;

import java.util.Scanner;

/**
 * @author rahul
   @since  04-Mar-2024 2024 8:21:11 pm
 */
public class IntegerToRoman {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter A Decimal Value:");
		int decimalValue = scanner.nextInt();
		String[] symbolStrings = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		int[] decimalValues = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		StringBuilder builder = new StringBuilder();
		int index = 0;
		while(decimalValue>0) {
			while(decimalValues[index]<=decimalValue) {
				builder.append(symbolStrings[index]);
				decimalValue -= decimalValues[index]; 
			}
			index++;
		}
		System.out.println("Roman Number is: "+builder.toString());
	}

}
