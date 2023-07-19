package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxAndMinInList {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(5, 10, 3, 8, 1, 12, 6);

		Optional<Integer> maxNumber = numbers.stream().max(Integer::compare);

		Optional<Integer> minNumber = numbers.stream().min(Integer::compare);

		System.out.println("Maximum Number: " + maxNumber.orElse(null));
		System.out.println("Minimum Number: " + minNumber.orElse(null));
	}
}
