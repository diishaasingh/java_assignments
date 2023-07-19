package lambdaExpressions;

import java.util.Arrays;
import java.util.List;

public class LongestAndSmallestStringInList {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("apple", "banana", "orange", "kiwi");

		String longestString = strings.stream().max((s1, s2) -> Integer.compare(s1.length(), s2.length())).orElse("");

		String shortestString = strings.stream().min((s1, s2) -> Integer.compare(s1.length(), s2.length())).orElse("");

		int longestLength = longestString.length();
		int shortestLength = shortestString.length();

		System.out.println("Longest string length: " + longestLength);
		System.out.println("Shortest string length: " + shortestLength);
	}
}
