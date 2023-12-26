import java.util.Scanner;
import java.lang.Math;

public class TrignometricSeries {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double degree;
		int term;
	
		System.out.println("Enter degree in double: ");
		degree = scan.nextDouble();
		
		do {
			System.out.println("Enter num of term(<10 and >3):");
			term = scan.nextInt();
		}while(term<2 || term>=10);
		
		double pi = Math.PI;
		double ang = 180.00;
		double radians = degree * (pi/ang);
		
		System.out.println("The computation of sin(x) is: ");
		System.out.println(sin(radians, term));
		System.out.println("checking with math sin: " + Math.sin(radians));
		System.out.println("It is almost accurate!");
		
		System.out.println();
		System.out.println("The computation of cos(x) is:" );
		System.out.println(cos(radians, term));
		System.out.println("Checking with math cos: " + Math.cos(radians));
		System.out.println("This is also accurate!");
	}
	
	public static double sin(double x, int n) {
		double result = 0;
		int count = 1;
		for(int i=1; i<=n; i+=2) {
			if(count%2==0) {
				result -= Math.pow(x, i)/fact(i);
			}else if(count%2!=0) {
				if(count == 1) {
					result += x;
				}else {
					result += Math.pow(x, i)/fact(i);
				}
			}
			count++;
		}
		return result;
	}
	
	public static double cos(double x, int n) {
		double result = 0;
		int count = 1;
		for(int i=0; i<=n; i+=2) {
			if(count==1) {
				result += 1;
			}else {
				if(count%2==0) {
					result -= Math.pow(x, i)/fact(i);
				}else {
					result += Math.pow(x, i)/fact(i);
				}
			}
			count++;
		}
		return result;
	}
	
	public static int fact(int num) {
		int result = 1;
		for(int i=num; i>0; i--) {
			result *= i; 
		}
		return result;
	}
}
