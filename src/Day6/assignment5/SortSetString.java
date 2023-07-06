package Day6.assignment5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class SortSetString {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("Disha");
		set.add("Ayush");
		set.add("Pranjal");
		set.add("Ankit");
		set.add("Shivakshi");
		set.add("John");
		set.add("Mary");
		set.add("Emily");
		set.add("Paul");
		set.add("Adam");
		set.add("Eve");
		set.add("Smith");
		set.add("Charles");
		System.out.println(set);

//		for(String name: set){
//			System.out.println(name);
//		}
		System.out.println();
		System.out.println("list after sorting");
		ArrayList<String> list = new ArrayList<>(set);
//		for(String name: list){
//			System.out.println(name);
//		}
		System.out.println(list);

		System.out.println();
		System.out.println("list after sorting");
		Collections.sort(list);
//		for(String name: list){
//			System.out.println(name);
//		}
		System.out.println(list);
	}

}
