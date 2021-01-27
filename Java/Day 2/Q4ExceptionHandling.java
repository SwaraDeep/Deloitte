package JavaDay2;

public class Q4ExceptionHandling {

	public static void main(String[] args) {
		int a = 0;
		int b = 100;
		
		try {
			int c = b / a;
			System.out.println("C: " + c);
		}catch(ArithmeticException e){
			System.out.println("Error occured: Do not divide with zero!");
		}catch(Exception e) {
			System.out.println("Some error occured: ");
			e.printStackTrace();
		}

	}

}
