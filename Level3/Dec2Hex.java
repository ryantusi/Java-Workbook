// interesting program to convert decimal to hex code

import java.util.Scanner;

public class Dec2Hex {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num;
		System.out.println("Enter decimal number (positive): ");
		do {
			num = scan.nextInt();
		}while(num<0);
		
		final int[] arr = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		final int div = 16;
		int qou = num/div;
		int rem = num%div;
		String str = "";
		
		do {
			if(rem>=10 && rem<=15) {
				switch(rem) {
				case 10:
					str += "A";
					break;
				case 11:
					str += "B";
					break;
				case 12:
					str += "C";
					break;
				case 13:
					str += "D";
					break;
				case 14:
					str += "E";
					break;
				case 15:
					str += "F";
					break;
				}
			}else {
				str += rem;
			}
			rem = qou%div;
			qou = qou/div;
		}while(qou>0);
		
		if(rem>=10 && rem<=15) {
			switch(rem) {
			case 10:
				str += "A";
				break;
			case 11:
				str += "B";
				break;
			case 12:
				str += "C";
				break;
			case 13:
				str += "D";
				break;
			case 14:
				str += "E";
				break;
			case 15:
				str += "F";
				break;
			}
		}else {
			str += rem;
		}
		
		System.out.println("The equavalent hexadecimal number is: ");
		
		String result = "";
		for(int j=str.length()-1; j>=0; j--) {
			result += str.charAt(j);
		}
		
		System.out.println(result);
	}
}
