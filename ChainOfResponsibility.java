package com.assigmentjava8;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class ChainOfResponsibility {


public static void main(String[] args) {

	 // First processing object
	 Function<String,String> headerProcessing =
	   (text) -> "From Raoul, Mario and Alan: " + text;
	   
	 //Second processing object
	 Function<String,String> spellCheckerProcessing =
	   (text) -> text.replaceAll("labda", "lambda");
	   
	 // Compose the two functions resulting in a chain of operations.
	 Function<String, String> pipeline = headerProcessing.andThen(spellCheckerProcessing);
	 String result2 = pipeline.apply("Aren't labdas really fun.?!!");
	 System.out.println(result2);
	}
}