package lambdaExpressions;

import java.util.function.Function;

public class IntegerToBinary {
	public static void main(String[] args) {
		Function<Integer, String> toBinary = number -> Integer.toBinaryString(number);

		int number = 20;
		String binary = toBinary.apply(number);
		// the apply method is used to apply the lambda expression to the number
		System.out.println("Binary representation of " + number + ": " + binary);
	}
}
