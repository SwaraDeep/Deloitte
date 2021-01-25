
public class GStringBuilder {

	public static void main(String[] args) {
		String str1 = "Hi!";
		String str2 = " Welcome to";
		String str3 = " Java World!";
		
		String res1 = new String(str1);
		res1 += str2;
		res1 += str3;
		
		StringBuffer sbuff = new StringBuffer(str1);
		sbuff.append(str2);
		sbuff.append(str3);
		
		StringBuilder sbuild = new StringBuilder(str1);
		sbuild.append(str2);
		sbuild.append(str3);
		
		System.out.println("String: " + res1);
		System.out.println("Stringbuffer: " + sbuff);
		System.out.println("Stringbuilder: " + sbuild);
	}

}
