package Day6;

//Create an ArrayList of Integers, fill with a different random values from 1-100. Display those values on the screen, then prompt the user for an integer. Search through the ArrayList, and if the item is present, give the slot number(s) where it is located. 
import java.util.*;

public class Assignment1 {

	public static void main(String[] args) {
		ArrayList<Integer> li = new ArrayList<>();
		Random r = new Random();

		for (int i = 0; i < 10; i++) {
			int random = r.nextInt(100) + 1;
			li.add(random);
		}
		System.out.println(li);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. to be checked");
		int n = sc.nextInt();

		int index = li.indexOf(n);
		if (index != -1) {
			System.out.println(n + " is present at index " + index + " in the arraylist");
		} else {
			System.out.println(n + " is not present in the arraylist");
		}

	}

}
