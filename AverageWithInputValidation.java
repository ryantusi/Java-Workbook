//compute average using input validation method

import java.util.Scanner;

public class AverageWithInputValidation {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n1, n2, n3;
		double sum, average;
		boolean valid = false;

    //prompting user for valid input (number > 0) +
		do {
			System.out.println("Enter marks (0-100) for student1: ");
			n1 = scan.nextInt();
			if(n1>=0 && n1<=100) {
				valid = true;
			}else {
				System.out.println("Invalid Input, Try again...");
			}
		}while(!valid);
		
		valid = false;
		do {
			System.out.println("Enter marks (0-100) for student2: ");
			n2 = scan.nextInt();
			if(n2>=0 && n2<=100) {
				valid = true;
			}else {
				System.out.println("Invalid Input, Try again...");
			}
		}while(!valid);
		
		valid = false;
		do {
			System.out.println("Enter marks (0-100) for student3: ");
			n3 = scan.nextInt();
			if(n3>=0 && n3<=100) {
				valid = true;
			}else {
				System.out.println("Invalid Input, Try again...");
			}
		}while(!valid);
		
		sum = n1+n2+n3;
		average = sum/3;
		System.out.printf("Average: %.2f%n", average);
	}
}
