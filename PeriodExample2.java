package com.assigmentjava8;


	import java.time.LocalDate;
	import java.time.Period;

	public class PeriodExample2 {
	    public static void main(String[] args) {
	        LocalDate date = LocalDate.now();
	        Period period = Period.of(1, 2, 3);
	        LocalDate newDate = date.minus(period);
	        System.out.println("Date before subtracting period: " + date);
	        System.out.println("Period: " + period);
	        System.out.println("Date after subtracting period: " + newDate);
	    }
	}


