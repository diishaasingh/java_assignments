package lambdaExpressions;

@FunctionalInterface
interface Sum {
	int operation(int a, int b);

}

public class SumOfTwoIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum calculate = (a, b) -> a + b;
		int result = calculate.operation(10, 20);
		System.out.println(result);

	}

}
