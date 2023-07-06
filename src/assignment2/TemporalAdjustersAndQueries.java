package assignment2;

import java.time.*;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersAndQueries {
	public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now();

		LocalDate secondMondayOfMonth = currentDate.with(TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.MONDAY));
		System.out.println("First Monday of the Month: " + secondMondayOfMonth);

		boolean isLeapYear = currentDate.isLeapYear();
		System.out.println("Is the current year a leap year? " + isLeapYear);
	}
}
