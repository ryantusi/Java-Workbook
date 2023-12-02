// Interesting program to print the date in words using user input

import java.util.Scanner;

public class PrintDayInWord {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Day Number: ");
		int n = scan.nextInt();
		
		//If-else nested
		System.out.println("Inside if-else nested...");
		if(n < 0 || n > 6) {
			System.out.println("Not a valid day");
		}
		else if(n == 0) {
			System.out.println("Sunday");
		}
		else if(n == 1) {
			System.out.println("Monday");
		}
		else if(n == 2) {
			System.out.println("Tuesday");
		}
		else if (n == 3) {
			System.out.println("Wednesday");
		}
		else if(n == 4) {
			System.out.println("Thursday");
		}
		else if(n == 5) {
			System.out.println("Friday");
		}
		else if(n == 6) {
			System.out.println("Saturday");
		}
		
		//Switch case
		System.out.println("Inside Switch case...");
		
		switch(n) {
		case 0:
			System.out.println("Sunday");
			break;
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Not a valid day");
			break;
		}
		System.out.println("Done");
	}
}
