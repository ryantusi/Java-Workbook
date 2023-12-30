// Implement Fibonacci series using recursive function

import java.util.Scanner;

public class FibonacciRecursive {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int num = scan.nextInt();
		
		for(int i=0; i<=num; i++) {
			System.out.println("F(" + i + "): " + fibonacci(i));
		}
	}
	public static int fibonacci(int n) {
		if (n == 0) { 
			return 0; 
		} else if (n == 1) { 
			return 1; 
		} else { 
			return fibonacci(n-1) + fibonacci(n-2); 
		} 
	}
}
