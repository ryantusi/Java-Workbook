// to demonstrate the use of remainders using number 3,5, and 7 

public class ThreeFiveSevenSum {
	public static void main(String[] args) {
		final int LB = 1;
		final int UB = 1000;
		
		int n = LB;
		int threesum = 0, fivesum = 0, sevensum = 0;
		
		while(n <= UB) {
			if(n % 3 == 0) {
				threesum += n;
			}
			
			if(n % 5 == 0) {
				fivesum += n;
			}
			
			if(n % 7 == 0) {
				sevensum += n;
			}
			
			++n;
		}
		
		System.out.println("The threesum, fivesum, and sevensum, values are: ");
		System.out.println(threesum);
		System.out.println(fivesum);
		System.out.println(sevensum);
	}
}
