
public class FFibanocci {

	public static void main(String[] args) {
		int num = 10;
		int first = 0;
		int next = 1;
		
		for(int i = 1; i <= num; i++) {
			System.out.print(next + "  ");
			int temp = next;
			next += first;
			first = temp;
		}

	}

}