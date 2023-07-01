package assignment2;

import java.util.*;

class DuplicateNumberException extends Exception {

	public DuplicateNumberException(String message) {
		super(message);
	}
}

public class DuplicateNumber {
	static List<Integer> readNumbersFromUser() {
		List<Integer> li = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of integers: ");
		int count = scanner.nextInt();

		System.out.println("Enter the integers:");
		for (int i = 0; i < count; i++) {
			int number = scanner.nextInt();
			li.add(number);
		}

		return li;
	}

	 static void checkDuplicates(List<Integer> li) throws DuplicateNumberException {
		Set<Integer> uniqueNumbers = new HashSet<>();
		Set<Integer> duplicates = new HashSet<>();

		for (int number : li) {
			if (!uniqueNumbers.add(number)) {
				duplicates.add(number);
			}
		}

		if (!duplicates.isEmpty()) {
			throw new DuplicateNumberException("Duplicate numbers found: " + duplicates);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li = readNumbersFromUser();
        try {
            checkDuplicates(li);
            System.out.println("No duplicates found.");
        } catch (DuplicateNumberException e) {
            System.out.println("Duplicates found: " + e.getMessage());
        }
	}

}
