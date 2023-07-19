package streams;

import java.util.Arrays;
import java.util.List;

public class CountTheNumberOfStrings {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("apple", "banana", "orange", "kiwi");

		char specificLetter = 'a';
		long count = strings.stream().filter(s -> s.startsWith(String.valueOf(specificLetter))).count();

		System.out.println("Number of strings starting with '" + specificLetter + "': " + count);
	}
}
