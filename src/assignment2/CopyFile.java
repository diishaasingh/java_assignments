package assignment2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) {
		// mthd1
		try (FileInputStream fis = new FileInputStream("C:\\Users\\DishaSingh\\Documents\\File.txt");
				FileOutputStream fos = new FileOutputStream("C:\\Users\\DishaSingh\\Documents\\File 2.txt")) {
			int data;
			while ((data = fis.read()) != -1) {
				fos.write(data);
			}
			System.out.println("File copied successfully");
		} catch (IOException e) {
			e.printStackTrace();
		}
		// mthd2
		// utility method in java for copying the contents of one file in another file

	}

}
