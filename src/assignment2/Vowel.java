package assignment2;

class NoVowelsException extends Exception {
	public NoVowelsException(String message) {
		super(message);
	}
}

public class Vowel {
	public static void checkVowel(String str) throws NoVowelsException {
		boolean foundVowel = false;
		for (char c : str.toCharArray()) {
			if (isVowel(c)) {
				foundVowel = true;
				break;
			}
		}

		if (!foundVowel) {
			throw new NoVowelsException("String does not contain any vowels.");
		}
	}

	public static boolean isVowel(char c) {
		c = Character.toLowerCase(c);
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I am a Java Developer";
		try {
			checkVowel(str);
			System.out.println("String contains vowel");
		} catch (NoVowelsException e) {
			System.out.println("String does not contain any vowel");
		}

	}

}
