package JavaDay2;

import java.util.ArrayList;
import java.util.List;

public class Q9MiddleElement {

	public static Integer lastEntry(List<Integer> l){
		return l.get(l.size() / 2);
	}
	
	public static <T> void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		
		for(int i = 0; i <= 50; i++) {
			l.add(i);
		}
		
		System.out.println("Middle element is: " + lastEntry(l));
	}
}
