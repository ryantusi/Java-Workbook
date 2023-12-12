import java.util.Scanner;
import java.lang.Math;

public class SpecialSeries {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double num;
		int term;
	
		System.out.println("Enter Speical Number in double(-1<x<1): ");
		do {
			num = scan.nextDouble();
		}while(num<-1 || num>1 || num==0);
		
		do {
			System.out.println("Enter num of term(<10 and >3):");
			term = scan.nextInt();
		}while(term<2 || term>=10);
		
		System.out.println("The given special number is: " + num);
		System.out.println("Computing it with the special series: ");
		System.out.println(specialseries(num, term));
	}
	
	public static double specialseries(double x, int n) {
		double result = 0;
		for(int i=1; i<=n; i+=2) {
			if(i==1) {
				result += x;
			}else {
				result += (oddfact(i)/evenfact(i)) * ((double)Math.pow(x, i)/(double)i);
			}
		}
		return result;
	}
	
	public static double oddfact(int n) {
		double result = 1;
		for(int i=1; i<n; i+=2) {
			result *= i;
		}
		return result;
	}
	
	public static double evenfact(int n) {
		double result = 1;
		for(int i=2; i<n; i+=2) {
			result *= i;
		}
		return result;
	}
}
