import java.io.FileReader;
import java.io.IOException;

public class Q2FileReader {

	public static void main(String[] args) {

		try {
			String path = "C:\\Users\\nvenkataswaradeep\\Desktop\\file.txt";
			FileReader fin = new FileReader(path);
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
