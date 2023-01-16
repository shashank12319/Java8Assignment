package com.assigmentjava8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TerminalandIntermediate {
//	In this example, the count() method is a terminal operation
//	that triggers the execution of the filter operation,
//	and produces a result, which is the number of even
//	numbers in the stream.
public static void main(String[] args) {
	List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	long count = numbers.stream().filter(n -> n % 2 == 0).count();
	System.out.println("Number of even numbers: " + count);
	List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	Stream<Integer> evenNumbers = numbers1.stream().filter(n -> n % 2 == 0);
	System.out.println(evenNumbers);
//	In this example, the filter() method is an intermediate
//	operation that returns a new stream containing only the
//	even numbers. Further operations can be performed on
//	this new stream, for example, another filter or a terminal
//	operation such as forEach()
}
}
