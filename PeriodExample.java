package com.assigmentjava8;

//In this example, the Period.of(1, 2, 3) creates a Period of 1 year, 2 months, and 3 days. 
//The LocalDate.plus(period) method is used to add the period to the current date, and the 
//result is stored in the newDate variable.
	import java.time.LocalDate;
	import java.time.Period;

	public class PeriodExample {
	    public static void main(String[] args) {
	        LocalDate date = LocalDate.now();
	        Period period = Period.of(1, 2, 3);
	        LocalDate newDate = date.plus(period);
	        System.out.println("Date before adding period: " + date);
	        System.out.println("Period: " + period);
	        System.out.println("Date after adding period: " + newDate);
	    }
	}


