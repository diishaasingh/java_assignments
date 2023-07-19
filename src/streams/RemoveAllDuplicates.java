package streams;

import java.util.Arrays;
import java.util.List;

public class RemoveAllDuplicates {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		int sumOfEvenNumbers = numbers.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();

		int sumOfOddNumbers = numbers.stream().filter(n -> n % 2 != 0).mapToInt(Integer::intValue).sum();

		System.out.println("Sum of Even Numbers: " + sumOfEvenNumbers);
		System.out.println("Sum of Odd Numbers: " + sumOfOddNumbers);
	}
}
