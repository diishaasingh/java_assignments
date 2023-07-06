package assignment2;

import java.time.Duration;
import java.time.LocalTime;
import java.time.*;

public class DateTime3 {
    public static void main(String[] args) {
        ZoneId id = ZoneId.of("America/New_York");
        LocalTime newYorkTime = LocalTime.now(id);
        
        System.out.println("Current time in New York: " + newYorkTime);
        
        
        LocalTime localTime = LocalTime.now();
        
        Duration timeDifference = Duration.between(newYorkTime, localTime);
        System.out.println("Time difference between New York and local time: " + timeDifference.toHours());
        
        //using offset example in this 
        
        ZoneOffset zoneOffset = ZoneOffset.of("+02:00");
        OffsetDateTime offsetDateTime = OffsetDateTime.now(zoneOffset);
        System.out.println("Current date and time with offset +02:00: " + offsetDateTime);
    }




    }
