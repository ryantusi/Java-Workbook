// Interesting program to compute the value of PI manually and comparing it with Math.PI

public class ComputePI {
	public static void main(String[] args) {
		final int max = 1000000;
		double sum1 = 0;
		double sum2 = 0;
		double pi;
		
		//loop for 1, 5, 9, 13...
		for(int i=1; i<=max; i += 4) {
			sum1 += (1/(double)i); 
		}
		
		//loop for 3, 7, 11, 15...
		for(int j=3; j<=max; j += 4) {
			sum2 += (1/(double)j);
		}
		
		//computing pi
		pi = 4 * (sum1 - sum2);
		System.out.println("The value of pi is: " + pi);
		
		//comparing mathpi to computedpi
		System.out.println();
		double p = Math.PI;
		System.out.println("The value of math pi is: " + p);
		double percent = (pi/p)*100;
		System.out.println("The percentage of pi values comparison is: " + percent);
	}
}
