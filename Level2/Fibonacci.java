// Interesting Exercise to print Fibonacci series 

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter an int to find fact F(x): ");
		int num = scan.nextInt();
	
		if(fact(num) == -1) {
			System.out.println("F(" + num + ") is out of the range of int");
		}else {
			System.out.println("F(" + num + ") : " + fact(num));
		}
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
	}
	
	public static int fact(int num) {
		int result = 0;
		final int min = Integer.MIN_VALUE;
		final int max = Integer.MAX_VALUE;
		int fn_1 = 0;
		int fn_2 = 1;
		int next;
		boolean flag = true;
		
		if(num == 0) {
			result = fn_2;
		}else {
			for(int i=1; i<=num; i++) {
				if(max-fn_1 < fn_2) {
					flag = false;
					break;
				}else {
					next = fn_1 + fn_2;
					result = next;
					fn_1 = fn_2;
					fn_2 = next;
					flag = true;
				}
			}
		}
		
		if(flag) {
			return result;
		}else {
			return -1;
		}
		
	}
}
