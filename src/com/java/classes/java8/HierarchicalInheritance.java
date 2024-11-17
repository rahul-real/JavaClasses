/**
 * 
 */
package com.java.classes.java8;

/**
 * @author rahul
   @since  18-Jul-2024 2024 8:06:46 pm
 */
class Six{
	void six() {
		System.out.println("SIX ");
	}
}
class Seven extends Six{
	void seven() {
		System.out.println("Seven");
	}
}
class Eight extends Six{
	
}

public class HierarchicalInheritance {
	
	public static void main(String[] args) {
		
		Eight eight = new Eight();
		
		eight.six();
		
	}

}
