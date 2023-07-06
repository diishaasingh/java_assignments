package assignment2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class SingleCatch {
	public static void main(String[] args) {
		try {
			int result = 10 / 0;
			System.out.println("Result: " + result);
			throw new FileNotFoundException();
		} catch (FileNotFoundException | ArrayIndexOutOfBoundsException e) {
			if (e instanceof SQLException) {
				System.out.println("IOException occurred: " + e.getMessage());
			} else if (e instanceof ArithmeticException) {
				System.out.println("ArithmeticException occurred: " + e.getMessage());
			} else {
				System.out.println("Some other exception occurred: " + e.getMessage());
			}
		}
	}

}
