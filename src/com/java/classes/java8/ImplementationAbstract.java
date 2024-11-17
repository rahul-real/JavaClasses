/**
 * 
 */
package com.java.classes.java8;

/**
 * @author rahul
   @since  18-Jul-2024 2024 9:51:03 pm
 */
public class ImplementationAbstract extends AbstractClass {
	
	

	@Override
	void display() {
		System.out.println("Display Method");
	}
	
	@Override
	double area() {
		return length * width;
	}
	
	public static void main(String[] args) {
		
		ImplementationAbstract implementationAbstract = new ImplementationAbstract();
		implementationAbstract.display();
		implementationAbstract.hello();
		
		Encapsulation encapsulation = new Encapsulation("Rahul", 24);
		System.out.println(encapsulation);
		System.out.println(encapsulation.getName());
	}
	
}
