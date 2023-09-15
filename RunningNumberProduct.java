public class RunningNumberProduct {
	public static void main(String[] args) {
		final int LB = 1;
		final int UB = 10;
		
		int n = LB;
		int product = 1;
		
		while(n <= UB) {
			product = product * n;
			++n;
		}
		
		System.out.println("The product from " + LB + " to " + UB + " is " + product);
	}
}
