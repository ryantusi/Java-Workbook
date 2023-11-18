// Java program which lists out prime factors upto upper bound provided

import java.util.Scanner;
import java.lang.Math;

public class PerfectPrimeFactorList {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num;
		int count = 0;
		double perc;
		do {
			System.out.println("Enter a positive upperbound: ");
			num = scan.nextInt();
		}while(num<=0);
		
		System.out.println("Prime Factor Numbers: ");
		for(int i=1; i<=num; i++) {
			if(isProductOfPrimeFactor(i)) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println();
		System.out.print(count + " numbers are found. ");
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
	public static boolean isProductOfPrimeFactor(int n) {
		boolean flag = false;
		double product = 1;
		for(int i=2; i<n; i++) {
			if(n%i==0 && isPrime(i)) {
				product *= i;
			}
		}
		if(product==n) {
			flag = true;
		}
		return flag;
	}
}
