// Fun program to print out a series of exponential of a given user input number

import java.util.Scanner;
import java.lang.Math;

public class ExponentialSeries {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter an exponential: ");
		double expo = scan.nextDouble();
		
		System.out.println("Enter the number of terms(<10 and >3): ");
		int terms;
		do {
			terms = scan.nextInt();
		}while(terms<=3 || terms>=10);
		
		double pi = Math.PI;
		double ang = 180.00;
		double radians = expo * (pi/ang);
		
		System.out.println();
		System.out.println("The computation of E only (exp(terms)) is: ");
		System.out.println(exp(terms));
		System.out.println("The computation of exponential E " + expo + " is: ");
		System.out.println(exp(radians, terms));
		System.out.println("Checking with Math: " + Math.exp(radians));
	}
	public static double exp(int n) {
		double result = 0;
		for(int i=0; i<=n; i++) {
			if(i==0) {
				result += 1;
			}else {
				result += 1/fact(i);
			}
		}
		return result;
	}
	public static double exp(double x, int n) {
		double result = 0;
		for(int i=0; i<=n; i++) {
			if(i==0) {
				result += 1;
			}else {
				if(i==1) {
					result += x;
				}else {
					result += Math.pow(x, i)/fact(i);
				}
			}
		}
		return result;
	}
	
	public static int fact(int num) {
		int result = 1;
		for(int i=num; i>0; i--) {
			result *= i; 
		}
		return result;
	}
}
