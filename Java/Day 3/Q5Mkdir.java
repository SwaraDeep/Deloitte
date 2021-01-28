import java.io.File;

public class Q5Mkdir {

	public static void main(String[] args) {
		String path = "C:\\Users\\nvenkataswaradeep\\Desktop\\folder_just_created";
		
		File file = new File(path);
		
		System.out.println(file.mkdir());
	}
}
