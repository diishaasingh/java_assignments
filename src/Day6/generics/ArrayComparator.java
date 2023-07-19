package Day6.generics;

public class ArrayComparator {
	public static <T> boolean compareArrays(T[] array1, T[] array2) {
		if (array1.length != array2.length) {
			return false;
		}

		for (int i = 0; i < array1.length; i++) {
			if (!array1[i].equals(array2[i])) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		Integer[] array1 = { 1, 2, 3 };
		Integer[] array2 = { 1, 2, 3 };
		Integer[] array3 = { 1, 2, 4 };

		boolean result1 = ArrayComparator.compareArrays(array1, array2);
		System.out.println("Arrays 1 and 2 are the same: " + result1);
		boolean result2 = ArrayComparator.compareArrays(array1, array3);
		System.out.println("Arrays 1 and 3 are the same: " + result2);
	}
}
