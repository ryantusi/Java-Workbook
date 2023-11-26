// Prints prime number list from 0 to upper bound from user input

import java.util.Scanner;
import java.lang.Math;

public class PrimeList {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num;
		int count = 0;
		double perc;
		do {
			System.out.println("Enter a positive upperbound: ");
			num = scan.nextInt();
		}while(num<=0);
		
		System.out.println("Prime Numbers: ");
		for(int i=0; i<=num; i++) {
			if(i==1) {
				System.out.print(i + " ");
				count++;
			}
			if(isPrime(i)) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println();
		System.out.print(count + " prime numbers are found. ");
		perc = ((double)count/(double)num) * 100;
		System.out.printf("(%.2f%%)%n", perc);
		System.out.println();
		
	}
	public static boolean isPrime(int n) {
		if (n <= 1) {
            return false;
		} else if (n == 2) {
            return true;
		} else if (n % 2 == 0) {
            return false;
		}
		
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
	}
}
