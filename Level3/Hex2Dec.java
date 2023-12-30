// Fun and Interesting exercise to convert Hex code Decimal

import java.util.Scanner;

public class Hex2Dec {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Hex String: ");
		String str = scan.next().toLowerCase();
		
		int a=10, b=11, c=12, d=13, e=14, f=15, n=16, result = 0, r;
		int len = str.length();
		char ch;
		boolean flag = false;
		
		for(int i=0; i<len; i++) {
			r = 1;
			ch = str.charAt(i);
			for(int j=len-1-1; j>=i; j--) {
				r *= n;
			}
			if((ch>='a' && ch<='f') || (ch>='0' && ch<='9')){
				switch(ch) {
				case '0':
					flag = true;
					result += 0 * r;
					break;
				case '1':
					flag = true;
					result += 1 * r;
					break;
				case '2':
					flag = true;
					result += 2 * r;
					break;
				case '3':
					flag = true;
					result += 3 * r;
					break;
				case '4':
					flag = true;
					result += 4 * r;
					break;
				case '5':
					flag = true;
					result += 5 * r;
					break;
				case '6':
					flag = true;
					result += 6 * r;
					break;
				case '7':
					flag = true;
					result += 7 * r;
					break;
				case '8':
					flag = true;
					result += 8 * r;
					break;
				case '9':
					flag = true;
					result += 9 * r;
					break;
				case 'a':
					flag = true;
					result += a * r;
					break;
				case 'b':
					flag = true;
					result += b * r;
					break;
				case 'c':
					flag = true;
					result += c * r;
					break;
				case 'd':
					flag = true;
					result += d * r;
					break;
				case 'e':
					flag = true;
					result += e * r;
					break;
				case 'f':
					flag = true;
					result += f * r;
					break;
				default:
					flag = false;
					break;
				}
			}else {
				flag = false;
				break;
			}
		}
		
		if(flag) {
			System.out.println("Decimal Number: " + result);
		}else {
			System.out.println("Invalid Hex Number " + str);
		}
	}
}
