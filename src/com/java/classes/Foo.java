/**
 * 
 */
package com.java.classes;

import java.time.Duration;
import java.time.LocalDateTime;

/**
 * @author rahul
   @since  28-Jan-2024 2024 5:23:11 pm
 */
public class Foo {
	public static void main(String[] args) {
        Integer n = 0;
        LocalDateTime localDateTime = LocalDateTime.now();
        while (n < Integer.MAX_VALUE) {
            n++;
        }
        LocalDateTime localDateTime2 = LocalDateTime.now();
        Duration diffDuration = Duration.between(localDateTime, localDateTime2);
        System.out.println(diffDuration.toSeconds());
        
        System.out.println(n);
    }

}
