package lambdaExpressions;

import java.util.ArrayList;
import java.util.List;

public class MinimumAndMaximumOfList {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(5);
		numbers.add(2);
		numbers.add(7);
		numbers.add(9);
		numbers.add(3);

		Integer max = numbers.stream().max(Integer::compareTo).orElse(null);

		System.out.println("Maximum value: " + max);

		Integer min = numbers.stream().min(Integer::compareTo).orElse(null);

		System.out.println("Minimum value: " + min);
	}
}
