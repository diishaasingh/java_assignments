package assignment2;

import java.time.*;
import java.time.temporal.WeekFields;

public class DateTime5 {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		int minYear = today.getYear();
		int maxYear = today.getYear();
		
		int minMonth = today.getMonthValue();
		int maxMonth = today.getMonthValue();
		
		int minWeek = today.get(WeekFields.ISO.weekOfYear());
		int maxWeek = today.get(WeekFields.ISO.weekOfYear());
		
		int minDate = today.getDayOfMonth();
		int maxDate = today.getDayOfMonth();
		
		System.out.println("The minimum year is " + minYear);
		System.out.println("The maximum year is " + maxYear);
		System.out.println("The minimum month is " + minMonth);
		System.out.println("The maximum month is " + maxMonth);
		System.out.println("The minimum week is " + minWeek);
		System.out.println("The maximum week is " + maxWeek);
		System.out.println("The minimum date is " + minDate);
		System.out.println("The maximum date is " + maxDate);
	}
}