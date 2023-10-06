// Interesting exercise to create a method which returns the computed value of base and exponent manually

import java.util.Scanner;

public class ExponentMethod {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter base: ");
		int base = scan.nextInt();
		
		System.out.println("Enter exponent: ");
		int expo = scan.nextInt();
		
		System.out.println(base + " raises to the power " + expo + " is: ");
		System.out.println(exponent(base, expo));
	}
	
	public static int exponent(int b, int e) {
		int product = 1;
		for(int i=e; i>0; i--) {
			product *= b;
		}
		return product;
	}
}
