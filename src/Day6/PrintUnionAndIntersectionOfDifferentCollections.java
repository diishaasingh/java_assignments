package Day6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class PrintUnionAndIntersectionOfDifferentCollections {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Set<Integer> set = new HashSet<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		set.add(1);
		set.add(4);
		set.add(5);
		set.add(6);

		Set<Integer> intersection = new HashSet<>();
		for (Integer i : list) {
			if (set.contains(i)) {
				intersection.add(i);
			}
		}
		System.out.println("Intersection: " + intersection);

		Set<Integer> union = new HashSet<>();
		for (Integer i : list) {
			union.add(i);
		}
		for (Integer i : set) {
			set.add(i);
		}
		System.out.println("Union: " + union);

		// can be done using collections also
		// Set me list pass krdo then usme .retainAll(set) krdo
		// similarly addAll bhi kr skte h

	}

}
