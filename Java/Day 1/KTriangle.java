
public class KTriangle {

	public static void main(String[] args) {

		int num = 5;
		
		for(int i = 1; i <= num; i++) {
			for(int j = num; j >= i; j--) {
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
