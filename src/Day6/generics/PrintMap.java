package Day6.generics;

import java.util.HashMap;
import java.util.Map;

public class PrintMap {

	static <K, V> void mapPrinter(Map<K, V> map) {
		for (Map.Entry<K, V> entry : map.entrySet()) {
			K key = entry.getKey();
			V value = entry.getValue();
			System.out.println(key + " : " + value);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> studentMap = new HashMap<>();
		studentMap.put(1, "John");
		studentMap.put(2, "Emily");
		studentMap.put(3, "Jack");
		studentMap.put(4, "Doe");

		mapPrinter(studentMap);

	}

}
