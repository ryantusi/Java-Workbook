// Implementing Fibonacci series

public class fibonacci {
	public static void main(String[] args) {
		int n = 1;
		int fn;
		int fn_1 = 1;
		int fn_2 = 1;
		int nmax = 20;
		int sum = 0;
		double average;
		
		System.out.println("The first " + nmax + " fibonacci numbers are: ");
		
		while(n <= nmax) {
			System.out.print(fn_1 + ", ");
			fn  = fn_1 + fn_2;
			sum += fn;
			fn_1 = fn_2;
			fn_2 = fn;
			n++;
		}
		
		System.out.println("The average is: ");
		average = (double)sum/(double)nmax;
		System.out.println(average);
		
	}
}
