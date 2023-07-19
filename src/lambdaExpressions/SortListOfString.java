package lambdaExpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = new ArrayList<>();
		names.add("Alice");
		names.add("Charlie");
		names.add("Bob");
		names.add("John");
		names.add("Ben");

		Collections.sort(names, (str1, str2) -> str1.compareTo(str2));
		System.out.println("sorted name : " + names);

	}

}
