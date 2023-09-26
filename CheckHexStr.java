// Interesting program to check the user's input as string is Hex Decimal or not

import java.util.Scanner;

public class CheckHexStr {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Hex String: ");
		String str = scan.next().toUpperCase();
		
		int len = str.length();
		boolean flag = false;
		char c;
		
		for(int i=0; i<len; i++) {
			c = str.charAt(i);
			if(c>='0' && c<='9') {
				flag = true;
			}else if(c>='A' && c<='F') {
				flag = true;
			}else {
				flag = false;
			}
		}
		
		if(flag) {
			System.out.println("It is a Hex String.");
		}else {
			System.out.println("It is not a Hex String.");
		}
		
	}
}
