// Fun and simple exercise to know whether a number is odd or even

import java.util.Scanner;

public class OddEvenTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int num = scan.nextInt();
		
		if(isOdd(num)) {
			System.out.println(num + " is an even number.");
		}else {
			System.out.println(num + " is an odd number.");
		}
	}
	
	public static boolean isOdd(int n) {
		if(n%2==0) {
			return true;
		}else {
			return false;
		}
	}
}
