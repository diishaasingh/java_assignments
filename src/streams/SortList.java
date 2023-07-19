package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortList {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("apple", "banana", "orange", "kiwi");

		List<String> ascendingOrder = strings.stream().sorted().toList();

		List<String> descendingOrder = strings.stream().sorted(Comparator.reverseOrder()).toList();

		System.out.println("Ascending Order: " + ascendingOrder);
		System.out.println("Descending Order: " + descendingOrder);
	}
}
