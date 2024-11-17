/**
 * 
 */
package com.java.classes.projects;

import java.util.Random;
import java.util.Scanner;

/**
 * @author rahul
 * @since 26-Feb-2024 2024 7:07:42 pm
 */
public class NumberGuessingGame {

	public static void main(String[] args) {

		Random random = new Random();
		int num = random.nextInt(10);
		Scanner scanner = new Scanner(System.in);
		int k = 5;
		while (k > 0) {
			System.out.println("Enter A number between 0 and 9");
			int userNum = scanner.nextInt();
			if (userNum > num) {
				System.out.println("The gueesed number is higher than the actual number");
			} else if (userNum < num) {
				System.out.println("The guessed number is lower than the actual number");
			} else if (userNum == num) {
				System.out.println("You have guessed the correct number");
				break;
			}
			k--;
		}
		if (k == 0) {
			System.out.println("You have exhausted number of trails, The Number was " + num);
		}

	}

}
