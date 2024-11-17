/**
 * 
 */
package com.java.classes;

/**
 * @author rahul
   @since  22-Feb-2024 2024 11:42:06 am
 */
public class MultiThreading {

	public static void main(String[] args) {
		
		for(int i=1; i<=3; i++) {
			MultiThreadExample threadExample = new MultiThreadExample(i);
			threadExample.start();	
		}
	}
}
