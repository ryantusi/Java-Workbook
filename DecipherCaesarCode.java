// Deciphering encrypted code with key of (-3)

import java.util.Scanner;

public class DecipherCaesarCode {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter String: ");
		String str = scan.next().toLowerCase();
		int len = str.length();
		char c;
		char newc;
		int strnum;
		String restr = "";
		
		for(int i=0; i<len; i++) {
			c = str.charAt(i);
			strnum = (int)c - 3;
			newc = (char)strnum;
			if(c=='a') {
				newc = 'x';
			}
			if(c=='b') {
				newc = 'y';
			}
			if(c=='c') {
				newc = 'z';
			}
			restr += newc;		
		}
		
		System.out.println("Cipher Text: " + restr.toLowerCase());
	}
}
