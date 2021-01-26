import java.time.*;
import java.time.format.DateTimeFormatter;


public class IDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "02/12/2000";
		
		str = str.replace("/", "-");
		
		DateTimeFormatter date = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate d = LocalDate.parse(str, date);
		
		System.out.println(d.toString() + " " + d.getDayOfWeek() + " is " + isLeapYear(d.getYear()));
	}
	
	public static String isLeapYear(int year) {
		if(year % 400 == 0) {
			return "a leap year";
		}else if(year % 4 == 0) {
			return "a leap year";
		}
		return "not a leap year";
	}

}
