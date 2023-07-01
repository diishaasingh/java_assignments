package assignment2;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\DishaSingh\\Documents\\File.txt";
        //String filePath ="";
        try (FileReader fr = new FileReader(filePath)) {
            int data;

            while ((data = fr.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
