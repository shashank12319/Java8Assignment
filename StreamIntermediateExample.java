package com.assigmentjava8;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class StreamIntermediateExample {
	public static void main(String[] args) {
		
	
	List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
	numbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
	System.out.println(numbers); // [2, 4, 6, 8]
	
	List<String> words = Arrays.asList("hello", "world");
	words =
	words.stream().map(String::toUpperCase).collect(Collectors.toList());
	System.out.println(words); // [HELLO, WORLD]
	
}
}