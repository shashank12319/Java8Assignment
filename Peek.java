package com.assigmentjava8;


import java.util.*;
import java.util.stream.IntStream;
public class Peek {
   public static void main(String[] args) {
      IntStream intStream = IntStream.range(50, 60);
      System.out.println("Elements in the stream = ");
      long res = intStream.count();
      System.out.println("Count of elements = " + res);
   }
}
