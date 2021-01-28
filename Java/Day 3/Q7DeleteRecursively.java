import java.io.File;

public class Q7DeleteRecursively {

	public static void main(String[] args) {
		String path = "C:\\Users\\nvenkataswaradeep\\Desktop\\folder_name";
		deleteFile(path);
		System.out.println("Completed......");
	}
	
	public static void deleteFile(String path) {
		File f = new File(path);
		
		if(f.list() != null) {
			for(String sub: f.list())
				deleteFile(path + "\\" + sub);
			if(f.delete()) {
				System.out.println("Deleted Folder: " + path);
			}else {
				System.out.println("Folder Deletion Failed: " + path);
			}
		}
		
		if(f.isFile()) {
			if(f.delete()) {
				System.out.println("Deleted file: " + path);
			}else {
				System.out.println("File Deletion Failed: " + path);
			}
		}
	}
}
