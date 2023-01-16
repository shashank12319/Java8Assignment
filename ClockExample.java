package com.assigmentjava8;


import java.time.Clock;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ClockExample {
    public static void main(String[] args) {
        // Get the current time using the system clock in the default time-zone
        Clock clock = Clock.systemDefaultZone();
        // Convert the instant to a LocalDateTime object
        LocalDateTime dateTime = LocalDateTime.ofInstant(clock.instant(), ZoneId.systemDefault());
        System.out.println("Current date and time: " + dateTime);
        System.out.println("Local date and Time  "  + LocalDateTime.now());
    }
}
