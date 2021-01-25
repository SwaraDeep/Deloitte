
public class HStringDuplicate {

	public static void main(String[] args) {
		String str = "I can can I do this Do do this do do this  this ";
		String res = "";
		String split[] = str.split(" ");
		
		for(int i = 0; i < split.length; i++) {
			if(!res.contains(split[i].toLowerCase())) {
				res += split[i].toLowerCase() + " ";
			}
		}
		
		System.out.println("Result: " + res);
	}

}
