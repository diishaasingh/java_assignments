package assignment1;

//1. Write a program that creates an array which can hold ten values. Fill the array with random numbers from 1 to 100. Display the values in the array on the screen. Then use a linear search to find the largest value in the array, and display that value. 
import java.util.Random;

public class Array1 {
	public static void main(String[] args) {
		int[] array = new int[10];
		Random random = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(100) + 1;
		}

		System.out.println("Array values:");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();

		// Linear search to find the largest value
		int largest = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > largest) {
				largest = array[i];
			}
		}

		// Display the largest value
		System.out.println("Largest value: " + largest);

	}
}