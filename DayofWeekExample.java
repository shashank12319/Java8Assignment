package com.assigmentjava8;


import java.time.*;  
import java.time.DayOfWeek;  
    
public class DayofWeekExample  
{  
    public static void main(String ar[])  
    {  
        LocalDate localDate = LocalDate.now();  
        DayOfWeek dayOfWeek = DayOfWeek.from(localDate);  
        System.out.println("Day of the Week on" + "  - " + dayOfWeek.name());  
        int val = dayOfWeek.getValue();  
        System.out.println("Int Value of " + dayOfWeek.name() + " - " + val);  
    }  
}  