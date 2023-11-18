// Java program to find if a number is perfect or deficient

import java.util.Scanner;

public class PerfectAndDeficientNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num;
		int count = 0;
		double perc;
		do {
			System.out.println("Enter a positive upperbound: ");
			num = scan.nextInt();
		}while(num<=0);
		
		System.out.println("Perfect Numbers: ");
		for(int i=1; i<=num; i++) {
			if(isPerfect(i)) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println();
		System.out.print(count + " numbers are found. ");
		perc = ((double)count/(double)num) * 100;
		System.out.printf("(%.2f%%)%n", perc);
		System.out.println();
		
		count = 0;
		System.out.println("Numbers neither perfect nor deficient: ");
		for(int i=1; i<=num; i++) {
			if(!isPerfect(i) && !isDeficient(i)) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println();
		System.out.print(count + " numbers are found. ");
		perc = ((double)count/(double)num) * 100;
		System.out.printf("(%.2f%%)", perc);
		System.out.println();
	}
	public static boolean isPerfect(int n) {
		boolean flag = false;
		int sum = 0;
		for(int i=1; i<n; i++) {
			if(n%i==0) {
				sum += i;
			}
		}
		if(sum==n) {
			flag = true;
		}
		return flag;
	}
	public static boolean isDeficient(int n) {
		boolean flag = false;
		int sum = 0;
		for(int i=1; i<n; i++) {
			if(n%i==0) {
				sum += i;
			}
		}
		if(sum<n) {
			flag = true;
		}
		return flag;
	}
}
