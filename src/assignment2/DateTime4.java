package assignment2;

import java.util.Scanner;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTime4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a date (format: dd-MM-yyyy): ");
		String input_date=sc.nextLine();
		DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(input_date, inputFormatter);
        
        DateTimeFormatter outputFormatter1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println("Date in MM/dd/yyyy format: " + date.format(outputFormatter1));
        
        DateTimeFormatter outputFormatter2 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        System.out.println("Date in dd-MMM-yyyy format: " + date.format(outputFormatter2));
        
        DateTimeFormatter outputFormatter3 = DateTimeFormatter.ofPattern("MMM dd, yyyy");
        System.out.println("Date in MMM dd, yyyy format: " + date.format(outputFormatter3));

	}

}
