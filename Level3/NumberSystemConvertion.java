// Interesting program to convert one radix to other

import java.util.Scanner;

public class NumberSystemConvertion {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int inrad, outrad;
		do{
			System.out.println("Enter the input radix (<=16): ");
			inrad = scan.nextInt();
		}while(inrad>16);
		
		do{
			System.out.println("Enter the output radix (<=16): ");
			outrad = scan.nextInt();
		}while(outrad>16);
		
		System.out.println("Enter String: ");
		String str = scan.next().toLowerCase();
		System.out.println(str.toUpperCase() + " in radix " + inrad + " is " + toradix(str, inrad, outrad) + " in radix " + outrad);
	}
	
	public static String toradix(String in, int inradix, int outradix) {
		final String[] arr = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};
		
		int len = in.length();
		char ch;
		String str = "";
		
		for(int i=0; i<len; i++) {
			ch = in.charAt(i);
			switch(ch) {
			case '0':
				str += arr[0]; 
				break;
			case '1':
				str += arr[1]; 
				break;
			case '2':
				str += arr[2];
				break;
			case '3':
				str += arr[3];
				break;
			case '4':
				str += arr[4];
				break;
			case '5':
				str += arr[5];
				break;
			case '6':
				str += arr[6];
				break;
			case '7':
				str += arr[7];
				break;
			case '8':
				str += arr[8];
				break;
			case '9':
				str += arr[9];
				break;
			case 'a':
				str += arr[10];
				break;
			case 'b':
				str += arr[11];
				break;
			case 'c':
				str += arr[12];
				break;
			case 'd':
				str += arr[13];
				break;
			case 'e':
				str += arr[14];
				break;
			case 'f':
				str += arr[15];
				break;
			default:
				System.out.print("Invalid");
				break;
			}
		}
		return str;
	}
}
