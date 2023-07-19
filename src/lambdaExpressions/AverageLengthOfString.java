package lambdaExpressions;

import java.util.Arrays;
import java.util.List;

public class AverageLengthOfString {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("apple", "banana", "orange", "kiwi");

		double averageLength = strings.stream().mapToInt(String::length).average().orElse(0);

		System.out.println("Average Length: " + averageLength);
	}
}
