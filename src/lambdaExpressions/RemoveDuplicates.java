package lambdaExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(2);
		numbers.add(5);

		List<Integer> distinctNumbers = numbers.stream().distinct().collect(Collectors.toList());

		System.out.println("Distinct numbers: " + distinctNumbers);
	}
}
