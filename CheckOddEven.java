// Exercise to check whether user input int is odd or even

import java.util.Scanner;

public class CheckOddEven {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int num = scan.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("The number is even.");
		}
		else {
			System.out.println("The number is odd.");
		}
		
		System.out.println("bye!");
	}
}
