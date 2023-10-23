// Interesting program to convert Octal to Decimal

import java.util.Scanner;

public class Oct2Dec {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Octal String: ");
		String str = scan.next();
		
		int len = str.length();
		int n = 8, r, result = 0;
		char c;
		boolean flag = false;
		
		for(int i=0; i<len; i++) {
			r = 1;
			c = str.charAt(i);
			for(int j = len-1-1; j>=i; j--) {
				r *= n;
			}
			if(Character.isLetter(c)) {
				flag = false;
				break;
			}else if (c>='0' && c<='9'){
				flag = true;
				result += (Character.getNumericValue(c))*r;
			}else {
				flag = false;
			}
		}
		
		if(flag) {
			System.out.println("Decimal number: " + result);
		}else {
			System.out.println("Invalid Octal Number " + str);
		}
	}
}
