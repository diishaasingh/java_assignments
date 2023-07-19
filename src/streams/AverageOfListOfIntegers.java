package streams;

import java.util.Arrays;
import java.util.List;

public class AverageOfListOfIntegers {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25);

		double average = numbers.stream().mapToInt(Integer::intValue).average().orElse(0);

		System.out.println("Average: " + average);
	}
}
