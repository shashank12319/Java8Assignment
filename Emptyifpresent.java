package com.assigmentjava8;

//WE can also check whether an Optional is empty
//or not by using the isPresent() method, it returns
//false if the Optional is empty, otherwise it returns true.

import java.util.Optional;

public class Emptyifpresent {
  public static void main(String[] args) {
    Optional<String> emptyOptional = Optional.empty();
    System.out.println(emptyOptional); // prints false
  }
}
