package com.assigmentjava8;


//Implementation of Stream.distinct()
//to get the distinct elements in the List
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Distinct {

	// Driver code
	public static void main(String[] args)
	{

		// Creating a list of integers
		List<Integer> list = Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5);

		System.out.println("The distinct elements are :");

		// Displaying the distinct elements in the list
		// using Stream.distinct() method
		list.stream().distinct().forEach(System.out::println);
		 System.out.println("The sorted stream is : ");
		  
	        // displaying the stream with elements
	        // sorted in natural order
	        list.stream().sorted().forEach(System.out::println);
	        Stream<Integer> evenNumInfiniteStream = Stream.iterate(0, n -> n + 2);

	        List<Integer> newList = evenNumInfiniteStream.limit(10)
	                                        .collect(Collectors.toList());

	        System.out.println(newList);	
	        Stream<Integer> evenNumInfiniteStream1 = Stream.iterate(0, n -> n + 2);

	        List<Integer> newList1 = evenNumInfiniteStream1
	        		.skip(5)
	        		.limit(10)
	        		.collect(Collectors.toList());
	        	//skip first 5 even numbers	
	        System.out.println(newList1);
	       
	}
}
