package lambdaExpressions;

import java.util.ArrayList;
import java.util.List;

public class MultiplyAndSumOfList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = new ArrayList<>();
		numbers.add(5);
		numbers.add(2);
		numbers.add(7);
		numbers.add(9);
		numbers.add(3);

		int product = numbers.stream().reduce(1, (a, b) -> a * b);
		int sum = numbers.stream().reduce(0, (a, b) -> a + b);

		System.out.println("Product: " + product);
		System.out.println("Sum: " + sum);
	}
}
