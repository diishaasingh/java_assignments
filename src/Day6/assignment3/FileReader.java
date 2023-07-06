package Day6.assignment3;

import java.io.BufferedReader;
import java.time.LocalDate;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FileReader {
    public static void main(String[] args) {
        String filepath = "C:\\Users\\DishaSingh\\eclipse-workspace\\JAVA_Training\\src\\Day6\\assignment3\\data.csv"; 
        Set<Person> uniquePersons = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new java.io.FileReader(filepath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                if (data.length >= 4) {
                    String firstName = data[0];
                    String lastName = data[1];
                    String[] dateValues = data[2].split("/");
                    String lastValue = data[3];
                    
                    int year, month, dayOfMonth;
            		year = Integer.parseInt(dateValues[2]);
            		month = Integer.parseInt(dateValues[1]) ;
            		dayOfMonth = Integer.parseInt(dateValues[0]);
            		LocalDate d = LocalDate.of(year, month, dayOfMonth);

            		Person person = new Person(firstName, lastName, d);
            		Person p1= uniquePersons.get(person);
            		if(p1==null) {
                		uniquePersons.add(person);
                    }
            		if(uniquePersons.contains(person)) {
                    if (lastValue.contains("@")) {
                        person.setEmail(lastValue);
                    } else {
                        person.setPhone(lastValue);
                    }

                    uniquePersons.add(person);
                }}
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Printing unique persons
        for (Person person : uniquePersons) {
        	System.out.println(person.toString());
        }
    }
}

