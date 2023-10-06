// Converting cipher text to plain text just by exchanging letters 'A' - 'Z', 'B' - 'Y'... without any algorithm

import java.util.Scanner;

public class ExchangeCipher {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str = scan.next().toUpperCase();
		
		int len = str.length();
		String restr = "";
		char c;
		char newc;
		int strnum;
		
		for(int i=0; i<len; i++) {
			c = str.charAt(i);
			switch(c) {
			case 'A':
				newc = 'Z';
				restr += newc;
				break;
			case 'B':
				newc = 'Y';
				restr += newc;
				break;
			case 'C':
				newc = 'X';
				restr += newc;
				break;
			case 'D':
				newc = 'W';
				restr += newc;
				break;
			case 'E':
				newc = 'V';
				restr += newc;
				break;
			case 'F':
				newc = 'U';
				restr += newc;
				break;
			case 'G':
				newc = 'T';
				restr += newc;
				break;
			case 'H':
				newc = 'S';
				restr += newc;
				break;
			case 'I':
				newc = 'R';
				restr += newc;
				break;
			case 'J':
				newc = 'Q';
				restr += newc;
				break;
			case 'K':
				newc = 'P';
				restr += newc;
				break;
			case 'L':
				newc = 'O';
				restr += newc;
				break;
			case 'M':
				newc = 'N';
				restr += newc;
				break;
			case 'N':
				newc = 'M';
				restr += newc;
				break;
			case 'O':
				newc = 'L';
				restr += newc;
				break;
			case 'P':
				newc = 'K';
				restr += newc;
				break;
			case 'Q':
				newc = 'J';
				restr += newc;
				break;
			case 'R':
				newc = 'I';
				restr += newc;
				break;
			case 'S':
				newc = 'H';
				restr += newc;
				break;
			case 'T':
				newc = 'G';
				restr += newc;
				break;
			case 'U':
				newc = 'F';
				restr += newc;
				break;
			case 'V':
				newc = 'E';
				restr += newc;
				break;
			case 'W':
				newc = 'D';
				restr += newc;
				break;
			case 'X':
				newc = 'C';
				restr += newc;
				break;
			case 'Y':
				newc = 'B';
				restr += newc;
				break;
			case 'Z':
				newc = 'A';
				restr += newc;
				break;
			default:
				restr+=c;
				break;
			}
		}
		
		System.out.println("Exchange Cipher Text: " + restr);
	}
}
