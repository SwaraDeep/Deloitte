/*
 * contains a bug
 * when number contains one or multiple zeros,
 * it's not working and needs to be fixed
 */

public class JNumericNumbers {

	public static void main(String[] args) {
		int num = 912111;
		int digit[] = {-1, -1, -1, -1, -1, -1};
		int temp = num;
		String res = "";
		int count= 0;
		
		//seperate each digit and store in temporary digit array
		//will be stored in reverse order
		//used to count number of digits for taking fixed size array
		for(int i = 0; temp != 0; i++) {
			digit[i] = temp % 10;
			temp /= 10;
			count++;
		}
		
		//create fixed size array
		int digits[] = new int[count];
		for(int i = 0, j = count-1; i < count; i++, j--) {
			if(digit[j] != -1) {
				digits[i] = digit[j];
			}
		}
		
		count = digits.length;
		System.out.println("Count: " + count);
		for(int i = 0; i < digits.length; i++) {
			if(count == 6 && digits[i] != 0) {
				if(digits[i] == 1) {
					res = "one lakh";
				}else {
					res += getNumeric(digits[i]) + " lakhs ";
				}
				count--;
			}else if(count == 5 && digits[i] != 0) {
				res += getNumeric(digits[i] * 10 + digits[i+1]) + "thousand ";
				i++;
				count -= 2;
			}else if(count == 4 && digits[i] != 0){
				res += getNumeric(digits[i]) + "thousand ";
				count--;
			}else if(count == 3 && digits[i] != 0) {
				res += getNumeric(digits[i]) + "hundred ";
				count--;
			}else if(count == 2 && digits[i] != 0) {
				res += getNumeric(digits[i] * 10 + digits[i+1]);
				i++;
				count--;
			}else if(count == 1 && digits[i] != 0) {
				res += getNumeric(digits[i]);
				count--;
			}
			
			//removing each element which is already converted
			for(int j = 0; temp != 0; j++) {
				digits[j] = temp % 10;
				temp /= 10;
			}
		}
		
		System.out.println(res);
	}

	public static String getNumeric(int num) {
		String res = "";
		
			if(num > 89) {
				res = "ninty " + getNumeric(num % 10);
				return res;
			}else if(num == 9) {
				res = "nine";
				return res;
			}

			if(num > 79) {
				res = "eighty " + getNumeric(num % 10);
				return res;
			}else if(num == 8) {
				res = "eight";
				return res;
			}

			if(num > 69) {
				res = "seventy " + getNumeric(num % 10);
				return res;
			}else if(num == 7) {
				res = "seven";
				return res;
			}

			if(num > 59) {
				res = "sixty " + getNumeric(num % 10);
				return res;
			}else if(num == 6) {
				res = "six";
				return res;
			}
			
			if(num > 49) {
				res = "fifty " + getNumeric(num % 10);
				return res;
			}else if(num == 5) {
				res = "five";
				return res;
			}

			if(num > 39) {
				res = "forty " + getNumeric(num % 10);
				return res;
			}else if(num == 4) {
				res = "four";
				return res;
			}

			if(num > 29) {
				res = "thirty " + getNumeric(num % 10);
				return res;
			}else if(num == 3) {
				res = "three";
				return res;
			}

			if(num > 19) {
				res = "twenty " + getNumeric(num % 10);
				return res;
			}else if(num == 2) {
				res = "two";
				return res;
			}
			
			if(num == 19) {
				res = "ninteen ";
				return res;
			}else if(num == 18) {
				res = "eighteen ";
				return res;
			}else if(num == 17) {
				res = "seventeen ";
				return res;
			}else if(num == 16) {
				res = "sixteen ";
				return res;
			}else if(num == 15) {
				res = "fifteen ";
				return res;
			}else if(num == 14) {
				res = "fourteen ";
				return res;
			}else if(num == 13) {
				res = "thirteen ";
				return res;
			}else if(num == 12) {
				res = "twelve ";
				return res;
			}else if(num == 11) {
				res = "eleven ";
				return res;
			}else if(num == 10) {
				res = "ten ";
				return res;
			}
		
		return "";
	}
}
