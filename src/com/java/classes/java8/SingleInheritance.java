/**
 * 
 */
package com.java.classes.java8;

/**
 * @author rahul
   @since  18-Jul-2024 2024 7:55:41 pm
 */

class One{
	void hi() {
		System.out.println("Hi");
	}
}
class Two extends One{
	void hello() {
		System.out.println("Hello");
	}
	
}
public class SingleInheritance  extends Inheritance {
	
	public static void main(String[] args) {
		
		SingleInheritance inheritance = new SingleInheritance();
		
		inheritance.singleInheritance();
		
		Two two = new Two();
		two.hi();
		
		
	}

}
