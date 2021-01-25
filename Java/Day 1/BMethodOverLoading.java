
public class BMethodOverLoading {

	public static void main(String[] args) {
		int input1 = 121;
		int input2 = 100;
		String input3 = "Hello";
		
		add(input1, input2);
		add(input3, input2);
		add(input1, input3);
	}
	
	public static void add(int a, int b) {
		System.out.println("Sum is: " + (a + b));
	}
	
	public static void add(String a, int b) {
		System.out.println("Concatenation is: " + a + " " + b);
	}
	
	public static void add(int a, String b) {
		System.out.println("Concatenation is: " + a + " " + b);
	}
}
