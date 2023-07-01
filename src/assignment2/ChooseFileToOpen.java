package assignment2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ChooseFileToOpen {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	String fileName = scanner.nextLine();
        try (
             BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\DishaSingh\\Documents\\"+fileName))) {
            System.out.print("Enter the file name: ");
            
            
            try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
                String line = fileReader.readLine();
                String[] numbers = line.split("\\s+");
                
                int total = 0;
                for (String number : numbers) {
                    total += Integer.parseInt(number);
                }
                
                System.out.println("File Contents: " + line);
                System.out.println("Total: " + total);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
