
public class ESumOfSquares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 12345;
		int rem;
		int res = 1;
		while(num != 0) {
			rem = num % 10;
			num /= 10;
			res += (rem * 2);
		}
		System.out.println("Sum of squares of individual digits: " + res);
	}

}
