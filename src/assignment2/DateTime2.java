package assignment2;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTime2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ZoneId id=ZoneId.of("Europe/London");
        
        //mthd1
        LocalDateTime lt=LocalDateTime.now(id);
        System.out.println(lt);
        
        //mthd2
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy, HH:mm:ss");
        //y should be kept in small because Y represents week based year
        String time=lt.format(formatter);
        System.out.println("London date-time: "+time);
        
	}

}
