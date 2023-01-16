package com.assigmentjava8;


import java.util.Optional;

public class MainOf {
  public static void main(String[] args) {
    String value = "Hello";
    Optional<String> optional1 = Optional.of(value);
    System.out.println(optional1.get()); // prints "Hello"
  }
}
