/**
 * 
 */
package com.java.classes.java8;

/**
 * @author rahul
   @since  18-Jul-2024 2024 8:28:11 pm
 */
class RunTimePolyMorphism{
	void hello() {
		System.out.println("Class RunTimePolyMorphism");
	}
}
public class PolyMorphism extends RunTimePolyMorphism {
	
	void display() {
		System.out.println("Hi");
	}
	void display(int a) {
		System.out.println("Number: "+a);
	}
	void hello() {
		System.out.println("Class PolyMorphism");
	}
	
	
	public static void main(String[] args) {
		
		//Compile-Time Polymorphism
		PolyMorphism polyMorphism= new PolyMorphism();
		polyMorphism.display();
		polyMorphism.display(5);
		polyMorphism.hello();
		
	}

}
