// Fun and Interesting exercise to convert Hex code to Binary

import java.util.Scanner;
import java.util.Arrays;

public class Hex2Bin {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Hexadecimal number: ");
		String str = scan.next().toLowerCase();
		
		final String[] arr = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};
		
		int len = str.length();
		char ch;
		
		System.out.println("The equavalent binary of for hexadecimal " + str + " is: ");
		for(int i=0; i<len; i++) {
			ch = str.charAt(i);
			switch(ch) {
			case '0':
				System.out.print(arr[0] + " ");
				break;
			case '1':
				System.out.print(arr[1] + " ");
				break;
			case '2':
				System.out.print(arr[2] + " ");
				break;
			case '3':
				System.out.print(arr[3] + " ");
				break;
			case '4':
				System.out.print(arr[4] + " ");
				break;
			case '5':
				System.out.print(arr[5] + " ");
				break;
			case '6':
				System.out.print(arr[6] + " ");
				break;
			case '7':
				System.out.print(arr[7] + " ");
				break;
			case '8':
				System.out.print(arr[8] + " ");
				break;
			case '9':
				System.out.print(arr[9] + " ");
				break;
			case 'a':
				System.out.print(arr[10] + " ");
				break;
			case 'b':
				System.out.print(arr[11] + " ");
				break;
			case 'c':
				System.out.print(arr[12] + " ");
				break;
			case 'd':
				System.out.print(arr[13] + " ");
				break;
			case 'e':
				System.out.print(arr[14] + " ");
				break;
			case 'f':
				System.out.print(arr[15] + " ");
				break;
			default:
				System.out.print("Invalid");
			}
		}
	}
}
