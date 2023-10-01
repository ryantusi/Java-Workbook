// Fun exercise which iterates from 1-110 to print COZA, LOZA, and WOZA when the number is divisble by 3, 5, and 7 respectively, or else prints the number itself

public class CozaLozaWoza {
	public static void main(String[] args) {
		final int lowerBound = 1;
		final int upperBound = 110;
		
		for(int i=lowerBound; i<=upperBound; i++) {
			if(i%3 == 0) {
				System.out.print("COZA");
			}
			if(i%5 == 0) {
				System.out.print("LOZA");
			}
			if(i%7 == 0) {
				System.out.print("WOZA");
			}
			if(i%3!=0 && i%5!=0 && i%7!=0) {
				System.out.print(i);
			}
			if(i%11==0) {
				System.out.println();
			}else {
				System.out.println(" ");
			}
		}
	}
}
