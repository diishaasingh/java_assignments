package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertToUpperCaseOrLowerCase {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("apple", "banana", "orange", "kiwi");

		List<String> uppercaseList = strings.stream().map(String::toUpperCase).collect(Collectors.toList());

		List<String> lowercaseList = strings.stream().map(String::toLowerCase).collect(Collectors.toList());

		System.out.println("Uppercase List: " + uppercaseList);
		System.out.println("Lowercase List: " + lowercaseList);
	}
}
