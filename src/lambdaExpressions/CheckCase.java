package lambdaExpressions;

import java.util.Arrays;
import java.util.List;

public class CheckCase {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("Banana", "ApPle", "KIWI", "MANGO", "Litchi");

		boolean allUppercase = strings.stream().allMatch(s -> s.equals(s.toUpperCase()));
		boolean allLowercase = strings.stream().allMatch(s -> s.equals(s.toLowerCase()));

		String caseType;
		if (allUppercase) {
			caseType = "All Uppercase";
		} else if (allLowercase) {
			caseType = "All Lowercase";
		} else {
			caseType = "Mixed Case";
		}

		System.out.println("Case Type: " + caseType);
	}
}
