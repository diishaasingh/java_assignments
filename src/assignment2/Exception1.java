package assignment2;
import java.util.*;

public class Exception1 {
	public static void checkEvenNumber(int n) throws Exception {
		if (n % 2 != 0) {
			throw new Exception("Odd number exception");
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
