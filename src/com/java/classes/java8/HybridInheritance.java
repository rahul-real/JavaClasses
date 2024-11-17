/**
 * 
 */
package com.java.classes.java8;

/**
 * @author rahul
   @since  18-Jul-2024 2024 8:16:14 pm
 */

class Twele{
	
	void display() {
		System.out.println("Hi from Twele");
	}
	
}
class Thriteen extends Twele{
	
}

class Fourteen extends Twele{
	
}
class FifTeen extends Thriteen{

	
}
public class HybridInheritance {
	
	public static void main(String[] args) {
		
		FifTeen fifteen = new FifTeen();
		fifteen.display();
		
	}

}
