// Manual way of implementing factorial without recursive function

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int num = scan.nextInt();
		long fact = 1;		// instead of int, we will use long
		for(int i=1; i<=num; i++) {
			fact *= i;		
		}
		System.out.println("Factorial: " + fact);
		
		//the output shows wrong result because of less memory for the variable num
		
		//try with long, you will get the right result
	}
}
