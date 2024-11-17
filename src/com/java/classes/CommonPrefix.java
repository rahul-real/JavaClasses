/**
 * 
 */
package com.java.classes;

/**
 * @author rahul
   @since  04-Mar-2024 2024 5:12:55 pm
 */
public class CommonPrefix {
	
	public static void main(String[] args) {
		String[] commnon = {"geeksforgeeks", "geeks", "geek", "geezer"};
		String commonPrefixString = "";
		commonPrefixString = commnon[0];
		String longestCommonPrefixString = "";
		for(int word = 0;word<commnon.length;word++) {
			if(word == 0) {
				continue;
			}
			for(int i=0;i<commnon[word].length();i++) {
				if(commnon[word].charAt(i)== commonPrefixString.charAt(i)) {
					if(word == commnon.length - 1) {
						longestCommonPrefixString += commnon[word].charAt(i);
					}
				}
			}
		}
		System.out.println(longestCommonPrefixString);
	}

}
