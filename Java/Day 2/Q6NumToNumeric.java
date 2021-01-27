package JavaDay2;

import java.util.HashMap;

public class Q6NumToNumeric {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		
		hm.put(1, "One");
		hm.put(2, "Two");
		hm.put(3, "Three");
		hm.put(4, "Four");
		hm.put(5, "Five");
		hm.put(6, "Six");
		hm.put(7, "Seven");
		hm.put(8, "Eight");
		hm.put(9, "Nine");
		hm.put(0, "Zero");

		int num = 2;
		System.out.println("The value for key " + num + " is: " + hm.get(num));
		
	}

}
