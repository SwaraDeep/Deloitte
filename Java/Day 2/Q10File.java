package JavaDay2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Q10File {

	public static void main(String[] args) {
		try {
			String path = "C:\\Users\\nvenkataswaradeep\\Desktop\\file.txt";
			//String path = "file.txt";
			
			File file = new File(path);
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			long rows = file.length() / 20 * 2;
			
			ArrayList<String> l = new ArrayList<String>((int)rows);
			String s = br.readLine();
			while(s != null) {
				l.add(s);
				s = br.readLine();
			}
			
			for(String str: l) {
				System.out.println(str);
			}
			
			br.close();

		}catch(NullPointerException e) {
			System.out.println("File doesn't exist");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
