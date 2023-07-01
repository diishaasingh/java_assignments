package assignment2;

import java.time.Duration;
import java.time.Instant;
public class DateTime6 {

	static void print() {
		System.out.println("hello Caizin");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instant start=Instant.now();
		try {
           print();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        Instant end = Instant.now();
        Duration elapsedTime = Duration.between(start, end);
        
        System.out.println("Elapsed time: " + elapsedTime.toMillis() + " ms");
		

	}

}
