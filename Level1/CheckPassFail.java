// Fun exercise to print out pass or fail if marks is above or below 50

import java.util.Scanner;

public class CheckPassFail {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter marks: ");
		int mark = scan.nextInt();
		
		if(mark >= 50) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		
		System.out.println("Done");
	}
}
