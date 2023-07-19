package lambdaExpressions;

import java.util.ArrayList;
import java.util.List;

public class AverageOfListOfDoubles {
	public static void main(String[] args) {
		List<Double> numbers = new ArrayList<>();
		numbers.add(5.5);
		numbers.add(2.8);
		numbers.add(7.3);
		numbers.add(4.1);
		numbers.add(6.9);

		double average = numbers.stream().mapToDouble(Double::doubleValue)// this line maps Double to its corresponding
																			// primitive value
				.average().orElse(0.0);

		System.out.println("Average: " + average);
	}
}
