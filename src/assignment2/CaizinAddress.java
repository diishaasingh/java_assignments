package assignment2;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class CaizinAddress {
    public static void main(String[] args) {
        try {
            URL caizinURL = new URL("https://caizin.com/contact-us/");
            Scanner scanner = new Scanner(caizinURL.openStream());
            
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.contains("Caizin's office address")) {
                    System.out.println(line);
                    break;
                }
            }
            
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
