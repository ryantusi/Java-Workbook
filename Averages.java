//import scanner package
import java.util.Scanner;

public class Averages {
	//globally declaring a function to compute averages
	void average(int a, int b, int c){
		System.out.println("Inside another function...");
		double avg = (double)(a + b + c)/3;
		System.out.println("The average is: " + avg);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		//creating object from scanner
		
		System.out.println("Enter three numbers: ");	//promt the user
		
		//use scanner object to take input values
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int n3 = scan.nextInt();
		
		//creating objects from another function
		System.out.println("Creating objects to execute average function...");
		Prog05 obj = new Prog05();
		obj.average(n1, n2, n3);	//using the function
	}
}
