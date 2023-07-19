package assignment1;

import java.util.*;

public class Array4 {
	public static void main(String[] args) {
		String[] lastNames = { "Mitchell", "Ortiz", "Luu", "Zimmerman", "Brooks" };
		double[] gradeAverages = { 99.5, 78.5, 95.6, 96.8, 82.7 };
		int[] studentIDs = { 123456, 813225, 823669, 307760, 827131 };

		System.out.println("Values:");
		for (int i = 0; i < lastNames.length; i++) {
			System.out.println(lastNames[i] + " " + gradeAverages[i] + " " + studentIDs[i]);
		}

		Scanner scanner = new Scanner(System.in);
		System.out.print("ID number to find: ");
		int targetID = scanner.nextInt();

		int targetIndex = -1;
		for (int i = 0; i < studentIDs.length; i++) {
			if (studentIDs[i] == targetID) {
				targetIndex = i;
				break;
			}
		}

		if (targetIndex != -1) {
			System.out.println("Found in slot " + targetIndex);
			System.out.println("Name: " + lastNames[targetIndex]);
			System.out.println("Average: " + gradeAverages[targetIndex]);
			System.out.println("ID: " + studentIDs[targetIndex]);
		} else {
			System.out.println("ID number not found.");
		}
	}
}