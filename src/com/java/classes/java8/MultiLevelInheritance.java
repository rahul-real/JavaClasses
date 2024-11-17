/**
 * 
 */
package com.java.classes.java8;

/**
 * @author rahul
   @since  18-Jul-2024 2024 8:03:07 pm
 */
class Three{
	void hi() {
		System.out.println("Three Class");
	}
}
class Four extends Three{
	
}
class Five extends Four{
	
}
public class MultiLevelInheritance {
	
	public static void main(String[] args) {
		
		Five five = new Five();
		five.hi();
		
	}

}
