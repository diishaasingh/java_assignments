package assignment2;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class DurationPeriod {
    public static void main(String[] args) {
        Duration fivehrs = Duration.ofHours(5);
        LocalDateTime after_fivehrs = LocalDateTime.now().plus(fivehrs);
        System.out.println("After five hours " + after_fivehrs);
        
        Period twoMonthsFiveDays = Period.ofMonths(2).plusDays(5);
        LocalDate twoMonthsFiveDaysLater = LocalDate.now().plus(twoMonthsFiveDays);
        System.out.println("Two months and five days from now: " + twoMonthsFiveDaysLater);
    }
}