// Fun exercise to print different types of patterns

import java.util.Scanner;

public class NumberPatternX {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num;
		do {
			System.out.println("Enter number: ");
			num = scan.nextInt();
		}while(num<=0);
		
		//Pattern A
		System.out.println("Patter A");
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		
		//Pattern B
		System.out.println("Pattern B");
		for(int row=1; row<=num; row++) {
			for(int col=1; col<=num; col++) {
				if(row+col <= num+1) {
					System.out.print(col);
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		//Pattern C
		System.out.println("Pattern C");
		for(int row=1; row<=num; row++) {
			for(int col=1; col<=num; col++) {
				if(row+col >= num+1) {
					System.out.print(col);
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		//Pattern D
		System.out.println("Pattern D: ");
		for(int row=1; row<=num; row++) {
			for(int col=1; col<=num; col++) {
				if(row<=col) {
					System.out.print(col);
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
