package assignment2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
//Java NIO (New I/O) API, introduced in Java 7, which provides an improved and more flexible way of performing I/O operations compared to the traditional java.io package.

public class CopyFileUsingUtility {
	public static void main(String[] args) {
		Path sourcePath = Path.of("C:\\Users\\DishaSingh\\Documents\\File.txt");
		Path targetPath = Path.of("C:\\\\Users\\\\DishaSingh\\\\Documents\\\\File 2.txt");

		try {
			Files.copy(sourcePath, targetPath, StandardCopyOption.REPLACE_EXISTING);
			System.out.println("File copied successfully.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
