package com.assigmentjava8;
//In this example, the orElse() method is used to return a
//		default value if the Optional is empty. The provided
//		default value will be returned if the Optional is empty.
//
//It is also possible to use orElseGet(Supplier s) instead
//of orElse(T t), where Supplier will only be called if the
//optional is empty, this can be useful in case the default
//value is expensive to compute.

import java.util.Optional;

public class Orelse {
  public static void main(String[] args) {
    String value = null;
    Optional<String> optional = Optional.ofNullable(value);
    System.out.println(optional.orElse("Value is not present"));
  }
}
