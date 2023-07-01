package assignment2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class MyName {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\DishaSingh\\Documents\\Disha.txt"));) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] name = line.split(" ");//s+ can be used to space split also
                System.out.println("First Name: " + name[0]);
                System.out.println("Last Name: " + name[1]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}