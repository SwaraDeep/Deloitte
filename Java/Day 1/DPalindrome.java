
public class DPalindrome {

	public static void main(String[] args) {
		String str = "malayalam";
		String rev = "";
		char a[] = str.toCharArray();
		
		for(int i = a.length-1; i >= 0; i--) {
			rev += a[i];
		}
		if(rev.compareToIgnoreCase(str) == 0) {
			System.out.println("Palindrome!");
		}else {
			System.out.println("Not a palindrome!");
		}
	}
}
