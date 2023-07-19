package lambdaExpressions;

public class ConcatenateTwoStrings {

	public static void main(String[] args) {
		Concatenator concatenator = (str1, str2) -> str1 + str2;

		String str1 = "Hello, ";
		String str2 = "world!";

		String result = concatenator.concatenate(str1, str2);
		System.out.println("Concatenated string: " + result);
	}

	interface Concatenator {
		String concatenate(String str1, String str2);
	}
}
