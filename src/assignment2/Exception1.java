package assignment2;
import java.util.*;

public class Exception1 extends Exception {
	public Exception1(String message) {
        super(message);
    }
	public static void checkEvenNumber(int n) throws Exception1 {
		if (n % 2 != 0) {
			throw new Exception1("Odd number exception");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. to be tested: ");
		int n = sc.nextInt();
		try {
			checkEvenNumber(n);
			System.out.println("Number is even");
		} catch (Exception e) {
			System.out.println("Caught exception: " + e.getMessage());

		}

	}

}
