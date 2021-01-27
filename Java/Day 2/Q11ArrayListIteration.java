package JavaDay2;

import java.util.ArrayList;
import java.util.Iterator;

public class Q11ArrayListIteration {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		
		System.out.println("Printed using for each or advanced for loop:");
		for(Integer i: al)
			System.out.println(i);
		
		System.out.println("Printed using iterator:");
		Iterator<Integer> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		int search = 4;
		
		System.out.println(al.contains(search)?(search + " Found!"):(search + " Not Found!"));
		
	}

}
