package assignment2;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class FirstAndLastDayOfMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date=LocalDate.now();
		
		LocalDate firstDay=date.with(TemporalAdjusters.firstDayOfMonth());
		LocalDate lastDay=date.with(TemporalAdjusters.lastDayOfMonth());
		
		System.out.println("First day of the month: " + firstDay);
        System.out.println("Last day of the month: " + lastDay);

	}

}
