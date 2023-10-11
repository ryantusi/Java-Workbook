// Fun exercise to implement the concept of Greatest Common Divisor

import java.util.Scanner;

public class GCDRecursion {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number a: ");
		int x = scan.nextInt();
		System.out.println("Enter number b: ");
		int y = scan.nextInt();
		
		System.out.println("The Greatest Common Factor is: " + gcd(x,y));
	}
	public static int gcd(int a, int b) {
		if(b==0) {
			return a;
		}else {
			return gcd(b, a%b);
		}
	}
}
