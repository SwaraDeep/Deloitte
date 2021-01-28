import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class Q6CopyContent {

	public static void main(String[] args) {
		
		String path1 = "C:\\Users\\nvenkataswaradeep\\Desktop\\file.txt";
		String path2 = "C:\\Users\\nvenkataswaradeep\\Desktop\\file2.txt";
		
		try {
			FileReader file1 = new FileReader(path1);
			FileOutputStream fout2 = new FileOutputStream(path2);
			
			int b;
			while((b = file1.read()) != -1) {
				fout2.write(b);
			}
			
			file1.close();
			fout2.close();
			
			File file = new File(path1);
			file.delete();
			
			System.out.println("Completed!");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
