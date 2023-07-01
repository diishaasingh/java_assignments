package assignment2;

import java.io.*;

public class TryWithResources {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (

		FileOutputStream fos = new FileOutputStream("C:\\Users\\DishaSingh\\Documents\\File.txt")) {

			String text = "Hello World. This is my java program";

			byte arr[] = text.getBytes();
			fos.write(arr);
		}
		catch (Exception e) {

			System.out.println(e);
		}

	}

}
