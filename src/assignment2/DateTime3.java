package assignment2;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class DateTime3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZoneId id=ZoneId.of("America/New_York");
		LocalDateTime newyork_time=LocalDateTime.now(id);
		
		LocalDateTime current_location=LocalDateTime.now();
		
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy, HH:mm:ss");
        
		String nyTime=newyork_time.format(formatter);
		System.out.println("Date and time at New York: "+nyTime);
		
		String currTime=current_location.format(formatter);
		System.out.println("Date and Time at current location: "+currTime);
		
		//checking which one is ahead 
		
	}

}
