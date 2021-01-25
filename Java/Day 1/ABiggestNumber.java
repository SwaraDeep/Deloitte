import java.util.Scanner;

public class ABiggestNumber {

	public static void main(String[] args) {
		int num[] = new int[3];
		int max;
		
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {
			System.out.println("Enter a number: ");
			num[i] = s.nextInt();
		}
		
		max = num[0];
		for(int i = 1; i < 3; i++) {
			if(max < num[i]) {
				max = num[i];
			}
		}
		
		System.out.println("Max number is: " + max);
		s.close();
	}

}
