package com.assigmentjava8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Decendingstreamapi {
public static void main(String[] args) {
	List<Integer> numbers = new ArrayList<>(Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5));
	numbers = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	System.out.println(numbers);  // [9, 6, 5, 5, 4, 3, 2, 1, 1]

}
}
