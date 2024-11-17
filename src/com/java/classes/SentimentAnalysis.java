/**
 * 
 */
package com.java.classes;

import java.util.Scanner;

/**
 * @author rahul
 * @since 21-Feb-2024 2024 11:12:49 pm
 */
public class SentimentAnalysis {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Define positive and negative words
		String[] positiveWords = { "happy", "good", "love", "joy", "excited" };
		String[] negativeWords = { "sad", "bad", "hate", "angry", "frustrated" };
		String[] exitTheProgram = {"exit", "end" };
		boolean programRunning = true;
		while (programRunning) {
			System.out.print("Enter a sentence: ");
			String sentence = scanner.nextLine().toLowerCase();

			// Count positive and negative word occurrences
			int positiveCount = 0;
			int negativeCount = 0;

			for (String word : sentence.split(" ")) {
				if (containsWord(positiveWords, word)) {
					positiveCount++;
				} else if (containsWord(negativeWords, word)) {
					negativeCount++;
				} else if (containsWord(exitTheProgram, word)) {
					programRunning = false;
				}
			}
			if(!programRunning) {
				break;
			}

			// Analyze sentiment based on word counts
			String sentiment;
			if (positiveCount > negativeCount) {
				sentiment = "positive";
			} else if (negativeCount > positiveCount) {
				sentiment = "negative";
			} else {
				sentiment = "neutral";
			}

			System.out.println("Sentiment: " + sentiment);
		}
	}

	// Helper function to check if a word exists in an array
	private static boolean containsWord(String[] words, String word) {
		for (String w : words) {
			if (w.equals(word)) {
				return true;
			}
		}
		return false;
	}

}
