package assignment2;

public class ChainedException {
	public static void main(String[] args) {
		try {
			performOperation();
		} catch (Exception e) {
			System.out.println("Exception occurred: " + e.getMessage());
			System.out.println("Cause: " + e.getCause());
		}
	}

	public static void performOperation() throws Exception {
		try {
			divideNumbers(10, 0);
		} catch (ArithmeticException e) {
			throw new Exception("Error performing division", e);
		}
	}

	public static void divideNumbers(int num1, int num2) {
		if (num2 == 0) {
			throw new ArithmeticException("Cannot divide by zero");
		}
		int result = num1 / num2;
		System.out.println("Result: " + result);
	}
}
