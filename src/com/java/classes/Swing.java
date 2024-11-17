/**
 * 
 */
package com.java.classes;

/**
 * @author rahul
   @since  20-Feb-2024 2024 11:51:53 pm
 */
public class Swing {
	
	static int age;
	
	public static void main(String[] args) {
		
		int age2;
		char copy = '\u00A9';
		System.out.println(copy);
		int num = 1;
		int num2 = 2;
		//method Overloading
		addNum(num,num2);
		float f = 1.4f;
		float f1 = 1.8f;
		addNum(f, f1);
		String aString = "Rahul";
		String bString = "D.";
		String cString = "Vodala";
		addNum(aString, bString,cString);
	}

	/**
	 * @param aString
	 * @param bString
	 * @param cString
	 */
	private static void addNum(String aString, String bString, String cString) {
		System.out.println(aString+" "+bString+ " "+cString);
		
	}

	/**
	 * @param f
	 * @param f1
	 */
	private static void addNum(float f, float f1) {
		float sum = f + f1;
		System.out.println(sum);
		
	}

	/**
	 * @param num
	 * @param num2
	 */
	private static void addNum(int num, int num2) {
		int a = num + num2;
		System.out.println(a);
	}
	
	

}
