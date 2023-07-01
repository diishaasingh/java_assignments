package assignment2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NumberOfLines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = "C:\\\\Users\\\\DishaSingh\\\\Documents\\\\File 2.txt";

		int num_chars = 0;
		int num_Lines = 0;
		int num_Words = 0;

		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line;
			while ((line = br.readLine()) != null) {
				num_Lines++;
				num_chars += line.length();
				String[] words = line.split("\\s+");// whitespaces ke baad split
				num_Words += words.length;

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Character count: " + num_chars);
		System.out.println("Word count: " + num_Words);
		System.out.println("Line count: " + num_Lines);

	}

}
