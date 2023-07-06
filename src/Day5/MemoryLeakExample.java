package Day5;

import java.util.*;

public class MemoryLeakExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> li = new ArrayList<>();
	while(true) {
			li.add(1);
	}

//		int n = 1000000;
//
//		for (int i = 0; i < n; i++) {
//			li.add(1);
//		}
//
//		li = null;

	}

}
