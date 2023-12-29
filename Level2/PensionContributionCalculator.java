// Calculator for Pension based on salary and age factor

import java.util.Scanner;

public class PensionContributionCalculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		final int salary_ceiling = 6000;
		
		final double employee_55_below = 0.20;
		final double employee_55_60 = 0.13;
		final double employee_60_65 = 0.075;
		final double employee_65_above = 0.05;
		
		final double employer_55_below = 0.17;
		final double employer_55_60 = 0.13;
		final double employer_60_65 = 0.09;
		final double employer_65_above = 0.075;
		
		int salary, age, salaryComputable;
		double employeeContribution, employerContribution, totalContribution;
		
		System.out.println("Enter salary: ");
		salary = scan.nextInt();
		
		System.out.println("Enter age: ");
		age = scan.nextInt();
		
		if(age<=55) {
			employeeContribution = salary*employee_55_below;
			employerContribution = salary*employer_55_below;
			totalContribution = employeeContribution + employerContribution;
			System.out.printf("The employee contribution: %.2f%n", employeeContribution);
			System.out.printf("The employer Contribution: %.2f%n", employerContribution);
			System.out.printf("The total contribution: %.2f%n", totalContribution);
		}else if(age>55 && age<=60) {
			employeeContribution = salary*employee_55_60;
			employerContribution = salary*employer_55_60;
			totalContribution = employeeContribution + employerContribution;
			System.out.printf("The employee contribution: %.2f%n", employeeContribution);
			System.out.printf("The employer Contribution: %.2f%n", employerContribution);
			System.out.printf("The total contribution: %.2f%n", totalContribution);
		}else if(age>60 && age<=65) {
			employeeContribution = salary*employee_60_65;
			employerContribution = salary*employer_60_65;
			totalContribution = employeeContribution + employerContribution;
			System.out.printf("The employee contribution: %.2f%n", employeeContribution);
			System.out.printf("The employer Contribution: %.2f%n", employerContribution);
			System.out.printf("The total contribution: %.2f%n", totalContribution);
		}else if(age>65) {
			employeeContribution = salary*employee_65_above;
			employerContribution = salary*employer_65_above;
			totalContribution = employeeContribution + employerContribution;
			System.out.printf("The employee contribution: %.2f%n", employeeContribution);
			System.out.printf("The employer Contribution: %.2f%n", employerContribution);
			System.out.printf("The total contribution: %.2f%n", totalContribution);
		}
	}
}
