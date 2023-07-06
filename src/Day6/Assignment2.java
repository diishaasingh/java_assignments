package Day6;

import java.util.*;

public class Assignment2 {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(2);
		set.add(4);
		set.add(1);
		set.add(3);

		int setSize = set.size();
		System.out.println("the size of string set is " + setSize);

		Set<String> set2 = new HashSet<>();
		set2.add("one");
		set2.add("two");
		set2.add("three");
		set2.add("one");
		set2.add("two");
		System.out.println("the size of string set is: " + set2.size());

		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(2);
		list1.add(4);
		list1.add(1);
		list1.add(3);
		System.out.println("the size of integer list is " + list1.size());
		
		ArrayList<String> list2=new ArrayList<>();
		list2.add("one");
		list2.add("two");
		list2.add("three");
		list2.add("one");
		list2.add("two");
		System.out.println("the size of string list is: " + list2.size());


	}

}
