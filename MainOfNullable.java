package com.assigmentjava8;
//In the first example, Optional.of(value) creates an Optional containing the non-null value,
//and the get() method is used to retrieve the value. In the second example, Optional.ofNullable(value)
//creates an Optional that may contain a null value, if the value passed to it is null it will print Optional.empty
//
//It is important to note that if we use get() method with empty optionals it will throw NoSuchElementException,
//so it is always better to use ifPresent() or orElse() method to handle empty optionals.

import java.util.Optional;

public class MainOfNullable {
  public static void main(String[] args) {
    String value = "Hello";
    Optional<String> optional2 = Optional.ofNullable(value);
    System.out.println(optional2.get()); // prints "Hello"
    
    value = null;
    Optional<String> optional3 = Optional.ofNullable(value);
    System.out.println(optional3.get()); // prints "Optional.empty"
  }
}
