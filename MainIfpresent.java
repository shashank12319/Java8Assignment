package com.assigmentjava8;
//In this example, the ifPresent() method is used to check
//if the Optional contains a value, and if it does, it calls
//the provided lambda expression and prints the value.
import java.util.Optional;

public class MainIfpresent {
  public static void main(String[] args) {
    String value = "Hello";
    Optional<String> optional = Optional.ofNullable(value);
    optional.ifPresent(val -> System.out.println("Value: " + val));
  }
}
