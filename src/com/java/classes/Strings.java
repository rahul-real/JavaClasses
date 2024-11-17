/**
 * 
 */
package com.java.classes;

/**
 * @author rahul
   @since  21-Feb-2024 2024 9:13:00 pm
 */
public class Strings {
	
	public static void main(String[] args) {
		
		String name = "Rahul";
		String nameString = "Rahul";
		String namedup = new String("Rahul");
		String namedupString = new String("Rahul");
		System.out.println(namedupString.equalsIgnoreCase(namedup));
		System.out.println(namedupString==(namedup));
		
		System.out.println("Hello World I am "+ name +". I am from India and I am 23 Years Old");
	}

}
