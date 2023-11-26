// Converts tradional alphebetical phone pad characters to numbers

import java.util.Scanner;

public class PhoneKeyPad {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter String: ");
		String str = scan.next();
		str.toLowerCase();
		
		int len = str.length();
		char c;
		
		System.out.println("Keypad Format: ");
		
		for(int i=0; i<len; i++) {
			c = str.charAt(i);
			switch(c) {
			case 'c':
				System.out.print("2");
			case 'b':
				System.out.print("2");
			case 'a':
				System.out.println("2");
				break;
			case 'f':
				System.out.print("3");
			case 'e':
				System.out.print("3");
			case 'd':
				System.out.println("3");
				break;
			case 'i':
				System.out.print("4");
			case 'h':
				System.out.print("4");
			case 'g':
				System.out.println("4");
				break;
			case 'l':
				System.out.print("5");
			case 'k':
				System.out.print("5");
			case 'j':
				System.out.println("5");
				break;
			case '0':
				System.out.print("6");
			case 'n':
				System.out.print("6");
			case 'm':
				System.out.println("6");
				break;
			case 's':
				System.out.print("7");
			case 'r':
				System.out.print("7");
			case 'q':
				System.out.print("7");
			case 'p':
				System.out.println("7");
				break;
			case 'v':
				System.out.print("8");
			case 'u':
				System.out.print("8");
			case 't':
				System.out.println("8");
				break;
			case 'z':
				System.out.print("9");
			case 'y':
				System.out.print("9");
			case 'x':
				System.out.print("9");
			case 'w':
				System.out.println("9");
				break;
			default:
				System.out.println(c);
				break;
			}
		}
	}
}
