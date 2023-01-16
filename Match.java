package com.assigmentjava8;

import java.util.*;
import java.util.stream.Collectors;

public class Match {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		boolean anyEven = numbers.stream().anyMatch(n -> n % 2 == 0);
		System.out.println(anyEven); // true
		boolean allEven = numbers.stream().allMatch(n -> n % 2 == 0);
		System.out.println(allEven); // false
		boolean noneEven = numbers.stream().noneMatch(n -> n % 2 == 0);
		System.out.println(noneEven); // false
		List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println(evenNumbers); // [2, 4, 6, 8]
		long evenCount = numbers.stream().filter(n -> n % 2 == 0).count();
		System.out.println(evenCount); // 4
		System.out.println("******");
		Optional<Integer> optionalNumber = numbers.stream().findAny();
		System.out.println(optionalNumber.get()); // some number
		Optional<Integer> optionalNumber1 = numbers.stream().findFirst();
		System.out.println(optionalNumber1.get()); // 1
		numbers.stream().forEach(System.out::println); // print each number to the
		Optional<Integer> minNumber = numbers.stream().min(Integer::compare);
		System.out.println(minNumber.get()); // 1
		Optional<Integer> maxNumber = numbers.stream().max(Integer::compare);
		System.out.println(maxNumber.get()); // 9
		int sum = numbers.stream().reduce(0, Integer::sum);
		System.out.println(sum); // 45
		Integer[] evenNumbers1 = numbers.stream().filter(n -> n % 2 == 0).toArray(Integer[]::new);
		System.out.println(Arrays.toString(evenNumbers1)); // [2, 4, 6, 8]
	}
}