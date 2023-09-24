// Fun Exercise to illustrate the concept of encryption using caesar cipher concept to convertcipher test to plain text using a decryption key and algorithm
// The key is + 3

import java.util.Scanner;

public class CaesarCode {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter String: ");
		String str = scan.next().toUpperCase();
		
		int len = str.length();
		char c;
		char newc;
		int strnum;
		String restr = "";
		
		for(int i=0; i<len; i++) {
			c = str.charAt(i);
			strnum = (int)c + 3;
			newc = (char)strnum;
			if(c=='X') {
				newc = 'A';
			}
			if(c=='Y') {
				newc = 'B';
			}
			if(c=='Z') {
				newc = 'C';
			}
			restr += newc;		
		}
		
		System.out.println("Cipher Text: " + restr.toUpperCase());
	}
}
