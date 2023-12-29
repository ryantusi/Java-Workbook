// Interesting program to print number in words using user input

import java.util.Scanner;

public class PrintNumberInWord {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Number: ");
		int n = scan.nextInt();
		
		System.out.println("Inside If-else nested");
		
		//If else nested
		if(n == 1) {
			System.out.println("One");
		}
		else if(n == 2) {
			System.out.println("Two");
		}
		else if(n == 3) {
			System.out.println("Three");
		}
		else if(n == 4) {
			System.out.println("Four");
		}
		else if(n == 5) {
			System.out.println("Five");
		}
		else if(n == 6) {
			System.out.println("Six");
		}
		else if(n == 7) {
			System.out.println("Seven");
		}
		else if(n == 8) {
			System.out.println("Eight");
		}
		else if(n == 9) {
			System.out.println("Nine");
		}
		else {
			System.out.println("Other");
		}
		
		System.out.println("Inside Switch");
		
		//switch case
		
		switch(n) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		case 6:
			System.out.println("Six");
			break;
		case 7:
			System.out.println("Seven");
			break;
		case 8:
			System.out.println("Eight");
			break;
		case 9:
			System.out.println("Nine");
			break;
		default:
			System.out.println("Other");
			break;
		}
		
		System.out.println("Done");
	}
}
