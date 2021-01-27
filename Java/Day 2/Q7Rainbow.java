package JavaDay2;

import java.util.Iterator;
import java.util.TreeSet;

public class Q7Rainbow {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("blue");
		ts.add("green");
		ts.add("indigo");
		ts.add("orange");
		ts.add("red");
		ts.add("yellow");
		ts.add("violet");
		
		Iterator<String> itr = ts.descendingIterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
