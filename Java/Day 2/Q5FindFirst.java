package JavaDay2;

import java.util.ArrayList;
import java.util.List;

public class Q5FindFirst {

	public static <T> int findFirst(List<T> list, int begin, int end) {
		for(int i = begin; i != end; i++) {
			for(int j = begin; j != end; j++) {
				if(i != j) {
					if(gcd((Integer)list.get(i), (Integer)list.get(j))) {
						return (int) list.get(i);
					}
				}
			}
		}
		return -1;
	}
	
	public static boolean gcd(int i, int j) {
		for(int a = ((i<j) ? i : j); a >= 2; a--) {
			if(i % a == 0 && j % a == 0) {
				return true;
			}
		}
		return false;
	}
	
	public static <T> void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(6);
		list.add(2);
		list.add(3);
		list.add(9);
		list.add(12);
		
		int begin = 0;
		int end = list.size();
		
		System.out.println(findFirst(list, begin, end));

	}

}
