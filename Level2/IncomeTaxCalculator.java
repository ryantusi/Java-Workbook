// Fun program to compute income taxes based on tax slabs

import java.util.Scanner;

public class IncomeTaxCalculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter income: ");
		int income = scan.nextInt();
		double tax = 0;
		
		final double tax1 = 0.1;
		final double tax2 = 0.2;
		final double tax3 = 0.3;
		
		if(income>60000) {
			tax = (20000*tax1) + (20000*tax2) + ((income - 60000)*tax3);
		}else if(income>40000) {
			tax = (20000*tax1) + ((income - 40000)*tax2);
		}else if(income>20000) {
			tax = (income - 20000)*tax1;
		}
		
		System.out.println();
		System.out.printf("Tax payable: %.2f", tax);
		
		double rebate = 0;
		final double rp = 0.1;
		if(tax>0) {
			rebate = rp*tax;
		}
		System.out.println();
		System.out.printf("The tax rebate is: %.2f", rebate);
	}
}
