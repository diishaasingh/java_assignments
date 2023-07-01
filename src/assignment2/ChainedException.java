package assignment2;

public class ChainedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[] numbers = new int[5];
			int divisor = 0;
			for (int i = 0; i < numbers.length; i++) {
				int result = numbers[i] / divisor;
				System.out.println(result);
			}
		} catch (ArithmeticException e) {
			throw new RuntimeException("Error: division by zero", e);
		}
	}

}
//public class ChainedExceptionExample {
//    public static void main(String[] args) {
//        try {
//            performOperation();
//        } catch (Exception e) {
//            System.out.println("Exception occurred: " + e.getMessage());
//            System.out.println("Cause: " + e.getCause());
//        }
//    }
//
//    public static void performOperation() throws Exception {
//        try {
//            divideNumbers(10, 0);
//        } catch (ArithmeticException e) {
//            throw new Exception("Error performing division", e);
//        }
//    }
//
//    public static void divideNumbers(int num1, int num2) {
//        if (num2 == 0) {
//            throw new ArithmeticException("Cannot divide by zero");
//        }
//        int result = num1 / num2;
//        System.out.println("Result: " + result);
//    }
//}
