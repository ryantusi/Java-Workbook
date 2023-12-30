// Interesting exercise to implement factorial using recursive function

import java.util.Scanner;

public class FactorialRecursion {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int num = scan.nextInt();
		
		System.out.println("The Factorial of " + num + " is: ");
		for(int i=0; i<=num; i++) {
			System.out.print("F(" + i + "): " + fact(i));
			System.out.println();
		}
	}
	public static int fact(int n) {
		return (n==0)? 1:n*fact(n-1);
	}
}
