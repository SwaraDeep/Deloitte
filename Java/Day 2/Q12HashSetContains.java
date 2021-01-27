package JavaDay2;

import java.util.HashSet;

public class Q12HashSetContains {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		hs.add(5);
		hs.add(6);
		
		int num = 3;
		
		System.out.println((hs.contains(num))?("Yes! The element " + num + " exists!"):("No! The element " + num + " does not exist!"));

	}

}
