package com.assigmentjava8;


	import java.time.Month;
	import java.time.ZonedDateTime;
	import java.time.format.TextStyle;
	import java.time.temporal.ChronoField;
	import java.time.temporal.TemporalQueries;
	import java.util.Locale;

	public class MonthMethodsExample {

	    public static void main(String[] args) {
	        MonthMethodsExample example = new MonthMethodsExample();
	        example.valuesMethod();

	        example.valueOfMethodExample();

	        example.rangeMethodExample();

	        example.queryMethodExample();

	        example.plusMethodExample();

	        example.ofMethodExample();

	        example.minusMethodExample();

	        example.minLengthMethodExample();

	        example.maxLengthMethodExample();

	        example.getValueMethodExample();

	        example.getLongMethodExample();

	        example.getDisplayNameMethodExample();

	        example.getMethodExample();

	        example.fromMethodExample();

	        example.firstMonthOfQuarterMethodExample();

	        example.firstDayOfYearMethodExample();

	    }

	    public void valuesMethod() {
	        for (Month month: Month.values()) {
	            System.out.println(month);
	        }
	    }

	    public void valueOfMethodExample() {
	        Month month = Month.valueOf("MARCH");
	        System.out.println(month);
	    }

	    public void rangeMethodExample() {
	        Month day = Month.of(2);
	        System.out.println("Range : " + day.range(ChronoField.MONTH_OF_YEAR));
	    }

	    public void queryMethodExample() {
	        Month month = Month.of(2);
	        System.out.printf("Month precision is %s%n", month.query(TemporalQueries.precision()));
	    }

	    public void plusMethodExample() {
	        Month month = Month.of(5);
	        System.out.println(month);
	        System.out.println(month.plus(1));
	    }

	    public void ofMethodExample() {
	        Month month = Month.of(3);
	        System.out.println(month);
	    }

	    public void minusMethodExample() {
	        Month month = Month.of(5);
	        System.out.println(month);
	        System.out.println(month.minus(1));
	    }

	    public void minLengthMethodExample() {
	        Month month = Month.FEBRUARY;
	        System.out.println(month.minLength());
	    }

	    public void maxLengthMethodExample() {
	        Month month = Month.FEBRUARY;
	        System.out.println(month.maxLength());
	    }

	    public void getValueMethodExample() {
	        Month month = Month.FEBRUARY;
	        System.out.println(month.getValue());
	    }

	    public void getLongMethodExample() {
	        Month day = Month.FEBRUARY;
	        System.out.println(day.getLong(ChronoField.MONTH_OF_YEAR));
	    }

	    public void getDisplayNameMethodExample() {
	        Month day = Month.of(3);
	        System.out.println(day.getDisplayName(TextStyle.SHORT, Locale.ENGLISH));
	    }

	    public void getMethodExample() {
	        Month day = Month.FEBRUARY;
	        System.out.println(day.get(ChronoField.MONTH_OF_YEAR));
	    }

	    public void fromMethodExample() {
	        Month day = Month.from(ZonedDateTime.now());
	        System.out.println(day);
	    }

	    public void firstMonthOfQuarterMethodExample() {
	        Month month = Month.of(3);
	        System.out.println(month.firstMonthOfQuarter());
	    }

	    public void firstDayOfYearMethodExample() {
	        Month month = Month.of(3);
	        System.out.println(month.firstDayOfYear(false));
	    }
	}

