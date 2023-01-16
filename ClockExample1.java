package com.assigmentjava8;


import java.time.Clock;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ClockExample1 {
    public static void main(String[] args) {
        // Get the current time using the system clock in the specified time-zone
        Clock clock = Clock.system(ZoneId.of("Europe/Paris"));
        // Convert the instant to a LocalDateTime object
        LocalDateTime dateTime = LocalDateTime.ofInstant(clock.instant(), ZoneId.of("Europe/Paris"));
        System.out.println("Current date and time in Paris: " + dateTime);
    }
}
