/**
 * 
 */
package com.java.classes;

/**
 * @author rahul
   @since  04-Mar-2024 2024 7:02:53 pm
 */
public class CommonPrefixGPT {
	
    public static void main(String[] args) {
        String[] strings = {"geeksforgeeks", "geeks", "geek", "geezer"};
        String longestCommonPrefix = findLongestCommonPrefix(strings);
        System.out.println("Longest Common Prefix: " + longestCommonPrefix);
    }

    private static String findLongestCommonPrefix(String[] strings) {
        if (strings == null || strings.length == 0) {
            return "";
        }

        String prefix = strings[0];
        for (int i = 1; i < strings.length; i++) {
            while (!strings[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }	

}
