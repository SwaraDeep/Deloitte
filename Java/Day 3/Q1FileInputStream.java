import java.io.FileInputStream;
import java.io.IOException;

public class Q1FileInputStream {

	public static void main(String[] args) {
		try {
			String path = "C:\\Users\\nvenkataswaradeep\\Desktop\\file.txt";
			FileInputStream fin = new FileInputStream(path);
			int b;
			
			while((b = fin.read()) != -1) {
				System.out.print((char)b);
			}
			fin.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
