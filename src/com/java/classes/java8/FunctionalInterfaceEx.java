/**
 * 
 */
package com.java.classes.java8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

/**
 * @author rahul
   @since  19-Jul-2024 2024 11:54:24 am
 */
@FunctionalInterface
interface Hello{
	
	void hello();
	
}
@FunctionalInterface
interface StringManpulation{
	String transform(String input);
}
public class FunctionalInterfaceEx {
	
	public static void main(String[] args) {
		
		Hello hello = ()-> System.out.println("Hello Functional Interface");
		hello.hello();
		List<String> words = List.of("hello", "world", "java", "lambda");
        List<String> result = new ArrayList<>();
        StringManpulation stringManpulation = (word) -> word.toUpperCase();
        
        for(String word: words) {
        	result.add(stringManpulation.transform(word));
        }
        System.out.println(result);
		System.out.println(stringManpulation.transform("stringManpulation"));
		
        Function<String,Integer> function = (input) -> input.length();
        
        // Apply the lambda expression to each string in the list
        List<String> strings = Arrays.asList("hello", "world", "java", "lambda");
        for(String string: strings) {
        	System.out.println(function.apply(string));
        }
        Function<Integer,Integer> function2 = num -> num * 3;
        Function<Integer,Integer> function3 = num -> num + 5;
        Function<Integer,Integer> function4 =  function2.andThen(function3);
        Function<Integer, Integer> function5 = function2.compose(function3);
        System.out.println(function4.apply(10));
        System.out.println(function5.apply(10));
        
        UnaryOperator<Integer> unaryOperator = num -> num * 3;
        UnaryOperator<Integer> unaryOperator2 = num -> num + 5;
        Function<Integer, Integer> unaryOperator3 =  unaryOperator.andThen(unaryOperator2);
        System.out.println(unaryOperator3.apply(10));
        
        Consumer<String> consumer = (input) -> System.out.println(input.toUpperCase());
        Consumer<String> consumer2 = input -> System.out.println("Input is "+ input);
        consumer.andThen(consumer2).accept("Lambda");
        Supplier<String> dateSupplier = () -> LocalDate.now().getDayOfWeek().name();
        System.out.println(dateSupplier.get());
	}

}
