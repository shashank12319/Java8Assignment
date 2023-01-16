package com.assigmentjava8;
//The Strategy design pattern is a way to encapsulate different algorithms or behaviors and
//allow them to be interchangeable. It can be refactored to use Lambdas in Java 8 and later,
//as they provide a more concise and readable syntax for implementing the pattern.
//
//In Java, the strategy pattern can be refactored to use lambda expressions, functional
//interfaces and method references to create a more concise and readable code. The strategy
//interface can be defined as a functional interface (an interface with a single abstract method)
//to allow the use of lambda expressions.
//In this example, the strategy interface is defined as a functional interface,
//allowing the use of lambda expressions. The context class holds a reference to a
//strategy object and it can switch between different strategies at runtime by calling
//the setStrategy method. This eliminates the need for creating a separate class for each
//strategy. The code is more readable and maintainable, by using the lambda function instead
//of implementing the strategy interface.
//It also eliminates the need of creating a separate class for each strategy, and method
//references can also be used instead of lambda expressions.



	interface Strategy {
	    void execute();
	}

	public class Strategypattern {
	    private Strategy strategy;
	    public Strategypattern(Strategy strategy) {
	        this.strategy = strategy;
	    }
	    public void setStrategy(Strategy strategy) {
	        this.strategy = strategy;
	    }
	    public void executeStrategy() {
	        strategy.execute();
	    }
	
    public static void main(String[] args) {
	Strategypattern context = new Strategypattern(() -> System.out.println("Strategy 1"));
	context.executeStrategy();
	context.setStrategy(() -> System.out.println("Strategy 2"));
	context.executeStrategy();

}
}
