/**
 * 
 */
package com.java.classes.java8;

/**
 * @author rahul
   @since  18-Jul-2024 2024 10:07:27 pm
 */
public class Encapsulation {
	
	private String name;
	
	private int age;
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age= age;
	}
	
	public int getAge() {
		return age;
	}
	
	Encapsulation(String name,int age){
		this.name= name;
		this.age = age;
	}
	
	@Override
	public String toString(){
		return "Encapsulation[Name: "+name+" Age: "+age +"]";
	}

}
