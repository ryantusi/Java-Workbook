// Fun program to compute income taxes based on tax slabs with Sentinel (Prompting user for correct input)

import java.util.Scanner;

public class IncomeTaxCalculatorWithSentinel {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter income (or -1 to end): ");
		int income = scan.nextInt();
		double tax = 0;
		
		final int sentinel = -1;
		
		final double tax1 = 0.1;
		final double tax2 = 0.2;
		final double tax3 = 0.3;
		
		while(income != sentinel) {
			if(income>60000) {
				tax = (20000*tax1) + (20000*tax2) + ((income - 60000)*tax3);
			}else if(income>40000) {
				tax = (20000*tax1) + ((income - 40000)*tax2);
			}else if(income>20000) {
				tax = (income - 20000)*tax1;
			}	
		
			System.out.println();
			System.out.printf("Tax payable: %.2f", tax);
			
			System.out.println();
			System.out.println("Enter income (or -1 to end): ");
			income = scan.nextInt();
		}
		System.out.println("Bye!");
	}
}
