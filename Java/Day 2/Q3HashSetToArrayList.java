package JavaDay2;

import java.util.ArrayList;
import java.util.HashSet;

public class Q3HashSetToArrayList {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("air");
		hs.add("water");
		hs.add("fire");
		hs.add("earth");
		hs.add("human");
		
		ArrayList<String> ar = new ArrayList<>(hs);
		System.out.println(ar.toString());

	}

}
