// Interesting exercise to convert radix to decimal

import java.util.Scanner;

public class RadixN2Dec {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int rad;
		do{
			System.out.println("Enter radix (<=16): ");
			rad = scan.nextInt();
		}while(rad>16);
		
		System.out.println("Enter String: ");
		String str = scan.next().toLowerCase();
		
		int a=10, b=11, c=12, d=13, e=14, f=15, result = 0, r;
		int len = str.length();
		char ch;
		boolean flag = false;
		
		for(int i=0; i<len; i++) {
			r = 1;
			ch = str.charAt(i);
			for(int j=len-1-1; j>=i; j--) {
				r *= rad;
			}
			if(ch>='0' && ch<='9') {
				flag = true;
				result += (Character.getNumericValue(ch))*r;
			}else if(ch>='a' && ch<='f') {
				switch(ch) {
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
			}
		}
		
		if(flag) {
			System.out.println("Decimal Number: " + result);
		}else {
			System.out.println("Invalid");
		}
	}
}
