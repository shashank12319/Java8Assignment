package com.assigmentjava8;


import java.time.LocalDate;
import java.time.Year;

public class YearDate {
    public static void main(String[] args) {
        Year year = Year.now();
        LocalDate date = year.atDay(59);
        System.out.println("59th day of " + year + " is: " + date);
    }
}