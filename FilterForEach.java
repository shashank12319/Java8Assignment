package com.assigmentjava8;
import java.util.*;
public class FilterForEach {
public static void main(String[] args) {

List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

numbers.stream()
       .filter(n -> n % 2 == 0)  // keep only even numbers
       .forEach(System.out::println);  // print each number to the console
}
}