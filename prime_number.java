//import the scanner package to input values
import java.util.Scanner;

public class Prog04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		//create an object to use the scanner
		
		System.out.println("Enter a number: ");		//prompt the user
		int n = scan.nextInt();				//use the scanner to take input from user
		scan.close();					//close the scanner
		boolean f = false; 	

		//calculation
		for(int i=2; i<=n/2; i++) {
			if(n%i==0) {
				f = true;
				break;
			}
		}

		//printing out based on results
		if(f==false){
			System.out.println("The number " + n + " is a prime number");
		}else {
			System.out.println("The number " + n + " is not a prime number");
		}
	}
}
