// Factorial implementation program

public class Product1ToN {
	public static void main(String[] args) {
		final int lowerBound = 1;
		int upperBound = 10;
		int product = 1;
		
		for(int i=lowerBound; i<=upperBound; i++) {
			product *= i;
		}
		
		System.out.println("The factorial of 10 is: " + product);
		
		//modified program to factorial 11, 12, 13, and 14
		System.out.println();
		long product11 = 1;
		long product12 = 1;
		long product13 = 1;
		long product14 = 1;
		
		upperBound = 11; //factorial 11
		
		for(int i=lowerBound; i<=upperBound; i++) {
			product11 *= i;
		}
		System.out.println("The factorial of 11 is: " + product11);
		
		upperBound = 12; //factorial 12
		
		for(int i=lowerBound; i<=upperBound; i++) {
			product12 *= i;
		}
		System.out.println("The factorial of 12 is: " + product12);
		
		upperBound = 13; //factorial 13
		
		for(int i=lowerBound; i<=upperBound; i++) {
			product13 *= i;
		}
		System.out.println("The factorial of 13 is: " + product13);
		
		upperBound = 14; //factorial 14
		
		for(int i=lowerBound; i<=upperBound; i++) {
			product14 *= i;
		}
		System.out.println("The factorial of 14 is: " + product14);
		
	}
}
