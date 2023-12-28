public class RunningNumberOddSum {
	public static void main(String[] args) {
		final int LB = 1;
		final int UB = 1000;
		
		int n = LB;
		int sum = 0;
		
		while(n <= UB) {
			sum = sum + n;
			n = n + 2;
		}
		
		System.out.println("The sum from " + LB + " to " + UB + " is " + sum);
	}
}
