package JavaDay2;

import java.util.ArrayList;

public class Q2EliminateEven {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		ArrayList<String> rm = new ArrayList<String>();
		al.add("one");
		al.add("even");
		al.add("odd");
		al.add("four");
		al.add("eight");
		al.add("twelve");
		
		for(String str: al) {
			if(str.length() % 2 == 0) {
				rm.add(str);
			}
		}

		System.out.println("Initial list: " + al.toString());
		
		al.removeAll(rm);
		
		System.out.println("Remaining list: " + al.toString());
	}

}
