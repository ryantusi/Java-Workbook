// Interesting program to check the user's input as a string is binary or non-binary

import java.util.Scanner;

public class CheckBinary {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter binary: ");
		String str = scan.next();
		
		int len = str.length();
		boolean flag = false;
		char c;
		
		for(int i=0; i<len; i++) {
			c = str.charAt(i);
			if(c == '0' || c == '1') {
				flag = true;
			}else {
				flag = false;
				break;
			}
		}
		
		if(flag) {
			System.out.println(str + " is a binary.");
		}else {
			System.out.println(str + " is not binary.");
		}
	}
}
