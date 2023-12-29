// Fun exercise to print the magic sum of numbers if it has the number '8'

import java.util.Scanner;

public class MagicSum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num;
		int sum = 0;
		do{
			System.out.println("Enter number (or -1 to end): ");
			num = scan.nextInt();
			if(hasEight(num)) {
				sum += num;
			}
		} while(num != -1);	

		System.out.println("The Magic Sum is: " + sum);
	}
	
	public static boolean hasEight(int n) {
		String str = String.valueOf(n);
		char c;
		boolean flag = false;
		for(int i=0; i<str.length(); i++) {
			c = str.charAt(i);
			if(c=='8') {
				flag = true;
			}
		}
		return flag;
	}
}
