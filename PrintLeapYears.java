//program to find Leap Years between the range 999-2010

public class PrintLeapYears {
	public static void main(String[] args) {
		final int LAD = 999; //AD999
		final int UAD = 2010; //AD2010
	
		int count = 0;
		int n = LAD; //assuming 999 is the first leap year
		
		System.out.println("All the leap years is as follows: ");
	
		while(n <= UAD) {
			System.out.print(n + " "); //printing leap years
			n += 4; //next leap year in four years
			++count; //counting leap years
		}
		System.out.println();
		//printing the count of leap years
		System.out.println("The total count of leap years between " + LAD + " and " + UAD + " is " + count);
	}
}
 
