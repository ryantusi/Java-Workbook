// Fun exercise to compute the harmonic sums

public class HarmonicSum {
	public static void main(String[] args) {
		final int max = 5000;
		double sumL2R = 0;
		double sumR2L = 0;
		double absdiff;
		
		//left to right
		for(int i=1; i<=max; i++) {
			sumL2R = sumL2R + (1/(double)i);
		}
		System.out.println("The harmonic Sum from left to right is: " + sumL2R);
		
		//right to left
		for(int j=max; j>=1; j-- ) {
			sumR2L = sumR2L + (1/(double)j);
		}
		System.out.println("The harmonic sum from right to left is: " + sumR2L);
		
		//absolute difference
		if(sumL2R > sumR2L) {
			absdiff = sumL2R - sumR2L;
		}else {
			absdiff = sumR2L - sumL2R;
		}
		System.out.println("The absolute difference is: " + absdiff);
		
		//Are the two sums the same? Obtain the absolute difference between these two sums and explain the difference. Which sum is more accurate?
		System.out.println();
		System.out.println("The two sums are the same but not accurately correct.");
		System.out.println("The absolute difference give a very different incorrect result as there is a load on memory.");
		System.out.println("The sum left to right is more accurate.");
		
		
	}
}
