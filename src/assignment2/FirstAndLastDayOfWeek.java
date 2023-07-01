package assignment2;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

class FirstAndLastDayOfWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date = LocalDate.now();

		LocalDate firstDay = date.with(TemporalAdjusters.previousOrSame(java.time.DayOfWeek.MONDAY));
		LocalDate lastDay= date.with(TemporalAdjusters.nextOrSame(java.time.DayOfWeek.SUNDAY));

		System.out.println("First day of the week: " + firstDay);
		System.out.println("Last day of the week: " + lastDay);
	}

}
