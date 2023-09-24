// Fun Exercise to print boxes like these in different angles using algorithms
/*
		 ########
		 ##    ##
		 # #  # #
		 #  #   #
		 # # #  #
		 ##    ##
		 ########
*/

import java.util.Scanner;

public class BoxPatternX {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num;
		do {
			System.out.println("Enter size: ");
			num = scan.nextInt();
		}while(num<=0);
		
		//Pattern A
		System.out.println("Pattern A: ");
		for(int row=1; row<=num; row++) {
			for(int col=1; col<=num; col++) {
				if(row == 1 || row == num || col == 1 || col == num) {
					System.out.print("#");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		
		//Pattern B
		System.out.println("Pattern B: ");
		for(int row=1; row<=num; row++) {
			for(int col=1; col<=num; col++) {
				if(row == 1 || row == num || row == col) {
					System.out.print("#");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		
		//Pattern C
		System.out.println("Pattern C: ");
		for(int row=1; row<=num; row++) {
			for(int col=1; col<=num; col++) {
				if(row == 1 || row == num || col == num-row+1) {
					System.out.print("#");
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
				if(col == 1 || col == num || col == row) {
					System.out.print("#");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		
		//Pattern E
		System.out.println("Pattern E: ");
		for(int row=1; row<=num; row++) {
			for(int col=1; col<=num; col++) {
				if(row == 1 || row == num || col == 1 || col == num || col==num-row+1 || row==col) {
					System.out.print("#");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("My type of pattern: ");
		for(int i=1; i<=num; i++) {
			System.out.print("#");
		}
		
		System.out.println();
		for(int i=1; i<=num; i++) {
			if(i==1 || i==2) {
				System.out.print("#");
			}else if(i>2 && i<=num-2) {
				System.out.print(" ");
			}else if(i==num-1 || i==num) {
				System.out.print("#");
			}
		}
		
		System.out.println();
		for(int i=1; i<=num; i++) {
			if(i<=num/2) {
				if(i%2==0) {
					System.out.print(" ");
				}else {
					System.out.print("#");
				}
			}
			
			else if(i>=num/2) {
				if(i%2==0) {
					System.out.print("#");
				}else {
					System.out.print(" ");
				}
			}
		}
		
		System.out.println();
		for(int i=1; i<=num; i++) {
			if(i==1 || i==num || i==num/2) {
				System.out.print("#");
			}else {
				System.out.print(" ");
			}
		}
		
		System.out.println();
		for(int i=1; i<=num; i++) {
			if(i<=num/2) {
				if(i%2==0) {
					System.out.print(" ");
				}else {
					System.out.print("#");
				}
			}
			
			else if(i>=num/2) {
				if(i%2==0) {
					System.out.print("#");
				}else {
					System.out.print(" ");
				}
			}
		}
		
		System.out.println();
		for(int i=1; i<=num; i++) {
			if(i==1 || i==2 || i==num || i==num-1) {
				System.out.print("#");
			}else {
				System.out.print(" ");
			}
		}
		
		System.out.println();
		for(int i=1; i<=num; i++) {
			System.out.print("#");
		}
	}
}
