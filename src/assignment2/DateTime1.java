//Java LocalDateTime class is an immutable date-time object that represents a date-time, with the 
//default format as yyyy-MM-dd-HH-mm-ss.zzz. It inherits object class and implements the ChronoLocalDateTime interface.
package assignment2;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime1 {

	// methods to change the date and time into different formats
	public static String formatDateTime(LocalDateTime dateTime, String formatPattern) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formatPattern);
		return dateTime.format(formatter);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime date_time=LocalDateTime.now();
		
		System.out.println("Default format: "+date_time);
		System.out.println("Date and time: "+formatDateTime(date_time,"yyyy-MM-dd HH:mm:ss"));
		System.out.println("Formatted date: " + formatDateTime(date_time, "MMMM dd, yyyy"));
        System.out.println("Formatted time: " + formatDateTime(date_time, "hh:mm:ss a"));

	}

}
