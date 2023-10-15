// Demonstrating the concept of input validation or sentinal

import java.util.Scanner;

public class InputValidation {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n;
		boolean valid = false;
		do {
			System.out.println("Enter number between 0-10 or 90-100: ");
			n = scan.nextInt();
			if(n>=0 && n<=10) {
				System.out.println("You have entered: " + n);
				valid = true;
			}else if(n>=90 && n<=100) {
				System.out.println("You have entered: " + n);
				valid = true;
			}else {
				System.out.println("Invalid Input, Try again...");
			}
		}while(!valid);
	}
}
