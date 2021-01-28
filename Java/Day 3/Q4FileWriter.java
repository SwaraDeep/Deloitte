import java.io.FileWriter;
import java.io.IOException;

public class Q4FileWriter {

	public static void main(String[] args) {

		String path = "C:\\Users\\nvenkataswaradeep\\Desktop\\file.txt";
		String s1 = "abc\n";
		String s2 = "def\n";
		String s3 = "ghi\n";
		try {
			
			FileWriter fw = new FileWriter(path);
			
			fw.append(s1);
			fw.append(s2);
			fw.append(s3);
			
			System.out.println("Write completed!");
			
			fw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
}
