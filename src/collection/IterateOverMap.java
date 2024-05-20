package collection;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class IterateOverMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> students = new HashMap<Integer, String>();

		students.put(16, "Arshdeep Kaur");

		students.put(24, "Arshdeep Singh");

		students.put(33, "Annena PV");

		students.put(4, "Emil Sunny");

		students.put(15, "Jerin");

		students.put(4, "Rajinder");

		students.put(24, "Arshpreet Singh");

		Set<Entry<Integer, String>> studentSet = students.entrySet();

		for (Entry s : studentSet) {
			if (s.getValue().equals("Jerin")) {
				System.out.println("Key :" + s.getKey() + " Value : " + s.getValue());
			}
		}
	}

}