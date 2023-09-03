import java.util.Scanner;

public class Prog05 {
	void average(int a, int b, int c){
		System.out.println("Inside another function...");
		double avg = (double)(a + b + c)/3;
		System.out.println("The average is: " + avg);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter three numbers: ");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int n3 = scan.nextInt();
		
		//creating objects from another function
		System.out.println("Creating objects to execute average function...");
		Prog05 obj = new Prog05();
		obj.average(n1, n2, n3);
	}
}
