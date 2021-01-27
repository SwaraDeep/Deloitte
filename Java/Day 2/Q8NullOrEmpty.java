package JavaDay2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Q8NullOrEmpty {

	public static void main(String[] args) {
		System.out.println(isNullOrEmpty(new Object()));
		System.out.println(isNullOrEmpty("testInput"));
		System.out.println(isNullOrEmpty(new ArrayList<>()));
		System.out.println(isNullOrEmpty(Arrays.asList(1,2)));
		System.out.println(isNullOrEmpty(""));
		
		try {
			System.out.println(stringToDate("22-01-1999", "dd-MM-yyyy"));
			LocalDateTime date = LocalDateTime.now();
			System.out.println(dateToString(date, "dd/MM/yz, E"));
		}catch(DateTimeException e) {
			System.out.println("Please check the format of date!");
		}
	}
	
	public static boolean isNullOrEmpty(Object o) {
		return o.toString().length() == 25 ? false : true;
	}
	
	public static <T> boolean isNullOrEmpty(List<?> t) {
		return t.isEmpty();
	}
	
	public static boolean isNullOrEmpty(String s) {
		return s.length() == 0 ? true : false;
	}
	
	public static String dateToString(LocalDateTime d, String format) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
		return d.format(formatter);
	}
	
	public static LocalDate stringToDate(String date, String format) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(format);
		return LocalDate.parse(date, dtf);
	}

}
