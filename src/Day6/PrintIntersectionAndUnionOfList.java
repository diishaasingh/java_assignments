package Day6;

import java.util.ArrayList;

public class PrintIntersectionAndUnionOfList {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();

		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(2);


		list2.add(2);
		list2.add(2);
		list2.add(3);
		list2.add(4);

		// creating a new ArrayList for storing intersection of list1 and list2
		ArrayList<Integer> intersection = new ArrayList<>(list1);
		intersection.retainAll(list2);
		// creating a new ArrayList for storing union of list1 and list2
		ArrayList<Integer> union = new ArrayList<>(list1);
		union.addAll(list2);
		System.out.println("list1: "+list1);
		System.out.println("list2: "+list2);

		System.out.println("Intersection: " + intersection);
		System.out.println("Union " + union);

	}

}
