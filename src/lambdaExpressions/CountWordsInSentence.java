package lambdaExpressions;

import java.util.Arrays;

public class CountWordsInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sentence = "Disha is a Java Developer";

		int countWords = Arrays.stream(sentence.split(" ")).mapToInt(word -> 1).sum();

		System.out.println("count of words = " + countWords);
	}

}
