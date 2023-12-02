// fun exercise: printing different types of triangles and pyramids using loops

import java.util.Scanner;

public class PrintPatterns {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int size;
		System.out.println("Enter size 0-10: ");
		do {
			size = scan.nextInt();
		}while(size<=0 || size>10);
		
		printpatternA(size);
		printpatternB(size);
		printpatternC(size);
		printpatternD(size);
		printpatternE(size);
		printpatternF(size);
		printpatternG(size);
	}
	public static void printpatternA(int num) {
		System.out.println();
		System.out.println("Pattern A:");
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
	}
	public static void printpatternB(int num) {
		System.out.println();
		System.out.println("Pattern B");
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
	}
	
	public static void printpatternC(int num) {
		System.out.println();
		System.out.println("Pattern C: ");
		for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("#");
            }
            System.out.println();
        }

        for (int i = num - 1; i > 0; i--) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("#");
            }
            System.out.println();
        }

	}
	
	public static void printpatternD(int num) {
		System.out.println();
		System.out.println("Patter D:");
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void printpatternE(int num) {
		System.out.println();
		System.out.println("Pattern E: ");
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
	
	public static void printpatternF(int num) {
		System.out.println();
		System.out.println("Pattern F: ");
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
	}
	
	public static void printpatternG(int num) {
		System.out.println();
		System.out.println("Pattern G: ");
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
	}
}
