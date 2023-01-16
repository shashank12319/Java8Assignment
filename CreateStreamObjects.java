package com.assigmentjava8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreateStreamObjects {
@SuppressWarnings("unused")
public static void main(String[] args) {
	
	List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
	Stream<Integer> stream = list.stream();
	stream.forEach(System.out::print);
	System.out.println("print");
	Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5);
	stream1.forEach(System.out::print);
	System.out.println("print");

	//Stream<Double> randoms = Stream.generate(Math::random);
	Stream.iterate(0, n -> n + 2).limit(5).forEach(System.out::print);
	System.out.println("print");



	
	int[] arr = new int[]{1,2,3,4,5};
	IntStream intStream = Arrays.stream(arr);
	intStream.forEach(System.out::print);
	System.out.println("print");

	Stream<String> streamBuilder = Stream.<String>builder().add("a").add("b").add("c").build();
	streamBuilder.forEach(System.out::print);
	System.out.println("print");

	
	/*try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
	    Stream<String> lines = br.lines();
	} catch (IOException e) {
	    e.printStackTrace();
	}
*/
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
}
