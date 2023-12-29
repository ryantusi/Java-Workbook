// Fun exercise to print a hill pattern

import java.util.Scanner;

public class HillPatternX {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num;
		do {
			System.out.println("Enter size: ");
			num = scan.nextInt();
		}while(num<=0);
		
		//Pattern A
		System.out.println();
		System.out.println("Pattern A");
		for (int row = 1; row <= num; row++) { 
			 for (int col = 1; col <= num; col++) { 
				 if ((row + col >= num + 1)) { 
					 System.out.print("#");
				 } else { 
					 System.out.print(" ");
				 } 
			 } 
			 for (int col = 2; col <= num; col++) { 
				 if (row >= col) { 
					 System.out.print("#");
				 } else { 
					 System.out.print(" ");
				 } 
			 } 
			 System.out.println();
		}
		
		//Pattern B
		System.out.println();
		System.out.println("Pattern B");
		for (int row = 1; row <= num; row++) { 
			 for (int col = 1; col <= row; col++) { 
				 System.out.print(" ");
			 }
			 for(int col=row; col<num; col++) {
				 System.out.print("#");
			 }
			 for(int col=row; col<=num; col++) {
				 System.out.print("#");
			 }
			 System.out.println();
		}
		
		//Pattern C
		System.out.println();
		System.out.println("Pattern C");
		for (int row = 1; row <= num; row++) { 
			 for (int col = 1; col <= num; col++) { 
				 if ((row + col <= num + 1)) { 
					 System.out.print("#");
				 } else { 
					 System.out.print(" ");
				 } 
			 } 
			 for (int col = 2; col <= num; col++) { 
				 if (row <= col) { 
					 System.out.print("#");
				 } else { 
					 System.out.print(" ");
				 } 
			 } 
			 System.out.println();
		}
	}
}
