package com.assigmentjava8;
//In Java, the empty() method of the java.util.Optional
//class is used to create an empty Optional instance.
//An empty Optional instance represents the absence of a
//value, and it can be used to indicate that a value is not present.
//In this example, the empty() method is used to create
//an empty Optional instance, which can be used to indicate
//that a value is not present.
import java.util.Optional;

public class EmptyOptional {
  public static void main(String[] args) {
    Optional<String> emptyOptional = Optional.empty();
    System.out.println(emptyOptional); // prints "Optional.empty"
  }
}
