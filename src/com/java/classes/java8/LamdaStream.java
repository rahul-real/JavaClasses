/**
 * 
 */
package com.java.classes.java8;

import java.util.Arrays;
import java.util.List;

/**
 * @author rahul
   @since  18-Jul-2024 2024 10:58:55 pm
 */
public class LamdaStream {
	
	public static void main(String[] args) {
		
		List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		long squareOfEvenSum = num.stream().filter(x -> x %2 ==0).mapToLong(x -> x *x).sum();
		System.out.println(squareOfEvenSum);
		
		
	}

}
