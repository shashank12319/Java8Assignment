package com.assigmentjava8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ascendingstreamapi {
	public static void main(String[] args) {
		
	
	List<Integer> numbers = new ArrayList<>(Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5));
	numbers = numbers.stream().sorted().collect(Collectors.toList());
	System.out.println(numbers);  // [1, 1, 2, 3, 4, 5, 5, 6, 9]

}
}