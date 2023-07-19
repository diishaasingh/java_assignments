package lambdaExpressions;

import java.util.ArrayList;
import java.util.List;

public class FilterEvenOddFromList {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(7);
		numbers.add(25);
		numbers.add(12);
		numbers.add(9);

		List<Integer> evenNumbers = numbers.stream().filter(number -> number % 2 == 0).toList();
		System.out.println("Even numbers: " + evenNumbers);

		List<Integer> oddNumbers = numbers.stream().filter(number -> number % 2 != 0).toList();
		System.out.println("Odd numbers: " + oddNumbers);

	}
}
