//demonstrating scanner and adding integers

//import scanner package
import java.util.Scanner;

public class Add2Integers {
	public static void main(String[] args) {
    //instantiating an object 
		Scanner scan = new Scanner(System.in);

    //prompting input from user
		System.out.println("Enter two integers: ");
		int a = scan.nextInt();    
		int b = scan.nextInt();   

    //computing and printing
		int sum = a+b;
		System.out.println("The sum is: " + sum);
	}
}
