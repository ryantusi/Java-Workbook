// Fun program to print different triangles

import java.util.Scanner;
import java.lang.Math;

public class PrintTriangles {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int size;
		do {
			System.out.println("Enter size (1-10): ");
			size = scan.nextInt();
		}while(size<=0 || size>10);
		
		printpatternA(size);
		printpatternB(size);
		printpatternC(size);
	}
	
	public static void printpatternA(int num) {
		System.out.println();
		System.out.println("Pattern A: ");
		int k, l;
		int row = num;
		int len = num + 1;
		String str = " %"+len+"s";
		
        for (int i = 1; i <= num; i++)
        {
            for (int j = row; j > 0; j--)
            {
                System.out.printf(str, " ");
            }

            for (int j = 1; j <= (2*num); j++)
            {
                if (j == (num+1))
                {
                    continue;
                }

                if (j < (num+1))
                {
                    k = j;
                }
                else
                {
                    k = ((2*num)-j+1);
                }

                if (k >= (num+1-i))
                {
                    l = (int)Math.pow(2, (i+k-num-1));
                    String str1 = "" + l;
                    System.out.printf(str, str1);
                }
            }
            row--;
            System.out.println();
        }
        System.out.println();
	}
	
	public static void printpatternB(int num) {
		System.out.println();
		System.out.println("Pattern B: ");
		int c = 1;
		for (int i = 1 ; i <= num; i++ ) {
			for (int j = 1 ; j <= i; j++ ) {
				if(j==i) {
					System.out.println("1");
				}else {
					System.out.print(c + " ");
	                c = c * (i - j) / j;
				}
			}
			System.out.println();
		}
	}
	
	public static void printpatternC(int num) {
		System.out.println();
		System.out.println("Pattern C: ");
		for (int i = 1; i <= num; i++) {
            for (int j = 0; j <= num - i; j++) {
                System.out.print(" ");
            }
 
            int c = 1;
            for (int k = 1; k <= i; k++) {
                System.out.print(c + " ");
                c = c * (i - k) / k;
            }
            System.out.println();
        }
		System.out.println();
	}
}
