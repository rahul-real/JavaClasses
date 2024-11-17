/**
 * 
 */
package com.java.classes.projects;

import java.util.Random;
import java.util.Scanner;

/**
 * @author rahul
 * @since 26-Feb-2024 2024 9:11:57 pm
 */
public class AdditionFlashCard {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int isGameAlive = 2;
		int totalInstances = isGameAlive;
		int win = 0;
		int losses = 0;
		while (isGameAlive > 0) {
			int num1 = getNum();
			int num2 = getNum();
			System.out.println("Menu:\r\n" + "1. Addition\r\n" + "2. Subtraction\r\n" + "3. Multipication");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				int add = num1 + num2;
				System.out.println("Enter Sum of these two Numbers: ");
				System.out.println(num1 + " + " + num2 + " = ?");

				int userInput = scanner.nextInt();
				if (userInput == add) {
					System.out.println("Correct Answer " + num1 + " + " + num2 + " = " + add);
					win++;
				} else {
					System.out.println("Incorrect Answer, Correct Answer is " + add);
					losses++;
				}
				break;
			case 2:
				int sub = num1 - num2;
				System.out.println("Enter Sum of these two Numbers: ");
				System.out.println(num1 + " - " + num2 + " = ?");

				int subInput = scanner.nextInt();
				if (subInput == sub) {
					System.out.println("Correct Answer " + num1 + " - " + num2 + " = " + sub);
					win++;
				} else {
					System.out.println("Incorrect Answer, Correct Answer is " + sub);
					losses++;
				}
				break;
			}
			isGameAlive--;
		}
		double accuracy = (double) win / totalInstances;
		double accuracyPercentage = accuracy * 100;
		System.out.println(accuracyPercentage);
		System.out.println("Wins: " + win + " Losses: " + losses);

	}

	/**
	 * @return
	 */
	private static int getNum() {
		Random random = new Random();
		return random.nextInt(900) + 100;
	}
}
