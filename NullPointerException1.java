package com.assigmentjava8;

import java.util.Optional;

public class NullPointerException1 {
	@SuppressWarnings("null")
	public static void main(String[] args) {
	   /* try {
	        String str = null;
	        str.length();
	    } catch (NullPointerException e) {
	        // You can also log the exception
	        System.out.println("Caught NullPointerException: " + e.getMessage());
	    }
	    */
	    //System.out.println("This line will be executed after the exception");
	    String str = null;
	    Optional<String> optionalString = Optional.of(str);
	    System.out.println(optionalString);
	   // optionalString.ifPresent(s -> System.out.println(s.length()));
	    //Here, Optional.ofNullable(str) will return an
	  // Optional object with a null value, so the ifPresent()
	   //method will not execute and you will avoid the NPE.
	    
	    
	}

}
