import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Q3FileOutputStream {

	public static void main(String[] args) {
		String s1 = "first input\n";
		String s2 = "second string\n";
		String s3 = "third line\n";
		
		try {
			String path = "C:\\Users\\nvenkataswaradeep\\Desktop\\file.txt";
			FileOutputStream fout = new FileOutputStream(path);
			OutputStreamWriter osw = new OutputStreamWriter(fout);
		
			osw.append(s1);
			osw.append(s2);
			osw.append(s3);

			System.out.println("Write completed!");
			
			osw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
