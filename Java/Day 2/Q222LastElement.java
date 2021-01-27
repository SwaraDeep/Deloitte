package JavaDay2;

import java.util.ArrayList;
import java.util.List;

public class Q222LastElement {

	public static <T> T lastEntry(List<T> l){
		return l.get(l.size() - 1);
	}
	
	public static <T> void main(String[] args) {
		List<Object> l = new ArrayList<>();
		l.add("weasc");
		l.add("qwert");
		l.add(new Q222LastElement());
		
		System.out.println(lastEntry(l));
	}
}
