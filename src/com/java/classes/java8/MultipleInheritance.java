/**
 * 
 */
package com.java.classes.java8;

/**
 * @author rahul
   @since  18-Jul-2024 2024 8:10:15 pm
 */
interface Nine{
	void display();
}
interface Ten{
	void main();
}
interface Eleven extends Nine,Ten{
	
}
public class MultipleInheritance implements Eleven {
	
	@Override
	public void main() {
		System.out.println("TEN MAIN func");
	}
	
	@Override
	public void display() {
		System.out.println("Display NINE ");
	}

	public static void main(String[] args) {
		
		MultipleInheritance multipleInheritance = new MultipleInheritance();
		multipleInheritance.display();
		multipleInheritance.main();
		
	}

}
